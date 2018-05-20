<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="adminHeader.jsp" />

<!-- Main Section -->
<section class="container">

	<div class="container-fluid" style="padding-top: 120px">
		<div class="row">
			<div class="col-md-12"></div>

			<div class="row">
				<div class="col-md-12">
					<legend>Mesajlar Listesi</legend>
					<div class="table-responsive">
						<table id="example" class="table table-striped table-bordered">
							<thead>
								<tr>
									<th>Gönderenin Adı</th>
									<th>Gönderilme Tarihi</th>
									<th>Okundu/Okunmadı</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>


								<c:forEach items="${allMesajs}" var="mesaj">
									<tr>
										<td><c:out value="${mesaj.mesajSahibiAdi}" /></td>
										<td><c:out value="${mesaj.mesajZaman}" /></td>
										<td><c:if test="${mesaj.mesajOkunduMu =='true'}">
												<p style="color:green">okundu</p>
											</c:if>
											<c:if test="${mesaj.mesajOkunduMu =='false'}">
												<p style="color:red">okunmadı</p>
											</c:if></td>
										<td><a
											href="mesajController?action=delete&mesajId=${mesaj.mesajId}"
											class="btn btn-danger" type="button">Sil</a> <a
											href="mesajController?action=details&mesajId=${mesaj.mesajId}"
											class="btn btn-primary" type="button">Mesajı Oku</a></td>

									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
				<div class="col-md-6"></div>
			</div>

		</div>
	</div>
	</div>
</section>

<jsp:include page="adminFooter.jsp" />