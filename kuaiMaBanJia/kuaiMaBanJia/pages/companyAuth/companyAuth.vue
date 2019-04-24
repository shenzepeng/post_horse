<template>
	<view>
		<view class="list-box" v-if="pageState == 1">
			<view class="list-item">
				<view class="title">公司名称</view>
				<view class="info">
					<text class="info-text">{{companyInfoText.companyName}}</text>
				</view>
			</view>
			<view class="list-item">
				<view class="title">公司地址</view>
				<view class="info">
					<text class="info-text">{{companyInfoText.companyAddress}}</text>
				</view>
			</view>
			<view class="list-item">
				<view class="title">联系人姓名</view>
				<view class="info">
					<text class="info-text">{{companyInfoText.contactsPeopleName}}</text>
				</view>
			</view>
			<view class="list-item">
				<view class="title">服务区域</view>
				<view class="info">
					<text class="info-text">{{companyInfoText.serviceArea}}</text>
				</view>
			</view>
			<view class="list-item">
				<view class="title">服务详情</view>
				<view class="info">
					<text class="info-text">{{companyInfoText.serviceIfo}}</text>
					<!-- <uni-icon type="arrowright" size="22" color="#999"></uni-icon> -->
				</view>
			</view>
			<view class="list-item">
				<view class="title">企业资质</view>
				<view class="info">
					<image :src="companyInfoText.companyQualifications" class="info-img" mode="" @error="imageError"></image>
					<!-- <text class="info-text">点击查看</text>
					<uni-icon type="arrowright" size="22" color="#999"></uni-icon> -->
				</view>
			</view>
			<view class="list-item">
				<button class="btn" type="primary" @tap="againAuth">{{btnText}}</button>
			</view>
		</view>
		<view class="auth-again" v-if="pageState == 0">
			<view class="auth-item">
				<view class="label">公司名称</view>
				<!-- <view class="input-box"> -->
				<input class="input" type="text" v-model="companyName" value="" placeholder="请输入公司名称" />
				<!-- </view> -->
			</view>
			<view class="auth-item">
				<view class="label">公司地址</view>
				<!-- <view class="input-box"> -->
				<input class="input" type="text" v-model="companyAddress" value="" placeholder="请输入公司地址"/>
				<!-- </view> -->
			</view>
			<view class="auth-item">
				<view class="label">联系人姓名</view>
				<!-- <view class="input-box"> -->
				<input class="input" type="text" v-model="contactsPeopleName" value="" placeholder="请输入联系人姓名"/>
				<!-- </view> -->
			</view>
			<view class="auth-item">
				<view class="label">服务区域</view>
				<!-- <view class="input-box"> -->
				<input class="input" type="text" v-model="serviceArea" value="" placeholder="请输入服务区域"/>
				<!-- </view> -->
			</view>
			<view class="auth-item">
				<view class="label">服务详情</view>
				<!-- <view class="input-box"> -->
				<textarea class="input" value="" v-model="serviceIfo" placeholder="请输入服务详情" />
				<!-- </view> -->
			</view>
			<view class="auth-item">
				<view class="label">企业资质</view>
				<!-- <view class="input-box"> -->
				<view class="uni-common-mt">
					<view class="demo">
						<block v-if="imageSrc">
							<image :src="imageSrc" class="image" mode="widthFix"></image>
						</block>
						<block v-else>
							<view class="uni-hello-addfile" @click="chooseImage">+ 选择图片</view>
						</block>
					</view>
				</view>
				<!-- </view> -->
			</view>
			<view class="auth-item">
				<button type="primary" @tap="authFn()">提交</button>
			</view>
		</view>
	</view>
</template>

<script>
	import BASEURL from "../../common/baseInfo.js";
	import uniIcon from "@/components/uni-icon/uni-icon.vue"
	export default {
		data() {
			return {
				companyInfoText:{
					companyName: '未认证',
					companyAddress: '未认证',
					serviceArea: '未认证',
					serviceIfo: '未认证',
					companyQualifications: '',
					contactsPeopleName: '未认证',
				},
				pageState: 1,
				imageSrc: '',
				companyName: '',
				companyAddress: '',
				serviceArea: '',
				serviceIfo: '',
				companyQualifications: '',
				contactsPeopleName: '',
				companyId: '',
				userInfo: {},
				btnText: '重新认证'
			};
		},
		onLoad() {
			this.init();
		},
		components: {uniIcon},
		methods:{
			init(id) {
				let that = this;
				uni.getStorage({
				key: 'userInfo',
				success: function (res) {
					console.log(res);
					that.userInfo = res.data;
					console.log(that.userInfo);
					that.getData(that.userInfo.id);
				},
				fail(err) {
					console.log(err);
				}
			});
			},
			imageError() {
				let that = this;
				this.userInfo.imgUrl = '../../static/default_head.png';
			},
			authFn() {
				let that = this;
				if (that.companyName == '') {
					uni.showToast({
						title: '公司名称不能为空',
						icon: 'none'
					});
					return;
				}
				if (that.companyAddress == '') {
					uni.showToast({
						title: '公司地址不能为空',
						icon: 'none'
					});
					return;
				}
				if (that.contactsPeopleName == '') {
					uni.showToast({
						title: '联系人姓名不能为空',
						icon: 'none'
					});
					return;
				}
				if (that.serviceArea == '') {
					uni.showToast({
						title: '服务区域不能为空',
						icon: 'none'
					});
					return;
				}
				if (that.serviceIfo == '') {
					uni.showToast({
						title: '服务详情不能为空',
						icon: 'none'
					});
					return;
				}
// 				if (that.companyQualifications == '') {
// 					uni.showToast({
// 						title: '企业资质不能为空',
// 						icon: 'none'
// 					});
// 					return;
// 				}
				let submitData = {
						userId: that.userInfo.id,
						companyName: that.companyName,
						companyAddress: that.companyAddress,
						serviceArea: that.serviceArea,
						serviceIfo: that.serviceIfo,
						companyQualifications: that.companyQualifications,
						contactsPeopleName: that.contactsPeopleName,
					};
					console.log(JSON.stringify(submitData));
				// return;
				let postUrl = `${BASEURL}/post_horse-0.0.1-SNAPSHOT/insertCompany.action`;
				let putUrl = `${BASEURL}/post_horse-0.0.1-SNAPSHOT/updateCompanyById.action`;
				let requestUrl = '';
				let requestMethod = '';
				let requestData = {};
				if (that.btnText == '去认证') {
					requestUrl = `${BASEURL}/post_horse-0.0.1-SNAPSHOT/insertCompany.action`;
					requestMethod = 'POST';
					requestData = {
						userId: that.userInfo.id,
						companyName: that.companyName,
						companyAddress: that.companyAddress,
						serviceArea: that.serviceArea,
						serviceIfo: that.serviceIfo,
						companyQualifications: that.companyQualifications,
						contactsPeopleName: that.contactsPeopleName,
					};
				} else {
					requestUrl = `${BASEURL}/post_horse-0.0.1-SNAPSHOT/updateCompanyById.action`;
					requestMethod = 'PUT';
					requestData = {
						id: that.companyId,
						userId: that.userInfo.id,
						companyName: that.companyName,
						companyAddress: that.companyAddress,
						serviceArea: that.serviceArea,
						serviceIfo: that.serviceIfo,
						companyQualifications: that.companyQualifications,
						contactsPeopleName: that.contactsPeopleName,
					};
				}
				uni.request({
					url: requestUrl,
					method: requestMethod,
					data: requestData,
					success: res => {
						console.log(res);
						that.getData(that.userInfo.id);
						that.pageState = 1;
					},
					fail: () => {},
					complete: () => {}
				});
// 				uni.request({
// 					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/insertCompany.action`,
// 					method: 'POST',
// 					data: {
// 						userId: that.userInfo.id,
// 						companyName: that.companyName,
// 						companyAddress: that.companyAddress,
// 						serviceArea: that.serviceArea,
// 						serviceIfo: that.serviceIfo,
// 						companyQualifications: '',
// 						contactsPeopleName: that.contactsPeopleName,
// 					},
// 					success: res => {
// 						console.log(res);
// 						that.getData(that.userInfo.id);
// 						that.pageState = 1;
// 					},
// 					fail: () => {},
// 					complete: () => {}
// 				});
			},
			getData(id) {
				let that = this;
				uni.request({
					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/findCompanyByCompanyUserId.action`,
					method: 'GET',
					data: {
						userId: id,
					},
					success: res => {
						console.log(JSON.stringify(res));
						if (res.data.data.length == 0) {
							that.btnText = '去认证';
						} else {
							that.companyInfoText = res.data.data[0];
							that.companyName = res.data.data[0].companyName;
							that.companyAddress = res.data.data[0].companyAddress;
							that.serviceArea = res.data.data[0].serviceArea;
							that.serviceIfo = res.data.data[0].serviceIfo;
							that.companyQualifications = res.data.data[0].companyQualifications;
							that.companyQualifications = res.data.data[0].companyQualifications;
							that.contactsPeopleName = res.data.data[0].contactsPeopleName;
							that.companyId = res.data.data[0].id;
						}
					},
					fail: () => {},
					complete: () => {}
				});
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
								console.log('uploadImage success, res is:', res)
								let resUrl = JSON.parse(res.data).url;
								uni.showToast({
									title: '上传成功',
									icon: 'success',
									duration: 1000
								})
								that.companyQualifications = resUrl;
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
// 			authFn() {
// 				let that = this;
// 				uni.request({
// 					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/updateCompanyById.action`,
// 					method: 'PUT',
// 					data: {},
// 					success: res => {},
// 					fail: () => {},
// 					complete: () => {}
// 				});
// 			},
			againAuth() {
				let that = this;
				this.pageState = 0;
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
			box-sizing: border-box;
			min-height: 120upx;
			padding: 30upx 30upx;
			border-bottom: 1upx solid #ddd;
			.info{
				display: flex;
				justify-content: flex-end;
				align-items: center;
				max-width: 450upx;
				.info-img{
					width: 450upx;
					height: 450upx;
				}
			}
			.btn{
				width: 600upx;
			}
		}
	}
	.auth-again{
		width: 100%;
		.auth-item{
			box-sizing: border-box;
			padding: 20upx 30upx;
			.label{
				
			}
			.input{
				width: auto;
				border: 1upx solid #ddd;
				padding: 10upx 0;
				padding-left: 20upx;
			}
			.image {
				width: 100%;
			}

			.demo {
				background: #FFF;
				padding: 50upx;
				border: 1upx solid #ddd;
			}
		}
	}
</style>
