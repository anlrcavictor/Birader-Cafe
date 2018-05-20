<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<jsp:include page="header.jsp" />

<section class="mTop" style="padding: 120px">

	<div class="container">
		<div class="row">
			<div class="col-lg-12 text-center">
				<h2>Bize Ulaşın</h2>
				<h5 style="color:blue">Soularınız ve Önerileriniz için Bize Ulaşın</h5>
				<h5>(*) alanları doldurmak zorunludur!</h5>
			</div>
		</div>
		<div class="row">
			<div class="col-lg-10 col-lg-offset-2">
				<!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19. -->
				<!-- The form should work on most web servers, but if the form is not working you may need to configure your web server differently. -->
				<form action="bizeUlasin"  method="post" >
					<div class="row control-group">
						<div
							class="form-group col-xs-8 floating-label-form-group controls">
							<label>Name</label> <input type="text" class="form-control"
								placeholder="Adınız*" name="name" id="name" required maxlength="30">

						</div>
					</div>
					<div class="row control-group">
						<div
							class="form-group col-xs-8 floating-label-form-group controls">
							<label>Email Address</label> <input type="email"
								class="form-control" placeholder="Email Adresiniz*" name="email"id="email" required ">

						</div>
					</div>
					<div class="row control-group">
						<div
							class="form-group col-xs-8 floating-label-form-group controls">
							<label>Phone Number</label> <input type="tel"
								class="form-control" placeholder="Telefon Numaranız"
								name="phone" id="phone" maxlength="20" >

						</div>
					</div>
					<div class="row control-group">
						<div
							class="form-group col-xs-8 floating-label-form-group controls">
							<label>Message</label>
							<textarea rows="5" class="form-control" placeholder="Mesajınız*"
								name="message" id="message" required  maxlength="300"></textarea>

						</div>
					</div>
					<br>
					<div style="color: red"><h6>${errMsg}</h6></div>
					<div id="success"></div>
					<div class="row">
						<div class="form-group col-xs-8">
							<button type="submit" class="btn btn-success btn-lg">Gönder</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>

</section>



<jsp:include page="footer.jsp" />