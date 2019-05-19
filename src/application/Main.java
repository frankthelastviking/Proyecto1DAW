package application;

import java.io.IOException;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
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
            stagePrincipal.getIcons().add(new Image("/imagesUI/logo-colegio-valle-del-miro.png")); 
            stagePrincipal.setTitle("APLICACION DE GESTION DE DATOS DE PRACTICAS PROYECTO DAW1 FJ-V"); 
            stagePrincipal.setScene(scene);
            /*
             * Añadidos las llamadas del main al Controlador y del controlador al main ***/
            MainController controller = loader.getController();
            controller.mostrarVentanaPrincipal(this);

            stagePrincipal.show();
        } catch (IOException e) {
            //tratar la excepción.
        }
   }


    /* Este método es llamado cuando se presiona el botón de la ventana principal
     * Lo llama el controlador de la vista principal
     */
    
    public void mostrarVentanaAlumnos() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../application/Alumnos.fxml"));
            AnchorPane ventanaDos = (AnchorPane) loader.load();
            /* Creamos la segunda ventana como otro stage */
            Stage ventana = new Stage();
            ventana.setTitle("ALUMNOS - APLICACION DE GESTION DE DATOS DE PRACTICAS PROYECTO DAW1 FJ-V");
            stagePrincipal.getIcons().add(new Image("/imagesUI/logo-colegio-valle-del-miro.png")); 
            /* Le decimos a la ventana quién es la ventana original */
            ventana.initOwner(stagePrincipal);
            Scene scene = new Scene(ventanaDos);
            ventana.setScene(scene);

            AlumnosController controller2 = loader.getController();
            controller2.setStagePrincipal(ventana);

            ventana.show();

        } catch (Exception e) {
            //tratar la excepción
        }
    }
    
    public void mostrarVentanaEmpresas() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../application/Empresas.fxml"));
            AnchorPane ventanaDos = (AnchorPane) loader.load();
            /* Creamos la segunda ventana como otro stage */
            Stage ventana = new Stage();
            ventana.setTitle("EMPRESAS - APLICACION DE GESTION DE DATOS DE PRACTICAS PROYECTO DAW1 FJ-V");
            stagePrincipal.getIcons().add(new Image("/imagesUI/logo-colegio-valle-del-miro.png")); 
            /* Le decimos a la ventana quién es la ventana original */
            ventana.initOwner(stagePrincipal);
            Scene scene = new Scene(ventanaDos);
            ventana.setScene(scene);

            EmpresaController controller2 = loader.getController();
            controller2.setStagePrincipal(ventana);

            ventana.show();

        } catch (Exception e) {
            //tratar la excepción 
        }
    }
    
    public void mostrarVentanaCursosYCiclos() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../application/Cursos y ciclos.fxml"));
            AnchorPane ventanaDos = (AnchorPane) loader.load();
            /* Creamos la segunda ventana como otro stage */
            Stage ventana = new Stage();
            ventana.setTitle("CICLOS Y CURSOS - APLICACION DE GESTION DE DATOS DE PRACTICAS PROYECTO DAW1 FJ-V");
            stagePrincipal.getIcons().add(new Image("/imagesUI/logo-colegio-valle-del-miro.png")); 
            /* Le decimos a la ventana quién es la ventana original */
            ventana.initOwner(stagePrincipal);
            Scene scene = new Scene(ventanaDos);
            ventana.setScene(scene);

            CursosYCiclosController controller2 = loader.getController();
            controller2.setStageCursosYCiclos(ventana);

            ventana.show();

        } catch (Exception e) {
            //tratar la excepción 
        }
    }
    
    public void mostrarVentanaTutores() {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("../application/Tutores.fxml"));
            AnchorPane ventanaDos = (AnchorPane) loader.load();
            /* Creamos la segunda ventana como otro stage */
            Stage ventana = new Stage();
            ventana.setTitle("TUTORES - APLICACION DE GESTION DE DATOS DE PRACTICAS PROYECTO DAW1 FJ-V");
            stagePrincipal.getIcons().add(new Image("/imagesUI/logo-colegio-valle-del-miro.png")); 
            /* Le decimos a la ventana quién es la ventana original */
            ventana.initOwner(stagePrincipal);
            Scene scene = new Scene(ventanaDos);
            ventana.setScene(scene);

            TutoresController controller2 = loader.getController();
            controller2.setStageTutores(ventana);

            ventana.show();

        } catch (Exception e) {
            //tratar la excepción 
        }
    }
    
   
  
}

    

