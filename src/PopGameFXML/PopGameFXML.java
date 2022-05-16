package PopGameFXML;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

	public class PopGameFXML implements Initializable{
		
		Button cancelPopButton,confirmPopButton;
		
		public void closeApp(ActionEvent event) throws IOException {
			Main.popUpStage.close();
		}
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
		
}
