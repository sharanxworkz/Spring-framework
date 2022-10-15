<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>EL-DORADO...WORLD CRIMINALS DATA</h1>
	<h2> World is my territory</h2>

	<form action="criminal" method="post">
		<pre>

	Name: <input type="text" name="name"> 
	
	Age:  <select name="age">
		<option>select</option>
		<c:forEach begin="12" end="100" var="criminals">
    	<option value="${criminals}">${criminals}</option>
		</c:forEach>
	</select>
	
     Country:<select name="country">
		<option>India</option>
		<option>America</option>
		<option>Japan</option>
		<option>China</option>
		<option>Germany</option>
	</select> 
	
	Criminal Type:<select name="criminalType">
		<option>Cyber crime</option>
		<option>Kidnapping</option>
		<option>Theft</option>
		<option>Violence</option>
		<option>Felony</option>
	</select> 
	
	No Of Cases:<select name="noOfCases">
	<option>select</option>
	<c:forEach begin="1" end="100" var="case">
    	<option value="${case}">${case}</option>
		</c:forEach>
	</select>
	
	Alive:<input type="radio" name="alive" value="yes">yes
	      <input type="radio" name="alive" value="no">No
	      
	    Gender:<input type="radio" name="gender" value="male">Male
	    <input type="radio" name="gender" value="female">Female
	    <input type="radio" name="gender" value="transgender">Transgender
	    
	    International:<input type="radio" name="international" value="yes">yes
	    <input type="radio" name="international" value="no">No
	    
	    Married:<input type="radio" name="married" value="yes">yes
	    <input type="radio" name="married" value="no">No
	    
	    Jail Term:<select name="jailTerm">
	    
	    <option>1 years</option>
	    <option>2 years</option>
	    <option>3 years</option>
	    <option>4 years</option>
	    <option>5 years</option>
	    <option>6 years</option>
	    <option>7 years</option>
	    <option>8 years</option>
	    <option>9 years</option>
	    <option>10 years</option>
	     </select>
	     
	     Wife Name:<input type="text" name="wifeName">
	     
	     Right Hand Name:<input type="text" name="rightHandName">
	     
	     Left Hand Name:<input type="text" name="leftHandName">
	     
	      Prison Name:<input type="text" name="prisonName">
	      
	       Net Worth:<input type="text" name="netWorth">
	       
	       <input type="submit" value="save">
	     <a href="showALL">show all</a>
    </pre>
	</form>
</body>
</html>






