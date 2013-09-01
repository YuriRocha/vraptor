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
			<div style="width: 400; text-align: left;">
				<a href="<c:url value="/usuario/lista"/>">Voltar</a>
			</div>
			<form action="<c:url value="/usuario/salvar"/>" method="post">
				<table width="400">
					<tr>
						<td width="100" align="right">ID</td>
						<td width="300"><input name="usuario.id" type="text" readonly value="${usuario.id}"> </td>
					</tr>
					<tr>
						<td width="100" align="right">Nome</td>
						<td width="300"><input name="usuario.nmUsuario" type="text" value="${usuario.nmUsuario}"> </td>
					</tr>
					<tr>
						<td width="100" align="right">E-mail</td>
						<td width="300"><input name="usuario.dsEmail" type="text" value="${usuario.dsEmail}"> </td>
					</tr>
					<tr>
						<td width="100" align="right">Login</td>
						<td width="300"><input name="usuario.dsLogin" type="text" value="${usuario.dsLogin}"> </td>
					</tr>
					<tr>
						<td width="100" align="right">E-mail Público</td>
						<td width="300"><input type="checkbox" name="usuario.icEmailPublico" <c:if test="${usuario.icEmailPublico}">checked</c:if>></td> 
					</tr>
					<tr>
						<td width="100" align="right">Tipo Usuário</td>
						<td width="300">
							<INPUT TYPE=RADIO NAME="usuario.idTipoUsuario" VALUE="1" <c:if test="${usuario.idTipoUsuario == 1}">checked</c:if>>Usuário<BR>
							<INPUT TYPE=RADIO NAME="usuario.idTipoUsuario" VALUE="2" <c:if test="${usuario.idTipoUsuario == 2}">checked</c:if>>Administrador<BR>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="right">
							<input type="submit" value="Salvar">
						</td>
					</tr>
				</table>
			</form>
		</center>
	</body>
</html>

