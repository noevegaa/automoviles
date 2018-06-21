# automoviles
create database automoviles; 
use automoviles
create table carros(carro int(3) zerofill,marca varchar(50),modelo varchar(50),tipo int(3) zerofill not null,color varchar (25),precio varchar(25),gasolina varchar(25),primary key(carro), index(tipo), foreign key(tipo) references tipos(tipo))engine=innodb;
 create table accesorios(accesorio int(3) zerofill auto_increment not null,nombre varchar(50),primary key(accesorio))engine=innodb;
create table tipos(tipo int(3) zerofill auto_increment not null,nombre varchar(50), descripcion varchar(50),primary key(tipo))engine=innodb;
create table accesorioxcarro(idcarro int(3) zerofill,idaccesorio int(3),primary key(idcarro),primary key(idaccesorio))engine=innodb;
