(global["webpackJsonp"]=global["webpackJsonp"]||[]).push([["pages/changeNickName/changeNickName"],{1063:function(e,t,n){"use strict";n.r(t);var a=n("828a"),i=n.n(a);for(var o in a)"default"!==o&&function(e){n.d(t,e,function(){return a[e]})}(o);t["default"]=i.a},3029:function(e,t,n){"use strict";n("601e");var a=o(n("b0ce")),i=o(n("c202"));function o(e){return e&&e.__esModule?e:{default:e}}Page((0,a.default)(i.default))},"78e4":function(e,t,n){"use strict";var a=n("806c"),i=n.n(a);i.a},"806c":function(e,t,n){},"828a":function(e,t,n){"use strict";(function(e){Object.defineProperty(t,"__esModule",{value:!0}),t.default=void 0;var a=i(n("3ff6"));function i(e){return e&&e.__esModule?e:{default:e}}var o={data:function(){return{userInfo:{},nickName:""}},onLoad:function(){this.init()},methods:{init:function(){var t=this;e.getStorage({key:"userInfo",success:function(e){console.log(e),t.userInfo=e.data,console.log(t.userInfo)},fail:function(e){console.log(e)}})},editNickName:function(){var t=this;e.request({url:"".concat(a.default,"/post_horse-0.0.1-SNAPSHOT/updateUserById.action"),method:"PUT",data:{id:t.userInfo.id,nickName:t.nickName},success:function(n){e.request({url:"".concat(a.default,"/post_horse-0.0.1-SNAPSHOT/findUserById.action"),method:"GET",data:{id:t.userInfo.id},success:function(t){console.log(t),e.setStorage({key:"userInfo",data:t.data.data,success:function(){e.navigateBack()}})},fail:function(){},complete:function(){}})},fail:function(){},complete:function(){}})}}};t.default=o}).call(this,n("6e42")["default"])},8290:function(e,t,n){"use strict";var a=function(){var e=this,t=e.$createElement,n=e._self._c||t;return n("view",[n("view",{staticClass:"auth-again"},[n("view",{staticClass:"auth-item"},[n("view",{staticClass:"label"},[e._v("昵称")]),n("input",{directives:[{name:"model",rawName:"v-model",value:e.nickName,expression:"nickName"}],staticClass:"input",attrs:{type:"text",value:"",placeholder:"请输入昵称",eventid:"3e0b4eba-0"},domProps:{value:e.nickName},on:{input:function(t){t.target.composing||(e.nickName=t.target.value)}}})]),n("view",{staticClass:"auth-item"},[n("button",{attrs:{type:"primary",eventid:"3e0b4eba-1"},on:{tap:e.editNickName}},[e._v("提交")])],1)])])},i=[];n.d(t,"a",function(){return a}),n.d(t,"b",function(){return i})},c202:function(e,t,n){"use strict";n.r(t);var a=n("8290"),i=n("1063");for(var o in i)"default"!==o&&function(e){n.d(t,e,function(){return i[e]})}(o);n("78e4");var u=n("2877"),c=Object(u["a"])(i["default"],a["a"],a["b"],!1,null,null,null);t["default"]=c.exports}},[["3029","common/runtime","common/vendor"]]]);