<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  
  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary elevation-4">
    <!-- Brand Logo -->
    <a href="index3.html" class="brand-link">
      <!-- <img src="dist/img/AdminLTELogo.png" alt="Accounts" class="brand-image img-circle elevation-3"
           style="opacity: .8"> -->
      <span class="brand-text font-weight-light">Accounts</span>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user panel (optional) -->
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
        <div class="image">
          <img src="/accounts/resources/img/user2-160x160.jpg" class="img-circle elevation-2" alt="User Image">
        </div>
        <div class="info">
          <a href="#" class="d-block">welcome, ${username}</a>
        </div>
      </div>

	<form:form method="post" action="" id="menuForm">
      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          
          
          <li class="nav-item">
            <a href="javascript:callPage('/accounts/loginSubmit')" class="nav-link">
              <i class="nav-icon fa fa-users"></i>
              <p>
                Customer
              </p>
            </a>
            
          </li>
          <li class="nav-item">
            <a href="javascript:callPage('/accounts/searchSpares')" class="nav-link">
              <i class="nav-icon fa fa-wrench"></i>
              <p>
                Spares
              </p>
            </a>
            
          </li>
          <li class="nav-item">
            <a href="javascript:callPage('/accounts/searchSupplier')" class="nav-link">
              <i class="nav-icon fa fa-plane"></i>
              <p>
                Supplier
              </p>
            </a>
            
          </li>
          
          <li class="nav-item has-treeview">
            <a href="#" class="nav-link">
              <i class="nav-icon fa fa-credit-card"></i>
              <p>
                Bill
                <i class="right fa fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="javascript:callPage('/accounts/newBill')" class="nav-link">
                  <i class="fa fa-money"></i>
                  <p> New Bill</p>
                </a>
              </li>
              <li class="nav-item">
                <a href="" class="nav-link">
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p>Purchase Return</p>
                </a>
              </li>              
            </ul>
          </li>
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
     </form:form> 
    </div>
    <!-- /.sidebar -->
  </aside>
  
  
<script>
function callPage(a){
	$('#menuForm').attr('action',a);
	$('#menuForm').submit();
}
</script>