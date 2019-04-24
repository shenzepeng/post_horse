<template>
	<view>
		<view class="order-state-box">
			<text class="state-text">{{orderInfo.orderStatus}}</text>
			<text class="welcome">期待下次为您服务</text>
		</view>
		<view class="order-info-box">
			<view class="top-box">
				<view class="order-code">订单号：{{orderInfo.stringId}}</view>
				<view class="time">{{orderInfo.createTime}}</view>
			</view>
			<view class="bottom-box">
				<view class="company">{{orderInfo.companyName}}</view>
				<view class="origin">出发地：{{orderInfo.origin}}</view>
				<view class="destination">目的地：{{orderInfo.destination}}</view>
			</view>
		</view>
		<view class="cancel-order-box" v-if="orderInfo.orderStatus == '进行中' && userInfo.type == '个人账号'">
			<button class="cancel-box" type="primary" @tap="cancelOrder">取消订单</button>
		</view>
		<view class="cancel-order-box" v-if="orderInfo.orderStatus == '进行中' && userInfo.type == '企业账号'">
			<button class="cancel-box" type="primary" @tap="finishOrder">完成订单</button>
		</view>
		<!-- <view class="why-cancel-box" v-if="orderInfo.orderStatus == '已取消'">
			<view class="title">取消原因</view>
			<view class="content">不想搬家了</view>
		</view> -->
		<view class="finish-box" v-if="orderInfo.orderStatus == '已完成'">
			<view class="title">完成时间</view>
			<view class="content">{{orderInfo.finishedTime}}</view>
		</view>
		<view class="order-evaluate-box" v-if="orderInfo.orderStatus == '已完成' && orderInfo.evaluateContent != null">
			<view class="top-box">
				<view class="order-code">订单评价</view>
			</view>
			<view class="bottom-box">
				<view class="count"><text>服务：</text><uni-rate :value="orderInfo.score == null ? 0 : orderInfo.score" disabled="true"></uni-rate></view>
				<view class="content">{{orderInfo.evaluateContent}}</view>
			</view>
		</view>
	</view>
</template>

<script>
	import BASEURL from "../../common/baseInfo.js";
	import uniRate from "@/components/uni-rate/uni-rate.vue"
	export default {
		data() {
			return {
				// orderState: "进行中",
				orderId: '',
				orderInfo: {},
				userInfo: {}
			};
		},
		components: {uniRate},
		onLoad(e) {
			this.init(e.id);
			this.orderId = e.id;
		},
		onPullDownRefresh() {
			console.log('refresh');
			this.getData(this.orderId);
			setTimeout(function () {
				uni.stopPullDownRefresh();
			}, 1000);
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
						
						// that.getData(id);
					},
					fail(err) {
						console.log(err);
					}
				});
				this.getData(id);
			},
			cancelOrder() {
				let that = this;
				uni.request({
					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/updateBookById.action`,
					method: 'PUT',
					data: {
						id: that.orderId,
						orderStatus: '已取消'
					},
					success: res => {
						console.log(res);
						that.orderInfo.orderStatus = res.data.data.orderStatus;
					},
					fail: () => {},
					complete: () => {}
				});
			},
			finishOrder() {
				let that = this;
				uni.request({
					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/updateBookById.action`,
					method: 'PUT',
					data: {
						id: that.orderId,
						orderStatus: '已完成'
					},
					success: res => {
						console.log(res);
						that.orderInfo.orderStatus = res.data.data.orderStatus;
					},
					fail: () => {},
					complete: () => {}
				});
			},
			getData(id) {
				let that = this;
				uni.request({
					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/findBookById.action`,
					method: 'GET',
					data: {
						id: id
					},
					success: res => {
						console.log(res);
						that.orderInfo = res.data.data;
					},
					fail: () => {},
					complete: () => {}
				});
			}
		}
	}
</script>

<style lang="less">
.order-state-box{
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	width: 100%;
	height: 300upx;
	margin-bottom: 30upx;
	background-color: #04a9fe;
	color: #ffffff;
	.state-text{
		font-size: 40upx;
	}
	.welcome{
		font-size: 30upx;
	}
}
.order-info-box{
	background-color: #f8f8f8;
	margin-bottom: 30upx;
	// padding: 20upx 0;
	.top-box{
		display: flex;
		justify-content: space-between;
		align-items: center;
		height: 60upx;
		line-height: 60upx;
		padding: 0 30upx;
		border-bottom: 1upx solid #dddddd;
		.order-code{
			max-width: 400upx;
			overflow:hidden;
			text-overflow:ellipsis;
			display:-webkit-box;
			-webkit-box-orient:vertical;
			-webkit-line-clamp:1;
		}
		.time{
			
		}
	}
	.bottom-box{
		padding-left: 30upx;
		.company{
			padding: 16upx 0;
		}
		.origin{
			padding: 10upx 0;
		}
		.destination{
			padding: 16upx 0;
		}
	}
}
.cancel-order-box{
	.cancel-box{
		width: 600upx;
	}
}
.why-cancel-box{	
	display: flex;
	justify-content: space-between;
	align-items: center;
	height: 60upx;
	line-height: 60upx;
	padding: 30upx;
	background-color: #f8f8f8;
}
.finish-box{
	display: flex;
	justify-content: space-between;
	align-items: center;
	height: 60upx;
	line-height: 60upx;
	padding: 30upx;
	margin-bottom: 30upx;
	background-color: #f8f8f8;
}
.order-evaluate-box{
	background-color: #f8f8f8;
	.top-box{
		display: flex;
		justify-content: flex-start;
		align-items: center;
		height: 60upx;
		line-height: 60upx;
		padding: 0 30upx;
		border-bottom: 1upx solid #dddddd;
	}
	.bottom-box{
		padding-left: 30upx;
		.count{
			display: flex;
			justify-content: flex-start;
			align-items: center;
			height: 60upx;
			line-height: 60upx;
			padding: 16upx 0;
		}
		.content{
			padding: 16upx 0;
		}
	}
}
</style>
