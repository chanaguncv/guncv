package EnterNamePage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ControlName  implements Initializable{
	
	@FXML
	Button backButton, confirmButton;
	
	public void goToHomePage(ActionEvent event) throws IOException, InterruptedException{
		Main.root = FXMLLoader.load(getClass().getResource("/HomePageFXML/Home_Page.fxml"));
        Main.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Main.scene = new Scene(Main.root);
        Main.stage.setScene(Main.scene);
        Main.stage.setResizable(false);
        Main.stage.setTitle("RICH AND RUN");
        Main.stage.show();
	}

	public void goToGamePage(ActionEvent event) throws IOException, InterruptedException{
		Main.root = FXMLLoader.load(getClass().getResource("/GamePageFXML/GamePage.fxml"));
        Main.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Main.scene = new Scene(Main.root);
        Main.stage.setScene(Main.scene);
        Main.stage.setResizable(false);
        Main.stage.setTitle("RICH AND RUN");
        Main.stage.show();
       }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
