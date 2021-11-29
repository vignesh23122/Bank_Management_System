-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 06, 2021 at 12:20 AM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bank`
--

-- --------------------------------------------------------

--
-- Table structure for table `account`
--

CREATE TABLE `account` (
  `Acc` smallint(10) DEFAULT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `DOB` varchar(15) DEFAULT NULL,
  `Pin` smallint(10) DEFAULT NULL,
  `Acc_Type` varchar(10) DEFAULT NULL,
  `Nationality` varchar(50) DEFAULT NULL,
  `Caste` varchar(20) DEFAULT NULL,
  `MICR_No` smallint(6) DEFAULT NULL,
  `Gender` varchar(9) DEFAULT NULL,
  `Mob` bigint(10) DEFAULT NULL,
  `Address` varchar(200) DEFAULT NULL,
  `Sec_Q` varchar(100) DEFAULT NULL,
  `Sec_A` varchar(100) DEFAULT NULL,
  `Balance` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `account`
--

INSERT INTO `account` (`Acc`, `Name`, `DOB`, `Pin`, `Acc_Type`, `Nationality`, `Caste`, `MICR_No`, `Gender`, `Mob`, `Address`, `Sec_Q`, `Sec_A`, `Balance`) VALUES
(3264, 'Srivignesh S', '23-Dec-2001', 234, 'Saving', 'Hindu', 'Kongu Vellalar', 862, 'Male', 9894747665, 'KinathuKadu,Palakadu,Namakkal', 'What is your nick name?', 'Vicky', 50000000),
(2345, 'raj', '23-Dec-2001', 232, 'Saving', 'Hindhu', 'Kongu', 232, 'Male', 9876543212, 'chennai', 'What is your nick name?', 'man', 2000),
(5238, 'sdfsd', '11-Sep-2001', 152, 'Saving', 'Hindu', 'sdf', 16, 'Male', 1234567812, 'dfsafd', 'What is your nick name?', 'asdw', 12345),
(1161, 'vignesh', '23-Dec-2001', 363, 'Saving', 'Hindu', 'Konguv', 393, 'Male', 989474766, 'komarapalayam[TK], kinathukadu, padaiveedu[po],namakkal[dt]..', 'What is your nick name?', 'hello', 70000),
(1833, 'Srivignesh', '11-Oct-2021', 163, 'Current', 'Hindu', 'Kongu Vellalar', 812, 'Male', 9095802109, 'chennai,600032.', 'What is your nick name?', 'vicky', 100000);

-- --------------------------------------------------------

--
-- Table structure for table `balances`
--

CREATE TABLE `balances` (
  `Name` varchar(50) DEFAULT NULL,
  `Acc` smallint(10) DEFAULT NULL,
  `MICR_No` smallint(10) DEFAULT NULL,
  `Balance` int(29) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `balances`
--

INSERT INTO `balances` (`Name`, `Acc`, `MICR_No`, `Balance`) VALUES
('Srivignesh S', 3264, 862, 49984000),
('raj', 2345, 232, 49996900),
('sdfsd', 5238, 16, 22495),
('vignesh', 1161, 393, 69900),
('Srivignesh', 1833, 812, 100000);

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `eid` int(200) NOT NULL,
  `ename` char(200) NOT NULL,
  `eusername` varchar(200) NOT NULL,
  `password` varchar(200) NOT NULL,
  `eage` int(3) NOT NULL,
  `eDOB` date NOT NULL,
  `egender` char(10) NOT NULL,
  `enationality` char(50) NOT NULL,
  `edesignition` char(20) NOT NULL,
  `emobile` int(10) NOT NULL,
  `esalary` int(20) NOT NULL,
  `eYOJ` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`eid`, `ename`, `eusername`, `password`, `eage`, `eDOB`, `egender`, `enationality`, `edesignition`, `emobile`, `esalary`, `eYOJ`) VALUES
(1, 'Ram charan', 'Ram234', '12345', 23, '2001-04-17', 'male', 'Indian', 'Manager', 1234567890, 720000, '2019-09-17'),
(2, 'kumar shankar', 'Kumar234', '12456', 25, '2001-09-26', 'male', 'indian', 'Accountant', 987654321, 50000, '2021-09-08');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `account`
--
ALTER TABLE `account`
  ADD UNIQUE KEY `Pin` (`Pin`),
  ADD UNIQUE KEY `Acc` (`Acc`);

--
-- Indexes for table `balances`
--
ALTER TABLE `balances`
  ADD UNIQUE KEY `Acc` (`Acc`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`eid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employees`
--
ALTER TABLE `employees`
  MODIFY `eid` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
