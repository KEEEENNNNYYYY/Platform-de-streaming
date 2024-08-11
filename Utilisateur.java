package models;

import java.util.ArrayList;

public class Utilisateur {
    private String nom;
    private ArrayList<Object> liste_de_playlist;
    private ArrayList<Object> playlist_like;
    private int identifiant;
    private static int count = 1;

    public Utilisateur(String nom){
        this.nom = nom;
        this.liste_de_playlist = new ArrayList<>();
        this.playlist_like = new ArrayList<>();
        this.identifiant = count++;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Object> getListe_de_playlist() {
        return liste_de_playlist;
    }

    public void setListe_de_playlist(ArrayList<Object> liste_de_playlist) {
        this.liste_de_playlist = liste_de_playlist;
    }

    public ArrayList<Object> getPlaylist_like() {
        return playlist_like;
    }

    public void setPlaylist_like(ArrayList<Object> playlist_like) {
        this.playlist_like = playlist_like;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    @Override
    public String toString() {
        return "Utilisateur :" +
                "nom='" + nom + '\'' +
                ", liste_de_playlist=" + liste_de_playlist +
                ", playlist_like=" + playlist_like +
                ", identifiant=" + identifiant;
    }
}
