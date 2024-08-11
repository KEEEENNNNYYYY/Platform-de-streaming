package models;

import java.util.ArrayList;
import java.util.Date;

public class Album {
    private String nom;
    private int identifiant;
    private static int count = 0;
    private Date date_de_sortie;
    private Object auteur;
    private ArrayList <Object> chanson_membre;

    public Album(String nom, Date date_de_sortie, Object auteur){
        this.nom = nom;
        this.date_de_sortie = date_de_sortie;
        this.auteur = auteur;
        this.identifiant = count++;
        this.chanson_membre = new ArrayList<Object>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public Date getDate_de_sortie() {
        return date_de_sortie;
    }

    public void setDate_de_sortie(Date date_de_sortie) {
        this.date_de_sortie = date_de_sortie;
    }

    public Object getAuteur() {
        return auteur;
    }

    public void setAuteur(Object auteur) {
        this.auteur = auteur;
    }

    public ArrayList<Object> getChanson_membre() {
        return chanson_membre;
    }

    public void setChanson_membre(Single single1) {
        this.chanson_membre = chanson_membre;
    }

}
