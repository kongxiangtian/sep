function fnLogin() {
 var oUname = document.getElementById("username")
 var oUpass = document.getElementById("psw")
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
 $.ajax({
     async:false,
     url: "http://localhost:8080/weekreport/login?username=123&psw=321",
     type: "POST",
     data: {
    	
     },
     dataType: "json",
     success: function (data) {
         if (data.resultInfo == "success") {
             alert("登录成功");
         }
         else  {
             alert("登录失败");
         } 
     },
     error:function (data) {
         alert(data.result);
         
     }
 });
 /*window.alert("登录成功")
 window.open("student.html")*/
}

function postinfor(){
	 $.ajax({
	     async:true,
	     crossDomain:true,
	     type: "post",
	     url: "http://localhost:8080/weekreport/updateuser?username=fe&sex=0&department=1&teachername=1&teacherid=2",
	    	
	     data: "",
//	    	 JSON.stringify({
//	    	 name: "1234567",
//	    	 dep:"1234567",
//	    	 sex:"1234567",
//	    	 tecname:"1234567",
//	    	 tecid:"1234567"
//	     }),
	     contentType: 'application/json;charset=UTF-8',
	     dataType: "json",//预期服务器返回的数据类型
	     success: function (data) {
	         if (data.code == "0") {
	             alert("修改成功");
	         }
	         else  {
	             alert("修改失败");
	         } 
	     },
	     error:function (data) {
	         alert("error");     
	     }
	 });
}
