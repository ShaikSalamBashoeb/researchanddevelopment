<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DashBoard Page</title>

<script type="text/javascript">

function submitForm() {
	//document.form.action="monthly/monthlyListAction.action";
	//document.form.submit();
}
</script>
</head>
<body>
<form method="POST" action="monthly/monthlyListAction.action">
<h1>DashBoard Page</h1>

<%-- <a href="javascript:submitForm();">Monthly Report</a>--%>
<input type="submit" value="Monthly Report"></input>
<table>
<tr><td></td><td></td><td></td><td></td></tr>
<tr><td></td><td></td><td></td><td></td></tr>
</table>
</form>
</body>
</html>