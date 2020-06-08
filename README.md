# Proyecto para la Academia Soluciones Informáticas.

## Actualmente solo funciona para la tabla horarios y alumnos:

CREATE TABLE `academia`.`horario`(  
`id` int (11) AUTO_INCREMENT,  
`horainicio` varchar (150) DEFAULT NULL,  
`horafin` varchar (150) DEFAULT NULL, 
`curso` varchar (150) DEFAULT NULL,   
`instructor` varchar (150) DEFAULT NULL,
PRIMARY KEY (`id`)
);

CREATE TABLE `academia`.`alumnos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `apellido` VARCHAR(45) NULL,
  `nombre` VARCHAR(45) NULL,
  `telefono` VARCHAR(45) NULL,
  `otro` VARCHAR(45) NULL,
  `comunietica` VARCHAR(45) NULL,
  `sexo` VARCHAR(45) NULL,
  `fechanac` DATE NULL,
  `lugarnac` VARCHAR(45) NULL,
  `papependiente` VARCHAR(45) NULL,
  `niveleducativo` VARCHAR(45) NULL,
  `dpi` VARCHAR(45) NULL,
  `extendida` VARCHAR(45) NULL,
  `direccion` VARCHAR(45) NULL,
  `municipio` VARCHAR(45) NULL,
  `departamento` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

### Link para el script de la base de datos.

https://gist.github.com/E-Samayoa/263f30a60170e580d45eba717ffc202a

Nota: La base de datos no está adaptada en su totalidad al esquema de Spring.
