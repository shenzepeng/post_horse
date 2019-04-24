<template>
	<view>
		<view class="list-box">
			<view class="list-item" @tap="changeNickName">
				<view class="title">昵称</view>
				<view class="info">
				<text class="info-text">{{ userInfo.nickName }}</text>
				<uni-icon type="arrowright" size="22" color="#999"></uni-icon>
				</view>
			</view>
			<view class="list-item">
				<view class="title">头像</view>
				<view class="info">
				<image class="info-img" :src="userInfo.imgUrl" mode="" @error="imageError" @click="chooseImage"></image>
				<uni-icon type="arrowright" size="22" color="#999"></uni-icon>
				</view>
			</view>
			<view class="list-item">
				<view class="title">手机号</view>
				<view class="info">
				<text class="info-text">18165252184</text>
				</view>
			</view>
			<!-- <view class="list-item">
				<view class="title">账户密码</view>
				<view class="info">
				<text class="info-text">去修改</text>
				<uni-icon type="arrowright" size="22" color="#999"></uni-icon>
				</view>
			</view> -->
		</view>
	</view>
</template>

<script>
	import BASEURL from "../../common/baseInfo.js";
	import uniIcon from "@/components/uni-icon/uni-icon.vue"
	export default {
		data() {
			return {
				userInfo: {
					imgUrl: '../../static/default_head.png'
				},
			};
		},
		components: {uniIcon},
		onLoad() {
			this.init();
		},
		methods:{
			init() {
				let that = this;
				uni.getStorage({
					key: 'userInfo',
					success: function (res) {
						console.log(res);
						that.userInfo = res.data;
						if (that.userInfo.imgUrl == null) {
							that.userInfo.imgUrl = '';
						}
						console.log(that.userInfo);
					},
					fail(err) {
						console.log(err);
					}
				});
			},
			changeNickName() {
				let that = this;
				uni.navigateTo({
					url: '../changeNickName/changeNickName',
					success: res => {},
					fail: () => {},
					complete: () => {}
				});
			},
// 			getData() {
// 				let that = this;
// 				uni.request({
// 					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/findUserById.action`,
// 					method: 'GET',
// 					data: {
// 						id: 1
// 					},
// 					success: res => {
// 						console.log(res);
// 						that.uerInfo = res.data.data;
// 					},
// 					fail: () => {},
// 					complete: () => {}
// 				});
// 			},
			imageError() {
				let that = this;
				this.userInfo.imgUrl = '../../static/default_head.png';
			},
			chooseImage: function() {
				let that = this;
				uni.chooseImage({
					count: 1,
					sizeType: ['compressed'],
					sourceType: ['album'],
					success: (res) => {
						console.log('chooseImage success, temp path is', res.tempFilePaths[0])
						var imageSrc = res.tempFilePaths[0]
						uni.uploadFile({
							url: 'http://129.28.84.183/sringmvcphoto-1.0-SNAPSHOT/updateitem.action',
							filePath: imageSrc,
							fileType: 'image',
							name: 'myPhoto',
							success: (res) => {
								let resUrl = JSON.parse(res.data).url;
								
								console.log(resUrl)
								// plus.nativeUI.alert('uploadImage success, res is:'+JSON.stringify(res.data.url))
								uni.showToast({
									title: '上传成功',
									icon: 'success',
									duration: 1000
								})
								uni.request({
									url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/updateUserById.action`,
									method: 'PUT',
									data: {
										id: that.userInfo.id,
										imgUrl: resUrl
									},
									success: res => {
										uni.request({
											url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/findUserById.action`,
											method: 'GET',
											data: {
												id: that.userInfo.id,
											},
											success: res => {
												console.log(res);
												uni.setStorage({
													key: 'userInfo',
													data: res.data.data,
													success: function () {
														uni.navigateBack();
													}
												});
											},
											fail: () => {},
											complete: () => {}
										});
									},
									fail: () => {},
									complete: () => {}
								});
								this.imageSrc = imageSrc
							},
							fail: (err) => {
								console.log('uploadImage fail', err);
								uni.showModal({
									content: err.errMsg,
									showCancel: false
								});
							}
						});
					},
					fail: (err) => {
						console.log('chooseImage fail', err)
					}
				})
			},
		}
	}
</script>

<style lang="less">
	.list-box{
		width: 100%;
		.list-item{
			display: flex;
			justify-content: space-between;
			align-items: center;
			height: 120upx;
			padding: 0 30upx;
			border-bottom: 1upx solid #ddd;
			.info{
				display: flex;
				justify-content: flex-end;
				align-items: center;
				.info-img{
					width: 80upx;
					height: 80upx;
				}
			}
		}
	}
</style>
