# Commandes : 
antlr4 Calc.g4 && javac -encoding utf8 *.java && grun Calc start -gui > test.mvap

java MVaPAssembler test.mvap && java CBaP -d test.mvap.cbap


CALCULATRICE CC
================================

Fichier 		   | Description					   |
-------------------------  | ----------------------------------------------------- |
Calc.g4			   | Le code de la calculatrice 	                   |
test.mvap		   | Un exemple avec appel de fonction                     |
MVaP.g4 		   | Le parser du langage qui produit un analyseur ANTLR4  |
MVaPAssemblerListener.java | Méthode appelée par le parcours de l'arbre d'analyse \
                                                  qui produit du code binaire (CB) |
MVaPAssembler.java	   | L'assembleur qui produit du code binaire              |
Pile.java		   | Un gestionnaire de pile d'entiers                     |
CBaP.java		   | La machine virtuelle pour le code binaire à pile      |
-------------------------- | ----------------------------------------------------- |

Contenu
-------
On a fait à peu près tout ce qui y avait à faire sauf pour la partie fonction où on n'a pas réussi à faire un return acceptable. On a aussi un bug avec la negation "!" qui fonctionne mal quand il y a trop de condition à la suite.


