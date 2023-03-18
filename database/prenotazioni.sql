-- hotel.prenotazioni definition

CREATE TABLE `prenotazioni` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome_prenotante` varchar(50) NOT NULL,
  `telefono` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `id_camera` int NOT NULL,
  `data_prenotazione` date NOT NULL,
  `num_persone` int NOT NULL,
  `acconto` decimal(8,2) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_camera` (`id_camera`),
  CONSTRAINT `prenotazioni_ibfk_1` FOREIGN KEY (`id_camera`) REFERENCES `camere` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;