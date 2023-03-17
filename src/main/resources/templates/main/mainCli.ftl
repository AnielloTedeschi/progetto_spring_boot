<br>
<h2>dati cliente</h2>

<form action="/cliente/add" method="post" id="datiCliente">
  <label for="nome">Nome:</label>
  <input type="text" id="nome" name="nome"><br>

  <label for="cognome">Cognome:</label>
  <input type="text" id="cognome" name="cognome"><br>

  <label for="codice_fiscale">Codice Fiscale:</label>
  <input type="text" id="codice_fiscale" name="codiceFiscale"><br>

  <label for="indirizzo">Indirizzo:</label>
  <input type="text" id="indirizzo" name="indirizzo"><br>

  <label for="email">Email:</label>
  <input type="email" id="email" name="email"><br>

  <label for="telefono">Telefono:</label>
  <input type="tel" id="telefono" name="telefono"><br>
  <input type="submit" value="Invia">
</form>
<br>
<table>
  <thead>
    <tr>
      <th>Id</th>
      <th>Nome</th>
      <th>Cognome</th>
      <th>Codice fiscale</th>
      <th>Indirizzo</th>
      <th>Email</th>
      <th>Telefono</th>
    </tr>
  </thead>
  <tbody>
    <#list listaClienti as cliente>
    <tr>
      <td>${cliente.id}</td>
      <td>${cliente.nome}</td>
      <td>${cliente.cognome}</td>
      <td>${cliente.codiceFiscale}</td>
      <td>${cliente.indirizzo}</td>
      <td>${cliente.email}</td>
      <td>${cliente.telefono}</td>
    </tr>
  </#list>
  </tbody>
</table>
<br>