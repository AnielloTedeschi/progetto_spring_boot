-- hotel.metodi_pagamento definition

CREATE TABLE `metodi_pagamento` (
  `tipo` varchar(50) NOT NULL,
  `descrizione` text,
  PRIMARY KEY (`tipo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;