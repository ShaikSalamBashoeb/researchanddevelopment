<%@ page language="java" import="java.util.List,com.inv.vo.options.Option;" contentType="text/html; charset=ISO-8859-1"
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
	List<Option> optionsList = (List<Option>)request.getAttribute("optionsList");
%>
<table>
<tr><td><input type="button" value="Add" onClick="validateAdd();"></input></td></tr>
</table>
<table>
<tr><td></td><td>Name</td><td>Unit</td><td>Unit Quantity</td><td>Price Per Unit</td><td>Total Price</td><td>Created Date</td></tr>
<%
	if(optionsList != null && optionsList.size() != 0) {
%>

<%
	for(Option option: optionsList) {
%>
<tr><td><input type="checkbox" name="<%=option.getName()%>" id="<%=option.getName()%>"></input></td><td><%= option.getName() %></td><td><%= option.getUnitQuantity() %></td><td><%= option.getUnit() %></td><td><%= option.getPricePerUnit() %></td><td><%= option.getTotalPrice() %></td><td><%= option.getCreatedDate() %></td></tr>
<%} %>
<% } else { %>

<tr><td>No Options Available</td></tr>
<%} %>
</table>

<input type="text" name="email" dojoType="dijit.form.ValidationTextBox"
	length="25" 
	trim="true" 
	lowercase="true" 
	regExp="[a-z0-9._%+-]+@[a-z0-9-]+\.[a-z]{2,4}" 
	required="true" 
	invalidMessage="Please enter valid email ID"></input>
<script type="text/javascript">

function validateAdd() {

	dojo.byId('formId').action = '/GenericInventory/AddOption.do';
	dojo.byId('formId').submit();
	
	
}

</script>
</form>
</body>
</html>