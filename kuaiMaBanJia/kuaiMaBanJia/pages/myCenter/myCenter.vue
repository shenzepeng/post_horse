<template>
	<view class="center">
		<view class="logo">
			<image class="logo-img" :src="userInfo.imgUrl" @error="imageError"></image>
			<view class="logo-title">
				<text class="uer-name">Hi，{{userInfo.nickName}}</text>
				<text class="uer-info" @tap="goUserInfo">账号信息<text class="navigat-arrow">&#xe65e;</text></text>
			</view>
		</view>
		<view class="center-list">
			<view class="center-list-item border-bottom" @tap="goAuth" v-if="userInfo.type == '企业账号'">
				<text class="list-icon">&#xe60f;</text>
				<text class="list-text">公司认证</text>
				<text class="navigat-arrow">&#xe65e;</text>
			</view>
		</view>
		<view class="center-list">
			<view class="center-list-item border-bottom" @tap="goCollection" v-if="userInfo.type == '个人账号'">
				<text class="list-icon">&#xe60f;</text>
				<text class="list-text">我的收藏</text>
				<text class="navigat-arrow">&#xe65e;</text>
			</view>
			<view class="center-list-item" @tap="goMyEvaluate" v-if="userInfo.type == '个人账号'">
				<text class="list-icon">&#xe639;</text>
				<text class="list-text">我的评价</text>
				<text class="navigat-arrow">&#xe65e;</text>
			</view>
		</view>
		<view class="center-list">
			<!-- <view class="center-list-item border-bottom" @tap="shareSomeThing">
				<text class="list-icon">&#xe60b;</text>
				<text class="list-text">分享应用</text>
				<text class="navigat-arrow">&#xe65e;</text>
			</view> -->
			<view class="center-list-item">
				<text class="list-icon">&#xe65f;</text>
				<text class="list-text">当前版本</text>
				<text class="list-right-info">{{ nowVersion }}</text>
			</view>
			<!-- <view class="center-list-item" @tap="checkShangshi" v-else>
				<text class="list-icon">&#xe65f;</text>
				<text class="list-text">立即验证，获得大家的投资吧</text>
				<text class="navigat-arrow">&#xe65e;</text>
			</view> -->
		</view>
		
		<view class="btn-box">
			<button type="primary" class="btn" @tap="logout()">退出登录</button>
		</view>
	</view>
</template>

<script>
	import BASEURL from "../../common/baseInfo.js";
	// import uniPopup from '../../components/uni-popup.vue';
	export default {
		components:{
			// uniPopup
		},
// 		onShow() {
// 			let that = this;
// // 			if (!this.isfirst) {
// // 				that.getUserAppInfo();
// // 			}
// 		},
		onPullDownRefresh() {
			console.log('refresh');
			this.getData(this.userInfo.id);
			setTimeout(function () {
				uni.stopPullDownRefresh();
			}, 1000);
		},
		data() {
			return {
				avatarUrl: "",
				userInfo: {},
				openId: '',
				showPopupBottom: false,
				checkedInfo: false,
				// isfirst: true,
				nowVersion: '1.0.0'
			}
		},
		beforeCreate() {
		},
		onLoad() {
			let that = this;
			this.init();
			// this.showVersion();
			// this.getData();
// 			uni.getStorage({
// 				key: 'userInfo',
// 				success: function (res) {
// 					// console.log(JSON.parse(res));
// 					console.log(res.data);
// 					that.uerInfo = res.data;
// 				}
// 			})
// 			uni.getStorage({
// 				key: 'openIdInfo',
// 				success: function(res) {
// 					// console.log(JSON.parse(res));
// 					console.log(res);
// 					that.openId = res.data;
// 					that.getUserAppInfo();
// 				}
// 			})
			// this.getUserInfoFn();
  
		},
		methods: {
			init(id) {
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
						
						that.getData(that.userInfo.id);
					},
					fail(err) {
						console.log(err);
					}
				});
			},
			getData() {
				let that = this;
				uni.request({
					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/findUserById.action`,
					method: 'GET',
					data: {
						id: that.userInfo.id
					},
					success: res => {
						console.log(res);
						that.userInfo = res.data.data;
						if (that.userInfo.imgUrl == null) {
							that.userInfo.imgUrl = '';
						}
					},
					fail: () => {},
					complete: () => {}
				});
			},
			goUserInfo() {
				let that = this;
				uni.navigateTo({
					url: '../userInfo/userInfo',
					success: res => {},
					fail: () => {},
					complete: () => {}
				});
			},
			goAuth() {
				let that = this;
				uni.navigateTo({
					url: '../companyAuth/companyAuth',
					success: res => {},
					fail: () => {},
					complete: () => {}
				});
			},
			goCollection() {
				let that = this;
				uni.navigateTo({
					url: '../myCollection/myCollection',
					success: res => {},
					fail: () => {},
					complete: () => {}
				});
			},
			goMyEvaluate() {
				let that = this;
				uni.navigateTo({
					url: '../myEvaluate/myEvaluate',
					success: res => {},
					fail: () => {},
					complete: () => {}
				});
			},
			showVersion() {
				let that = this;
				plus.runtime.getProperty(plus.runtime.appid, function(wgtinfo){  
					that.nowVersion = wgtinfo.version;  
				}); 
				// plus.nativeUI.alert(plus.runtime.version);
			},
			imageError() {
				let that = this;
				this.userInfo.imgUrl = '../../static/default_head.png';
			},
			logout() {
				let that = this;
				uni.removeStorage({
					key: 'userInfo',
					success: function (res) {
						uni.navigateTo({
							url: '../login/login',
							success: res => {},
							fail: () => {},
							complete: () => {}
						});
					}
				});
			}
// 			getUserInfoFn () {
// 				let that = this;
// 				uni.getUserInfo({
// 				  provider: 'weixin',
// 				  success: function (infoRes) {
// 					console.log(infoRes.userInfo);
// 					that.uerInfo = infoRes.userInfo;
// 				  }
// 				});
// 			}
		}
	}
</script>

<style>
	@font-face {
		font-family: texticons;
		font-weight: normal;
		font-style: normal;
		src: url('https://at.alicdn.com/t/font_984210_5cs13ndgqsn.ttf') format('truetype');
	}

	page,
	view {
		display: flex;
	}

	page {
		background-color: #f8f8f8;
	}

	.center {
		flex-direction: column;
	}

	.logo {
		width: 750upx;
		height: 240upx;
		padding: 20upx;
		box-sizing: border-box;
		background-color: #04a9fe;
		flex-direction: row;
		align-items: center;
	}

	.logo-hover {
		opacity: 0.8;
	}

	.logo-img {
		width: 150upx;
		height: 150upx;
		border-radius: 150upx;
	}

	.logo-title {
		height: 150upx;
		flex: 1;
		align-items: flex-start;
		justify-content: space-between;
		flex-direction: column;
		margin-left: 20upx;
	}

	.uer-name {
		height: 60upx;
		line-height: 60upx;
		font-size: 38upx;
		color: #FFFFFF;
		background-color: inherit;
		border: none;
		outline: none;
	}
	
	.uer-info{
		/* height: 60upx; */
		/* line-height: 60upx; */
		font-size: 20upx;
		color: #FFFFFF;
		background-color: inherit;
		border: none;
		outline: none;
	}
	.uer-info .navigat-arrow{
		padding-left: 10upx;
		color: #fff;
		font-size: 20upx;
	}
	.go-login.navigat-arrow {
		font-size: 38upx;
		color: #FFFFFF;
	}

	.login-title {
		height: 150upx;
		align-items: self-start;
		justify-content: center;
		flex-direction: column;
		margin-left: 20upx;
	}

	.center-list {
		background-color: #FFFFFF;
		margin-top: 20upx;
		width: 750upx;
		flex-direction: column;
	}

	.center-list-item {
		height: 90upx;
		width: 750upx;
		box-sizing: border-box;
		flex-direction: row;
		padding: 0upx 20upx;
	}

	.border-bottom {
		border-bottom-width: 1upx;
		border-color: #c8c7cc;
		border-bottom-style: solid;
	}

	.list-icon {
		width: 40upx;
		height: 90upx;
		line-height: 90upx;
		font-size: 34upx;
		color: rgb(52,150,245);
		text-align: center;
		font-family: texticons;
		margin-right: 20upx;
	}

	.list-text {
		height: 90upx;
		line-height: 90upx;
		font-size: 34upx;
		color: #555;
		flex: 1;
		text-align: left;
	}

	.navigat-arrow {
		height: 90upx;
		width: 40upx;
		line-height: 90upx;
		font-size: 34upx;
		color: #555;
		text-align: right;
		font-family: texticons;
	}
	.list-right-info{
		height: 90upx;
		width: 80upx;
		line-height: 90upx;
		font-size: 34upx;
		color: #555;
		text-align: right;
	}
	.btn-box{
		margin-top: 30upx;
	}
	
	.btn-box .btn{
			width: 600upx;
		}
</style>
