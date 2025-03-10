# Jeu de Devinettes

Un jeu simple en Java où plusieurs joueurs tentent de deviner un nombre aléatoire.

## Description

Ce projet est un jeu de devinettes en ligne de commande où plusieurs joueurs s'affrontent pour deviner un nombre généré aléatoirement entre 1 et 100.

## Fonctionnalités

- Génération aléatoire d'un nombre entre 1 et 100
- Support pour plusieurs joueurs
- Tour par tour
- Indications "plus grand" ou "plus petit" après chaque essai
- Annonce du gagnant

## Structure du Projet

```
jeu-devinettes/
│
├── src/
│   ├── main.java
│   └── models/
│       ├── Joueur.java
│       └── JeuDeDevinettes.java
```

## Comment jouer

1. Lancez le programme
2. Les joueurs jouent à tour de rôle
3. À chaque tour, le joueur doit entrer un nombre
4. Le programme indique si le nombre est trop grand ou trop petit
5. Le jeu continue jusqu'à ce qu'un joueur trouve le bon nombre

## Prérequis

- Java JDK 8 ou supérieur
- Un terminal ou IDE Java

## Compilation et Exécution

Pour compiler :
```bash
javac src/models/*.java src/main.java
```

Pour exécuter :
```bash
java src/main
```

## Auteurs

Build by Marc-Aurel AHOUANDJINOU

## Licence

Ce projet est sous licence libre.
