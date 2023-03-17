<h1> statistiche</h1>
<table>
  <thead>
    <tr>
      <th>ID</th>
      <th>Data Rilevamento</th>
      <th>Numero Clienti</th>
      <th>Numero Camere Totali</th>
      <th>Numero Camere Disponibili</th>
      <th>Numero Prenotazioni Totali</th>
      <th>Numero Prenotazioni Concluse</th>
      <th>Numero Prenotazioni Annullate</th>
      <th>Numero Entrate</th>
      <th>Numero Uscite</th>
      <th>Importo Entrate</th>
      <th>Importo Uscite</th>
      <th>Tassa Soggiorno Totale</th>
    </tr>
  </thead>
  <tbody>
    <#list listaStatistiche as statistiche>
      
    <tr>
      <td>${statistiche.id}</td>
      <td>${statistiche.dataRilevamento}</td>
      <td>${statistiche.numClienti}</td>
      <td>${statistiche.numCamereTotali}</td>
      <td>${statistiche.numCamereDisponibili}</td>
      <td>${statistiche.numPrenotazioniTotali}</td>
      <td>${statistiche.numeroPrenotazioniConcluse}</td>
      <td>${statistiche.numeroPrenotazioniAnnullate}</td>
      <td>${statistiche.numeroEntrate} </td>
      
      <td>${statistiche.numeroUscite}</td>
      <td>${statistiche.importoEntrate}</td>
      <td>${statistiche.importoUscite}</td>
      
      <td>${statistiche.tassaSoggiornoTotale}</td>
      
      </tr>
      </#list>
      </tbody>
      </table>
      <br>