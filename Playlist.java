package models;

import java.util.ArrayList;

public class Playlist {
    private String nom;
    private ArrayList<Object> composant;
    private int nombre_de_like;

    public Playlist(String nom){
        this.nom = nom;
        this.composant = new ArrayList<Object>();
        this.nombre_de_like = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Object> getComposant() {
        return composant;
    }

    public void setComposant(ArrayList<Object> composant) {
        this.composant = composant;
    }

    public int getNombre_de_like() {
        return nombre_de_like;
    }

    public void setNombre_de_like(int nombre_de_like) {
        this.nombre_de_like = nombre_de_like;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "nom='" + nom + '\'' +
                ", composant=" + composant +
                ", nombre_de_like=" + nombre_de_like +
                '}';
    }
}
