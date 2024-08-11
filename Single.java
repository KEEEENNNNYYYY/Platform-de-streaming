package models;

public class Single extends Chanson{
    private String type_de_chanson;

    public Single(String titre, Object artiste, String genre, int duree, String type_de_chanson){
        this.titre = titre;
        this.artiste = artiste;
        this.genre = genre;
        this.duree = duree;
        this.identifiant = count++;
        this.type_de_chanson = type_de_chanson;
    }

    public String getType_de_chanson() {
        return type_de_chanson;
    }

    public void setType_de_chanson(String type_de_chanson) {
        this.type_de_chanson = type_de_chanson;
    }

    @Override
    public String toString() {
        return "Single{" +
                "type_de_chanson='" + type_de_chanson + '\'' +
                ", titre='" + titre + '\'' +
                ", artiste=" + artiste +
                ", genre='" + genre + '\'' +
                ", identifiant=" + identifiant +
                ", duree=" + duree +
                '}';
    }
}
