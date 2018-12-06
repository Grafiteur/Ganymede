import java.lang.reflect.InvocationTargetException;

public class Appli {
    public static void main(String[] args) throws InvocationTargetException, InterruptedException {


        javax.swing.SwingUtilities.invokeAndWait(() -> {
            Model model = new Model();
            Vue vue = new Vue(model);
            Control1VaisseauColon controlVaisseauColon = new Control1VaisseauColon(model, vue);
            Control1TuileColon controltuile = new Control1TuileColon(model, vue);
            ControlMars controlMars = new ControlMars(model, vue);
            ControlTerre controlTerre = new ControlTerre(model, vue);
            System.out.println("debut"+controlTerre.vue.getCarteTerreList().size());
        });

    }
}
