<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
  <jsp:include page="adminHeader.jsp" />
    
    <!-- Main Section -->
    <section class="container">
    
    <div class="container-fluid" style="padding-top:120px">
		<div class="row">
			<div class="col-md-12">
			</div>

				<div class="row">
					<div class="col-md-12">
					<legend>Yönetici Listesi</legend>
						<div class="table-responsive">
							<table id="example" class="table table-striped table-bordered">							
							<thead>
								<tr>
									<th>Yönetici Adı</th>
									<th>Yönetici Kullanıcı Adı</th>
									<th>Yönetici Parolası</th>
									<th>Yönetici Mail</th>
									<th>Yönetici Seviyesi</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>


							 	<c:forEach items="${allYoneticis}" var="yonetici"> 
									<tr>
										<td><c:out value="${yonetici.yoneticiAdi}" /></td>
										<td><c:out value="${yonetici.yoneticiKulAdi}" /></td>
										<td><c:out value="${yonetici.yoneticiParola}" /></td>
										<td><c:out value="${yonetici.yoneticiMail}" /></td>
										<td><c:out value="${yonetici.yoneticiSeviye}" /></td>
										<td>
										  
									        <a href="yoneticiController?action=delete&yoneticiId=${yonetici.yoneticiId}"
										     class="btn btn-danger" type="button">Sil</a>
											<a href="yoneticiController?action=update&yoneticiId=${yonetici.yoneticiId}"
										     class="btn btn-primary" type="button">Güncelle</a>
										</td>
											
									</tr>
							 	</c:forEach> 
							</tbody>
						</table>
						</div>
					</div>
					<div class="col-md-6"></div>
				</div>
				<a href="yoneticiController?action=insert"
										     class="btn btn-primary" type="button">Ekle</a>
        	</div>
		</div>
	</div>
    </section>
        
  <jsp:include page="adminFooter.jsp" />