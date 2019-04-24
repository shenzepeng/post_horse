<template>
	<view>
		<view class="uni-list">
			<view class="uni-list-cell" hover-class="uni-list-cell-hover" v-for="(item,index) in list" :key="index" @tap="goCompanyDetail(item.company.id)">
				<view class="uni-media-list">
					<image class="uni-media-list-logo" :src="item.user.imgUrl"></image>
					<view class="uni-media-list-body">
						<view class="uni-media-list-text-top">{{item.company.companyName}}</view>
						<view class="uni-media-list-text-bottom uni-ellipsis">{{item.company.serviceIfo}}</view>
					</view>
				</view>
			</view>
		</view>
	</view>
</template>

<script>
	import BASEURL from "../../common/baseInfo.js";
	export default {
		data() {
			return {
				userInfo:{},
				list:[],
			};
		},
		onLoad() {
			// this.getData();
			this.init();
		},
		onPullDownRefresh() {
			console.log('refresh');
			this.getData(this.userInfo.id);
			setTimeout(function () {
				uni.stopPullDownRefresh();
			}, 1000);
		},
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
					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/findFavortiesByUserId.action`,
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
			goCompanyDetail(id) {
				let that = this;
				uni.navigateTo({
					url: '../companyDetail/companyDetail?id='+id,
					success: res => {},
					fail: () => {},
					complete: () => {}
				});
			},
// 			getNewItem(item) {
// 				// console.log(item);
// 				uni.request({
// 					url: `${BASEURL}/post_horse-0.0.1-SNAPSHOT/findCompanyById.action`,
// 					method: 'GET',
// 					data: {
// 						id: item.companyId
// 					},
// 					success: res => {
// 						// console.log(res.data.data);
// 						let newItem = res.data.data;
// 						console.log(newItem);
// 						return newItem;
// 						// newItem.
// 					},
// 					fail: () => {},
// 					complete: () => {}
// 				});
// 			}
		}
	}
</script>

<style lang="less">

</style>
