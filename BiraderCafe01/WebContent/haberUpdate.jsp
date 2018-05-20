<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
  <jsp:include page="adminHeader.jsp" />
    
    <!-- Main Section -->
    <section class="container">
    <div class="container-fluid" style="padding-top:120px">
		<div class="row">
			<div class="col-md-12">
				<div class="row">
					<div class="col-md-12">
						<form class="form-horizontal" action="haberController"
							method="POST">
							<fieldset>

								<!-- Form Name -->
								<legend>Haber Düzenle</legend>
								
									<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="id">Id</label>
									<div class="col-md-4">
										<input id="id" name="id" type="text" readonly="readonly"
										placeholder="" value="${haber.haberId}" 
											class="form-control input-md">

									</div>
								</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="haberAdi">Haber Adı</label>
									<div class="col-md-4">
										<input id="haberAdi" name="haberAdi" type="text" placeholder=""
											value="${haber.haberAdi}" class="form-control input-md">

									</div>
								</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="haberBaslik">Haber Başlığı</label>
									<div class="col-md-4">
										<input id="haberBaslik" name="haberBaslik" type="text" placeholder=""
											value="${haber.haberBaslik}" class="form-control input-md">

									</div>
								</div>
								
									<!-- TextArea input -->
								<div class="form-group">
  									<label class="col-md-4 control-label" for="haberMakale">Haber Makale</label>
  									<div class="col-md-8">                     
    								<textarea class="form-control" rows="8" id="haberMakale" name="haberMakale"> 
    							     <c:out value="${haber.haberMakale}" /></textarea>
  									</div>
								</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="haberResimYolu">Resim Yolu</label>
									<div class="col-md-4">
										<input id="haberResimYolu" name="haberResimYolu" type="text" placeholder=""
											value="${haber.haberResimYolu}" class="form-control input-md">

									</div>
								</div>

								<!-- Button -->
								<div class="form-group">
									<label class="col-md-4 control-label" for="add"></label>
									<div class="col-md-4">
										<input type="submit" class="btn btn-info"
											value="Haberi Düzenle">
									</div>
								</div>
								<!-- ErrMsg -->
								<div class="col-md-4 col-md-offset-4" style="color: red">
									<h5>${errMsg}</h5>
								</div>

							</fieldset>
						</form>
					</div>
					<div class="col-md-6"></div>
				</div>
			</div>
		</div>
	</div>

    
    </section>
        
  <jsp:include page="adminFooter.jsp" />