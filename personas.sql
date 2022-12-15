use sakila;
CREATE TABLE `personas` (
    `id` INT NOT NULL,
    `nombre` VARCHAR(45) NULL,
    `apellido` VARCHAR(45) NULL,
    `fecha_nacimiento` DATETIME NULL,
    `cedula` VARCHAR(45) NULL,
    PRIMARY KEY (`id`)
);

INSERT INTO `personas` (`id`, `nombre`, `apellido`, `fecha_nacimiento`, `cedula`)
VALUES ('1', 'Alejandra', 'Buquete', '1990-11-22 00:00:00', '1234');INSERT INTO `personas` (`id`, `nombre`, `apellido`, `fecha_nacimiento`, `cedula`) VALUES ('2',
'Daniel', 'Ridolfo', '1989-10-07 00:00:00', '5678');INSERT INTO `personas` (`id`,
`nombre`, `apellido`, `fecha_nacimiento`, `cedula`) VALUES ('3', 'Natalia', 'Perez', '1987-03-12
00:00:00', '9012');INSERT INTO `personas` (`id`, `nombre`, `apellido`,
`fecha_nacimiento`, `cedula`) VALUES ('4', 'Sebastian', 'Cabinas', '1992-09-12 00:00:00', '3478');

use sakila;
CREATE TABLE `paises` (
 `id` INT NOT NULL,
 `nombre` VARCHAR(45) NOT NULL,
 PRIMARY KEY (`id`));
 
CREATE TABLE `ciudades` (
 `id` INT NOT NULL,
`fk_pais` INT NOT NULL,
 `nombre` VARCHAR(45) NOT NULL,
 PRIMARY KEY (`id`),
 FOREIGN KEY (`fk_pais`)
 REFERENCES `indra2022`.`paises` (`id`)
 );
 
INSERT INTO `paises` (`id`, `nombre`) VALUES ('1', 'Argentina');
INSERT INTO `paises` (`id`, `nombre`) VALUES ('2', 'España');
INSERT INTO `paises` (`id`, `nombre`) VALUES ('3', 'Chile');
INSERT INTO `paises` (`id`, `nombre`) VALUES ('4', 'Portugal');

INSERT INTO `ciudades` (`id`, `fk_pais`, `nombre`) VALUES ('1', '1', 'Buenos Aires');
INSERT INTO `ciudades` (`id`, `fk_pais`, `nombre`) VALUES ('2', '1', 'Rosario');
INSERT INTO `ciudades` (`id`, `fk_pais`, `nombre`) VALUES ('3', '1', 'Viedma');
INSERT INTO `ciudades` (`id`, `fk_pais`, `nombre`) VALUES ('4', '1', 'Campana');
INSERT INTO `ciudades` (`id`, `fk_pais`, `nombre`) VALUES ('5', '1', 'Zarate');
INSERT INTO `ciudades` (`id`, `fk_pais`, `nombre`) VALUES ('6', '2', 'Madrid');
INSERT INTO `ciudades` (`id`, `fk_pais`, `nombre`) VALUES ('7', '2', 'Sevilla');
INSERT INTO `ciudades` (`id`, `fk_pais`, `nombre`) VALUES ('8', '2', 'Badajoz');
INSERT INTO `ciudades` (`id`, `fk_pais`, `nombre`) VALUES ('9', '2', 'Malaga');
INSERT INTO `ciudades` (`id`, `fk_pais`, `nombre`) VALUES ('10', '2', 'Toledo');
INSERT INTO `ciudades` (`id`, `fk_pais`, `nombre`) VALUES ('11', '3', 'Santiago');
INSERT INTO `ciudades` (`id`, `fk_pais`, `nombre`) VALUES ('12', '3', 'La Serena');
INSERT INTO `ciudades` (`id`, `fk_pais`, `nombre`) VALUES ('13', '3', 'Viña del Mar');

