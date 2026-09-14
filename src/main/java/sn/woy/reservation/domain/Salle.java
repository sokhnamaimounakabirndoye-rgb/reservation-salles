package sn.woy.reservation.domain;

public final class Salle extends AbstractEntity {

    private String nom;
    private String batiment;
    private int capacite;
    private boolean active;
    private TypeSalle type;

    public Salle(Long id, String nom, String batiment, int capacite, boolean active, TypeSalle type) {
        super(id);
        this.nom = nom;
        this.batiment = batiment;
        this.capacite = capacite;
        this.active = active;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getBatiment() {
        return batiment;
    }

    public void setBatiment(String batiment) {
        this.batiment = batiment;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public TypeSalle getType() {
        return type;
    }

    public void setType(TypeSalle type) {
        this.type = type;
    }
}
