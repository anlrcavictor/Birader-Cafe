<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    <jsp:include page="header.jsp" />
    
    <section class="mTop" style="padding:220px">
     <div class="container">
            <div class="row">
                <div class="col-lg-8 ">
                   <h5>Yönetici Girişi</h5>
                    
                </div>
            </div>
            <div class="row">
                <div class="col-lg-8 ">
                    <!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19. -->
                    <!-- The form should work on most web servers, but if the form is not working you may need to configure your web server differently. -->
                    <form action="login" method="post" novalidate>
                        <div class="row control-group">
                            <div class="form-group col-xs-6 floating-label-form-group controls">
                                <label>Name</label>
                                <input type="text" class="form-control" placeholder="Name" id="name" name="name"required data-validation-required-message="Please enter your name.">
                                <p class="help-block text-danger"></p>
                            </div>
                        </div>
                        <div class="row control-group">
                            <div class="form-group col-xs-6 floating-label-form-group controls">
                                <label>Password</label>
                                <input type="password" class="form-control" placeholder="Password" id="password" name="password" required data-validation-required-message="Lütfen Şifrenizi Giriniz.">
                                <p class="help-block text-danger"></p>
                            </div>
                        </div>
                        
                        
                        <br>
                        <div id="success"></div>
                        <div class="row">
                            <div class="form-group col-xs-12">
                                <button type="submit" class="btn btn-primary btn-lg">Giriş</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        
        <div class="col-md-4"><p style="color:red">${requestScope.errMsg}</p></div>
    
    </section>
    
    
    
    <jsp:include page="footer.jsp" />