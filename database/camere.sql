-- hotel.camere definition

CREATE TABLE `camere` (
  `id` int NOT NULL,
  `piano` int NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `prezzo` decimal(8,2) NOT NULL,
  `nome` varchar(50) NOT NULL,
  `occupanti_max` int NOT NULL,
  `descrizione` text,
  `disponibile` tinyint(1) NOT NULL,
  `ultima_pulizia` date DEFAULT NULL,
  `ultima_manutenzione` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;