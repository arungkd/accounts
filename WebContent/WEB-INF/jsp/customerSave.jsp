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
              <form:form action="saveCustomer" method="post" modelAttribute="customers">
                <div class="card-body">
                  <div class="form-group">
                    <label for="customername">Customer Name</label>
                    <input type="text" class="form-control" id="customername" placeholder="Enter customer name">
                  </div>
                  <div class="form-group">
                    <label for="CompanyName">Company Name</label>
                    <input type="text" class="form-control" id="companyname" placeholder="Enter Company Name">
                  </div>
                  <div class="form-group">
                    <label for="CompanyContacNumber">Contact Number</label>
                    <input type="text" class="form-control" id="contactnumber" placeholder="Enter Contact Number">
                  </div>
                  
                  <div class="form-group">
                    <label for="CompanyEmail">Email Address</label>
                    <input type="email" class="form-control" id="emailid" placeholder="Enter Email Id">
                  </div>
                  
                  <div class="form-group">
                    <label for="CompanyAddress">Company Address</label>
                    <input type="text" class="form-control" id="companyaddress" placeholder="Enter Company Address">
                  </div>
                  
                  <div class="form-group">
                    <label for="gstnumber">GST Number</label>
                    <input type="text" class="form-control" id="gstnumber" placeholder="Enter GST Number">
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
