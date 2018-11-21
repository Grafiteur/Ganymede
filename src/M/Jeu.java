package M;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Path;
import javafx.stage.Stage;
import java.awt.event.MouseListener;
import java.util.*;

public class Jeu{

    private List<VaisseauColon> vaisseauColonList;
    private List<VaisseauColon> defausse;
    private List<VaisseauColon> main;
    private List<VaisseauColon> affichage;
    private Stage primaryStage = new Stage();
    private GraphicsContext gc;
    private int posx = 50;
    private int posy = 50;
    private Canvas canvas = new Canvas(700, 700);
    private int click = 2;

    private EventHandler<MouseEvent> mouseHandler = event -> {
        if (50 <= event.getX() && 50 <= event.getY() && 150 >= event.getX() && 150 >= event.getY()){
            System.out.println("zinzin");
            click --;
            main.add(vaisseauColonList.get(0));
            System.out.println(click);
            if(click == 0){
                newCanvas();
                System.out.println(main.get(0)+"\n"+main.get(1));
            }

        }
        if (200 <= event.getX() && 50 <= event.getY() && 300 >= event.getX() && 150 >= event.getY()){
            System.out.println("zinzin1");
            click --;
            main.add(vaisseauColonList.get(1));
            if(click == 0){
                newCanvas();
                System.out.println(main.get(0).getImg()+"\n"+main.get(1).getImg());
            }

        }
        if (350 <= event.getX() && 50 <= event.getY() && 450 >= event.getX() && 150 >= event.getY()){
            System.out.println("zinzin2");
            click --;
            main.add(vaisseauColonList.get(2));
            if(click == 0){
                newCanvas();
                System.out.println(main.get(0).getImg()+"\n"+main.get(1).getImg());
            }

        }
        if (500 <= event.getX() && 50 <= event.getY() && 550 >= event.getX() && 150 >= event.getY()){
            System.out.println("zinzin3");
            click --;
            main.add(vaisseauColonList.get(3));

            if(click == 0){
                newCanvas();
                System.out.println(main.get(0).getImg()+"\n"+main.get(1).getImg());

            }

        }
    };



    public Jeu(){
        vaisseauColonList = new ArrayList<VaisseauColon>();
        defausse = new ArrayList<VaisseauColon>();
        main = new ArrayList<VaisseauColon>();
        affichage = new ArrayList<VaisseauColon>();
    }

    public List<VaisseauColon> getVaisseauColonList() {
        return vaisseauColonList;
    }


    public void create_img(String nom_img, ImgVaisseau effet, int col, int row){
        Group root = new Group();
        Scene theScene = new Scene(root);
        theScene.setOnMouseClicked(mouseHandler);
        gc = canvas.getGraphicsContext2D();
        primaryStage.setScene(theScene);
        root.getChildren().add(canvas);
        ImageView vaisseau = new ImageView(new Image(getClass().getResource(nom_img).toString(),100,100,false,false));
        VaisseauColon vaisseau_obj = new VaisseauColon(effet, vaisseau.getImage());
        vaisseauColonList.add(vaisseau_obj);
        //ee
    }

    public void init(){
        int ecart = 150;

        creerPaquet();
        Collections.shuffle(vaisseauColonList);
        for(int i = 0; i<4;i++){
            gc.drawImage(vaisseauColonList.get(i).getImg_vaisseau(),getPosx(),getPosy());
            setPosx(getPosx()+150);
            setPosy(50);
            affichage.add(vaisseauColonList.get(i));
        }
        primaryStage.show();

    }

    public void newCanvas(){
            Stage primaryStage1 = new Stage();
            Group root = new Group();
            Scene theScene = new Scene(root);
            Canvas canvas1 = new Canvas(800,800);
            gc = canvas1.getGraphicsContext2D();
            primaryStage1.setScene(theScene);
            root.getChildren().add(canvas1);
            primaryStage1.show();
    }

    public void creerPaquet(){

        for(int i = 0; i<2 ; i++) {
            create_img("imgcarteVaisseau/1PV_par_symbole_colon_bleu.png", ImgVaisseau.un_pv_bleu_navtte, posx, posy);
            create_img("imgcarteVaisseau/1PV_par_symbole_colon_jaune.png", ImgVaisseau.un_pv_jaune_navtte, posx , posy);
            create_img("imgcarteVaisseau/1PV_par_symbole_colon_rouge.png", ImgVaisseau.un_pv_rouge_navtte, posx, posy);
            create_img("imgcarteVaisseau/1PV_par_symbole_colon_violet.png", ImgVaisseau.un_pv_violet_navtte, posx , posy);
            create_img("imgcarteVaisseau/2PV_par_tuile.png", ImgVaisseau.deux_pv_par_tuile_posseder_fin_partie, posx, posy);
            create_img("imgcarteVaisseau/2PV_type_navette.png", ImgVaisseau.deuxPV_blanc_navette_fin_tour, posx , posy);
            create_img("imgcarteVaisseau/2PV_type_navette_bleu.png", ImgVaisseau.deuxPV_bleu_navette_fin_tour, posx, posy);
            create_img("imgcarteVaisseau/2PV_type_navette_rouge.png", ImgVaisseau.deuxPV_rouge_navette_fin_tour, posx, posy);
            create_img("imgcarteVaisseau/2PV_type_navette_jaune.png", ImgVaisseau.deuxPV_jaune_navette_fin_tour, posx, posy);
            create_img("imgcarteVaisseau/2PV_type_navette_violet.png", ImgVaisseau.deuxPV_violet_navette_fin_tour, posx , posy);
            create_img("imgcarteVaisseau/4PV_1colon_terre.png", ImgVaisseau.quatre_pv_recruter_colon_terre, posx, posy);
            create_img("imgcarteVaisseau/4PV_2transfers.png", ImgVaisseau.quatre_pv_plus_deux_transfers, posx, posy);
            create_img("imgcarteVaisseau/4PV_moins1.png", ImgVaisseau.quatre_pv_moins_un_colon_por_decole, posx, posy);
            create_img("imgcarteVaisseau/4PV_reput_plus_1.png", ImgVaisseau.quatre_pv_plus_un_reput, posx , posy);
            create_img("imgcarteVaisseau/6PV.png", ImgVaisseau.six_pv_si_utiliser_au_moins_une_navette_de_chaque, posx, posy);
            create_img("imgcarteVaisseau/5PV.png", ImgVaisseau.cinqPV, posx , posy);
            create_img("imgcarteVaisseau/PV_egale_reput.png", ImgVaisseau.pv_egale_reput, posx, posy);
        }
    }

    public void print(){
       System.out.println(vaisseauColonList.get(1).getImg()+"\n" + "taille list :"+vaisseauColonList.size());
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }


    public void setVaisseauColonList(List<VaisseauColon> vaisseauColonList) {
        this.vaisseauColonList = vaisseauColonList;
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public GraphicsContext getGc() {
        return gc;
    }

    public void setGc(GraphicsContext gc) {
        this.gc = gc;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void setCanvas(Canvas canvas) {
        this.canvas = canvas;
    }

    public List<VaisseauColon> getDefausse() {
        return defausse;
    }

    public void setDefausse(List<VaisseauColon> defausse) {
        this.defausse = defausse;
    }

    public List<VaisseauColon> getMain() {
        return main;
    }

    public void setMain(List<VaisseauColon> main) {
        this.main = main;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }

    public List<VaisseauColon> getAffichage() {
        return affichage;
    }

    public void setAffichage(List<VaisseauColon> affichage) {
        this.affichage = affichage;
    }


}
