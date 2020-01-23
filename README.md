### Connexion à la base de données PostgreSQL gérée sur Heroku 

- Avoir installé Heroku et PostgreSQL (ils doivent être dans le path)
- ``heroku pg:psql -a=woozer-api``
- La connexion à la bdd est normalement établie, pour se mettre sur le bon schéma : ``set search_path to woozer;``