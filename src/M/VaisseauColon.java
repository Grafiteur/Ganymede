package M;

import javafx.scene.effect.ImageInput;

import java.awt.*;
import java.awt.image.BufferedImage;

public class VaisseauColon {
    private ImgVaisseau img;
    private javafx.scene.image.Image img_vaisseau;

    public VaisseauColon(){

    }

    public VaisseauColon(ImgVaisseau img, javafx.scene.image.Image img_vaisseau){
        this.img = img;
        this.img_vaisseau = img_vaisseau;

    }

    public ImgVaisseau getImg() {
        return img;
    }

    public void setImg(ImgVaisseau img) {
        this.img = img;
    }

    public javafx.scene.image.Image getImg_vaisseau() {
        return img_vaisseau;
    }

    public void setImg_vaisseau(javafx.scene.image.Image img_vaisseau) {
        this.img_vaisseau = img_vaisseau;
    }
}
