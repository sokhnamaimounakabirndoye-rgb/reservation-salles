# Modèle du domaine

## Entités

Le domaine est composé de deux entités principales :

- Salle
- Reservation

Les deux entités héritent de la classe abstraite AbstractEntity.

## AbstractEntity

AbstractEntity contient l'identifiant unique des entités :

- id : Long

## Relation Salle - Reservation

Une salle peut avoir zéro ou plusieurs réservations.

Une réservation concerne une seule salle.

Cardinalité :

Salle 1 -------- 0..* Reservation

La classe Reservation possède directement une référence vers Salle :

private Salle salle;

## Classes finales

Salle et Reservation sont déclarées final car le domaine ne prévoit pas de sous-types pour ces deux entités.

## Types métier

TypeSalle et StatutReservation sont représentés sous forme d'enum.