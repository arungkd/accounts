<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  	<!-- DataTables -->
  <link rel="stylesheet" href="/accounts/resources/plugins/datatables/dataTables.bootstrap4.css">

  <!-- Font Awesome Icons -->
  <link rel="stylesheet" href="/accounts/resources/plugins/font-awesome/css/font-awesome.min.css">
  
  <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.0/themes/base/jquery-ui.css">
  
  <!-- Theme style -->
  <link rel="stylesheet" href="/accounts/resources/css/adminlte.min.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="/accounts/resources/font/fontcss.css" rel="stylesheet">
  
  <!-- REQUIRED SCRIPTS -->
	<!-- jQuery -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.0.0/jquery.min.js"></script>
	
	<!-- jQuery UI -->
	<script src="https://code.jquery.com/ui/1.12.0/jquery-ui.js"></script>
	
	<!-- Bootstrap -->
	<script src="/accounts/resources/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
	<!-- AdminLTE App -->
	<script src="/accounts/resources/js/adminlte.js"></script>
	
	<!-- OPTIONAL SCRIPTS -->
	<script src="/accounts/resources/js/demo.js"></script>
	
	<!-- PAGE PLUGINS -->
	<!-- SparkLine -->
	<script src="/accounts/resources/plugins/sparkline/jquery.sparkline.min.js"></script>
	<!-- jVectorMap -->
	<script src="/accounts/resources/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
	<script src="/accounts/resources/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
	<!-- SlimScroll 1.3.0 -->
	<script src="/accounts/resources/plugins/slimScroll/jquery.slimscroll.min.js"></script>
	<!-- ChartJS 1.0.2 -->
	<script src="/accounts/resources/plugins/chartjs-old/Chart.min.js"></script>
	
	<!-- PAGE SCRIPTS -->
	<script src="/accounts/resources/js/pages/dashboard2.js"></script>
	
	<!-- DataTables -->
	<script src="/accounts/resources/plugins/datatables/jquery.dataTables.js"></script>
	<script src="/accounts/resources/plugins/datatables/dataTables.bootstrap4.js"></script>
	
	<!-- Select combo box -->
	<script src="/accounts/resources/plugins/select2/select2.full.min.js"></script>
	<link rel="stylesheet" href="/accounts/resources/plugins/select2/select2.min.css">
	
  <tiles:insertAttribute name="header" />	
</head>
<body class="hold-transition sidebar-mini">
	<div class="wrapper">
	  <tiles:insertAttribute name="menu" />	
	  <tiles:insertAttribute name="body" />	
	</div>
	<!-- ./wrapper -->
</body>
<tiles:insertAttribute name="footer"/>	
</html>
