package models;

import java.util.Date;

public class Artiste_solo extends Artiste {
    private String nom;
    private String prenom;
    private Date date_de_naissance;
    private Object groupe;

    public Artiste_solo(String nom_de_scene, Date date_de_debut, String nationnalite, String nom, String prenom, Date date_de_naissance) {
        super(nom_de_scene, date_de_debut, nationnalite);
        this.nom = nom;
        this.prenom = prenom;
        this.date_de_naissance = date_de_naissance;
        this.groupe = groupe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_de_naissance() {
        return date_de_naissance;
    }

    public void setDate_de_naissance(Date date_de_naissance) {
        this.date_de_naissance = date_de_naissance;
    }

    public Object getGroupe() {
        return groupe;
    }

    public void setGroupe(Object groupe) {
        this.groupe = groupe;
    }

    @Override
    public String toString() {
        return "Artiste_solo{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", date_de_naissance=" + date_de_naissance +
                ", groupe=" + groupe +
                ", nom_de_scene='" + nom_de_scene + '\'' +
                ", date_de_debut=" + date_de_debut +
                ", nationnalite='" + nationnalite + '\'' +
                '}';
    }
}
