<br>
	<h1>Inserisci Dipendente</h1>
	<form action="/dipendenti/add" method="POST" id="datiDip">
		<label for="nome">Nome:</label>
		<input type="text" id="nome" name="nome" required><br>

		<label for="cognome">Cognome:</label>
		<input type="text" id="cognome" name="cognome" required><br>

		<label for="dataNascita">Data di Nascita:</label>
		<input type="date" id="dataNascita" name="dataNascita" required><br>

		<label for="email">Email:</label>
		<input type="email" id="email" name="email" required> <br>

		<label for="telefono">Telefono:</label>
		<input type="tel" id="telefono" name="telefono" required><br>

		<label for="indirizzo">Indirizzo:</label>
		<input type="text" id="indirizzo" name="indirizzo" required><br>

		<label for="citta">Città:</label>
		<input type="text" id="citta" name="citta" required><br>

		<label for="provincia">Provincia:</label>
		<input type="text" id="provincia" name="provincia" required><br>

		<label for="tipoRuolo">Tipo Ruolo:</label>
		<input type="text" id="ruolo" name="ruolo" required><br>
		

		<label for="stipendio">Stipendio:</label>
		<input type="number" id="stipendio" name="stipendio" min="0" step=".01" required><br>

		<label for="dataAssunzione">Data di Assunzione:</label>
		<input type="date" id="dataAssunzione" name="dataAssunzione" required><br>

		<label for="username">Username:</label>
		<input type="text" id="username" name="username" required><br>

		<label for="password">Password:</label>
		<input type="password" id="password" name="password" required><br>

		<input type="submit" value="Inserisci">
	</form>
<br>
<h2> lista dipendenti </h2>
<table>
  <thead>
    <tr>
      <th>id</th>
      <th>nome</th>
      <th>cognome</th>
      <th>data_nascita</th>
      <th>email</th>
      <th>telefono</th>
      <th>indirizzo</th>
      <th>citta</th>
      <th>provincia</th>
      
      <th>id_tipo_ruolo</th>
      <th>stipendio</th>
      <th>data_assunzione</th>
      <th>username</th>
      <th>password</th>
    </tr>
  </thead>
  <tbody>
    <#list listaDipendenti as dipendente>
    <tr>
      <td> ${dipendente.id}</td>
      <td> ${dipendente.nome}</td>
      
      <td>${dipendente.cognome}</td>
      <td>${dipendente.dataNascita}</td>
      <td>${dipendente.email}</td>
      <td>${dipendente.telefono}</td>
      <td>${dipendente.indirizzo}</td>
      <td>${dipendente.citta}</td>
      <td>${dipendente.provincia} </td>
      <td>${dipendente.ruolo}</td>
      <td>${dipendente.stipendio}</td>
      <td>${dipendente.dataAssunzione}</td>
      <td>${dipendente.username}</td>
      <td>${dipendente.password}</td>
      
      </tr>
  </#list>
  </tbody>
</table>
	<br>