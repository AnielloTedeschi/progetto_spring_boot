-- hotel.check_in definition

CREATE TABLE `check_in` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_prenotazione` int NOT NULL,
  `id_cliente` int NOT NULL,
  `data_ingresso` date NOT NULL,
  `ora_ingresso` varchar(16) DEFAULT NULL,
  `data_uscita` date NOT NULL,
  `ora_uscita` varchar(16) DEFAULT NULL,
  `numero_camera` int NOT NULL,
  `costo_totale` decimal(8,2) NOT NULL,
  `stato_prenotazione` varchar(50) DEFAULT NULL,
  `numero_persone` int NOT NULL,
  `metodo_pagamento` varchar(50) DEFAULT NULL,
  `note` text,
  `data_pagamento` date DEFAULT NULL,
  `tassa_soggiorno` decimal(8,2) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;