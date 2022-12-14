CREATE TABLE `deporte` (
  `id` int NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `prioridad` int NOT NULL,
  `grupal` boolean DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
