# Proyecto para la Academia Soluciones Informáticas.

## Actualmente solo funciona para la tabla horarios:

CREATE TABLE `db_prueba`.`horario`(  
`id` int (11) AUTO_INCREMENT,  
`horainicio` varchar (150) DEFAULT NULL,  
`horafin` varchar (150) DEFAULT NULL, 
`curso` varchar (150) DEFAULT NULL,   
`instructor` varchar (150) DEFAULT NULL,
PRIMARY KEY (`id`)
);

### Link para el script de la base de datos.

https://gist.github.com/E-Samayoa/263f30a60170e580d45eba717ffc202a

Nota: La base de datos no está adaptada en su totalidad al esquema de Spring.
