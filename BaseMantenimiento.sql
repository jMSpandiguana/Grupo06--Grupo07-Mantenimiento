{\rtf1\ansi\ansicpg1252\cocoartf2511
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 -- phpMyAdmin SQL Dump\
-- version 4.9.3\
-- https://www.phpmyadmin.net/\
--\
-- Host: localhost:8889\
-- Generation Time: Jun 23, 2020 at 03:10 AM\
-- Server version: 5.7.26\
-- PHP Version: 7.4.2\
\
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";\
SET time_zone = "+00:00";\
\
--\
-- Database: `Citas_Medicas_Mater`\
--\
\
-- --------------------------------------------------------\
\
--\
-- Table structure for table `cit_personas`\
--\
\
CREATE TABLE `cit_personas` (\
  `per_codigo` int(11) NOT NULL,\
  `per_cedula` varchar(11) NOT NULL,\
  `per_nombre` varchar(100) NOT NULL,\
  `per_apellido` varchar(100) NOT NULL,\
  `per_fechaNacimiento` varchar(100) NOT NULL,\
  `per_telefono` varchar(11) NOT NULL,\
  `per_direccion` varchar(200) NOT NULL\
) ENGINE=InnoDB DEFAULT CHARSET=utf8;\
\
--\
-- Dumping data for table `cit_personas`\
--\
\
INSERT INTO `cit_personas` (`per_codigo`, `per_cedula`, `per_nombre`, `per_apellido`, `per_fechaNacimiento`, `per_telefono`, `per_direccion`) VALUES\
(1, '0107181562', 'fernando', 'sanchez', '03/10/1997', '2900295', 'rosal'),\
(2, '0107843950', 'Jose', 'Pandiguana', '09/10/1996', '090909090', 'Colegio Borja');\
\
--\
-- Indexes for dumped tables\
--\
\
--\
-- Indexes for table `cit_personas`\
--\
ALTER TABLE `cit_personas`\
  ADD PRIMARY KEY (`per_codigo`);\
\
--\
-- AUTO_INCREMENT for dumped tables\
--\
\
--\
-- AUTO_INCREMENT for table `cit_personas`\
--\
ALTER TABLE `cit_personas`\
  MODIFY `per_codigo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;\
}