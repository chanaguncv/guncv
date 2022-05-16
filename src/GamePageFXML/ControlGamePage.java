package GamePageFXML;

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

	public class ControlGamePage implements Initializable{
		
		Button teacherButton, psychiatristButton, dentistButton, pharmacistButton;
		
		public void popTeacher(ActionEvent event) throws IOException {
			Main.popUpStage = new Stage();
			Main.pop = FXMLLoader.load(getClass().getResource("/PopGameFXML/Teacher.fxml"));
			Main.popUpStage.setScene(new Scene(Main.pop));
			Main.popUpStage.initModality(Modality.APPLICATION_MODAL);
			Main.popUpStage.initOwner(Main.stage);
			Main.popUpStage.setResizable(false);
			Main.popUpStage.setTitle("RICH AND RUN");
			Main.popUpStage.showAndWait();
		}
		
		public void popPsychiatrist(ActionEvent event) throws IOException {
			Main.popUpStage = new Stage();
			Main.pop = FXMLLoader.load(getClass().getResource("/PopGameFXML/Psychiatrist.fxml"));
			Main.popUpStage.setScene(new Scene(Main.pop));
			Main.popUpStage.initModality(Modality.APPLICATION_MODAL);
			Main.popUpStage.initOwner(Main.stage);
			Main.popUpStage.setResizable(false);
			Main.popUpStage.setTitle("Psychiatrist Zone");
			Main.popUpStage.showAndWait();
		}
		
		public void popDentist(ActionEvent event) throws IOException {
			Main.popUpStage = new Stage();
			Main.pop = FXMLLoader.load(getClass().getResource("/PopGameFXML/Dentist.fxml"));
			Main.popUpStage.setScene(new Scene(Main.pop));
			Main.popUpStage.initModality(Modality.APPLICATION_MODAL);
			Main.popUpStage.initOwner(Main.stage);
			Main.popUpStage.setResizable(false);
			Main.popUpStage.setTitle("Teacher Zone");
			Main.popUpStage.showAndWait();
		}
		
		public void popPharmacist(ActionEvent event) throws IOException {
			Main.popUpStage = new Stage();
			Main.pop = FXMLLoader.load(getClass().getResource("/PopGameFXML/Pharmacist.fxml"));
			Main.popUpStage.setScene(new Scene(Main.pop));
			Main.popUpStage.initModality(Modality.APPLICATION_MODAL);
			Main.popUpStage.initOwner(Main.stage);
			Main.popUpStage.setResizable(false);
			Main.popUpStage.setTitle("Teacher Zone");
			Main.popUpStage.showAndWait();
		}
		
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			
		}
		
}
