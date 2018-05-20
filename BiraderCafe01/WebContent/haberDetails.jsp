<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="adminHeader.jsp" />

<!-- Main Section -->
<section class="container" style="padding: 100px">

	<div class="container">
		<div class="row">
			<div class="col-lg-10 ">
				<div class="modal-body">
					<h2>
						<c:out value="${haber.haberBaslik}" />
					</h2>
					</hr>
					<img src="img/${haber.haberResimYolu}"
						class="img-responsive img-centered" alt="">
					<p><c:out value="${haber.haberMakale}" /></p>
					<ul class="list-inline item-details">
						<li>Haber Adı: <strong><span style="color:blue"><c:out value="${haber.haberAdi}" /></span> </strong>
						</li>
						<li>Tarih: <strong><span style="color:blue" ><c:out value="${haber.haberZaman}" /></span> </strong>
						</li>
						<li>ID: <strong><span style="color:blue"><c:out value="${haber.haberId}" /></span> </strong>
						</li>
					</ul>
					 <a href="haberController" class="btn btn-default" type="button">Kapat</a>
				</div>
			</div>
		</div>
	</div>


</section>

<jsp:include page="adminFooter.jsp" />