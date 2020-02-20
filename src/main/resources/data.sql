INSERT INTO `user` (id, username, email) VALUES
(1, 'awatrelos', 'amandine.watrelos@gmail.com'),
(2, 'mgallardo', 'marie.gallardo@outlook.fr'),
(3, 'pierre59100', 'pierre.legrand@gmail.com'),
(4, 'pierrehenry', 'pierreh@gmail.com'),
(5, 'pierrick', 'pierrick59@gmail.com');


INSERT INTO `group` (id, name) VALUES
(1, 'Amis lycée'),
(2, 'Collègues'),
(3, 'Master 2'),
(4, 'Potes fac');

INSERT INTO `group_user` (group_id, user_id) VALUES
(1, 1),
(1, 2),
(1, 4),
(2, 1),
(3, 1),
(3, 2),
(4, 2);

INSERT INTO `group_admin` (group_id, user_id) VALUES
(1, 1);

INSERT INTO `event` (id,name,place,hour,date,description) VALUES
(1, 'Crémaillière Marie', 'Merris', '20:00:00', '2020-2-14', 'Bienvenue dans mon nouvel appart!'),
(2, 'Laser Game', 'Lille', '18:00:00', '2020-3-23', 'Laser game du turfu');

INSERT INTO `group_event` (group_id, event_id) VALUES 
(4, 1),
(4, 2);