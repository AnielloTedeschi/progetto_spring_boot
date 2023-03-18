-- hotel.uscite definition

CREATE TABLE `uscite` (
  `id` int NOT NULL AUTO_INCREMENT,
  `data` date NOT NULL,
  `descrizione` varchar(100) DEFAULT NULL,
  `importo` decimal(8,2) NOT NULL,
  `tipo_pagamento` varchar(50) DEFAULT NULL,
  `note` text,
  PRIMARY KEY (`id`),
  KEY `tipo_pagamento` (`tipo_pagamento`),
  CONSTRAINT `uscite_ibfk_1` FOREIGN KEY (`tipo_pagamento`) REFERENCES `metodi_pagamento` (`tipo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;