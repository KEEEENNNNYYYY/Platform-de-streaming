package models;

import java.util.ArrayList;
import java.util.Date;

public class Artiste_groupe extends Artiste{
    private ArrayList <Object> artistes_membres;
    public Artiste_groupe(String nom_de_scene, Date date_de_debut, String nationnalite) {
        super(nom_de_scene, date_de_debut, nationnalite);
        this.artistes_membres = new ArrayList<Object>();
    }

    public ArrayList<Object> getArtistes_membres() {
        return artistes_membres;
    }

    public void setArtistes_membres(ArrayList<Object> artistes_membres) {
        this.artistes_membres = artistes_membres;
    }

    @Override
    public String toString() {
        return "Artiste_groupe{" +
                "artistes_membres=" + artistes_membres +
                ", nom_de_scene='" + nom_de_scene + '\'' +
                ", date_de_debut=" + date_de_debut +
                ", nationnalite='" + nationnalite + '\'' +
                '}';
    }
}
