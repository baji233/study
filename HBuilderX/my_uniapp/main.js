// #ifndef VUE3
import Vue from 'vue'
import App from './App'
// 按需导入 $http 对象
import { $http } from '@escook/request-miniprogram'

// 在 uni-app 项目中，可以把 $http 挂载到 uni 顶级对象之上，方便全局调用
uni.$http = $http

// 配置请求根路径
$http.baseUrl = 'https://api-hmugo-web.itheima.net/api/public/v1'

// 请求开始之前做一些事情
$http.beforeRequest = function (options) {
  uni.showLoading({
  	title: '数据加载中...'
  })
}

//请求后隐藏加载条
$http.afterRequest = function (options) {
	uni.hideLoading()
}

// 封装请求失败的提示信息的方法
uni.$showReqErrorMsg = function ( title = '数据请求失败!', duration = 1500) {
	uni.showToast({
		title,
		duration,
		icon: 'none',
	})
}
 
Vue.config.productionTip = false

App.mpType = 'app'

const app = new Vue({
    ...App
})
app.$mount()
// #endif

// #ifdef VUE3
import { createSSRApp } from 'vue'
import App from './App.vue'
export function createApp() {
  const app = createSSRApp(App)
  return {
    app
  }
}
// #endif