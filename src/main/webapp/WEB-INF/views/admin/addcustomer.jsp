<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">

<head>

	<%@include file="title.jsp" %>

<!-- Bootstrap Core CSS -->
    <link href="/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="/vendor/morrisjs/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <%@include file="header.jsp" %>
       
        <div id="page-wrapper">
            <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Add Customer</h1>
                </div>
                <!-- /.col-lg-12 -->
                   
                <!-- add course information form-->
                <div class="row">
                                <div class="col-lg-9">
                               
	      <form role="form" action="/admin/customer/add" method="post">
	      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                    
                                        <div class="form-group">
                                            <label>Name</label>
                                            <input class="form-control" name="customer_name" type="text" placeholder="Enter name here" required>
                                            <p class="help-block">Enter name in block letters.</p>
                                        </div>
                                        <div class="form-group">
                                            <label>Phone number</label>
                                            <input class="form-control" type="text" name="customer_number" placeholder="Enter number here" required>
                                        </div>
                                         <div class="form-group">
                                            <label>Email address</label>
                                            <input class="form-control" type="text" name="customer_email" placeholder="Enter email  here" required>
                                        </div>
                                          <div class="form-group">
                                            <label>Address</label>
                                            <input class="form-control" type="text" name="customer_address" placeholder="Enter address  here" required>
                                        </div>
                                            <div class="form-group">
                                            <label>Customer status</label>
                                            <input  type="radio" name="customer_status" value="1"> check-in &nbsp; &nbsp; &nbsp;
                                            <input type="radio" name="customer_status" value="0"> check-out &nbsp; &nbsp;
                                        </div>
                                        
                                      
                       
                                        
                                        <button type="submit" class="btn btn-default">Submit Button</button>
                                        <button type="reset" class="btn btn-default">Reset Button</button>
                                    </form>
                                </div>
            </div>
            </div>
          

    </div>
    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="../vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="../vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="../vendor/metisMenu/metisMenu.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="../vendor/raphael/raphael.min.js"></script>
    <script src="../vendor/morrisjs/morris.min.js"></script>
    <script src="../data/morris-data.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="../dist/js/sb-admin-2.js"></script>

</body>

</html>
