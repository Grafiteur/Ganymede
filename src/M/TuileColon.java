package M;

public class TuileColon {
    private Couleur type;
    private Effet[] effets;

    public TuileColon(Couleur type, Effet[] effets) {
        this.type = type;
        this.effets = effets;
    }

    public Couleur getType() {
        return type;
    }

    public void setType(Couleur type) {
        this.type = type;
    }

    public Effet[] getEffets() {
        return effets;
    }

    public void setEffets(Effet[] effets) {
        this.effets = effets;
    }
}
