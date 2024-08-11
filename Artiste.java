package models;

import java.util.Date;

public abstract class Artiste {
    protected String nom_de_scene;
    protected Date date_de_debut;
    protected String nationnalite;

    protected Artiste(String nom_de_scene, Date date_de_debut, String nationnalite) {
        this.nom_de_scene = nom_de_scene;
        this.date_de_debut = date_de_debut;
        this.nationnalite = nationnalite;
    }

    public String getNom_de_scene() {
        return nom_de_scene;
    }

    public void setNom_de_scene(String nom_de_scene) {
        this.nom_de_scene = nom_de_scene;
    }

    public Date getDate_de_debut() {
        return date_de_debut;
    }

    public void setDate_de_debut(Date date_de_debut) {
        this.date_de_debut = date_de_debut;
    }

    public String getNationnalite() {
        return nationnalite;
    }

    public void setNationnalite(String nationnalite) {
        this.nationnalite = nationnalite;
    }

    @Override
    public String toString() {
        return "Artiste{" +
                "nom_de_scene='" + nom_de_scene + '\'' +
                ", date_de_debut=" + date_de_debut +
                ", nationnalite='" + nationnalite + '\'' +
                '}';
    }
}
