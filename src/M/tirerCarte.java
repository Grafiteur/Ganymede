package M;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class tirerCarte extends Application {


    public static void main(String[] args) {

        Application.launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        Jeu jeu = new Jeu();
        System.out.println("apres");
        jeu.init();

        System.out.println("-------------------------------------------");
        for (VaisseauColon v: jeu.getAffichage()) {
            System.out.println(v.getImg());
        }






    }
}
