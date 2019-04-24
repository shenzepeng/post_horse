<template>
	<view class="">
		<!-- <view class="uni-padding-wrap uni-common-mt">
			<uniSegmentedControl :current="current" :values="items" v-on:clickItem="onClickItem" :styleType="styleType"
			 :activeColor="activeColor"></uniSegmentedControl>
		</view> -->
		<view class="content">
			<view class="uni-list" v-show="current === 0">
			    <block v-for="(item,index) in lists" :key="index">
			        <view class="uni-list-cell" hover-class="uni-list-cell-hover">
			            <view class="uni-triplex-row">
			                <view class="uni-triplex-left" @tap="openDetail(item.id)">
			                    <text class="uni-title uni-ellipsis" v-if="userInfo.type == '个人账号'">{{item.companyName}}</text>
			                    <text class="uni-title uni-ellipsis" v-if="userInfo.type == '企业账号'">{{item.customerName}}</text>
			                    <text class="uni-text-small">出发地：{{item.origin}}</text>
			                    <text class="uni-text-small uni-ellipsis">目的地：{{item.destination}}</text>
			                </view>
			                <view class="uni-triplex-right" style="width: 200upx;">
			                    <text class="uni-h5">订单{{item.orderStatus}}</text>
								<!-- <button class="order-item-button" type="primary" v-if="item.orderStatus == '已取消'">取消原因</button> -->
								<button class="order-item-button" type="primary" v-if="userInfo.type == '个人账号' && item.orderStatus == '已完成' && item.evaluateContent == null" @tap="goEval(item.id)">去评价</button>
			                </view>
			            </view>
			        </view>
			    </block>
			</view>
			<!-- <view class="uni-list" v-show="current === 1">
			    <block v-for="(item,index) in lists" :key="index">
			        <view class="uni-list-cell" hover-class="uni-list-cell-hover">
			            <view class="uni-triplex-row">
			                <view class="uni-triplex-left">
			                    <text class="uni-title uni-ellipsis">偶成1搬家公司</text>
			                    <text class="uni-text-small">出发地：电视塔</text>
			                    <text class="uni-text-small uni-ellipsis">目的地：广电公司</text>
			                </view>
			                <view class="uni-triplex-right" style="width: 200upx;">
			                    <text class="uni-h5">订单已完成</text>
								<button class="order-item-button" type="primary">取消原因</button>
			                </view>
			            </view>
			        </view>
			    </block>
			</view>
			<view class="uni-list" v-show="current === 2">
			    <block v-for="(item,index) in lists" :key="index">
			        <view class="uni-list-cell" hover-class="uni-list-cell-hover">
			            <view class="uni-triplex-row">
			                <view class="uni-triplex-left">
			                    <text class="uni-title uni-ellipsis">偶成2搬家公司</text>
			                    <text class="uni-text-small">出发地：电视塔</text>
			                    <text class="uni-text-small uni-ellipsis">目的地：广电公司</text>
			                </view>
			                <view class="uni-triplex-right" style="width: 200upx;">
			                    <text class="uni-h5">订单已完成</text>
								<button class="order-item-button" type="primary">取消原因</button>
			                </view>
			            </view>
			        </view>
			    </block>
			</view> -->
		</view>
	</view>
</template>

<script>
	import BASEURL from "../../common/baseInfo.js";
	import uniSegmentedControl from '../../components/uni-segmented-control.vue';
	export default {
		data() {
			return {
				title:'order',
				lists: [],
// 				items: [
// 					'选项卡1',
// 					'选项卡2',
// 					'选项卡3'
// 				],
				current: 0,
				activeColor: '#007aff',
				styleType: 'button',
				userInfo: {},
// 				styleIndex: 0,
// 				colorIndex: 0,
			};
		},
		components: {
			uniSegmentedControl
		},
		onLoad() {
			this.init();
		},
		onPullDownRefresh() {
			console.log('refresh');
			this.getData();
			setTimeout(function () {
				uni.stopPullDownRefresh();
			}, 1000);
		},
// 		onShow() {
// 			this.getData();
// 		},
		methods:{
			init() {
				let that = this;
				uni.getStorage({
					key: 'userInfo',
					success: function (res) {
						// console.log(res);
						that.userInfo = res.data;
						
						that.getData();
						// console.log(that.userInfo);
					},
					fail(err) {
						console.log(err);
					}
				});
			},
			openDetail(id) {
				uni.navigateTo({
					url: '../orderDetail/orderDetail?id='+id,
					success: res => {},
					fail: () => {},
					complete: () => {}
				});
			},
			onClickItem(index) {
				if (this.current !== index) {
					this.current = index;
				}
			},
			goEval(id) {
				let that = this;
				uni.navigateTo({
					url: '../evaluate/evaluate?id='+id,
					success: res => {},
					fail: () => {},
					complete: () => {}
				});
			},
			getData() {
				let that = this;
				if (that.userInfo.type == '个人账号') {
					uni.request({
						url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/findBooksByUserId.action`,
						method: 'GET',
						data: {
							userId: that.userInfo.id
						},
						success: res => {
							console.log(res);
							that.lists = res.data.data;
						},
						fail: () => {},
						complete: () => {}
					});
				} else {
					uni.request({
					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/findCompanyByCompanyUserId.action`,
					method: 'GET',
					data: {
						userId: that.userInfo.id,
					},
					success: res => {
						console.log(res);
						if (res.data.data.length == 0) {
							// that.btnText = '去认证';
						} else {
							uni.request({
								url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/findBooksByCompanyId.action`,
								method: 'GET',
								data: {
									companyId: res.data.data[0].id
								},
								success: res2 => {
									console.log(res2);
									that.lists = res2.data.data;
								},
								fail: () => {},
								complete: () => {}
							});
						}
					},
					fail: () => {},
					complete: () => {}
				});
					
				}
			},
		}
	}
</script>

<style lang="less">
	.uni-triplex-right{
		justify-content: space-between;
		align-items: flex-end;
	}
	.order-item-button{
		width: 160upx;
		height: 60upx;
		font-size: 26upx;
		margin: 0;
	}
	.content{
		margin-top: 30upx;
	}
</style>
