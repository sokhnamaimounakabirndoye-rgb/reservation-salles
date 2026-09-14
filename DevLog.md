# DevLog — Reservation Salles

## 1. Ce que j'ai compris de Git et GitHub

Git est un système de gestion de versions qui permet de suivre les modifications
d'un projet et de travailler avec différentes branches.

GitHub est une plateforme distante permettant notamment d'héberger un dépôt Git
et de collaborer sur un projet.

Git fonctionne localement tandis que GitHub permet de publier et partager le
dépôt à distance.

---

## 2. Les branches créées et leur rôle

### main

La branche `main` représente la branche stable du projet. Elle ne contient que
des versions validées.

### develop

La branche `develop` est la branche d'intégration. Les différents incréments
du projet y sont fusionnés.

### feature/00-tooling

Cette branche a été utilisée pour initialiser et configurer les outils du
projet, notamment Git et Maven.

### feature/01-domain

Cette branche a été utilisée pour modéliser le domaine avec les classes
AbstractEntity, Salle et Reservation ainsi que les enums métier.

### feature/02-memory-basics

Cette branche a été utilisée pour ajouter les premières salles en mémoire
et vérifier leur construction.

Les trois branches feature ont ensuite été fusionnées dans `develop` puis
supprimées localement.

---

## 3. Les tags et leur signification

### v0.1.0

Ce tag correspond à l'initialisation de Git et Maven.

### v0.2.0

Ce tag correspond à la fin de la modélisation objet du domaine.

### v0.3.0

Ce tag correspond à l'ajout des premières données en mémoire.



## 4. Ce que Maven apporte au projet

Maven permet de gérer et de construire le projet Java.

Il permet notamment de compiler le projet et de vérifier que le code est
correctement construit.

La commande utilisée pour vérifier la compilation est :

mvn clean compile

Le fichier principal de configuration du projet Maven est `pom.xml`.

---

## 5. Diagramme de classes

Une Salle peut avoir zéro ou plusieurs Reservation.

Une Reservation concerne une seule Salle.

Cardinalité :

Salle 1 -------- 0..* Reservation

---

## 6. Pourquoi AbstractEntity est abstraite ?

`AbstractEntity` est abstraite car elle sert de classe commune aux entités
du domaine.

Elle contient l'identifiant `id` qui est commun aux entités.

Elle n'a pas vocation à être utilisée directement pour créer des objets.

---

## 7. Pourquoi Salle et Reservation sont final ?

Les classes `Salle` et `Reservation` sont déclarées `final` car le modèle
du domaine ne prévoit pas de sous-types de ces classes.

Cela évite un héritage qui ne serait pas justifié par le besoin métier.

---

## 8. Relation entre Salle et Reservation

La relation est une association simple.

Une salle peut avoir plusieurs réservations tandis qu'une réservation
concerne une seule salle.

La cardinalité est :

Salle 1 -------- 0..* Reservation

Dans `Reservation`, la relation est représentée par :

private Salle salle;

---

## 9. Difficulté rencontrée et résolution

Une difficulté rencontrée concernait la gestion des branches Git.

Après l'initialisation du dépôt, les branches `main` et `develop` n'apparaissaient
pas comme prévu car elles avaient été créées avant le premier commit.

Pour résoudre le problème, les branches ont été recréées à partir de l'état
du projet contenant les premiers commits.

Une autre difficulté concernait la validation du merge Git. Git a demandé
un message de commit lors de la fusion. Le message de merge proposé par Git
a été conservé afin de terminer correctement la fusion.

Ces difficultés m'ont permis de mieux comprendre le fonctionnement des
branches, des commits et des merges.