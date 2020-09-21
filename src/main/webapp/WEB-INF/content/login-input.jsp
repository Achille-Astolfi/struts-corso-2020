<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html lang="it">
<head>
<meta charset="UTF-8">
<title>Login</title>
<c:url var="webjars" value="/webjars" />
<link rel="stylesheet"
	href="${ webjars }/bootstrap/4.4.1/css/bootstrap.css" type="text/css">
</head>
<body>
	<div class="container">
		<h1>Login</h1>
		<s:form action="login" method="post" theme="simple">
			<div class="form-group">
				<s:label for="loginForm.emailAddress" value="Email" />
				<s:textfield type="email" class="form-control"
					name="loginForm.emailAddress"
					placeholder="nome.cognome@example.com" />
			</div>
			<div class="form-group">
				<s:label for="loginForm.password" value="Password" />
				<s:password class="form-control" name="loginForm.password"
					placeholder="Il nome del tuo animale domestico" />
			</div>
			<div class="form-group form-check">
				<s:checkbox class="form-check-input" name="loginForm.rememberMe" />
				<s:label class="form-check-label" for="loginForm.rememberMe"
					value="Ricordami." />
			</div>
			<s:submit class="btn btn-primary" value="Login" />
		</s:form>
	</div>
	<script type="text/javascript"
		src="${ webjars }/jquery/3.4.1/jquery.js"></script>
	<script type="text/javascript"
		src="${ webjars }/popper.js/1.14.7/popper.js"></script>
	<script type="text/javascript"
		src="${ webjars }/bootstrap/4.4.1/js/bootstrap.js"></script>
</body>
</html>
