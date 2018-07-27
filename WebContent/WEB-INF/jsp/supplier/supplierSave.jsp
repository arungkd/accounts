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
            <h1 class="m-0 text-dark">Supplier Details</h1>
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
                <h3 class="card-title">Supplier Form</h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->
              <form:form action="${actionName}" method="post" modelAttribute="supplier">
              <form:input path="supplierid"/>
                <div class="card-body">
                  <div class="form-group">
                    <label for="suppliername">Supplier Name</label>
                    <form:input path="suppliername" class="form-control" placeholder="Enter Supplier Name" />
                  </div>
                  <div class="form-group">
                    <label for="supplieraddress">Supplier Address</label>
                    <form:input path="supplieraddress" class="form-control" placeholder="Enter Supplier Address" />
                  </div>
                  <div class="form-group">
                    <label for="supplieremail">Supplier Email</label>
                    <form:input path="supplieremail" class="form-control" placeholder="Enter Supplier Email" />
                  </div>
                  <div class="form-group">
                    <label for="supplierphone">Supplier Phone</label>
                    <form:input path="supplierphone" class="form-control" placeholder="Enter Supplier Phone"/>
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