CREATE TABLE `legajo` (
  `idlegajo` int NOT NULL,
  `id` int NOT NULL,
  `caratula` varchar(255) DEFAULT NULL,
  `nro_legajo` int NOT NULL,
  `persona_id` int DEFAULT NULL,
  PRIMARY KEY (`idlegajo`),
  KEY `FK_nombre` (`persona_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `personas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `apellidos` varchar(85) DEFAULT NULL,
  `legajo_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `alejo_idx` (`legajo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

ALTER TABLE personas
ADD  CONSTRAINT `alejo` FOREIGN KEY (`legajo_id`) REFERENCES `legajo` (`idlegajo`);

ALTER TABLE legajo 
ADD  CONSTRAINT `FK_nombre` FOREIGN KEY (`persona_id`) REFERENCES `personas` (`id`);
