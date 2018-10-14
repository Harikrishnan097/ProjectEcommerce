-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 14, 2018 at 12:26 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fullstack`
--

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `p_id` int(11) NOT NULL,
  `company_name` varchar(255) DEFAULT NULL,
  `coupon_id` varchar(255) DEFAULT NULL,
  `p_dateofmanufacturing` date DEFAULT NULL,
  `p_image_name` varchar(255) DEFAULT NULL,
  `p_merchant_id` varchar(255) DEFAULT NULL,
  `p_name` varchar(255) DEFAULT NULL,
  `p_specification` varchar(255) DEFAULT NULL,
  `p_type` varchar(255) DEFAULT NULL,
  `price` double NOT NULL,
  `quantity` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`p_id`, `company_name`, `coupon_id`, `p_dateofmanufacturing`, `p_image_name`, `p_merchant_id`, `p_name`, `p_specification`, `p_type`, `price`, `quantity`) VALUES
(1001, 'Asus Mobile', 'TDF345', '2018-10-09', 'asus-zenfone-5', '123ERT', 'ASUS Z5', '4GB RAM', 'electronics', 8000, '1'),
(1002, 'MI ', 'ERT456', '2018-10-10', 'mi-redmi-5', 'TRPI456', 'MI REDMI 5', '16GB ROM', 'electronics', 9000, '1'),
(1003, 'MOTO', 'APE123', '2018-10-01', 'moto-x4', '123JFO', 'MOTO X4', '12MP + 8MP | 16MP Front Camera', 'electronics', 13000, '1'),
(1004, 'POLO T-SHIRT', 'DFR345', '2018-10-09', 'mens-fit-r-shirt', '123erty', 'MENS T SHIRT', 'FLEXIBLE', 'mens', 299, '1'),
(1005, 'OTTO T-SHIRT', 'ASD666', '2018-10-09', 'mens-fit-t-shirt', '33rtyu', 'TSHIRT', 'FLEXBLE', 'mens', 500, '1'),
(1006, 'HELICOPTER TOY', 'WER#444', '2018-10-12', 'helicopter-remote', 'tyy666', 'HELICOPTER TOY', 'GOOD SAFE', 'toys', 600, '1'),
(1007, 'TABLE-MATE', 'FGRT444', '2018-10-16', 'table-mate-f', 'SDF456', 'TABLE MATE', 'FLEXIBLE', 'furniture', 5000, '1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`p_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
