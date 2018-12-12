function fninfor() {
 var oUname = document.getElementById("uname")
 var oUpass = document.getElementById("usex")
  var oUsele = document.getElementById("usele")
   var oTname = document.getElementById("tname") 
   var oTinfor = document.getElementById("tinfor")

 var oError = document.getElementById("error_box")
 var isError = true;
 if (oUname.value.length > 15 || oUname.value.length < 6) {
  oError.innerHTML = "用户名请输入6-15位字符";
  isError = false;
  return;
 }
 if (oUpass.value.length > 15 || oUpass.value.length < 6) {
  oError.innerHTML = "密码请输入6-15位字符"
  isError = false;
  return;
 }
 window.alert("登录成功")
}
