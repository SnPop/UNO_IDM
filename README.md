# UNO_IDM

Autheur : Shervin PEDARAN

***Q1: Ecrire un feature model (FM) tel que:***

* Les règles par défaut du Uno sont une configuration valide du FM
* Fournir quelques configurations représentatives et valides par rapport au FM
* Fournir des configurations invalides
* Fournir des configurations “folles” mais valides du jeu
* Répondre à la question: Combien y a-t-il de variantes du Uno? 

-> Mon feature model (FM) se trouve dans le dossier [mon FM](https://github.com/SnPop/UNO_IDM/tree/main/FM/UNO/UNO) avec les différentes configurations dans le dossier configs [mes configs](https://github.com/SnPop/UNO_IDM/tree/main/FM/UNO/UNO/configs). 

Le UNO classique comporte un grand nombre de variantes, car on peut créer, rajouter, combiner autant de variables, règles donc de configurations que l'on souhaite.
Mon FM comporte `2594` configurations possibles en partant du Uno classique.

***Q2: Inventer un DSL avec une grammaire Xtext qui permet à un utilisateur de spécifier n’importe quelle règle complète du Uno.***

* Le DSL doit être aussi expressif que le FM ci-dessus: un utilisateur doit pouvoir spécifier autant de règles Uno que de configurations dans le FM. 
Conseil: le langage doit être simple et rapide à utiliser 
