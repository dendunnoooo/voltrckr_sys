-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 22, 2024 at 10:36 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `vltrtrckr`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_event`
--

CREATE TABLE `tbl_event` (
  `e_id` int(50) NOT NULL,
  `e_name` varchar(50) NOT NULL,
  `e_location` varchar(50) NOT NULL,
  `e_sdate` date NOT NULL,
  `e_edate` date NOT NULL,
  `e_status` varchar(50) NOT NULL,
  `e_image` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_event`
--

INSERT INTO `tbl_event` (`e_id`, `e_name`, `e_location`, `e_sdate`, `e_edate`, `e_status`, `e_image`) VALUES
(1, 'Tree Planting 2024', 'Cebu City', '2024-08-24', '2024-08-25', 'Active', '');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `user_id` int(50) NOT NULL,
  `user_firstname` varchar(50) NOT NULL,
  `user_lastname` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `user_email` varchar(50) NOT NULL,
  `user_account` varchar(50) NOT NULL,
  `user_status` varchar(50) NOT NULL,
  `user_image` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`user_id`, `user_firstname`, `user_lastname`, `username`, `password`, `user_email`, `user_account`, `user_status`, `user_image`) VALUES
(1, 'francis', 'doron', 'ked', 'qwe123!@#', 'test1@gmail.com', 'Admin', 'Active', ''),
(2, 'francis', 'doron', 'ked1', 'LINbqJZtkCEg+0UEA3+tNO/6S5Rh6YjkxNoHOtUNroI=', 'ked@gmail.com', 'Admin', 'Active', ''),
(3, 'ked', 'dor', 'kedg', 'LINbqJZtkCEg+0UEA3+tNO/6S5Rh6YjkxNoHOtUNroI=', 'test2@gmail.com', 'User', 'Active', 'src/images/Screenshot_20230301_031641.png');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_vlntr`
--

CREATE TABLE `tbl_vlntr` (
  `v_id` int(50) NOT NULL,
  `user_id` int(50) NOT NULL,
  `e_id` int(50) NOT NULL,
  `v_status` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_vlntr`
--

INSERT INTO `tbl_vlntr` (`v_id`, `user_id`, `e_id`, `v_status`) VALUES
(1, 1, 1, 'Active');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_event`
--
ALTER TABLE `tbl_event`
  ADD PRIMARY KEY (`e_id`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `tbl_vlntr`
--
ALTER TABLE `tbl_vlntr`
  ADD PRIMARY KEY (`v_id`),
  ADD KEY `e_id` (`e_id`),
  ADD KEY `u_id` (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_event`
--
ALTER TABLE `tbl_event`
  MODIFY `e_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `user_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `tbl_vlntr`
--
ALTER TABLE `tbl_vlntr`
  MODIFY `v_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_vlntr`
--
ALTER TABLE `tbl_vlntr`
  ADD CONSTRAINT `tbl_vlntr_ibfk_1` FOREIGN KEY (`e_id`) REFERENCES `tbl_event` (`e_id`),
  ADD CONSTRAINT `tbl_vlntr_ibfk_2` FOREIGN KEY (`user_id`) REFERENCES `tbl_user` (`user_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
