-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-08-2023 a las 16:42:32
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `g3extra`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seriespeliculas`
--

CREATE TABLE `seriespeliculas` (
  `id_contenido` int(11) NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `formato` varchar(30) NOT NULL,
  `creador` varchar(30) NOT NULL,
  `estreno` int(11) NOT NULL,
  `puntaje` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `seriespeliculas`
--

INSERT INTO `seriespeliculas` (`id_contenido`, `titulo`, `formato`, `creador`, `estreno`, `puntaje`) VALUES
(1, 'El planeta de los simios', 'Novela', 'Peter Jackson', 1963, 9.8),
(2, 'El planeta de los simios', 'Pelicula', 'Franklin Schaffner', 1968, 7.9),
(3, 'Escape del planeta de los simios', 'Pelicula', 'Arthur P. Jacobs', 1971, 6.5),
(4, 'Conquista del planeta de los simios', 'Pelicula', 'Arthur P. Jacobs', 1972, 6.7),
(5, 'La batalla por el planeta de los simios', 'Pelicula', 'Arthur P. Jacobs', 1973, 8.6),
(6, 'El planeta de los simios', 'Serie', 'Mort Abraham', 1977, 7),
(8, 'El planeta de los simios', 'Comic', 'El planeta de los simios franq', 1975, 8.2),
(9, 'El planeta de los simios', 'Pelicula', 'Tim Burton', 2001, 8),
(10, 'El planeta de los simios: evolucion', 'Pelicula', 'Rupert Wyatt', 2011, 7.8),
(11, 'El planeta de los simios: confrontacion', 'Pelicula', 'Matt Reeves', 2014, 9),
(12, 'La guerra del planeta de los simios', 'Serie', 'Matt Reeves', 2017, 9.5),
(15, 'Transformers: Bumblebee', 'Película', 'Travis Knight', 2018, 7.4),
(16, 'Transformers: El último caballero', 'Película', 'Michael Bay', 2017, 8.2),
(17, 'Transformers: La guerra por Cybertron - El asedio', 'Serie', 'Pierre Boulle', 2020, 9.8);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `seriespeliculas`
--
ALTER TABLE `seriespeliculas`
  ADD PRIMARY KEY (`id_contenido`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `seriespeliculas`
--
ALTER TABLE `seriespeliculas`
  MODIFY `id_contenido` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
