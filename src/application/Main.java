package application;

import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	//Esto es la ventana principal

    private static Stage stagePrincipal;
    private AnchorPane rootPane;

    @Override
    public void start(Stage stagePrincipal) throws Exception {
        Main.stagePrincipal = stagePrincipal;
        mostrarVentanaPrincipal();

    }

    /* En un proyecto JavaFX el main llama al launch que a su vez llama a start */
    public static void main(String[] args) {
        launch(args);
    }

    /*
     * cargamos la ventana principal
     */
    public void mostrarVentanaPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../application/Main.fxml"));
            rootPane=(AnchorPane) loader.load();
            Scene scene = new Scene(rootPane);
            stagePrincipal.setTitle("Ventana Principal");
            stagePrincipal.setScene(scene);
            /*
             * A�adidos las llamadas del main al Controlador y del controlador al main ***/
            MainController controller = loader.getController();
            controller.mostrarVentanaPrincipal(this);

            stagePrincipal.show();
        } catch (IOException e) {
            //tratar la excepci�n.
        }
   }


    /* Este m�todo es llamado cuando se presiona el bot�n de la ventana principal
     * Lo llama el controlador de la vista principal
     */
  


    }

