<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<fieldset>
	<h1>Enter Food Details</h1>
	<h3>${FoodDto.itemName}</h3>
	<h3>${count}</h3>
	<form action="food.do" method="Post">
		<br> <br> Name:<input type="text" name="itemName" /> <br>
		<br> Price:<input type="text" name="price" /> <br> <br>
		HotelName:<select name="hotelName">
			<option>select</option>
			<option>Gokul Cafe</option>
			<option>Cananara Hotel</option>
			<option>Kalyan Hotel</option>
			<option>Sujata Hotel</option>
		</select> <br> <br> Type:<input type="text" name="type" /> <br>
		<br> Location:<select name="location">
			<option>select</option>
			<option>BTM</option>
			<option>Mico Layout</option>
			<option>Hubli</option>
			<option>Dharawad</option>
		</select> <br> <br> Ordered:<select name="ordered">
			<option>select</option>
			<option>Offline</option>
			<option>Online Layout</option>
		</select> <br> <br> Quantity:<select name="quantity">
			<option>select</option>
			<option>1</option>
			<option>2</option>
			<option>3</option>
			<option>4</option>
		</select> <br> <br> <input type="Submit" value="Add"
			style="color: White; background: blue;"> <br> <br>
	</form>
	<select>  </select>
	</fieldset>

</body>
</html>