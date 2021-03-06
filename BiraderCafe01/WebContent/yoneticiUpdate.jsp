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
						<form class="form-horizontal" action="yoneticiController "
							method="POST">
							<fieldset>

								<!-- Form Name -->
								<legend>Yönetici Düzenle</legend>
								
									<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="id">Id</label>
									<div class="col-md-4">
										<input id="id" name="yoneticiId" type="text" readonly="readonly"
										placeholder="" value="${yonetici.yoneticiId}" 
											class="form-control input-md">

									</div>
								</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="yoneticiAdi">Yönetici Adı</label>
									<div class="col-md-4">
										<input id="yoneticiAdi" name="yoneticiAdi" type="text" placeholder=""
											value="${yonetici.yoneticiAdi}" class="form-control input-md">

									</div>
								</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="yoneticiKulAdi">Kullanıcı Adı</label>
									<div class="col-md-4">
										<input id="yoneticiKulAdi" name="yoneticiKulAdi" type="text" placeholder=""
											value="${yonetici.yoneticiKulAdi}" class="form-control input-md">

									</div>
								</div>
								
									<!-- Text input -->
								<div class="form-group">
  									<label class="col-md-4 control-label" for="yoneticiParola">Parolası</label>
  									<div class="col-md-8">                     
    								<input id="yoneticiParola" name="yoneticiParola" type="text" placeholder=""
											value="${yonetici.yoneticiParola}" class="form-control input-md">
  									</div>
								</div>

								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="yoneticiMail">Mail Adresi</label>
									<div class="col-md-4">
										<input id="yoneticiMail" name="yoneticiMail" type="text" placeholder=""
											value="${yonetici.yoneticiMail}" class="form-control input-md">

									</div>
								</div>
								
								<!-- Text input-->
								<div class="form-group">
									<label class="col-md-4 control-label" for="yoneticiSeviye">Yönetici Seviyesi</label>
									<div class="col-md-4">
										<input id="yoneticiSeviye" name="yoneticiSeviye" type="text" placeholder=""
											value="${yonetici.yoneticiSeviye}" class="form-control input-md">

									</div>
								</div>

								<!-- Button -->
								<div class="form-group">
									<label class="col-md-4 control-label" for="add"></label>
									<div class="col-md-4">
										<input type="submit" class="btn btn-info"
											value="Yönetici Düzenle">
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