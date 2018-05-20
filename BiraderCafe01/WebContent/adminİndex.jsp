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
					<legend>Haberler Listesi</legend>
						<div class="table-responsive">
							<table id="example" class="table table-striped table-bordered">							
							<thead>
								<tr>
									<th>Haber adı</th>
									<th>Haber Başlığı</th>
									<th>Haber Zamanı</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>


							 	<c:forEach items="${allHabers}" var="haber"> 
									<tr>
										<td><c:out value="${haber.haberAdi}" /></td>
										<td><c:out value="${haber.haberBaslik}" /></td>
										<td><c:out value="${haber.haberZaman}" /></td>
										<td>
										  
									        <a href="haberController?action=delete&haberId=${haber.haberId}"
										     class="btn btn-danger" type="button">Sil</a>
											<a href="haberController?action=update&haberId=${haber.haberId}"
										     class="btn btn-primary" type="button">Güncelle</a>
										     <a href="haberController?action=details&haberId=${haber.haberId}"
										     class="btn btn-primary" type="button">Detay</a>
										</td>
											
									</tr>
							 	</c:forEach> 
							</tbody>
						</table>
						</div>
					</div>
					<div class="col-md-6"></div>
				</div>
				<a href="haberController?action=insert"
										     class="btn btn-primary" type="button">Ekle</a>
        	</div>
		</div>
	</div>
    </section>
        
  <jsp:include page="adminFooter.jsp" />