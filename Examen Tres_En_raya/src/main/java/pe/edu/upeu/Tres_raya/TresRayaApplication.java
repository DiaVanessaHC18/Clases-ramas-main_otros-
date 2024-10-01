package pe.edu.upeu.Tres_raya;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.aspectj.apache.bcel.Repository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pe.edu.upeu.Tres_raya.TERcontroller.juego_Controller;
import pe.edu.upeu.Tres_raya.repositorio.Tres_en_rayaRepository;

@SpringBootApplication
@ComponentScan(basePackages = "pe.edu.upeu.Tres_raya")
public class TresRayaApplication extends Application {
	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/FXtresRaya.fxml"));
		juego_Controller controller = fxmlLoader.getController();
		
		Scene scene = new Scene(fxmlLoader.load(), 900, 450);
		stage.setTitle("Juego Tres en Raya");
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
