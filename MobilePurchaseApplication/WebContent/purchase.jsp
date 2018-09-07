<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<f:form action="purchase.obj" modelAttribute="pdetails">
Enter Customer Name:
<f:input path="custName"/>
<f:errors cssStyle="color:red" path="custName"/><br/>

Enter Phone Number:
<f:input path="phoneNo"/>
<f:errors cssStyle="color:red" path="phoneNo"/><br/>

Enter Mail ID:
<f:input path="emailId"/>
<f:errors cssStyle="color:red" path="emailId"/><br/>

Enter Purchase Date:
<f:input path="puchaseDate"/>
<f:errors cssStyle="color:red" path="puchaseDate"/><br/>
<f:hidden path="mobileId"/>
<input type="submit" value="Buy now"/>
</f:form>
</body>
</html>