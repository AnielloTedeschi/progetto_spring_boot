<br>
<h2>check-in </h2>
<form method="post" action="/checkIn/add" id="datiCheckIn">
  <label for="idPrenotazione">ID Prenotazione:</label>
  <input type="number" id="idPrenotazione" name="idPrenotazione" required><br>

  <label for="idCliente">ID Cliente:</label>
  <input type="number" id="idCliente" name="idCliente" required><br>

  <label for="dataIngresso">Data Ingresso:</label>
  <input type="date" id="dataIngresso" name="dataIngresso" required><br>

  <label for="oraIngresso">Ora Ingresso:</label>
  <input type="text" id="oraIngresso" name="oraIngresso" required><br>

  <label for="dataUscita">Data Uscita:</label>
  <input type="date" id="dataUscita" name="dataUscita" required><br>

  <label for="oraUscita">Ora Uscita:</label>
  <input type="text" id="oraUscita" name="oraUscita" required><br>

  <label for="numeroCamera">Numero Camera:</label>
  <input type="number" id="numeroCamera" name="numeroCamera" required><br>

  <label for="costoTotale">Costo Totale:</label>
  <input type="number" id="costoTotale" name="costoTotale" step="0.01" required><br>

  <label for="statoPrenotazione">Stato Prenotazione:</label>
  <input type="text" id="statoPrenotazione" name="statoPrenotazione" required><br>

  <label for="numeroPersone">Numero Persone:</label>
  <input type="number" id="numeroPersone" name="numeroPersone" required><br>

  <label for="metodoPagamento">Metodo Pagamento:</label>
  <input type="text" id="metodoPagamento" name="metodoPagamento"><br>

  <label for="note">Note:</label>
  <textarea id="note" name="note"></textarea><br>

  <label for="dataPagamento">Data Pagamento:</label>
  <input type="date" id="dataPagamento" name="dataPagamento"><br>

  <label for="tassaSoggiorno">Tassa Soggiorno:</label>
  <input type="number" id="tassaSoggiorno" name="tassaSoggiorno" step="0.01"><br>

  <input type="submit" value="Submit">
</form>
<br>
<h2> lista prenotazioni</h2>
<table>
    <thead>
        <tr>
            <th>Id</th>
            <th>Nome Prenotante</th>
            <th>Telefono</th>
            <th>Email</th>
            <th>Camera</th>
            <th>Data Prenotazione</th>
            <th>Num Persone</th>
            <th>Acconto</th>
        </tr>
    </thead>
    <tbody>
        <#list listaPrenotazioni as prenotazione>
        <tr>
            <td>${prenotazione.id}</td>
            <td>${prenotazione.nomePrenotante}</td>
            <td>${prenotazione.telefono}</td>
            <td>${prenotazione.email}</td>
            <td>${prenotazione.camera}</td>
            <td>${prenotazione.dataPrenotazione}</td>
            <td>${prenotazione.numPersone}</td>
            <td>${prenotazione.acconto}</td>
        
        </tr>
        </#list>
    </tbody>
</table>
<br>
