<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file = "header.jsp" %> 
     
   <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Electronics</title>
<link href="css/product.css" rel="stylesheet">
<!-- <link href="css/footer.css" rel="stylesheet"> 
 -->
<link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<br>
<br>
<br>

<ul class="products">
<a:forEach items="${productelectronics}" var="prodelec">
    <li>
        <a href="#">
            <center><img src="../images/${prodelec.p_image_name}.jpeg"  style="  border-radius : 10px; width:143px;height:300px;"></center>
            <h4><center>${prodelec.price}</center></h4>
            <h3><center>${prodelec.company_name}</center></h3><br>
        </a>
    </li>
    <li>
    </a:forEach>
    
    
    
        
</ul>

 
<!-- <footer>
<center><p style="font-size:15px;"> Copyright ©2018. All rights reserved.</p></center>
</footer> --> 
<%-- <footer class="page-footer font-small blue">

  <!-- Copyright -->
  <div class="footer-copyright text-center py-3">© 2018 Copyright:
    <a href="https://mdbootstrap.com/bootstrap-tutorial/"> MDBootstrap.com</a>
  </div>
  <!-- Copyright -->

</footer> --%>
<nav class="navbar fixed-bottom navbar-light" style="background-color: #EEEEEE;border-radius: 10px; height:45px;">
  <a class="navbar-brand" href="#"><center><p style="font-size:15px;"> Copyright ©2018. All rights reserved.</p></center></a>
</nav>

</body>
</html>