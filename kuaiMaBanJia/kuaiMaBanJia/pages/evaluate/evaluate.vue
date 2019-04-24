<template>
	<view>
		<view class="auth-again">
				<view class="auth-item">
					<view class="label">服务评分</view>
					<uni-rate value="5" @change="changeScore"></uni-rate>
					<!-- <view class="input-box"> -->
					<!-- <input class="input" type="text" v-model="customerName" value="" placeholder="请填写你的称呼" /> -->
					<!-- </view> -->
				</view>
				<view class="auth-item">
					<view class="label">评价</view>
					<!-- <view class="input-box"> -->
					<textarea class="input" value="" v-model="evaluateContent" placeholder="请输入服务详情" />
					<!-- </view> -->
				</view>
				
			<view class="auth-item">
				<button type="primary" @tap="addEvaluate()">提交</button>
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
				orderId: '',
				orderInfo: {},
				userInfo: {},
				evaluateContent: '',
				score: 5
			};
		},
		components: {uniRate},
		onLoad(e) {
			this.init(e.id);
			this.orderId = e.id;
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
				// this.getData(id);
			},
			changeScore (data) {
				let that = this;
				this.score = data.value;
				console.log(data);
			},
			addEvaluate() {
				let that = this;
				console.log({
						id: that.orderId,
						evaluateContent: that.evaluateContent,
						score: that.score
					});
				if (that.evaluateContent == '') {
					uni.showToast({
						title: '请输入评价',
						icon: 'none'
					});
					return;
				}
				// return;
				uni.request({
					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/updateBookById.action`,
					method: 'PUT',
					data: {
						id: that.orderId,
						evaluateContent: that.evaluateContent,
						score: that.score
					},
					success: res => {
						console.log(res);
						uni.showToast({
							title: '评价成功',
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
