function fnLogin() {
 var oUname = document.getElementById("uname")
 var oUpass = document.getElementById("upass")
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
	 async:true,
     crossDomain:true,
     type: "post",
     url: "http://localhost:8080/weekreport/login",
     data: {
    	 account:$('#uname').val(),
    	 psw:$('#upass').val()
     },
     dataType: "json",
     success: function (data) {
    	var obj=eval("("+data+")");
    	 if ( obj== "1") {
    		 window.location.href="index.html";
         }
         else  {
             alert("登录失败");
         } 
     },
     error:function (data) {
         alert("error");     
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
	     url: "http://localhost:8080/weekreport/updateuser",
	    	
	    data: 
	     { 
	    	 username: $('#username').val(),
	    	 department:$('#department').val(),
    	 sex:$('#sex').val(),
	    	 teachername:$('#teachername').val(),
	    	teacherdes:$('#teacherdes').val()
	    		},
	   //  contentType: 'application/json;charset=UTF-8',
	     dataType: "json",//预期服务器返回的数据类型
	     success: function (data) {
	         if (data.code == "0") {
	             alert("提交成功");
	         }
	         else  {
	             alert("提交失败");
	         } 
	     },
	     error:function (data) {
	         alert("error");     
	     }
	 });
}
function reportinfor(){
	 $.ajax({
	     async:true,
	     crossDomain:true,
	     type: "post",
	     url: "http://localhost:8080/weekreport/everyreport",
	    	
	    data: 
	     { 
	    	lastweek: $('#lastweek').val(),
	    	thisweek:$('#thisweek').val(),
	    	attachurl:$('#attachurl').val(),
	    	QandA:$('#QandA').val(),
	    	nextweek:$('#nextweeks').val()
	    		},
	   //  contentType: 'application/json;charset=UTF-8',
	     dataType: "json",//预期服务器返回的数据类型
	     success: function (data) {
	         if (data.code == "0") {
	             alert("提交成功");
	         }
	         else  {
	             alert("提交失败");
	         } 
	     },
	     error:function (data) {
	         alert("error");     
	     }
	 });
}



function getinfor(){
	 $.ajax({
	     async:true,
	     crossDomain:true,
	     type: "get",
	     url: "http://localhost:8080/weekreport/updateuser",
	    	
	    data: 
	     { 
	    	 username: $('#username').val(),
	    	 department:$('#department').val(),
   	 sex:$('#sex').val(),
	    	 teachername:$('#teachername').val(),
	    	teacherdes:$('#teacherdes').val()
	    		},
	   //  contentType: 'application/json;charset=UTF-8',
	     dataType: "json",//预期服务器返回的数据类型
	     success: function (data) {
	         if (data.code == "0") {
	             alert("提交成功");
	         }
	         else  {
	             alert("提交失败");
	         } 
	     },
	     error:function (data) {
	         alert("error");     
	     }
	 });
}
