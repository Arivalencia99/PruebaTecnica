-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-08-2022 a las 03:34:50
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `prueba`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `id` bigint(20) NOT NULL,
  `ciudad` varchar(255) DEFAULT NULL,
  `edad` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `zona_horaria` tinyblob DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`id`, `ciudad`, `edad`, `nombre`, `zona_horaria`) VALUES
(1, 'cali', '23', 'ari', 0xaced00057372000d6a6176612e74696d652e536572955d84ba1b2248b20c00007870771107000e416d65726963612f426f676f746178);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `examen`
--

CREATE TABLE `examen` (
  `id` bigint(20) NOT NULL,
  `fecha` datetime DEFAULT NULL,
  `puntos` int(11) DEFAULT NULL,
  `total_puntos` int(11) DEFAULT NULL,
  `id_estudiante` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `examen`
--

INSERT INTO `examen` (`id`, `fecha`, `puntos`, `total_puntos`, `id_estudiante`) VALUES
(1, '2022-08-07 19:00:00', 80, 100, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `examen_preguntas`
--

CREATE TABLE `examen_preguntas` (
  `examen_id` bigint(20) NOT NULL,
  `preguntas_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `examen_preguntas`
--

INSERT INTO `examen_preguntas` (`examen_id`, `preguntas_id`) VALUES
(1, 1),
(1, 2),
(1, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta`
--

CREATE TABLE `pregunta` (
  `id` bigint(20) NOT NULL,
  `id_respuesta_correcta` int(11) DEFAULT NULL,
  `peso` int(11) DEFAULT NULL,
  `pregunta_examen` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pregunta`
--

INSERT INTO `pregunta` (`id`, `id_respuesta_correcta`, `peso`, `pregunta_examen`) VALUES
(1, 7, 50, 'cual es la capital de colombia'),
(2, 4, 30, '10+10'),
(3, 12, 20, 'cual de las siquientes es una marca de carro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta_respuestas`
--

CREATE TABLE `pregunta_respuestas` (
  `pregunta_id` bigint(20) NOT NULL,
  `respuestas_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `pregunta_respuestas`
--

INSERT INTO `pregunta_respuestas` (`pregunta_id`, `respuestas_id`) VALUES
(1, 5),
(1, 6),
(1, 7),
(1, 8),
(2, 1),
(2, 2),
(2, 3),
(2, 4),
(3, 9),
(3, 10),
(3, 11),
(3, 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuesta`
--

CREATE TABLE `respuesta` (
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `respuesta`
--

INSERT INTO `respuesta` (`id`, `descripcion`) VALUES
(1, '5'),
(2, '10'),
(3, '15'),
(4, '20'),
(5, 'cali'),
(6, 'medellin'),
(7, 'bogota'),
(8, 'armenia'),
(9, 'mazda'),
(10, 'kia'),
(11, 'chevrolet'),
(12, 'todas las anteriores');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `examen`
--
ALTER TABLE `examen`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKsg9x185ksq2tpiw87n8fr1ogh` (`id_estudiante`);

--
-- Indices de la tabla `examen_preguntas`
--
ALTER TABLE `examen_preguntas`
  ADD PRIMARY KEY (`examen_id`,`preguntas_id`),
  ADD UNIQUE KEY `UK_ogvnvyh2ytauwr89bm7u7gv32` (`preguntas_id`);

--
-- Indices de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pregunta_respuestas`
--
ALTER TABLE `pregunta_respuestas`
  ADD PRIMARY KEY (`pregunta_id`,`respuestas_id`),
  ADD UNIQUE KEY `UK_fpufmfdngc86apu62gj1g6a7h` (`respuestas_id`);

--
-- Indices de la tabla `respuesta`
--
ALTER TABLE `respuesta`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `examen`
--
ALTER TABLE `examen`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `respuesta`
--
ALTER TABLE `respuesta`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
