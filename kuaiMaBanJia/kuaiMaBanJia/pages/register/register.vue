<template>
	<view class="register-box">
		<view class="logo-box">
			<!-- <image class="close-icon" src="../../static/delete_icon.png" mode=""></image> -->
			<image class="register-logo" src="../../static/kmbj.jpg" mode=""></image>
			<view class="login-btn" @click="goLogin">
				登录
			</view>
		</view>
		<view class="register-form">
			<view class="form-item">
				<picker class="register-input" mode="selector" :range="typeList" @change="selectType" :value="index">
					<view class="text">{{typeList[index]}}</view>
				</picker>
			</view>
			<view class="form-item">
				<input id="phoneInput" class="register-input" type="number" name="phone" v-model="phone" value="" placeholder="手机号" maxlength="11" />
			</view>
			<view class="form-item">
				<input class="register-input" type="password" password="true" v-model="password" value="" placeholder="密码"/>
			</view>
			<view class="form-item">
				<input class="register-input" type="password" password="true" v-model="secondPassword" value="" placeholder="再次确认密码"/>
			</view>
			<view class="btn-box">
				<button type="primary" @tap="regFn">注册</button>
			</view>
		</view>
	</view>
</template>

<script>
	import BASEURL from "../../common/baseInfo.js";
	export default {
		data() {
			return {
				phone: "",
				password: "",
				secondPassword: "",
				typeList: [
					"个人账号",
					"企业账号"
				],
				typeVal:"个人账号",
				index: 0,
			};
		},
		methods:{
			regFn() {
				let that = this,
				regphone = /^(13\d|14[57]|15[012356789]|18\d|17[013678])\d{8}$/;
				//进行表单检查
				console.log(that.phone);
				if(!regphone.test(that.phone)) {
					uni.showToast({title:"请输入正确的手机号", icon:"none"});
					return;
				}
				if (that.password == "") {
					uni.showToast({title:"请输入密码", icon:"none"});
					return;
				}
				if (that.secondPassword == "") {
					uni.showToast({title:"请再次输入密码", icon:"none"});
					return;
				}
				if (that.secondPassword != that.password) {
					uni.showToast({title:"两次密码输入不一致", icon:"none"});
					return;
				}
				console.log(that.phone,that.secondPassword,that.typeVal);
				uni.request({
					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/insertUser.action`,
					// url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/insertUser.action?username=${that.phone}&password=${that.secondPassword}&type=${that.typeVal}`,
					method: 'POST',
					data: {
						username: that.phone,
						password: that.secondPassword,
						type: that.typeVal,
						telPhoneNumber: that.phone
					},
					success: res => {
						console.log(res);
						
					},
					fail: () => {},
					complete: () => {}
				});
			},
			selectType(e) {
				this.index = e.target.value;
				this.typeVal = this.typeList[this.index];
			},
			goLogin() {
				uni.navigateBack();
			}
		}
	}
</script>

<style lang="less">
.register-box{
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
			.register-logo{
				width: 200upx;
				height: 294upx;
			}
			.login-btn{
				position: absolute;
				right: 30upx;
				top: 30upx;
			}
		}
		.register-form{
			width: 600upx;
			.form-item{
				margin-bottom: 30upx;
				.register-input{
					box-sizing: border-box;
					width: 100%;
					height: 60upx;
					padding-left: 30upx;
					background-color: rgb(244, 246, 248);
					font-size: 26upx;
					line-height: 1;
					border-radius: 10upx;
					.text{
						height: 60upx;
						// padding-left: 30upx;
						font-size: 26upx;
						line-height: 60upx;
					}
				}
			}
		}
	}
</style>
