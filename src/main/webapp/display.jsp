<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width,initial-scale=1">
	<title>Acquia Motors Inc</title>
	<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro" rel="stylesheet">
	<link rel="stylesheet" type="text/css" href="css/normalize.css">
	<link rel="stylesheet" type="text/css" href="css/materialize.min.css">
	<link rel="stylesheet" type="text/css" href="css/loginStyle.css">
</head>
<body>
<div class="row gmailStyle">
		<div class="container-fluid">
			<div class="valign-wrapper screenHeight">
					<div class="col card s12 m8 l6 xl4 autoMargin setMaxWidth overflowHidden">
						<div class="row hidden" id="progress-bar">
					    <div class="progress mar-no">
					      <div class="indeterminate"></div>
					    </div>
						</div>
						<div class="clearfix mar-all pad-all"></div>

						<img src="/images/acquia_logo.jpg" class="logoImage" />
						<h5 class="center-align mar-top mar-bottom formTitle">Acquia Motors</h5>
						

						<div class="clearfix mar-all pad-all"></div>

						<div id="formContainer" class="goRight">
<form> 
	<div class="clearfix mar-all pad-all"></div>
	
	
	<img src="/images/time.png" class="logoImage" width="50" height="50" style="float:left"/><h7>(Total Time  Taken)</h7><br>
	<h3 style="color:blue">  <%= request.getAttribute("totaltime") %> hrs </h3><br>
	
	
	<img src="/images/refuel_logo.png" class="logoImage" width="50" height="50" style="float:left"/><h7>(No of times refueled)</h7><br>
	<h3 style="color:blue">  <%= request.getAttribute("refuel") %> </h3><br>
	
	<img src="/images/distance_logo.jpg" class="logoImage" width="50" height="50" style="float:left"/><h7>(Total Distance Covered)</h7><br>
	<h3 style="color:blue">  <%= request.getAttribute("totaldistance") %> km </h3><br>
</form>
</div>


						<div class="clearfix mar-all pad-all"></div>
					</div>
			</div>
		</div>
	</div>
</body>
</html>