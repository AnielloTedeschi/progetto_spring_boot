<!DOCTYPE html>
<html>
<head>
	<title>Login</title>
	
</head>
<body>
	<form action="home" method="post" id="datiDip">
		<h2>Login</h2>
		<label for="ruolo">Ruolo:</label>
      	<select id="ruolo" name="ruolo">
        	<option value="amministratore">Amministratore</option>
        	<option value="receptionist">Receptionist</option>
        	<option value="contabile">Responsabile contabilità</option>
      	</select><br><br>
		<label for="nome">Nome:</label>
      	<input type="text" id="nome" name="nome"/><br><br>
      	<label for="password">Password:</label>
      	<input type="password" id="password" name="password"><br><br>
      	<input type="submit" value="Accedi">
	</form>
</body>
</html>
