# UNO_IDM

Autheur : Shervin PEDARAN
M2 ILA

***Q1: Ecrire un feature model (FM) tel que:***

* Les règles par défaut du Uno sont une configuration valide du FM
* Fournir quelques configurations représentatives et valides par rapport au FM
* Fournir des configurations invalides
* Fournir des configurations “folles” mais valides du jeu
* Répondre à la question: Combien y a-t-il de variantes du Uno? 

-> Mon feature model (FM) se trouve dans le dossier [mon FM](https://github.com/SnPop/UNO_IDM/tree/main/FM/UNO/UNO) avec les différentes configurations dans le dossier configs [mes configs](https://github.com/SnPop/UNO_IDM/tree/main/FM/UNO/UNO/configs). 

Le UNO classique comporte un grand nombre de variantes, car on peut créer, rajouter, combiner autant de variables, règles donc de configurations que l'on souhaite.
Mon FM comporte `2594` (change tout le temps sur eclipse) configurations possibles en partant du Uno classique.

***Q2: Inventer un DSL avec une grammaire Xtext qui permet à un utilisateur de spécifier n’importe quelle règle complète du Uno.***

* Le DSL doit être aussi expressif que le FM ci-dessus: un utilisateur doit pouvoir spécifier autant de règles Uno que de configurations dans le FM. 
Conseil: le langage doit être simple et rapide à utiliser 

Se situe dans le dossier [DSL](https://github.com/SnPop/UNO_IDM/tree/main/DSL)


***Q3: Spécifier en JSON plusieurs règles du Uno et spécifier le schema JSON associé***

"$schema": "http://json-schema.org/draft-07/schema#"
Se situe dans le dossier [JSON](https://github.com/SnPop/UNO_IDM/tree/main/JSON)
Quelques variantes : `Uno classique`, `Seven-0`, et `Progressive_Uno`

***Q4: On souhaite écrire un générateur de règles Uno (pour fournir à des joueurs en début de partie, par exemple pour éviter tout conflit). Comment développeriez-vous ce générateur avec le FM de la Q1, le DSL de la Q2, et le JSON de la Q3?***

* Avec le FM => Je peut partir d'un fichier config de mon FM pour créer une nouvelle configuration/variante en choisissant aléatoirement des variables.   
* Avec le DSL => 
* Avec le JSON => Je ferait un parser Java qui lirait le fichier et  

***Q5: On souhaite transformer un programme écrit dans votre DSL (cf Q2) en fichier JSON (et vice-versa). Comment développeriez-vous cette transformation?***

Je ferai un interpréteur qui prendrait le fichier `".uno"` en entrée et pour chaque variantes du dsl son équivalent serait traduit sous le format json.
Et inversement, je ferai un interpreteur json vers le dsl uno.
