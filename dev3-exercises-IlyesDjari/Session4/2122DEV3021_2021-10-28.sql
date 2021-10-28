# ************************************************************
# Sequel Pro SQL dump
# Version 4541
#
# http://www.sequelpro.com/
# https://github.com/sequelpro/sequelpro
#
# Host: dt5.ehb.be (MySQL 5.7.36-0ubuntu0.18.04.1)
# Database: 2122DEV3021
# Generation Time: 2021-10-28 15:25:22 +0000
# ************************************************************


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


# Dump of table cities
# ------------------------------------------------------------

DROP TABLE IF EXISTS `cities`;

CREATE TABLE `cities` (
  `id` int(11) unsigned NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `cities` WRITE;
/*!40000 ALTER TABLE `cities` DISABLE KEYS */;

INSERT INTO `cities` (`id`, `name`)
VALUES
	(1,'Halle'),
	(2,'Elsene'),
	(3,'Brussel-zuid');

/*!40000 ALTER TABLE `cities` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table passanger_ride
# ------------------------------------------------------------

DROP TABLE IF EXISTS `passanger_ride`;

CREATE TABLE `passanger_ride` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `ride_id` int(11) DEFAULT NULL,
  `passanger_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `passanger_ride` WRITE;
/*!40000 ALTER TABLE `passanger_ride` DISABLE KEYS */;

INSERT INTO `passanger_ride` (`id`, `ride_id`, `passanger_id`)
VALUES
	(1,1,1),
	(2,2,1),
	(3,3,2);

/*!40000 ALTER TABLE `passanger_ride` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table passengers
# ------------------------------------------------------------

DROP TABLE IF EXISTS `passengers`;

CREATE TABLE `passengers` (
  `id` int(11) unsigned NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

LOCK TABLES `passengers` WRITE;
/*!40000 ALTER TABLE `passengers` DISABLE KEYS */;

INSERT INTO `passengers` (`id`, `name`)
VALUES
	(1,'Axel'),
	(2,'Ilyes');

/*!40000 ALTER TABLE `passengers` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table rides
# ------------------------------------------------------------

DROP TABLE IF EXISTS `rides`;

CREATE TABLE `rides` (
  `id` int(11) unsigned NOT NULL,
  `departure_time` datetime NOT NULL,
  `train_id` int(11) DEFAULT NULL,
  `departure_city_id` int(11) DEFAULT NULL,
  `destination_city_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `rides` WRITE;
/*!40000 ALTER TABLE `rides` DISABLE KEYS */;

INSERT INTO `rides` (`id`, `departure_time`, `train_id`, `departure_city_id`, `destination_city_id`)
VALUES
	(1,'2021-10-28 14:18:00',1,1,2);

/*!40000 ALTER TABLE `rides` ENABLE KEYS */;
UNLOCK TABLES;


# Dump of table trains
# ------------------------------------------------------------

DROP TABLE IF EXISTS `trains`;

CREATE TABLE `trains` (
  `type` varchar(255) NOT NULL,
  `capacity` int(11) NOT NULL,
  `max_speed` int(11) NOT NULL,
  `max_passengers` int(11) NOT NULL,
  `id` int(11) unsigned NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `trains` WRITE;
/*!40000 ALTER TABLE `trains` DISABLE KEYS */;

INSERT INTO `trains` (`type`, `capacity`, `max_speed`, `max_passengers`, `id`)
VALUES
	('Desiro',300,50,300,1),
	('Dubbeldekker',600,80,600,2);

/*!40000 ALTER TABLE `trains` ENABLE KEYS */;
UNLOCK TABLES;



/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
