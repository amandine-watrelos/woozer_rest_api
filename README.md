### API pour l'application Woozer  

Retrouvez nous sur Facebook à l'adresse suivante : https://www.facebook.com/Woozer-110270700360039/  
N'hésitez pas à nous contacter à l'adresse mail suivante : app.woozer@gmail.com  

#### Installation en local  

Il faut avoir installé :  
- Java  
- Maven  
- Un serveur MySQL (v8 fonctionne)  

Il faut ensuite :  
- Créer un utilisateur dans le serveur MySQl (username = root, mot de passe = root)   
- Lancer le script sql ```schema.sql``` pour créer la structure des tables  
- Une fois le schéma créé, lancer le script sql ``data.sql`` pour créer un premier jeu de données  
- Lancer les commandes suivantes : ``mvn package`` puis ``mvn install``    

#### Lancement de l'API  

Lancer la commande suivante : ``mvn spring-boot:run``  

Vous pouvez maintenant requêter l'API !  
