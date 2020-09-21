<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="it">
<head>
<meta charset="UTF-8">
<title>Risultato della somma</title>
<c:url var="webjars" value="/webjars" />
<link rel="stylesheet" href="${ webjars }/bootstrap/4.4.1/css/bootstrap.css" type="text/css">
</head>
<body>
	<div class="container">
	La somma di ${ sumResponse.left } e ${ sumResponse.right } è ${ sumResponse.sum }.
	</div>
	<script type="text/javascript" src="${ webjars }/jquery/3.4.1/jquery.js"></script>
	<script type="text/javascript" src="${ webjars }/popper.js/1.14.7/popper.js"></script>
	<script type="text/javascript" src="${ webjars }/bootstrap/4.4.1/js/bootstrap.js"></script>
</body>
</html>
