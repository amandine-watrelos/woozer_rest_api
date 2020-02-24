CREATE schema bscts78dfuswnzqa1gko;

CREATE TABLE `user` (
      id INT PRIMARY KEY NOT NULL,
      username VARCHAR(25) NOT NULL,
      email VARCHAR(255) NOT NULL
);

CREATE TABLE `group` (
      id INT PRIMARY KEY NOT NULL,
      name VARCHAR(25) NOT NULL
);

CREATE TABLE `group_user` (
      group_id INT NOT NULL,
      user_id INT NOT NULL ,
      PRIMARY KEY (group_id, user_id),
      FOREIGN KEY (group_id) REFERENCES bscts78dfuswnzqa1gko.group(id),
      FOREIGN KEY (user_id) REFERENCES bscts78dfuswnzqa1gko.user(id)
);

CREATE TABLE `group_admin` (
      group_id INT NOT NULL,
      user_id INT NOT NULL ,
      PRIMARY KEY (group_id, user_id),
      FOREIGN KEY (group_id) REFERENCES bscts78dfuswnzqa1gko.group(id),
      FOREIGN KEY (user_id) REFERENCES bscts78dfuswnzqa1gko.user(id)
);

CREATE TABLE `event` (
	id INT PRIMARY KEY NOT NULL,
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
	FOREIGN KEY (group_id) REFERENCES bscts78dfuswnzqa1gko.group(id),
    FOREIGN KEY (event_id) REFERENCES bscts78dfuswnzqa1gko.event(id)
);

CREATE TABLE `event_user_participate` (
	  event_id INT NOT NULL,
      user_id INT NOT NULL ,
      PRIMARY KEY (event_id, user_id),
      FOREIGN KEY (event_id) REFERENCES bscts78dfuswnzqa1gko.event(id),
      FOREIGN KEY (user_id) REFERENCES bscts78dfuswnzqa1gko.user(id)
);