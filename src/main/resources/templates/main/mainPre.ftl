<br>
<h2> prenotazioni </h2>
<form method="POST" action="/prenotazione/add" id="datiPrenotazione">
  <label for="nomePrenotante">Nome prenotante:</label>
  <input type="text" id="nomePrenotante" name="nomePrenotante" required>

  <label for="telefono">Telefono:</label>
  <input type="tel" id="telefono" name="telefono" required>

  <label for="email">Email:</label>
  <input type="email" id="email" name="email" required>
<br>
  <label for="camera">Camera:</label>
  <select id="camera" name="camera.id" required>
    <option value="">Seleziona una camera</option>
    <option value="1">Camera 1</option>
    <option value="2">Camera 2</option>
    <option value="3">Camera 3</option>
    <option value="4">Camera 4</option>
  </select>
<br>
  <label for="dataPrenotazione">Data prenotazione:</label>
  <input type="date" id="dataPrenotazione" name="dataPrenotazione"

  <label for="num_persone">Numero persone:</label>
  <input type="number" id="numPersone" name="numPersone"><br>

  <label for="acconto">Acconto:</label>
  <input type="number" id="acconto" name="acconto"><br>
  <input type="submit" value="Invia">

</form>
<br>
<h2> camere </h2>
<table>
  <thead>
    <tr>
      <th>ID</th>
      <th>Piano</th>
      <th>Tipo</th>
      <th>Prezzo</th>
      <th>Nome</th>
      <th>Occupanti Max</th>
      <th>Descrizione</th>
      <th>Disponibile</th>
      <th>Ultima Pulizia</th>
      <th>Ultima Manutenzione</th>
    </tr>
  </thead>
  <tbody>
    
					<#list listaCamere as camera>
	<tr>
	<td>${camera.id}</td>
	<td>${camera.piano}</td>
	<td>${camera.tipo}</td>
	<td>${camera.prezzo}</td>
	<td>${camera.nome}</td>
	<td> ${camera.occupantiMax}</td>
	<td>${camera.descrizione}</td>
	<td>${camera.disponibile?string('true', 'false')}</td>
	
	<td>${camera.ultimaPulizia}</td>
	<td>${camera.ultimaManutenzione}</td>
	
	</dr>
	
	</#list>			
    

  </tbody>
</table>
<br>