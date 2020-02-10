CREATE schema woozer;

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
      FOREIGN KEY (group_id) REFERENCES woozer.group(id),
      FOREIGN KEY (user_id) REFERENCES woozer.user(id)
);

CREATE TABLE `group_admin` (
      group_id INT NOT NULL,
      user_id INT NOT NULL ,
      PRIMARY KEY (group_id, user_id),
      FOREIGN KEY (group_id) REFERENCES woozer.group(id),
      FOREIGN KEY (user_id) REFERENCES woozer.user(id)
);