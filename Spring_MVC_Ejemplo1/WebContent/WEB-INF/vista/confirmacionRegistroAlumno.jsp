<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmaci�n de Registro</title>
</head>
<body>
El alumno con nombre <strong>${elAlumno.nombre}</strong>, apellido <strong>${elAlumno.apellido}</strong>,
 edad <strong>${elAlumno.edad}</strong>, E-Mail <strong> ${elAlumno.email} </strong> y C. postal <strong>${elAlumno.codigoPostal}</strong> 
se ha registrado con �xito.
<br>
La asignatura escogida es: <strong>${elAlumno.optativa}</strong>
<br/>
La ciudad donde iniciar� los estudios el alumno es: ${elAlumno.ciudadEstudios}
<br/>
Los idiomas escogidos por el alumno son: ${elAlumno.idiomasAlumno}
</body>
</html>