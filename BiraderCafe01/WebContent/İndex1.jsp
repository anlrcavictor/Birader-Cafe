<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<jsp:include page="header.jsp" />


<section class="" style="padding-top: 124px; padding-bottom: 45px ">
	<div class="row">
		<div class="col-lg-12 text-center">
			<h4>Birader Cafede Panorama</h4>
		</div>
	</div>
	<div class="row">
	     <div class="col-lg-1"></div>
		<div class="col-lg-10">
		<div class="container">
			<div id="carousel-example-generic" class="carousel slide"
				data-ride="carousel">
				<!-- Indicators -->
				<ol class="carousel-indicators">
					<li data-target="#carousel-example-generic" data-slide-to="0"
						class="active"></li>
					<li data-target="#carousel-example-generic" data-slide-to="1"></li>
					<li data-target="#carousel-example-generic" data-slide-to="2"></li>
					<li data-target="#carousel-example-generic" data-slide-to="3"></li>
				</ol>

				<!-- Wrapper for slides -->
				<div class="carousel-inner" role="listbox">
					<div class="item active">
						<img src="img/AnaBaslik.jpg" alt="...">
						<div class="carousel-caption">
							<h3>TÜM YAYINLAR HD KALİTESİNDE BİRADER CAFEDE</h3>
						</div>
					</div>

					<c:forEach items="${allHabers}" var="haber">
						<div class="item">
							<a href="index?action=details&haberId=${haber.haberId}"><img
								src="img/${haber.haberResimYolu}" alt="..."></a>
							<div class="carousel-caption">
								<h3>
									<c:out value="${haber.haberBaslik}" />
								</h3>
							</div>
						</div>
					</c:forEach>

					<!--  <div class="item">
      <img src="http://lorempixel.com/output/nightlife-q-c-1170-480-3.jpg" alt="...">
      <div class="carousel-caption">
        <h3>Başlık 3</h3>
      </div>
    </div>-->

				</div>

				<!-- Controls -->
				<a class="left carousel-control" href="#carousel-example-generic"
					role="button" data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">Previous</span>
				</a> <a class="right carousel-control" href="#carousel-example-generic"
					role="button" data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">Next</span>
				</a>
			</div>

		</div>
	</div>
	</div>
	</div>
</section>


<jsp:include page="footer.jsp" />