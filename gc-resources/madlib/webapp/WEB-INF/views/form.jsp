<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Start your Adventure</title>
</head>
<body>
	<h1>Please enter the following words for your story:</h1>
	<form action="/madlib-story">
		<p>
			<label>noun</label> <input type="text" name="noun" />
		</p>
		<p>
			<label>verb</label> <input type="text" name="verb" />
		</p>
		<p>
			<label>adjective</label> <input type="text" name="adjective" />
		</p>
		<p>
			<label>adverb</label> <input type="text" name="adverb" />
		</p>
		<p>
			<button type="submit">GENERATE</button>
		</p>
	</form>
</body>
</html>