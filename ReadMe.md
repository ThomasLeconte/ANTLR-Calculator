# Introduction
> Ce projet s'est déroulé dans le cadre d'un CC de l'UE **Théorie des languages et compilation**. Il a pour but de créer son propre language de programmation à partir de l'analyse d'une grammaire syntaxique. Ici, l'objectif était de créer son propre assembleur au travers de la création d'une calculatrice scientifique capable de comprendre des bouts de code traditionnels tels que des blocs "if", "else", "while", "for", etc ... pour les transformer en code compréhensible par la **MVaP** (**M**achine **V**irtuelle **à** **P**ile).

# Equipe
- [Thomas Leconte](https://github.com/ThomasLeconte)
- [Adrien Robert](https://github.com/Herissflamm)

## Fonctionnalités développées
- Calcul de base (addition, soustraction, multiplication, division) avec prise en charge des priorités de calcul.
- Déclaration de variables entières ou flottantes, avec valeur ou sans valeur : `int x;` `float x;` `int x = 2;` `float x = 3.2;`
- Assignation de variable : `int x; x = (3 + 2)*4`
- Gestion des entrées sorties : Ecriture dans la console grâce à **write(expression)** ou lecture d'une saisie utilisateur grâce à **read(x)** (read(x) assignera la valeur saisie à la variable x)
- Conditions simples : `if(condition) instruction;` ou `if(condition){ bloc d'instructions }` ou encore `if(condition){ bloc d'instructions }else{ bloc d'instructions }`
- Traitement des opérations logique : if(`condition && condition`)... ou encore if(`condition || condition`)...
- Traitement des opérations basiques : prise en charge de `< >`, `<= >=`, `==`, `!=`, `i++`, `i--`
- Gestion des boucles : `while(condition) instruction`, `while(condition){ bloc d'instructions }`, `for(i=1;i<x;i++){ bloc d'instructions }` et enfin `repeat(instruction) condition`
- Déclaration et appel de fonctions : `int x(int z){ return z; } int test = x(3);`
- Prise en charge des flottants


## Commandes debug :
- Analyser la grammaire syntaxique et compiler le tout en Java pour faire apparaitre l'arbre d'analyse à la suite d'une saisie d'un programme : 
`antlr4 Calc.g4 && javac -encoding utf8 *.java && grun Calc start -gui > test.mvap`
- Afficher le statut de la pile pour chaque étape du programme :
`java MVaPAssembler test.mvap && java CBaP -d test.mvap.cbap`
## Compiler le projet : 
`antlr4 Calc.g4 && javac -encoding utf8 *.java && grun Calc start -gui > test.mvap`

## Exemple de saisie utilisateur :
```
int i = 0
while ( false || i <= 40) i = i + 2
write(i)
i = 100
while (! i == 100 || false) i = i - 2
write(i)
i = 42
while (false || ! true || true  &&  ! i == 42) i = i - 2
write(i)
```

# Commandes tests : 
tp-compil-autocor Calc.g4 AdresseType.java TableSymboles.java TablesSymboles.java


CALCULATRICE CC
================================

Fichier 		   | Description					   |
-------------------------  | ----------------------------------------------------- |
Calc.g4			   | Le code de la calculatrice 	                   |
test.mvap		   | Un exemple avec appel de fonction                     |
MVaP.g4 		   | Le parser du langage qui produit un analyseur ANTLR4  |
MVaPAssemblerListener.java | Méthode appelée par le parcours de l'arbre d'analyse | qui produit du code binaire (CB) |
MVaPAssembler.java	   | L'assembleur qui produit du code binaire              |
Pile.java		   | Un gestionnaire de pile d'entiers                     |
CBaP.java		   | La machine virtuelle pour le code binaire à pile      |


