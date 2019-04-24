<template>
	<view class="list-box">
		<view class="list-item"  v-for="(item,index) in list" :key="index">
			<view class="item-top">{{item.companyName}}</view>
			<view class="item-bottom">
				<view class="bottom1">
					<view class="name">
						{{item.customerName}}
					</view>
					<view class="time">
						{{item.finishedTime}}
					</view>
				</view>
				<view class="bottom2">
					<view class="code">
						<text>服务：</text><uni-rate :value="item.score" disabled="true"></uni-rate>
					</view>
					<view class="address">
						{{item.origin}}-{{item.destination}}
					</view>
				</view>
				<view class="content">
					{{item.evaluateContent}}
				</view>
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
				list: [],
				userInfo: {},
			};
		},
		onLoad() {
			this.init();
		},
		onPullDownRefresh() {
			console.log('refresh');
			this.getData(this.userInfo.id);
			setTimeout(function () {
				uni.stopPullDownRefresh();
			}, 1000);
		},
		components: {uniRate},
		methods:{
			init() {
				let that = this;
				uni.getStorage({
				key: 'userInfo',
				success: function (res) {
					console.log(res);
					that.userInfo = res.data;
					console.log(that.userInfo);
					
					that.getData(res.data.id);
				},
				fail(err) {
					console.log(err);
				}
			});
			},
			getData (id) {
				let that = this;
				uni.request({
					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/findBooksByUserIdAndCommonsIsNotNull.action`,
					method: 'GET',
					data: {
						userId: id
					},
					success: res => {
						console.log(res);
// 						var a1 = ['a', 'b', 'c'];
// 						let newList = res.data.data.map(function(item,key,ary) {
// 							return that.getNewItem(item)
// 						})
// 						console.log(newList);
// 						var a2 = a1.map(function(item，key，ary) {
// 							 return item.toUpperCase();
// 						});
// 						console.log(a1);// ['a','b','c'];
// 						console.log(a2); //['A','B','C'];
						that.list = res.data.data;
					},
					fail: () => {},
					complete: () => {}
				});
			},
		}
	}
</script>

<style lang="less">
	.uni-page-body{
		background-color: #f8f8f8;
	}
	.list-box{
		padding-top: 30upx;
		.list-item{
			margin-bottom: 30upx;
			border-top: 1upx solid #ddd;
			border-bottom: 1upx solid #ddd;
			.item-top{
				padding: 0 30upx;
				border-bottom: 1upx solid #ddd;
			}
			.item-bottom{
				padding: 0 30upx;
				.bottom1{
					display: flex;
					justify-content: space-between;
					align-items: center;
					height: 60upx;
					line-height: 60upx;
					.name{
						
					}
					.time{
						
					}
				}
				.bottom2{
					display: flex;
					justify-content: space-between;
					align-items: center;
					height: 60upx;
					line-height: 60upx;
					.code{
						display: flex;
						justify-content: flex-start;
						align-items: center;
					}
					.address{
						
					}
				}
				.content{
					line-height: 60upx;
				}
			}
		}
	}
</style>
