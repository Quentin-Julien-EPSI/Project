# Project
Projet de GitHub sur les hooks en Java et sur Java en général.

# But du jeu

Le but du jeu est de finir un donjon qui est constitué de dix étages.

Chaque étage vas contenir des récompenses ou des ennemis ou des pièges.

Le but du joueur est de survivre a ces dix épreuves pour atteindre le sommet du donjon.

Le joueur a le choix de différents personnage.

## Les personnages

Chaque personnage a différentes statistique qui influe sur la manière de jouer au jeu,

Le ***barbare*** qui possède le plus de force et de point de vie du jeu.

Le ***magicien*** qui a le plus de point de magie et d'attaque magique du jeu.

Le ***voleur*** un personnage fragile mais qui a une attaque très élevé.

Et pour finir ***l'archer*** un peu moins fragile que le voleur et qui peut moins bien utiliser la magie.

## Les combats

Les combats sont l'une des différentes épreuves qui vous attendent dans le donjons. Un combat ce finit quand vous ou votre ennemie tombe a 0 point de vie.

En combat vous pouvez faire différentes actions : 

 - Utiliser votre arme (inflige des dégâts physique)
 - Utiliser la magie (inflige des dégâts magique)
 - Utiliser un objet (utilise l'objet choisi)
 - Parer (réduit les dégâts encaissé)

## Les pièges

Qui dit donjon dit piège, et il risque d'avoir des pièges, fasse a un piège vous avez trois choix.

 1. Passer en force (vous passerez le piège mais vous allez prendre des dégâts)
 2. Détruire le piége (utilise la force pour tenter de détruire le piége)
 3. Désamorcer le piège (utilise la magie pour désamorcer le piège)

## Les trésors

Dans un donjon il y a toujours des trésors, et vous pourrez en trouver, avec des potions qui peuvent restaurer votre magie comme votre santé, a vous de les utiliser judicieusement.




## Hooks
Il existe 2 hooks sur ce Github :

1. commit-msg: Ce hook vérifie que le message fasse au minimum 5 caractéres
2. pre-push : Ce hook écrit ``pre-push`` dans la console
