<%@ taglib prefix="c" uri="/WEB-INF/c-rt.tld"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <link rel="stylesheet" type="text/css" href="css/Style1.css">
</head>
<body>

<ul class="topnav">
  <li><a class="active" href="#home">Home</a></li>
    <li class="right" ><a   href="#Login">Logout</a></li>
  <li class="right"><a href="#contact">Welcome <c:out value="${currentSessionUser.getName()}" /> </a></li>
</ul>
 <div class="container">
  <h3 class="center"> Employee Details</h3>
  <c:forEach items="${requestScope.employee}" var="customer">
  <div class="panel panel-primary style_prevu_kit">
    <div class="panel-body ">
     <div class="row">
      <div class="col-sm-2"><img src="mahi.jpg" class="img1 img-circle"></div>
     <div class="col-sm-1">${customer.id}</div>
     <div class=col-sm-2>${customer.firstName}</div>
     <div class=col-sm-2>${customer.lastName}</div>
     <div class=col-sm-2>${customer.address}</div>
     <div class=col-sm-1><button type="button" class="btn btn-info btn-sm">Edit</button></div>
     <div class=col-sm-1><button type="button" class="btn btn-info btn-sm">Delete</button></div>
     </div>
    </div>  
    </div>
    </c:forEach>
  </div>
</body>
</html>