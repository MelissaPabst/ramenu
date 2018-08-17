-- phpMyAdmin SQL Dump
-- version 4.7.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Aug 02, 2018 at 06:24 AM
-- Server version: 5.6.38
-- PHP Version: 7.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


CREATE TABLE IF NOT EXISTS `ingredient` (
  `id` int(11) NOT NULL,
  `type` varchar(30) NOT NULL,
  `name` varchar(30) NOT NULL,
  `description` varchar(30) NOT NULL,
  `price` decimal(19,2) NOT NULL,
  `ingredientId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;



INSERT INTO `ingredient` (`id`, `type`, `name`, `description`, `price`) VALUES


(1, 'broth', 'Pork', 'Made from the best pork meat', 2),
(2, 'broth', 'Chicken', 'Made from the meanest chickens', 2),
(3, 'broth', 'Veggie', 'Made from basic veggies.', 2),

(4, 'noodle', 'Flat', 'Thin, skinny cut.', 3),
(5, 'noodle', 'Fat', 'Wide, thick cut.', 3),
(6, 'noodle', 'Gluten-Free', 'Rice noodles', 3),

(7, 'topping', 'Mushrooms', 'Wood Ear, Local', 2),
(8, 'topping', 'Scallions', 'Green Onions', 1),
(9, 'topping', 'Burnt Ends', 'Pork goodness', 3),
(10, 'topping', 'Bacon', 'Hipster Staple', 1),
(11, 'topping', 'Chicken', 'Roasted', 3),
(12, 'topping', 'Egg', 'Boiled', 1),
(13, 'topping', 'Tofu', 'Fermented Soybeans', 2),
(14, 'topping', 'Bean Sprouts', 'Um.', 1),
(15, 'topping', 'Corn', 'Grows on a cob. Roasted', 1),
(16, 'topping', 'Kimchi', 'Fermented stuff', 1),
(17, 'topping', 'Steamed Vegetables', 'zucchini, onions, broccoli, ca', 2),
(18, 'topping', 'Gyoza', 'Pork Dumplings', 3),
(19, 'topping', 'Roasted Pork', 'Pork not in a dumpling.', 3),
(20, 'topping', 'Spinach', 'Locally-grown', 1),
(21, 'topping', 'Bamboo Shoots', 'Not from around here', 1);

