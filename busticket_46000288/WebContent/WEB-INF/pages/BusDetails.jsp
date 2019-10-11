<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>View BusDetails</title>
</head>
<body>
	<!-- <c:out value="${ requestScope.model }"/> -->
	<table border="1" style="width: 70%">
		<tr>
			<th bgcolor="#cc99ff">Bus Id</th>
			<th bgcolor="#cc99ff">Bus Travel Name</th>
			<th bgcolor="#cc99ff">Source</th>
			<th bgcolor="#cc99ff">Destination</th>
			<th bgcolor="#cc99ff">Available Seats</th>
		</tr>
		<c:forEach var="bus" items="${busDetailsList}">
			<tr>
				<td align="center" bgcolor="#ccffff">${bus.busId}</td>
				<td align="center" bgcolor="#ccffff">${bus.busTravelName}</td>
				<td align="center" bgcolor="#ccffff">${bus.source}</td>
				<td align="center" bgcolor="#ccffff">${bus.destination}</td>
				<td align="center" bgcolor="#ccffff">${bus.availableSeats}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>