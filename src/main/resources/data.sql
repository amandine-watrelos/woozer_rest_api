INSERT INTO `user` (id, username, email) VALUES
(1, 'awatrelos', 'amandine.watrelos@gmail.com');

INSERT INTO `group` (id, name) VALUES
(1, 'Amis lycée'),
(2, 'Collègues'),
(3, 'Master 2'),
(4, 'Potes fac');

INSERT INTO `group_user` (group_id, user_id) VALUES
(1, 1),
(2, 1),
(3, 1);

INSERT INTO `group_admin` (group_id, user_id) VALUES
(1, 1);