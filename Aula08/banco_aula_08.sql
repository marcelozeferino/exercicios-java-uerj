/*
SQLyog v4.07
Host - 4.1.12a-nt : Database - aula08bd
*********************************************************************
Server version : 4.1.12a-nt
*/


create database if not exists `aula08bd`;

USE `aula08bd`;

/*Table structure for table `aluno` */



/*Table structure for table `turma` */

drop table if exists `turma`;

CREATE TABLE `turma` (
  `codigo` int(11) NOT NULL default '0',
  `data_inicio` date default NULL,
  `data_fim` date default NULL,
  PRIMARY KEY  (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `turma` */

insert into `turma` values (1,'2011-03-20','2011-03-21'),(2,'2010-03-20','2011-03-20');

drop table if exists `aluno`;

CREATE TABLE `aluno` (
  `codigo` int(11) NOT NULL default '0',
  `nome` varchar(60) default NULL,
  `turma` int(11) default NULL,
  PRIMARY KEY  (`codigo`),
  KEY `turma` (`turma`),
  CONSTRAINT `aluno_ibfk_1` FOREIGN KEY (`turma`) REFERENCES `turma` (`codigo`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `aluno` */

insert into `aluno` values (1,'Marcelo',1),(2,'Pedro',2);