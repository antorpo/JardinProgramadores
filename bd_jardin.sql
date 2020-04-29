-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-04-2020 a las 09:03:07
-- Versión del servidor: 10.4.8-MariaDB
-- Versión de PHP: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_jardin`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acudiente`
--

CREATE TABLE `acudiente` (
  `Id` int(50) NOT NULL,
  `Nombre` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `TipoDocumento` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `NumeroDocumento` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `FechaCreacion` datetime NOT NULL,
  `FechaModificacion` datetime DEFAULT NULL,
  `CelAdicional` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Horario` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Permiso` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `Telefono` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `Calidad` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `Celular` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `Direccion` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiante`
--

CREATE TABLE `estudiante` (
  `Id` int(50) NOT NULL,
  `Nombre` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `TipoDocumento` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `NumeroDocumento` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `FechaCreacion` datetime NOT NULL,
  `FechaModificacion` datetime DEFAULT NULL,
  `Edad` int(2) NOT NULL,
  `Talla` double NOT NULL,
  `Peso` double NOT NULL,
  `Genero` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `Problemas` varchar(250) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `estudiante`
--

INSERT INTO `estudiante` (`Id`, `Nombre`, `TipoDocumento`, `NumeroDocumento`, `FechaCreacion`, `FechaModificacion`, `Edad`, `Talla`, `Peso`, `Genero`, `Problemas`) VALUES
(1, 'Juanito  Perez Ocampo', 'Tarjeta de Identidad', '99091234032', '2020-04-29 00:00:00', NULL, 5, 154, 45, 'Masculino', 'Un chicho muy atento y juicioso.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupo`
--

CREATE TABLE `grupo` (
  `Id` int(50) NOT NULL,
  `FechaCreacion` datetime NOT NULL,
  `FechaModificacion` datetime DEFAULT NULL,
  `Nombre` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `grupo`
--

INSERT INTO `grupo` (`Id`, `FechaCreacion`, `FechaModificacion`, `Nombre`) VALUES
(1, '2020-04-29 00:00:00', NULL, 'Grupo 1'),
(2, '2020-04-29 00:00:00', NULL, 'Grupo 2'),
(3, '2020-04-29 00:00:00', NULL, 'Grupo 3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `logro`
--

CREATE TABLE `logro` (
  `Id` int(50) NOT NULL,
  `Nombre` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `TipoLogro` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `FechaCreacion` datetime NOT NULL,
  `FechaModificacion` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `logro`
--

INSERT INTO `logro` (`Id`, `Nombre`, `TipoLogro`, `FechaCreacion`, `FechaModificacion`) VALUES
(1, 'Razonmiento Logico 1', 'Academico', '2020-04-29 00:00:00', NULL),
(2, 'Razonmiento Logico 2', 'Academico', '2020-04-29 00:00:00', NULL),
(3, 'Razonmiento Logico 3', 'Academico', '2020-04-29 00:00:00', NULL),
(4, 'Resolucion de Problemas 1', 'Academico', '2020-04-29 00:00:00', NULL),
(5, 'Resolucion de Problemas 2', 'Academico', '2020-04-29 00:00:00', NULL),
(6, 'Analisis 1', 'Actitudinal', '2020-04-29 00:00:00', NULL),
(7, 'Analisis 2', 'Actitudinal', '2020-04-29 00:00:00', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pariente`
--

CREATE TABLE `pariente` (
  `Id` int(50) NOT NULL,
  `Nombre` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `TipoDocumento` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `NumeroDocumento` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `FechaCreacion` datetime NOT NULL,
  `FechaModificacion` datetime DEFAULT NULL,
  `Telefono` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `Calidad` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `Celular` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `Direccion` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `pariente`
--

INSERT INTO `pariente` (`Id`, `Nombre`, `TipoDocumento`, `NumeroDocumento`, `FechaCreacion`, `FechaModificacion`, `Telefono`, `Calidad`, `Celular`, `Direccion`) VALUES
(1, 'Eugenia Ocampo', 'Cedula de Ciudadania', '10293349503', '2020-04-29 00:00:00', NULL, '4930239', 'Padre/Madre', '312394349', 'Carrera Avenida 23');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `Id` int(50) NOT NULL,
  `Nombre` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `TipoDocumento` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `NumeroDocumento` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `FechaCreacion` datetime NOT NULL,
  `FechaModificacion` datetime DEFAULT NULL,
  `Telefono` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `Especialidad` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `Genero` varchar(100) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`Id`, `Nombre`, `TipoDocumento`, `NumeroDocumento`, `FechaCreacion`, `FechaModificacion`, `Telefono`, `Especialidad`, `Genero`) VALUES
(1, 'David  Perez Velazques', 'Cedula de Ciudadania', '10394509689', '2020-04-29 00:00:00', NULL, '3339845', 'Razonamiento Logico', 'Masculino'),
(2, 'Manuela Quiroz Arbealez', 'Cedula de Ciudadania', '10569904545', '2020-04-29 00:00:00', NULL, '4569898', 'Matematicas', 'Masculino'),
(3, 'Jorge Ivan Ortiz Cartagena', 'Cedula de Ciudadania', '1095894049', '2020-04-29 00:00:00', NULL, '3459809', 'Pensamiento Sistemico', 'Masculino');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seguimiento`
--

CREATE TABLE `seguimiento` (
  `Id` int(50) NOT NULL,
  `IdLogro` int(50) NOT NULL,
  `IdEstudiante` int(50) NOT NULL,
  `PrimeraFecha` date DEFAULT NULL,
  `SegundaFecha` date DEFAULT NULL,
  `PrimeraCalificacion` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `SegundaCalificacion` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `CalificacionFinal` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `Bimestre` tinyint(1) NOT NULL,
  `NombreLogro` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `Comentario` varchar(500) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `seguimiento`
--

INSERT INTO `seguimiento` (`Id`, `IdLogro`, `IdEstudiante`, `PrimeraFecha`, `SegundaFecha`, `PrimeraCalificacion`, `SegundaCalificacion`, `CalificacionFinal`, `Bimestre`, `NombreLogro`, `Comentario`) VALUES
(1, 1, 1, '2020-03-11', '2020-04-11', 'Capaz', 'Muy Capaz', 'Con posibilidades de Avanzar', 1, 'Razonmiento Logico 1', 'Buen avance en el curso de Razonamiento Logico 1.\nDemostro los conocimiento suficientes para ganar el logro.'),
(2, 2, 1, '2020-04-16', NULL, 'Aceptable', '', '', 0, 'Razonmiento Logico 2', 'Manifiesta una capacitad notable en esta unidad.'),
(3, 3, 1, NULL, NULL, '', '', '', 0, 'Razonmiento Logico 3', ''),
(4, 4, 1, NULL, NULL, '', '', '', 0, 'Resolucion de Problemas 1', ''),
(5, 5, 1, NULL, NULL, '', '', '', 0, 'Resolucion de Problemas 2', ''),
(6, 6, 1, NULL, NULL, '', '', '', 0, 'Analisis 1', ''),
(7, 7, 1, NULL, NULL, '', '', '', 0, 'Analisis 2', '');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `acudiente`
--
ALTER TABLE `acudiente`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `grupo`
--
ALTER TABLE `grupo`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `logro`
--
ALTER TABLE `logro`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `pariente`
--
ALTER TABLE `pariente`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`Id`);

--
-- Indices de la tabla `seguimiento`
--
ALTER TABLE `seguimiento`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `acudiente`
--
ALTER TABLE `acudiente`
  MODIFY `Id` int(50) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `estudiante`
--
ALTER TABLE `estudiante`
  MODIFY `Id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `grupo`
--
ALTER TABLE `grupo`
  MODIFY `Id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `logro`
--
ALTER TABLE `logro`
  MODIFY `Id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `pariente`
--
ALTER TABLE `pariente`
  MODIFY `Id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `profesor`
--
ALTER TABLE `profesor`
  MODIFY `Id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `seguimiento`
--
ALTER TABLE `seguimiento`
  MODIFY `Id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
