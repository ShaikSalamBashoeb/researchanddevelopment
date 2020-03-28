<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="/static/js/dojo1.5/dojo/dojo.js" djConfig="parseOnLoad:true, isDebug:false"></script>
</head>
<body>
<form action="" id="addFormId">
<table>
<tr><td>Name: </td><td><input name="name" type="text" value=""></input></td></tr>
<tr><td>Unit Quantity: </td><td><input name="unitQuantity" type="text" value=""></input></td></tr>
<tr><td>Unit: </td><td><input name="unit" type="text" value=""></input></td></tr>
<tr><td>Price Per Unit: </td><td><input name="pricePerUnit" type="text" value=""></input></td></tr>
<tr><td>Total Price: </td><td><input name="totalPrice" type="text" value=""></input></td></tr>
<tr><td colspan="2"><input type="button" value="Save" onClick="validateSave();"></input></td>
</table>

<script type="text/javascript">
function validateSave() {

	dojo.byId('addFormId').action='/GenericInventory/CreateOption.do';
	dojo.byId('addFormId').submit();;
}

</script>
</form>
</body>
</html>