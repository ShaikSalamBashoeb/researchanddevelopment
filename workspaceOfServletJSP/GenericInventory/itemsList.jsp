<%@ page language="java" import="java.util.List,com.inv.vo.items.Item;" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="/static/js/dojo1.5/dojo/dojo.js" djConfig="parseOnLoad:true, isDebug:false"></script>
</head>
<body>
<form id="formId" method="post">
<%
	List<Item> itemsList = (List<Item>)request.getAttribute("itemsList");
%>
<table>
<tr><td><input type="button" value="Add" onClick="validateAdd();"></input></td></tr>
</table>
<table>
<tr><td></td><td>Name</td><td>Unit</td><td>Unit Quantity</td><td>Price Per Unit</td><td>Total Price</td><td>Created Date</td></tr>
<%
	if(itemsList != null && itemsList.size() != 0) {
%>

<%
	for(Item item: itemsList) {
%>
<tr><td><input type="checkbox" name="<%=item.getName()%>" id="<%=item.getName()%>"></input></td><td><%= item.getName() %></td><td><%= item.getUnit() %></td><td><%= item.getUnitQuantity() %></td><td><%= item.getPricePerUnit() %></td><td><%= item.getTotalPrice() %></td><td><%= item.getCreatedDate() %></td></tr>
<%} %>
<% } else { %>

<tr><td>No Items Available</td></tr>
<%} %>
</table>

<script type="text/javascript">

function validateAdd() {

	dojo.byId('formId').action = '/GenericInventory/AddItem.do';
	dojo.byId('formId').submit();
	
	
}

</script>
</form>
</body>
</html>