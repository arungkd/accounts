<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
  
<form:form id="editSupplier" action="editSupplier" method="post" modelAttribute="supplier">
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <section class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1>Supplier Search</h1>
          </div>
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item"><a href="javascript:newSupplier()">New Supplier</a></li>
            </ol>
          </div>
        </div>
      </div><!-- /.container-fluid -->
    </section>

	<section>
		<div id="showAlert" class="alert alert-success alert-dismissible" style="display: none">
		<button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
		<h5><i class="icon fa fa-check"></i> Alert!</h5>
			Success alert preview. This alert is dismissable.
		</div>
	</section>

    <!-- Main content -->
    <section class="content">
      <div class="row">
        <div class="col-12">
          <div class="card">
            <div class="card-header">
              <h3 class="card-title">Supplier Search Result</h3>
              <input type="text" name="supplierid" id="supplierid" />
            </div>
            <!-- /.card-header -->
            <div class="card-body">
              
            <table id="supplierSearch" role="grid" class="table table-bordered table-striped dataTable">
            	<thead>
            		<tr>
            			<td>Supplier Name</td>
            			<td>Supplier Email</td>
            			<td>Supplier Phone</td>
            			<td>Action</td>
            		</tr>
            	</thead>
            </table>  
              
              
            </div>
            <!-- /.card-body -->
          </div>
          <!-- /.card -->

          
        </div>
        <!-- /.col -->
      </div>
      <!-- /.row -->
    </section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->
  
</form:form>
  
  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
  
  <!-- Scripts starts here -->
  <!-- DataTables -->


<script type="text/javascript">
$(document).ready(function(){
	var listVal =eval('${supplierList}');
	var table = $('#supplierSearch').DataTable( {
	"aaData": listVal,
	"aoColumns": [
	{ "mData": "suppliername"},
	{ "mData": "supplieremail"},
	{ "mData": "supplierphone"},
	{ "mData": "supplierid",
		"render": function ( mData, type, full, meta ) {
		return '<a href="javascript:addValue('+mData+')">View/Edit</a>'}}
	]
	});
	});
	
function addValue(a){
	//alert($('#customerIdHid').val());
	//alert(a);
	$('#supplierid').val(a);
	//redirect '/accounts/editCustomer';
	$('#editSupplier').submit();
}


function newSupplier(){
	//newCustomer
	$('#supplierid').val('1');
	$('#editSupplier').attr('action','newSupplier');
	$('#editSupplier').submit();
}

</script>
