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
	<style>
.dropdown {
  position: relative;
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown:hover .dropdown-content {
  display: block;
}

.desc {
  padding: 15px;
  text-align: center;
}
</style>
	<script type="text/javascript" >
function validateForm() {
	var letters = /^[a-zA-Z]+$/;
	var numbers = /^[0-9]+$/;
	var number2=/^\\d+(?:\\.{1}\\d+)?$/;
	
 
if (!/^[a-zA-Z]*$/g.test(document.mainform.t1.value)) {
    alert("Please enter String in RoadType, Integers not accepted");
    document.mainform.t1.focus();
    return false;
}



}
</script>
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
						<p class="center-align pad-no mar-no">WELCOME!!</p>

						<div class="clearfix mar-all pad-all"></div>

						<div id="formContainer" class="goRight">

							<form name="mainform" action="home" onsubmit="return validateForm()" method="post" class="signUpForm">
								<div class="input-fields-div autoMargin">
									<div class="row input-inline-field">
										
									
										<div class="input-field">
					          		<input  list="RoadType" name ="t1"  placeholder="RoadType"   required> 
					          <datalist name="RoadType" id="RoadType">
					          
					          <option value="URBAN"></option>
					          <option value="RURAL"></option>
					          </datalist>
									<span class="helper-text" data-error="wrong" data-success="right"></span>
									</div>
					         		</div>
										
										
    

					        </div>
					        <div class="input-field">
					          <input name="t2" id="reg_user_name2" placeholder="RoadLength (in Km)" type="number" min="0" max="9300000" pattern="^\d*(\.\d{0,2})?$" step=".01"  required>
					          
										<span class="helper-text" data-error="wrong" data-success="right"></span>
					        </div>
									
										
								<div class="input-fields-div autoMargin right-align">
									<button type="submit" class="registerBtn waves-effect waves-light btn">Submit</button>
								</div>
							</form>

							
							<div class="clearfix"></div>
						</div>


						<div class="clearfix mar-all pad-all"></div>
					</div>
			</div>
		</div>
	</div>