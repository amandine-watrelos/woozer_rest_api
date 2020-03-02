INSERT INTO `user` (id, username, email) VALUES
(1, 'awatrelos', 'amandine.watrelos@gmail.com'),
(2, 'mgallardo', 'marie.gallardo@outlook.fr'),
(3, 'pierre59100', 'pierre.legrand@gmail.com'),
(4, 'pierrehenry', 'pierreh@gmail.com'),
(5, 'pierrick', 'pierrick59@gmail.com');


INSERT INTO `groupe` (id, name) VALUES
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
(4, 1),
(4, 2);

INSERT INTO `group_admin` (group_id, user_id) VALUES
(1, 1);

INSERT INTO `event` (id, name, place, hour, date, description) VALUES
(1, 'Crémaillière Marie', 'Merris', '20:00:00', '2020-2-14', 'Bienvenue dans mon nouvel appart!'),
(2, 'Laser Game', 'Lille', '18:00:00', '2020-3-23', 'Laser game du turfu');

INSERT INTO `group_event` (group_id, event_id) VALUES 
(4, 1),
(4, 2);

INSERT INTO `discussion` (id, group_id) VALUES
(1, 1),
(2, 3),
(3, 2),
(4, 4);

INSERT INTO `message` (id, discussion_id, user_id, date, message) VALUES
(1, 1, 1, '2020-02-14', 'Coucou les copains du lycée! J\'ai crée ce groupe pour qu\'on s\'organise plus facilement dans nos sorties :)'),
(2, 1, 2, '2020-02-28', 'Hey ! Cool merci Amandine. D\'ailleurs ça fait un bail qu\'on s\'est pas vus donc je pensais aller boire un verre prochainement! Je crée un événement, mettez vos dispos dessus si vous êtes chauds ;)'),
(3, 2, 2, '2020-02-27', 'Hello les potes ! Bientôt fini ce master, on fête ça après les exams? :)'),
(4, 1, 1, '2020-03-01', 'Yes bonne idée ^^');

INSERT INTO `debt` (id, payed_by_id, payed_for_id, amount, comment, done) VALUES
(1, 2, 1, 15.0, 'ciné + macdo', 0),
(2, 2, 4, 7.5, 'mojito velvet', 1),
(3, 4, 1, 5.0, 'courses raclette', 1),
(4, 1, 4, 25.0, 'accrobranche', 0);