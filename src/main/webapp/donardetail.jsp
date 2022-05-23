<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page language = "java" contentType = "text/html; charset = UTF-8" pageEncoding = "UTF-8"%>

<html>
	<head>
		<link rel="stylesheet" href="css/donardetail.css">
	</head>
	<body>
		<section>
			<h1>Donar's List</h1>
			<div id="tbl-header">
				<table id="keywords" cellspacing="0" cellpadding="0">
					<thead>
						<tr>
							<td>name</td>
							<td>gender</td>
							<td>age</td>
							<td>bgp</td>
							<td>city</td>
							<td>district</td>
							<td>state</td>
							<td>phn</td>
							<td>email</td>
							<td>exp</td>
							<td>hexp</td>
						</tr>
					</thead>
					<c:forEach var="results" items="${result}">
						<tr>
							<td>${results.name}</td>
							<td>${results.gender}</td>
							<td>${results.age}</td>
							<td>${results.bgp}</td>
							<td>${results.city}</td>
							<td>${results.district}</td>
							<td>${results.state}</td>
							<td>${results.phn}</td>
							<td>${results.email}</td>
							<td>${results.exp}</td>
							<td>${results.hexp}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</section>
		<script src="donardetail.js"></script>
	</body>
</html>