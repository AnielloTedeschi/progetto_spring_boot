<form method="POST" action="/bilancio/uscite/add" id="datiUscite">
  <h2>Uscite</h2>
  <label for="data_uscite">Data:</label>
  <input type="date" id="data_uscite" name="data"><br>

  <label for="descrizione_uscite">Descrizione:</label>
  <input type="text" id="descrizione_uscite" name="descrizione"><br>

  <label for="importo_uscite">Importo:</label>
  <input type="number" id="importo_uscite" name="importo"><br>

  <label for="tipo_pagamento_uscite">Tipo di pagamento:</label>
  <select id="tipo_pagamento_uscite" name="tipoPagamento">
    <option value="contanti">Contanti</option>
    <option value="carta_di_credito">Carta di credito</option>
    <option value="bonifico_bancario">Bonifico bancario</option>
    <option value="altro">Altro</option>
  </select><br>

  <label for="note_uscite">Note:</label>
  <textarea id="note_uscite" name="note"></textarea><br>
<input type="submit" value="Invia">
</form>

  <form method="POST" action="/bilancio/entrate/add" id="datiEntrate">
  <h2>Entrate</h2>
  <label for="data_entrate">Data:</label>
  <input type="date" id="data_entrate" name="data"><br>

  <label for="descrizione_entrate">Descrizione:</label>
  <input type="text" id="descrizione_entrate" name="descrizione"><br>

  <label for="importo_entrate">Importo:</label>
  <input type="number" id="importo_entrate" name="importo"><br>

  <label for="tipo_pagamento_entrate">Tipo di pagamento:</label>
  <select id="tipo_pagamento_entrate" name="tipoPagamento">
    <option value="contanti">Contanti</option>
    <option value="carta_di_credito">Carta di credito</option>
    <option value="bonifico_bancario">Bonifico bancario</option>
    <option value="altro">Altro</option>
  </select><br>

  <label for="note_entrate">Note:</label>
  <textarea id="note_entrate" name="note"></textarea><br>

  <input type="submit" value="Invia">
</form>
<br> 
<h2> entrate </h2>
<table>
  <thead>
    <tr>
      <th>ID</th>
      <th>Data</th>
      <th>Descrizione</th>
      <th>Importo</th>
      <th>Tipo di pagamento</th>
      <th>Note</th>
      <th>Metodo di pagamento</th>
    </tr>
  </thead>
  <tbody>
    <#list listaEntrate as entrate>
    <tr>
      <td>${entrate.id}</td>
      <td>${entrate.data}</td>
      <td>${entrate.descrizione}</td>
      <td>${entrate.importo}</td>
      <td>${entrate.tipoPagamento}</td>
      <td>${entrate.note}</td>
      <td>${entrate.metodiPagamento}</td>
    </tr>
  </#list>
  </tbody>
</table>
<br>
<h2> uscite </h2>
<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Data</th>
            <th>Descrizione</th>
            <th>Importo</th>
            <th>Tipo di pagamento</th>
            <th>Note</th>
            <th>Metodo di pagamento</th>
        </tr>
    </thead>
    <tbody>
        <#list listaUscite as uscite>
        <tr>
            <td>${uscite.id}</td>
            <td>${uscite.data}</td>
            <td>${uscite.descrizione}</td>
            <td>${uscite.importo}</td>
            <td>${uscite.tipoPagamento}</td>
            <td>${uscite.note}</td>
            <td>${uscite.metodoPagamento}</td>
        </tr>
    </#list>
    </tbody>
</table>
<br>