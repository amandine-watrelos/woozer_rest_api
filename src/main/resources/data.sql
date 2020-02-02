INSERT INTO `user` (id, username, email) VALUES
(1, 'awatrelos', 'amandine.watrelos@gmail.com');

INSERT INTO `group` (id, name) VALUES
(1, 'Amis lycée'),
(2, 'Collègues'),
(3, 'Master 2'),
(4, 'Potes fac');

INSERT INTO `group_user` (id, group_id, user_id, role) VALUES
(1, 1, 1, 'admin'),
(2, 2, 1, 'member'),
(3, 3, 1, 'member');
