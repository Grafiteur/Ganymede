package M;

import java.util.ArrayList;

public class Navette {
    private Couleur type;
    private Effet effet;
    private java.util.ArrayList<Object> coût;
    private boolean terrien;

    public Navette(Couleur type, Effet effet, ArrayList<Object> coût, boolean terrien) {
        this.type = type;
        this.effet = effet;
        this.coût = coût;
        this.terrien = terrien;
    }

    public Couleur getType() {
        return type;
    }

    public void setType(Couleur type) {
        this.type = type;
    }

    public Effet getEffets() {
        return effet;
    }

    public void setEffets(Effet effet) {
        this.effet = effet;
    }

    public ArrayList<Object> getCoût() {
        return coût;
    }

    public void setCoût(ArrayList<Object> coût) {
        this.coût = coût;
    }

    public boolean isTerrien() {
        return terrien;
    }

    public void setTerrien(boolean terrien) {
        this.terrien = terrien;
    }
}
