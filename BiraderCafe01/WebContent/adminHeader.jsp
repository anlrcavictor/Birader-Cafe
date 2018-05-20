<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">


<!DOCTYPE html>
<html lang="tr">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>BİRADER CAFE</title>

<!-- Custom CSS -->
<link href="/css/custom.css" rel="stylesheet">

<!-- Bootstrap Core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">


<!-- Theme CSS -->
<link href="css/freelancer.min.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="vendor/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link
	href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body id="page-top" class="index">

	<!-- Navigation -->
	<nav id="mainNav"
		class="backcolorblack navbar navbar-default navbar-fixed-top navbar-custom"
		style="background-color: black">
		<div class="container">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header page-scroll">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span> Menu <i
						class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand" href="#page-top">Admin Paneli</a>
			</div>

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li class="hidden"><a href="#page-top"></a></li>
					<li class="page-scroll"><a
						href="/BiraderCafe01/haberController">Haberler</a></li>
					<li class="page-scroll"><a
						href="/BiraderCafe01/mesajController">Mesajlar</a></li>
					<li class="page-scroll"><a
						href="/BiraderCafe01/yoneticiController">Yonetici</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
						role="button" aria-haspopup="true" aria-expanded="false" style="color:yellow;background-color:#4e4646">${realUsername}</a>
						<div class="dropdown-menu" style="text-align:center">
							<div class="dropdown-divider text-center"></div>
							<a class="dropdown-item" style="color:red; text-decoration:none" href="logoutController">Çıkış</a>
						</div></li>
					<!--  <li class="page-scroll"><a href="logoutController">Çıkış</a></li>-->
					<!--  <span style="text-transform:lowercase; color:yellow">${realUsername}</span>-->
                   </ul>
            </div>
            <!-- /.navbar-collapse -->
			</div>
			<!-- /.container-fluid -->
	</nav>