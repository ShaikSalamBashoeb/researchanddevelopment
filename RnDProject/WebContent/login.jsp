<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<link href="/static/js/dojo1.5/dijit/themes/tundra/tundra.css" rel="stylesheet" style="text/css"></link>
<link href="/static/js/dojo1.5/dojo/resources/dojo.css" rel="stylesheet" style="text/css"></link>
<script type="text/javascript" src="/static/js/dojo1.5/dojo/dojo.js"  djConfig="parseOnLoad:true, isDebug:false"></script>
</head>
<body class="tundra">
<!-- http://localhost:8080/RnDProject/login.jsp -->
<form method="POST" action="login/loginAction.action">
<h1>Login Page</h1>
User Name2: <input type="text" name="emp.username" dojoType="dijit.form.TextBox"></input>
Password2: <input type="text" name="emp.password" dojoType="dijit.form.TextBox"></input>

 <!--  <div dojoType="dijit.form.Button" >Login</div>
-->

<input type="submit" value="Login"></input>
<script type="text/javascript">
dojo.require("dijit.form.TextBox");
dojo.require("dijit.form.Button");
dojo.require("dojo.parser");
</script>
</form>
</body>
</html>