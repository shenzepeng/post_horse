<template>
	<view class="login-box">
		<view class="logo-box">
			<!-- <image class="close-icon" src="../../static/delete_icon.png" mode=""></image> -->
			<image class="login-logo" src="../../static/kmbj.jpg" mode=""></image>
			<view class="register-btn" @click="selectType">
				注册
			</view>
		</view>
		<view class="login-form">
			<view class="form-item">
				<input id="phoneInput" class="login-input" type="number" name="phone" v-model="login.phone" value="" placeholder="手机号" maxlength="11" />
			</view>
			<view class="form-item">
				<input class="login-input" type="password" password="true" v-model="login.password" value="" placeholder="密码"/>
			</view>
			<view class="btn-box">
				<button type="primary" @tap="loginFn">登录</button>
			</view>
		</view>
	</view>
</template>

<script>
	import BASEURL from "../../common/baseInfo.js";
	export default {
		data() {
			return {
				login: {
					loading: false,
					phone:"",
					password:""
				},

			};
		},
		methods:{
			loginFn() {
				var that = this,
					regphone = /^(13\d|14[57]|15[012356789]|18\d|17[013678])\d{8}$/;
				    //进行表单检查
				    console.log(that.login.phone);
				    if(!regphone.test(that.login.phone)) {
					    uni.showToast({title:"请输入正确的手机号", icon:"none"});
					    return;
				    }
				    if (that.login.password == "") {
					    uni.showToast({title:"请输入密码", icon:"none"});
					    return;
				    }
				    uni.request({
						url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/findUserByUsernameAndPassword.action`, //仅为示例，并非真实接口地址。
						// method: 'GET',
						data: {
							username: that.login.phone,
							password: that.login.password
						},
						header: {
							// 'custom-header': 'hello' //自定义请求头信息
						},
						success: (res) => {
							console.log(res.data.data);
							if(res.data.status == 200){
								uni.setStorage({
									key: 'userInfo',
									data: res.data.data,
									success: function () {
										uni.navigateBack();
									}
								});
								
							}else {
								uni.showToast({title:"该用户不存在", icon:"none"});
							}
						},
						fail: () => {
							
						}
					});
			},
			selectType() {
				uni.navigateTo({
					url: '../register/register'
				});
			}
		} 
	}
</script>

<style lang="less">
	.login-box{
		display: flex;
		flex-direction: column;
		justify-content: flex-start;
		align-items: center;
		.logo-box{
			position: relative;
			display: flex;
			justify-content: center;
			align-items: center;
			width: 100%;
			height: 33vh;
			.close-icon{
				width: 40upx;
				height: 40upx;
				position: absolute;
				top: 30upx;
				left: 30upx;
			}
			.login-logo{
				width: 200upx;
				height: 294upx;
			}
			.register-btn{
				position: absolute;
				right: 30upx;
				top: 30upx;
			}
		}
		.login-form{
			width: 600upx;
			.form-item{
				margin-bottom: 30upx;
				.login-input{
					box-sizing: border-box;
					width: 100%;
					height: 60upx;
					padding-left: 30upx;
					background-color: rgb(244, 246, 248);
					font-size: 26upx;
					line-height: 1;
					border-radius: 10upx;
				}
			}
		}
	}
</style>
