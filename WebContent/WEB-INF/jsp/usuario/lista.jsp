<%@page contentType="text/html"%>
<%@page pageEncoding="iso-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<meta http-equiv="Content-type" content="text/html; charset=iso-8859-1" />
		<title>VRaptor - Usuário : Lista</title>
	</head>
	<body>
		<div style="height: 10px">&nbsp;</div>
		<center>
			<a href="<c:url value="/usuario/formulario"/>">Novo</a>
			<table width="500" border="1">
				<thead>
					<tr>
						<td width="50">ID</td>
						<td width="300">Nome</td>
						<td width="75">Editar</td>
						<td width="75">Excluir</td>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${usuarios}" var="usuario">
						<tr>
							<td>${usuario.id}</td>
							<td>${usuario.nmUsuario}</td>
							<td><a href="<c:url value="/usuario/editar/${usuario.id}"/>">Editar</a> </td>
							<td><a href="<c:url value="/usuario/excluir/${usuario.id}"/>">Excluir</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</center>
	</body>
</html>

