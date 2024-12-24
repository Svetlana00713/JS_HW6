create table notes (
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
status ENUM('TASK', 'REMINDER', 'INFORMATION') NOT NULL,
title VARCHAR(50) NOT NULL,
description VARCHAR(250) NOT NULL,
local_date_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);