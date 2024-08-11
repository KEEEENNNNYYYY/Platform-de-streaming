package models;

public abstract class Chanson {
    protected String titre;
    protected Object artiste;
    protected String genre;
    protected int identifiant;
    protected int duree;
    protected static int count = 0;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Object getArtiste() {
        return artiste;
    }

    public void setArtiste(Object artiste) {
        this.artiste = artiste;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Chanson{" +
                "titre='" + titre + '\'' +
                ", artiste=" + artiste +
                ", genre='" + genre + '\'' +
                ", identifiant=" + identifiant +
                ", duree=" + duree +
                ", count=" + count +
                '}';
    }
}
