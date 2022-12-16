# Project
Projet de GitHub sur les hooks en Java et sur Java en général fait par Quentin Launay et Julien Flusin

# But du jeu

Le but du jeu est de remporter un combat singulier contre un monstre défini aléatoirement, vous avez le choix de quel objet de soutien vous posséder ainsi que votre classe.

## Les personnages

Chaque personnage a différentes statistique qui influe sur la manière de jouer au jeu,

Le ***barbare*** qui possède le plus de force et de point de vie du jeu.

Le ***magicien*** qui a le plus de point de magie et d'attaque magique du jeu.

Le ***voleur*** un personnage fragile mais qui a une attaque très élevé.

Et pour finir ***l'archer*** un peu moins fragile que le voleur mais qui peut moins bien utiliser la magie.

## Les combats

Les combats sont l'une des différentes épreuves qui vous attendent dans le donjons. Un combat ce finit quand vous ou votre ennemie tombe a 0 point de vie.

En combat vous pouvez faire différentes actions : 

 - Utiliser votre arme (inflige des dégâts physique)
 - Utiliser la magie (inflige des dégâts magique)
 - Utiliser un objet (utilise l'objet choisi)

## Le jeu

Pour l'instant le jeu se résume à un combat simple, au lancement du jeu vous pourrez indiquer votre nom, choisir une classe et choisir un objet qui vous aidera pendant le combat. Une armure ainsi qu'une arme généré aléatoirement vous sera automatiquement fournie puis vous ferez face a votre adversaire, lui aussi généré aléatoirement.

Des demande de texte seront affiché et vous n'aurez qu'à remplir selon vos actions, vous pourrez ainsi suivre le déroulement du combat sans problème. Un combat est assez court.

Un **projet.jar** est fournie à part, il permet de lancer le jeu sans avoir à exécuté le code, sinon, il suffit de lancer le **main.java** sur un éditeur de code.


## Le code

Chaque classe du projet contient des bouts de code et des méthodes qui sont pour la majorité appelé par **player.java**, la classe **tools.java** contient des méthodes utilitaires faite à la main qui peuvent être appellé dans le cadre de n'importe quel projet.

Il y a aussi deux classe de test la première: **PlayerTest** qui permet de tester les méthodes du player et des monstres ainsi que leur génération aléatoire.
La seconde **ToolsTest** permet de tester nos méthodes qui sont utilisable dans chaque projet Java.


## Hooks
Il existe 2 hooks sur ce projet :

1. commit-msg: Ce hook vérifie que le message fasse au minimum 5 caractéres
2. pre-push : Ce hook écrit ``pre-push`` dans la console
