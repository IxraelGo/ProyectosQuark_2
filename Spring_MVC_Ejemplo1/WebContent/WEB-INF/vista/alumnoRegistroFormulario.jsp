<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de registro</title>
</head>
<body>

	<form:form action="procesarFormulario" modelAttribute="elAlumno">
		Nombre: <form:input path="nombre"/>
		
		<br><br><br>
		
		Apellido: <form:input path="apellido"/>
		
		<br/><br/><br/>
		
		Asignaturas Optativas: <br>
		<form:select path="optativa" multiple="true">
		
			<form:option value="Dise�o" label="Dise�o"></form:option>
			<form:option value="Karate" label="Karate"></form:option>
			<form:option value="Comercio" label="Comercio"></form:option>
			<form:option value="Danza" label="Danza"></form:option>
		
		</form:select>

		<br/><br/><br/>

		<input type="submit" value="Enviar"/>		
		
	</form:form>

</body>
</html>