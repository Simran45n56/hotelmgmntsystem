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
                    <h1 class="page-header">Edit Room</h1>
                </div>
                <!-- /.col-lg-12 -->
                   
                <!-- add course information form-->
                <div class="row">
                                <div class="col-lg-9">
                               
	      <form role="form" action="/admin/room/update" method="post">
	      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
	      
                                        <div class="form-group">
                                            <label>Id</label>
                                            <input class="form-control" name="room_id" type="text" value="${Room.room_id}"  readonly>
                                            <p class="help-block">Enter name in block letters.</p>
                                        </div>
                                    
                                        <div class="form-group">
                                            <label>Room Type</label>
                                            <input class="form-control" name="room_type" type="text" value="${Room.room_type}"  required>
                                            <p class="help-block">Enter name in block letters.</p>
                                        </div>
                                        <div class="form-group">
                                            <label>Room rate</label>
                                            <input class="form-control" type="text" name="room_rate" value="${Room.room_rate}" required>
                                        </div>
                                         <div class="form-group">
                                            <label>Room Description</label>
                                            <input class="form-control" type="text" name="room_description" value="${Room.room_description}"  required>
                                        </div>
                                          <div class="form-group">
                                            <label>Room Image</label>
                                            <input class="form-control" type="text" name="room_image" value="${Room.room_image}"  required>
                                        </div>
                                            <div class="form-group">
                                            <label>Room status</label>
                                            <input  type="radio" name="room_status" value="1" <c:if test="${Room.room_status.equals(true)}"> checked</c:if>> check-in &nbsp; &nbsp; &nbsp;
                                            <input type="radio" name="room_status" value="0" <c:if test="${Room.room_status.equals(false)}"> checked</c:if>> check-out &nbsp; &nbsp;
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
