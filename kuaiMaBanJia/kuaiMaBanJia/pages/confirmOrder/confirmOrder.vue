<template>
	<view class="">
		<view class="input-box">
			<view class="auth-again">
				<view class="auth-item">
					<view class="label">称呼</view>
					<!-- <view class="input-box"> -->
					<input class="input" type="text" v-model="customerName" value="" placeholder="请填写你的称呼" />
					<!-- </view> -->
				</view>
				<view class="auth-item">
					<view class="label">出发地</view>
					<!-- <view class="input-box"> -->
					<input class="input" type="text" v-model="origin" value="" placeholder="请填写出发地" />
					<!-- </view> -->
				</view>
				<view class="auth-item">
					<view class="label">目的地</view>
					<!-- <view class="input-box"> -->
					<input class="input" type="text" v-model="destination" value="" placeholder="请填写目的地"/>
					<!-- </view> -->
				</view>
				<view class="auth-item">
					<view class="label">搬家时间</view>
					<!-- <view class="input-box"> -->
					<picker class="picker" mode="date" :start="startDate" :end="endDate" @change="bindDateChange" fields="day">
						<view>{{date}}</view>
					</picker>
					<!-- </view> -->
				</view>
			</view>
		</view>
		<view class="companyInfo">
			<view class="title">{{companyInfo.companyName}}</view>
			<view class="person">联系人：{{companyInfo.contactsPeopleName}}</view>
		</view>
		<view class="btn-box">
			<button class="submit-btn" type="primary" @tap="submitFn">提交订单</button>
		</view>
	</view>
</template>

<script>
	import BASEURL from "../../common/baseInfo.js";
import uniList from '@/components/uni-list/uni-list.vue'
import uniListItem from '@/components/uni-list-item/uni-list-item.vue'
	export default {
		data() {
        const currentDate = this.getDate({
			format: false
		})
		const timestamp = (new Date()).getTime(); 
			return {
				date: currentDate,
				createTime: currentDate,
				companyInfo: {},
				phoneNum: 1,
				userInfo: {},
				companyId: '',
				destination: '',
				origin: '',
				customerName: ''
			};
		},
		computed: {
			startDate() {
				return this.getDate('start');
			},
			endDate() {
				return this.getDate('end');
			}
		},
		components: {uniList,uniListItem},
		onLoad(e) {
			console.log(e);
			this.init(e.companyId);
			this.companyId = e.companyId;
		},
		methods:{
			init(id) {
				let that = this;
				uni.getStorage({
				key: 'userInfo',
				success: function (res) {
					console.log(res);
					that.userInfo = res.data;
					console.log(that.userInfo);
					
					that.getData(id);
				},
				fail(err) {
					console.log(err);
				}
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
        getDate(type) {
            const date = new Date();
            let year = date.getFullYear();
            let month = date.getMonth() + 1;
            let day = date.getDate();

            if (type === 'start') {
                year = year - 60;
            } else if (type === 'end') {
                year = year + 2;
            }
            month = month > 9 ? month : '0' + month;;
            day = day > 9 ? day : '0' + day;
            return `${year}-${month}-${day}`;
        },
        bindDateChange: function(e) {
            this.date = e.target.value
        },
		submitFn() {
			let that = this;
			if (this.customerName == '') {
				uni.showToast({
					title: '请输入你的称呼',
					icon: 'none'
				});
				return;
			}
			if (this.origin == '') {
				uni.showToast({
					title: '请输入出发地',
					icon: 'none'
				});
				return;
			}
			if (this.destination == '') {
				uni.showToast({
					title: '请输入目的地',
					icon: 'none'
				});
				return;
			}
			uni.request({
				url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/insertBook.action`,
				method: 'POST',
				data: {
					userId: that.userInfo.id,
					companyId: that.companyId,
					orderStatus: "进行中",
					telPhoneNumber: that.phoneNum,
					companyName: that.companyInfo.companyName,
					destination: that.destination,
					origin: that.origin,
					finishedTime: that.date,
					createTime: that.createTime,
					customerName: that.customerName
				},
				success: res => {
					console.log(res);
					uni.showToast({
						title: '下单成功',
						icon: 'success'
					});
					setTimeout(() => {
						uni.navigateBack({
							delta: 1
						});
					},2000)
				},
				fail: () => {},
				complete: () => {}
			});
		},
		}
	}
</script>

<style lang="less">
	.input-box{
		margin-top: 30upx;
	}
	.companyInfo{
		margin-top: 30upx;
		border-top: 1upx solid #ddd;
		border-bottom: 1upx solid #ddd;
		.title{
			height: 80upx;
			line-height: 80upx;
			padding: 0 30upx;
			border-bottom: 1upx solid #ddd;
		}
		.person{
			height: 100upx;
			line-height: 100upx;
			padding: 0 30upx;
		}
	}
	.btn-box{
		position: fixed;
		bottom: 0;
		left: 0;
		width: 100%;
		height: 100upx;
		.submit-btn{
			width: 690upx;
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
			.picker{
				width: auto;
				height: 80upx;
				line-height: 80upx;
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
