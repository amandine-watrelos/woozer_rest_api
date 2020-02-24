DROP SCHEMA woozer;
CREATE schema woozer;
USE woozer;

CREATE TABLE `user` (
      id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
      username VARCHAR(25) NOT NULL,
      email VARCHAR(255) NOT NULL
);

CREATE TABLE `groupe` (
      id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
      name VARCHAR(25) NOT NULL
);

CREATE TABLE `group_user` (
      group_id INT NOT NULL,
      user_id INT NOT NULL ,
      PRIMARY KEY (group_id, user_id),
      FOREIGN KEY (group_id) REFERENCES woozer.groupe(id),
      FOREIGN KEY (user_id) REFERENCES woozer.user(id)
);

CREATE TABLE `group_admin` (
      group_id INT NOT NULL,
      user_id INT NOT NULL ,
      PRIMARY KEY (group_id, user_id),
      FOREIGN KEY (group_id) REFERENCES woozer.groupe(id),
      FOREIGN KEY (user_id) REFERENCES woozer.user(id)
);

CREATE TABLE `event` (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(255),
	place VARCHAR(255),
	hour TIME,
	date DATE,
	description VARCHAR(255)
);

CREATE TABLE `group_event` (
	group_id INT NOT NULL,
	event_id INT NOT NULL,
	PRIMARY KEY (group_id,event_id),
	FOREIGN KEY (group_id) REFERENCES woozer.groupe(id),
    FOREIGN KEY (event_id) REFERENCES woozer.event(id)
);

CREATE TABLE `event_user_participate` (
	  event_id INT NOT NULL,
      user_id INT NOT NULL ,
      PRIMARY KEY (event_id, user_id),
      FOREIGN KEY (event_id) REFERENCES woozer.event(id),
      FOREIGN KEY (user_id) REFERENCES woozer.user(id)
);