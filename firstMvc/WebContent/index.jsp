<!DOCTYPE html>
<html>
<head>
<title>Employee</title>  
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
   <link rel="stylesheet" type="text/css" href="css/Style1.css">
</head>
<body>
  <ul class="topnav">
  <li><a class="active" href="#home">Home</a></li>
  <li><a href="#news">News</a></li>
  <li><a href="#contact">Contact</a></li>
  <li class="right" data-toggle="modal" data-target="#myModal"><a   href="#Login">Login</a></li>
</ul>
       
        
      <!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog" data-keyboard="true" data-backdrop="static">
    <div class="modal-dialog ">
    
      <!-- Modal content-->
      <div class="modal-content ">
        <div class="modal-header model-header-color">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Login</h4>
        </div>
        <div class="modal-body">
        
          <form action="controlleServlet?action=displaylist" method="post" >
   
          
          <div class="form-group">
            <label for="">Employee Name:</label>
            <input  type="text" class="form-control"  name="name" placeholder="Enter Your Name" required >
          </div>
        
           <div class="form-group">
            <label for="pwd">Password:</label>
             <input type="password" class="form-control" id="pwd" name="pwd" placeholder="Enter password">
           </div>
         <button type="submit" class="btn btn-primary model-header-color">Submit</button>
      </form>

       </div>
       
      </div>
      
    </div>
    </div>

       
</body>
</html>