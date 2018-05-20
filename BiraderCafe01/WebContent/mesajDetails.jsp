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

						<fieldset>

							<!-- Form Name -->
							<legend>Mesaj no:${mesaj.mesajId}</legend>

							<!-- Text input-->
							<div class="row">
								<div class="form-group">
									<label class="col-md-4 control-label" for="id">Id</label>
									<div class="col-md-8">
										<p>${mesaj.mesajId}</p>


									</div>
								</div>
							</div>

							<!-- Text input-->
							<div class="row">
								<div class="form-group">
									<label class="col-md-4 control-label" for="MesajSahibiAdi">Mesajı
										Gönderen:</label>
									<div class="col-md-8">
										<p>${mesaj.mesajSahibiAdi}</p>

									</div>
								</div>
							</div>

							<!-- Text input-->
							<div class="row">
								<div class="form-group">
									<label class="col-md-4 control-label" for="MesajSahibiMail">Gönderenin
										Maili:</label>
									<div class="col-md-8">
										<p>${mesaj.mesajSahibiMail}</p>

									</div>
								</div>
							</div>

							<!-- Text input-->
							<div class="row">
								<div class="form-group">
									<label class="col-md-4 control-label" for="MesajSahibiNumara">Gönderenin
										Numarası:</label>
									<div class="col-md-8">
										<p>${mesaj.mesajSahibiNumara}</p>

									</div>
								</div>
							</div>



							<!-- TextArea input -->
							<div class="row">
								<div class="form-group">
									<label class="col-md-4 control-label" for="Message">Mesaj:</label>
									<div class="col-md-8">
										<textarea class="form-control" rows="5" id="Message"
											name="Message" readonly="readonly"> 
    							     ${mesaj.mesage}</textarea>
									</div>
								</div>
							</div>

							<!-- Text input-->
							<div class="row">
								<div class="form-group">
									<label class="col-md-4 control-label" for="MesajTarih">Gönderilme
										Tarihi:</label>
									<div class="col-md-8">
										<p>${mesaj.mesajZaman}</p>

									</div>
								</div>
							</div>



							<!-- Button -->
							<div class="form-group">
								<label class="col-md-4 control-label" for="add"></label>
								<div class="col-md-4">
									<a class="btn btn-default" href="mesajController" role="button">Kapat</a>
								</div>
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