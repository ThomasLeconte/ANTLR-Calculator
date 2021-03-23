# Commandes debug : 
antlr4 Calc.g4 && javac -encoding utf8 *.java && grun Calc start -gui > test.mvap

java MVaPAssembler test.mvap && java CBaP -d test.mvap.cbap

# Commandes tests : 
tp-compil-autocor Calc.g4 AdresseType.java TableSymboles.java TablesSymboles.java


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
Nous avons fait l'ensemble des parties du TP, à l'exception des parties optionnelles. Cependant, il y
a un problème avec la condition "! condition", qui fonctionne mal quand il y a trop de conditions à la suite.
Aussi, nous n'avons pas réussi à intégrer la notion de fonction, car l'instruction return pose quelques
problèmes. La détection de fonction et l'appel de celle-ci se fait cependant sans problème.


