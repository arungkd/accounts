<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
<body class="hold-transition sidebar-mini">
<div class="wrapper">
  
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 class="m-0 text-dark">Spare Details</h1>
          </div>
        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content-header -->

  <!-- Main content -->
    <section class="content">
      <div class="container-fluid">
					
      		<div class="row">
          <!-- left column -->
          <!--  <div class="col-md-8"> --> <div class="col-md-12">
            <!-- general form elements -->
            <div class="card card-primary">
              <div class="card-header">
                <h3 class="card-title">Spare Form</h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->
              <form:form action="${actionName}" method="post" modelAttribute="spares">
              <form:input path="spareid"/>
                <div class="card-body">
                  <div class="form-group">
                    <label for="sparename">Spare Name</label>
                    <form:input path="sparename" class="form-control" placeholder="Enter Spare Name" />
                  </div>
                  <div class="form-group">
                    <label for="sparecode">Spare Code</label>
                    <form:input path="sparecode" class="form-control" placeholder="Enter Spare Code" />
                  </div>
                  <div class="form-group">
                    <label for="SpareUnit">Spare Unit</label>
                    <form:input path="spareunit" class="form-control" placeholder="Enter Spare Unit" />
                  </div>
                  <div class="form-group">
                    <label for="sparedescription">Spare Description</label>
                    <form:input path="sparedescription" class="form-control" placeholder="Enter Spare Description"/>
                  </div>
                  
                  <div class="form-group">
                    <label for="spareprice">Spare Price</label>
                    <form:input path="spareprice" class="form-control" placeholder="Enter Spare Price"/>
                  </div>
                  
                  <%--Supplier id --%>
                  <%-- <div class="form-group">
                    <label for="CompanyAddress">Company Address</label>
                    <form:input path="address" class="form-control" placeholder="Enter Company Address"/>
                  </div> --%>
                  
                  <div class="form-group">
                    <label for="sparestock">Spare Stock</label>
                    <form:input path="sparestock" class="form-control" placeholder="Enter Available Stock"/>
                  </div>
                  
                </div>
                <!-- /.card-body -->

                <div class="card-footer">
                  <button type="submit" class="btn btn-primary">Submit</button>
                </div>
              </form:form>  
            </div>
            <!-- /.card -->

          </div>
         
        </div>
            
      </div><!--/. container-fluid -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->

    <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->

</div>
<!-- ./wrapper -->


</body>
</html>
  