package sn.woy.reservation;

import java.util.ArrayList;
import java.util.List;

import sn.woy.reservation.domain.Salle;
import sn.woy.reservation.domain.TypeSalle;

public class Demo {

    public static void main(String[] args) {

        List<Salle> salles = new ArrayList<>();

        salles.add(new Salle(1L, "Salle A", "Batiment A", 30, true, TypeSalle.COURS));
        salles.add(new Salle(2L, "Salle B", "Batiment A", 50, true, TypeSalle.SOUTENANCES));
        salles.add(new Salle(3L, "Salle C", "Batiment B", 40, true, TypeSalle.REUNIONS));
        salles.add(new Salle(4L, "Salle D", "Batiment B", 25, false, TypeSalle.TP));
        salles.add(new Salle(5L, "Salle E", "Batiment C", 35, true, TypeSalle.EVENEMENTS));

        for (Salle salle : salles) {
            System.out.println("ID : " + salle.getId());
            System.out.println("Nom : " + salle.getNom());
            System.out.println("Batiment : " + salle.getBatiment());
            System.out.println("Capacite : " + salle.getCapacite());
            System.out.println("Active : " + salle.isActive());
            System.out.println("Type : " + salle.getType());
            System.out.println("-------------------------");
        }
    }
}