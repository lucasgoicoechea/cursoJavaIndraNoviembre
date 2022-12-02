<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>Señal Page</title>
	<style type="text/css">
		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}
	</style>
</head>
<body>
<h1>
	Add a Señal
</h1>

<c:url var="addAction" value="/señal/add" ></c:url>

<form:form action="${addAction}" commandName="señal">
<table>
	<c:if test="${!empty señal.nombre}">
	<tr>
		<td>
			<form:label path="id">
				<spring:message text="ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="id" readonly="true" size="8"  disabled="true" />
			<form:hidden path="id" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="nombre">
				<spring:message text="nombre"/>
			</form:label>
		</td>
		<td>
			<form:input path="nombre" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="tipo">
				<spring:message text="tipo"/>
			</form:label>
		</td>
		<td>
			<form:input path="tipo" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty señal.nombre}">
				<input type="submit"
					value="<spring:message text="Edit Señal"/>" />
			</c:if>
			<c:if test="${empty señal.nombre}">
				<input type="submit"
					value="<spring:message text="Add Señal"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Señales List</h3>
<c:if test="${!empty listSeñales}">
	<table class="tg">
	<tr>
		<th width="80">Señal ID</th>
		<th width="120">Señal Nombre</th>
		<th width="120">Señal Tipo</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listSeñales}" var="señal">
		<tr>
			<td>${señal.id}</td>
			<td>${señal.nombre}</td>
			<td>${señal.tipo}</td>
			<td><a href="<c:url value='/edit/${señal.id}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${señal.id}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
