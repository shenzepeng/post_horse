<template>
	<view>
		<view class="auth-again">
			<view class="auth-item">
				<view class="label">昵称</view>
				<!-- <view class="input-box"> -->
				<input class="input" type="text" v-model="nickName" value="" placeholder="请输入昵称" />
				<!-- </view> -->
			</view>
			<view class="auth-item">
				<button type="primary" @tap="editNickName">提交</button>
			</view>
		</view>
	</view>
</template>

<script>
	import BASEURL from "../../common/baseInfo.js";
	export default {
		data() {
			return {
				userInfo: {},
				nickName: ''
			};
		},
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
						console.log(that.userInfo);
					},
					fail(err) {
						console.log(err);
					}
				});
			},
			editNickName () {
				let that = this;
				uni.request({
					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/updateUserById.action`,
					method: 'PUT',
					data: {
						id: that.userInfo.id,
						nickName: that.nickName
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
			}
		}
	}
</script>

<style lang="less">

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
