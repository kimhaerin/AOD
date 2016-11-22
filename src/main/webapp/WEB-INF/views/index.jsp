<!DOCTYPE HTML>
<!--
	Aerial by HTML5 UP
	html5up.net | @ajlkn
	Free for personal and commercial use under the CCA 3.0 license (html5up.net/license)
-->
<html>
<head>
<script src="https://code.jquery.com/jquery-1.12.0.min.js"></script>
<title>Age Of Discovery</title>
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1" />
<!--[if lte IE 8]><script src="assets/js/ie/html5shiv.js"></script><![endif]-->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/assets/css/main.css " />
<link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css">
<!--[if lte IE 8]><link rel="stylesheet" href="assets/css/ie8.css" /><![endif]-->
<!--[if lte IE 9]><link rel="stylesheet" href="assets/css/ie9.css" /><![endif]-->
</head>
<body class="loading">
	<style>
.login {
	color: black;
}
</style>
	<div id="wrapper">
		<div id="bg"></div>
		<div id="overlay"></div>
		<div id="main">
			<!-- Header -->
			<header id="header">

				<h1>Age Of Discovery</h1>
				<p>Captin Won &nbsp;&bull;&nbsp; HyeonJoong &nbsp;&bull;&nbsp;
					YoungMin &nbsp;&bull;&nbsp; JinSu &nbsp;&bull;&nbsp; HaeRin</p>
				<nav>
					<ul>
						<li><a href="#" class="fa fa-list-ul"><span class="label">Menu</span></a></li>
						<li><a href="#" class="fa fa-edit"><span class="label">Write</span></a></li>
						<li><a href="#" class="fa fa-star"><span class="label">Favorite</span></a></li>
						<li><a href="#" class="fa fa-user-plus"><span
								class="label">Register</span></a></li>

					</ul>

					<form method="post">
						<p>
							ID <input class="login" type="text">
						</p>
						<p>
							PW<input class="login" type="text">
						</p>
						<a id="loginBtn" class="fa fa-unlock-alt">LOGIN</a>
					</form>
				</nav>

			</header>
			<script>
				$("#loginBtn").on("mouseover", function(event) {
					$(this).removeClass("fa fa-unlock-alt");
					$(this).addClass("fa fa-lock");
				});
				$("#loginBtn").on("mouseout", function(event) {
					$(this).removeClass("fa fa-lock");
					$(this).addClass("fa fa-unlock-alt");
				});
			</script>

			<!-- Footer -->
			<footer id="footer">
				<p>Team Won-Piece</p>
			</footer>

		</div>
	</div>
	<!--[if lte IE 8]><script src="assets/js/ie/respond.min.js"></script><![endif]-->
	<script>
		window.onload = function() {
			document.body.className = '';
		}
		window.ontouchmove = function() {
			return false;
		}
		window.onorientationchange = function() {
			document.body.scrollTop = 0;
		}
	</script>
</body>
</html>