<%@ page import="java.util.*" %>

<html>
<body>
	<% 
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	// get the list of advise from request
	List<String> listOfAdvices = (List<String>)request.getSession().getAttribute("advise"); 
	
	/**
	 * get the iterator
	 */
	 if(null!=listOfAdvices) {
		Iterator<String> iter = listOfAdvices.iterator();
		String str = null;
		
		while(iter.hasNext()) {
			
			/**
			 * get the advise
			 */
			str = iter.next();
			
			out.println("<br>try: "+str);
		}
	 }
	
	%>
<h1>Redirect Successful</h1>
</body>
</html>