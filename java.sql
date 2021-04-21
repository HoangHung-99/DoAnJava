-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: Apr 21, 2021 at 05:49 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `java`
--

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `ID` int(11) NOT NULL,
  `Name` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`ID`, `Name`) VALUES
(1, 'Thức ăn'),
(2, 'Thức uống'),
(3, 'Thức uống không cồn');

-- --------------------------------------------------------

--
-- Table structure for table `desk`
--

CREATE TABLE `desk` (
  `ID` int(11) NOT NULL,
  `Name` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `desk`
--

INSERT INTO `desk` (`ID`, `Name`) VALUES
(1, 'Bàn A1'),
(2, 'Bàn B12');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `ID` int(11) NOT NULL,
  `Username` text NOT NULL,
  `Password` text NOT NULL,
  `Name` text NOT NULL,
  `Level` text NOT NULL,
  `Phone` varchar(10) DEFAULT NULL,
  `Email` varchar(100) DEFAULT NULL,
  `Sex` varchar(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`ID`, `Username`, `Password`, `Name`, `Level`, `Phone`, `Email`, `Sex`) VALUES
(1, 'admin', 'admin', 'Tien', '1', NULL, NULL, NULL),
(2, 'test', 'test', 'Tien Test', '2', NULL, NULL, NULL),
(3, 'test1', 'test1', 'test', '2', NULL, NULL, NULL),
(4, 'admin1', 'admin1', 'Tien ne', '4', NULL, NULL, NULL),
(7, 'anh', 'anh', 'aloalo', '3', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `ID` int(11) NOT NULL,
  `Name` text NOT NULL,
  `Price` double NOT NULL,
  `CategoryID` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `product`
--

INSERT INTO `product` (`ID`, `Name`, `Price`, `CategoryID`, `Quantity`) VALUES
(1, '7up', 10000, 2, 10),
(2, 'Mì xào bò', 20000, 1, 10),
(15, 'Coca Cola', 12000, 2, 10),
(16, 'Redbull', 12000, 2, 14),
(17, 'Bánh mì thập cẩm', 15000, 1, 30),
(20, 'Bánh mì trứng', 15000, 1, 20),
(21, 'String', 10000, 2, 10),
(22, 'Pepsi', 10000, 2, 10),
(23, 'Fanta', 10000, 2, 10),
(24, 'Monster Energy', 30000, 2, 10),
(25, 'Tea plus', 10000, 2, 10),
(26, 'C2', 10000, 2, 10),
(27, 'Aquafina', 5000, 2, 10),
(28, 'Revive', 10000, 2, 10),
(29, 'Cocktail', 50000, 2, 10),
(30, 'Vĩnh Hảo', 5000, 2, 10),
(31, 'Bánh Mì Chả Cá', 15000, 1, 10),
(32, 'Bò kho', 10000, 1, 20),
(33, 'Bò Né', 10000, 1, 20),
(34, 'Bò Bít Tết', 10000, 1, 20),
(35, 'Cơm sườn', 10000, 1, 20),
(36, 'Cơm tấm', 10000, 1, 20),
(37, 'Mì Quảng', 10000, 1, 20),
(38, 'Mì Hoành Thánh', 10000, 1, 20),
(39, 'Gà sốt tiêu đen', 10000, 1, 20),
(40, 'Gà cháy tỏi', 10000, 1, 20);

-- --------------------------------------------------------

--
-- Table structure for table `receipt`
--

CREATE TABLE `receipt` (
  `ID` int(11) NOT NULL,
  `Date` text NOT NULL,
  `Detail` text NOT NULL,
  `Total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `receipt`
--

INSERT INTO `receipt` (`ID`, `Date`, `Detail`, `Total`) VALUES
(6, '01:59 11-04-2021 ', 'Bàn B12_[Mì Hoành Thánh_1_10000.0,Cơm sườn_1_10000.0,Cơm tấm_1_10000.0,Bò Né_1_10000.0,]Bàn B12_[Mì Hoành Thánh_1_10000.0,Cơm sườn_1_10000.0,Cơm tấm_1_10000.0,Bò Né_1_10000.0,]', 80000),
(7, '02:00 11-04-2021 ', 'Bàn B12_[Mì Hoành Thánh_1_10000.0,Cơm tấm_1_10000.0,Mì xào bò_1_20000.0,Bánh mì thập cẩm_1_15000.0,Cocktail_1_50000.0,Aquafina_1_5000.0,C2_1_10000.0,]Bàn B12_[Mì Hoành Thánh_1_10000.0,Cơm tấm_1_10000.0,Mì xào bò_1_20000.0,Bánh mì thập cẩm_1_15000.0,Cocktail_1_50000.0,Aquafina_1_5000.0,C2_1_10000.0,]', 240000),
(8, '02:04 11-04-2021 ', 'Bàn B12_[Gà sốt tiêu đen_1_10000.0,Mì Quảng_1_10000.0,Cơm sườn_1_10000.0,Bánh Mì Chả Cá_1_15000.0,Bò Né_1_10000.0,Bánh mì thập cẩm_1_15000.0,]Bàn B12_[Gà sốt tiêu đen_1_10000.0,Mì Quảng_1_10000.0,Cơm sườn_1_10000.0,Bánh Mì Chả Cá_1_15000.0,Bò Né_1_10000.0,Bánh mì thập cẩm_1_15000.0,]', 140000),
(9, '02:11 11-04-2021 ', 'Bàn A1_[Gà sốt tiêu đen_1_10000.0,Mì Hoành Thánh_1_10000.0,Cơm sườn_1_10000.0,Mì Quảng_1_10000.0,Bánh mì thập cẩm_1_15000.0,Bò Né_1_10000.0,Bánh Mì Chả Cá_1_15000.0,]Bàn A1_[Gà sốt tiêu đen_1_10000.0,Mì Hoành Thánh_1_10000.0,Cơm sườn_1_10000.0,Mì Quảng_1_10000.0,Bánh mì thập cẩm_1_15000.0,Bò Né_1_10000.0,Bánh Mì Chả Cá_1_15000.0,]', 160000),
(10, '02:12 11-04-2021 ', 'Bàn B12_[Mì Hoành Thánh_1_10000.0,Gà sốt tiêu đen_1_10000.0,Mì Quảng_1_10000.0,]Bàn B12_[Mì Hoành Thánh_1_10000.0,Gà sốt tiêu đen_1_10000.0,Mì Quảng_1_10000.0,]', 60000),
(11, '02:16 11-04-2021 ', 'Bàn B12_[Gà sốt tiêu đen_1_10000.0,Mì Quảng_1_10000.0,Mì xào bò_1_20000.0,Bánh mì thập cẩm_1_15000.0,Bánh mì trứng_1_15000.0,Mì Hoành Thánh_1_10000.0,Cơm tấm_1_10000.0,Cơm sườn_1_10000.0,Bánh Mì Chả Cá_1_15000.0,Bò kho_1_10000.0,]Bàn B12_[Gà sốt tiêu đen_1_10000.0,Mì Quảng_1_10000.0,Mì xào bò_1_20000.0,Bánh mì thập cẩm_1_15000.0,Bánh mì trứng_1_15000.0,Mì Hoành Thánh_1_10000.0,Cơm tấm_1_10000.0,Cơm sườn_1_10000.0,Bánh Mì Chả Cá_1_15000.0,Bò kho_1_10000.0,]', 125000),
(12, '02:18 11-04-2021 ', 'Bàn B12_[Cơm tấm_1_10000.0,Bò kho_1_10000.0,Bánh mì thập cẩm_1_15000.0,Mì Quảng_1_10000.0,]Bàn B12_[Cơm tấm_1_10000.0,Bò kho_1_10000.0,Bánh mì thập cẩm_1_15000.0,Mì Quảng_1_10000.0,]', 45000),
(13, '02:19 11-04-2021 ', 'Bàn B12_[Mì Hoành Thánh_1_10000.0,Cơm tấm_1_10000.0,Cơm sườn_1_10000.0,Bánh mì trứng_1_15000.0,]Bàn B12_[Mì Hoành Thánh_1_10000.0,Cơm tấm_1_10000.0,Cơm sườn_1_10000.0,Bánh mì trứng_1_15000.0,]', 45000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `desk`
--
ALTER TABLE `desk`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `CategoryID` (`CategoryID`);

--
-- Indexes for table `receipt`
--
ALTER TABLE `receipt`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `desk`
--
ALTER TABLE `desk`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT for table `receipt`
--
ALTER TABLE `receipt`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `product`
--
ALTER TABLE `product`
  ADD CONSTRAINT `product_ibfk_1` FOREIGN KEY (`CategoryID`) REFERENCES `category` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
