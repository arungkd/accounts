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
            <h1 class="m-0 text-dark">Customer Details</h1>
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
                <h3 class="card-title">Customer Form</h3>
              </div>
              <!-- /.card-header -->
              <!-- form start -->
              <form:form action="${actionName}" method="post" modelAttribute="customer">
              <form:input path="customerid"/>
                <div class="card-body">
                  <div class="form-group">
                    <label for="customername">Customer Name</label>
                    <form:input path="customername" class="form-control" placeholder="Enter customer name" />
                    <!-- <input type="text" class="form-control" name="customername" id="customername" placeholder="Enter customer name"> -->
                  </div>
                  <div class="form-group">
                    <label for="CompanyName">Company Name</label>
                    <form:input path="companyname" class="form-control" placeholder="Enter Company Name" />
                  </div>
                  <div class="form-group">
                    <label for="CompanyContacNumber">Contact Number</label>
                    <form:input path="contactnumber" class="form-control" placeholder="Enter Contact Number"/>
                  </div>
                  
                  <div class="form-group">
                    <label for="CompanyEmail">Email Address</label>
                    <form:input path="emailid" class="form-control" placeholder="Enter Email Id"/>
                  </div>
                  
                  <div class="form-group">
                    <label for="CompanyAddress">Company Address</label>
                    <form:input path="address" class="form-control" placeholder="Enter Company Address"/>
                  </div>
                  
                  <div class="form-group">
                    <label for="gstnumber">GST Number</label>
                    <form:input path="GSTnumber" class="form-control" placeholder="Enter GST Number"/>
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
  