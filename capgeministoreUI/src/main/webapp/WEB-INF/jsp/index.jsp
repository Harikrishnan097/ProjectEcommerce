<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ include file = "header.jsp" %> 
     
   <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
   
   
  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="css/product.css" rel="stylesheet">
<link href="css/footer.css" rel="stylesheet">
<link href="css/bootstrap.min.css" rel="stylesheet">  



</head>
<body>


<marquee   behavior="scroll" direction="left" scrollamount="15" ><a href="https://www.google.com"><img src="../images/poster4.jpg "> </a> <a href="https://www.google.com"><img src="../images/poster3.jpg "> </a> <a href="https://www.google.com"><img src="../images/poster4.jpg "> </a> </marquee>
<!-- <table border="1px" class="table">
<tr>
<th>ID</th>
<th>Name</th>
<th>company name</th>
</tr> -->

<%-- <a:forEach items="${product}" var="prod">

<tr>
<td>${prod.p_id}</td>
<td>${prod.p_name}</td>
<td>${prod.company_name}</td>
</tr>
</a:forEach> --%>
<br>
<br>
<br>

<ul class="products">
<a:forEach items="${product}" var="prod">
    <li>
        <a href="#">
            <center><img src="../images/${prod.p_image_name}.jpeg"  style="  border-radius : 10px;width:143px;height:300px;"></center>
            <h4><center>${prod.price}</center></h4>
            <h3><center>${prod.company_name}</center></h3><br>
        </a>
    </li>
    <li>
    </a:forEach>
    
    
    
        
</ul>

<!-- <footer class="footer">
<center><p style="font-size:15px;"> Copyright ©2018. All rights reserved.</p></center>
</footer> -->
<nav class="navbar fixed-bottom navbar-light" style="background-color: #EEEEEE; border-radius: 10px; height:45px;">
  <a class="navbar-brand" href="#"><center><p style="font-size:15px;"> Copyright ©2018. All rights reserved.</p></center></a>


</nav>
</body>
</html>