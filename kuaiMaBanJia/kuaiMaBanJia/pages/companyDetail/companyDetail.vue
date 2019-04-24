<template>
	<view>
		<view class="companyName">
			<view class="name">
				{{ companyInfo.companyName }}
			</view>
			<view class="state">
				<uni-icon type="checkmarkempty"></uni-icon>
				企业认证
			</view>
		</view>
		<view class="info-box">
			<view class="space">
				<view class="left">
					服务区域
				</view>
				<view class="right">
					{{ companyInfo.serviceArea }}
				</view>
			</view>
			<view class="space">
				<view class="left">
					联系人
				</view>
				<view class="right">
					{{ companyInfo.contactsPeopleName }}
					<uni-icon class="right-icon" type="phone-filled" @tap="callPhone"></uni-icon>
				</view>
			</view>
			<view class="space">
				<view class="left">
					商家地址
				</view>
				<view class="right">
					{{ companyInfo.companyAddress }}
				</view>
				
			</view>
		</view>
		<view class="introduction">
			<view class="title">
				服务详情
			</view>
			<view class="content">
				{{ companyInfo.serviceIfo }}
			</view>
		</view>
		<view class="btn-box">
			<view class="collection" @tap="addCollection">
				<uni-icon color="#04a9fe" :type="iconType"></uni-icon>
				<text>收藏</text>
			</view>
			<button class="btn" type="primary" @tap="addOrder">下单</button>
		</view>
	</view>
</template>

<script>
	import BASEURL from "../../common/baseInfo.js";
	import uniIcon from "@/components/uni-icon/uni-icon.vue"
	export default {
		data() {
			return {
				companyInfo:{
					companyId: null,
					companyName: '',
					companyAddress: '',
					companyQualifications: '',
					serviceArea: '',
					contactsPeopleName:'',
					serviceIfo: ''
				},
				phoneNum: 1,
				companyId: '',
				userInfo: {},
				iconType: 'star'
			};
		},
		components: {uniIcon},
		onLoad(e) {
			console.log(e);
			this.init(e.id);
			this.companyId = e.id;
		},
		methods:{
			init(id) {
				let that = this;
				this.getData(id);
			
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
			addCollection() {
				let that = this;
				console.log(that.companyId);
				if (that.userInfo.type != '个人账号') {
					uni.showToast({
						title: '公司账户不可进行本操作',
						icon: 'none'
					});
					return;
				}
				uni.request({
					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/insertFavorite.action`,
					method: 'POST',
					data: {
						companyId: that.companyId,
						userId: that.userInfo.id
					},
					success: res => {
						console.log(res);
					    uni.showToast({title:"收藏成功", icon:"success"});
						that.iconType = 'star-filled';
					},
					fail: () => {},
					complete: () => {}
				});
			},
			addOrder() {
				let that = this;
				if (that.userInfo.type != '个人账号') {
					uni.showToast({
						title: '公司账户不可进行本操作',
						icon: 'none'
					});
					return;
				}
				uni.navigateTo({
					url: '../confirmOrder/confirmOrder?companyId='+that.companyId,
					success: res => {},
					fail: () => {},
					complete: () => {}
				});
			},
			callPhone() {
				let that = this;
				uni.makePhoneCall({
					phoneNumber: '114' //仅为示例
				});
			},
			getData(id) {
				let that = this;
				uni.request({
					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/findCompanyById.action`,
					method: 'GET',
					data: {
						id:id
					},
					success: res => {
						console.log(res);
						that.companyInfo = res.data.data;
						uni.request({
							url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/findUserById.action`,
							method: 'GET',
							data: {
								id: res.data.data.userId
							},
							success: res => {
								console.log(res);
								that.phoneNum = res.data.data.telPhoneNumber;
							},
							fail: () => {},
							complete: () => {}
						});
					},
					fail: () => {},
					complete: () => {}
				});
			},
		}
	}
</script>

<style lang="less">
	.companyName{
		margin-bottom: 30upx;
		.name{
			padding: 30upx 30upx;
		}
		.state{
			padding-left: 30upx;
			background-color: #FFF7C0;
		}
	}
	.info-box{
		margin-bottom: 30upx;
		border-top: 1upx solid #ddd;
		border-bottom: 1upx solid #ddd;
		.space{
			display: flex;
			justify-content: flex-start;
			align-items: center;
			padding-left: 30upx;
			height: 60upx;
			.left{
				width: 150upx;
			}
			.right{
// 				display: flex;
// 				justify-content: space-between;
// 				align-items: center;
				.right-icon{
					margin-left: 60upx;
				}
			}
		}
	}
	.introduction{
		border-top: 1upx solid #ddd;
		border-bottom: 1upx solid #ddd;
		.title{
			height: 80upx;
			line-height: 80upx;
			padding-left: 30upx;
			border-bottom: 1upx solid #ddd;
		}
		.content{
			padding: 30upx;
		}
	}
	.btn-box{
		position: fixed;
		bottom: 0;
		left: 0;
		display: flex;
		justify-content: space-between;
		align-items: center;
		box-sizing: border-box;
		width: 100%;
		height: 100upx;
		padding: 0 30upx;
		border-top: 1upx solid #ddd;
		.collection{
			display: flex;
			flex-direction: column;
			align-items: center;
			justify-content: center;
			// width: 100upx;
		}
		.btn{
			width: 580upx;
			height: 80upx;
			line-height: 80upx;
			margin: 0;
		}
	}
</style>
