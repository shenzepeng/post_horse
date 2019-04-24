<template>
	<view class="content">
		<view class="">
			<mSearch :mode="2" button="inside" :show="true" @search="search($event,3)"></mSearch>
		</view>
		<view class="uni-list">
			<view class="uni-list-cell" hover-class="uni-list-cell-hover" v-for="(item,index) in list" :key="index" @tap="goCompanyDetail(item.id)">
				<view class="uni-media-list">
					<image class="uni-media-list-logo" :src="item.imgUrl"></image>
					<view class="uni-media-list-body">
						<view class="uni-media-list-text-top">{{item.companyName}}</view>
						<view class="uni-media-list-text-bottom uni-ellipsis">{{item.serviceIfo}}</view>
					</view>
				</view>
			</view>
		</view>
       <!-- <image class="logo" src="../../static/logo.png"></image>
		<view>
            <text class="title">{{title}}</text>
        </view> -->
	</view>
</template>

<script>
	import mSearch from '../../components/mehaotian-search.vue';
	import BASEURL from "../../common/baseInfo.js";
	export default {
		components:{
			mSearch
		},
		data() {
			return {
				// title: 'index'
				list:[],
			}
		},
		onLoad() {
// 			uni.removeStorage({
// 				key: 'userInfo',
// 				success: function (res) {
// 					console.log('success');
// 				}
// 			});
			// this.getMyLocation();
			
			this.getData();
		},
		onShow() {
			this.goLogin();
		},
		onPullDownRefresh() {
			console.log('refresh');
			this.getData();
			setTimeout(function () {
				uni.stopPullDownRefresh();
			}, 1000);
		},
		methods: {
			getData() {
				let that = this;
				uni.request({
					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/findAllCompanyListVo.action`,
					method: 'GET',
					data: {},
					success: res => {
						console.log(res);
						that.list = res.data.data;
					},
					fail: () => {},
					complete: () => {}
				});
			},
			goLogin() {
				let that = this;
				uni.getStorage({
					key: 'userInfo',
					success: function (res) {
						console.log(res.data);
						if (res.data == undefined) {
							uni.navigateTo({
								url: '../login/login',
								success: res => {},
								fail: () => {},
								complete: () => {}
							});
						}
					},
					fail() {
						uni.navigateTo({
							url: '../login/login',
							success: res => {},
							fail: () => {},
							complete: () => {}
						});
					}
				});
				
			},
			goCompanyDetail(id) {
				uni.navigateTo({
					url: '../companyDetail/companyDetail?id='+id,
					success: res => {},
					fail: () => {},
					complete: () => {}
				});
			},
// 			getMyLocation() {
// 				uni.getLocation({
// 				type: 'gcj02', //返回可以用于uni.openLocation的经纬度
// 				success: function (res) {
// 					const latitude = res.latitude;
// 					const longitude = res.longitude;
// 					uni.openLocation({
// 						latitude: latitude,
// 						longitude: longitude,
// 						success: function () {
// 							console.log('success');
// 						}
// 					});
// 				}
// 			});
// 			},
			search(e, val) {
				let that = this;
				if (e == null || e == '') {
					that.getData();
					return;
				}
				console.log(e);
				uni.request({
					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/findCompanyByCompanyName.action`,
					method: 'GET',
					data: {
						companyName: e
					},
					success: res => {
						console.log(res);
						that.list = res.data.data;
					},
					fail: () => {},
					complete: () => {}
				});
			}
		}
	}
</script>

<style>
	.content {
		/* text-align: center; */
		height: 400upx;
	}
    .logo{
        height: 200upx;
        width: 200upx;
        margin-top: 200upx;
    }
	.title {
		font-size: 36upx;
		color: #8f8f94;
	}
</style>
