package M;

public class Joueur {
    private int id;
    private String name;
    private int pointDeVictoires;

    public Joueur(int id, String name) {
        this.id = id;
        this.name = name;
        pointDeVictoires = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPointDeVictoires() {
        return pointDeVictoires;
    }

    public void setPointDeVictoires(int pointDeVictoires) {
        this.pointDeVictoires = pointDeVictoires;
    }
}