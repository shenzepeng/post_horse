<script>
	export default {
		onLaunch: function () {
			console.log('App Launch')
		},
		onShow: function () {
			console.log('App Show')
		},
		onHide: function () {
			console.log('App Hide')
		},
		methods:{
			
		}
	}
</script>

<style lang="less">
	/* uni.css - 通用组件、模板样式库，可以当作一套ui库应用 */
	@import './common/uni.css';
	/*每个页面公共css */
	button{
		height: 60upx;
		line-height: 60upx;
		font-size: 30upx;
		background: linear-gradient(to right, #04a9fe , #468ff2);
	}
</style>
