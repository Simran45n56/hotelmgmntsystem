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
                               
	      <form role="form" action="/admin/room/add" method="post" enctype="multipart/form-data">
	      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	      
	      							<div class="form-group">
	      							<label>Room-Type</label>
	      							<select name="room_type">
	      							<option value="deluxeroom">Deluxe Room </option>
	      							<option value="doubleroom">Double Bed Room </option>
	      							<option value="singleroom">Single Bed Room </option>
	      							
	      							</select>
	      							</div>
                                    
                                        <div class="form-group">
                                            <label>Room-Rate</label>
                                            <input class="form-control" name="room_rate" type="text" placeholder="Enter rate here" required>
                                            <p class="help-block">Enter name in block letters.</p>
                                        </div>
                                        <div class="form-group">
                                            <label>Room Description</label>
                                            <input class="form-control" type="text" name="room_description" placeholder="Enter description here" required>
                                        </div>
                                          <div class="form-group">
                                            <label>Room Image</label>
                                            <input class="form-control" type="file" name="room_image" placeholder="Enter image here" required>
                                        </div>
                                         <div class="form-group">
                                            <label>Room-Status</label>
                                            
                                            <input  type="radio" name="room_status" value="1"> room-available &nbsp; &nbsp; &nbsp;
                                             <input  type="radio" name="room_status" value="0"> room-notavailable &nbsp; &nbsp;
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
