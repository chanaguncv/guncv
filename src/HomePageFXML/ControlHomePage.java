package HomePageFXML;

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

public class ControlHomePage implements Initializable{
	
	//Home_Page
	@FXML
	Button choose2P, choose3P, choose4P;
	
	@FXML
	Button readRuleButton, optionButton;
	
	@FXML
	Button exitOptionButton;
	
	@FXML
	ImageView logoutButton;

	public void goToEnterNamePage2P(ActionEvent event) throws IOException, InterruptedException{
		Main.root = FXMLLoader.load(getClass().getResource("/EnterNamePage/EnterName2P.fxml"));
        Main.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Main.scene = new Scene(Main.root);
        Main.stage.setScene(Main.scene);
        Main.stage.setResizable(false);
        Main.stage.setTitle("RICH AND RUN");
        Main.stage.show();
       }

	public void goToEnterNamePage3P(ActionEvent event) throws IOException, InterruptedException{
		Main.root = FXMLLoader.load(getClass().getResource("/EnterNamePage/EnterName3P.fxml"));
        Main.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Main.scene = new Scene(Main.root);
        Main.stage.setScene(Main.scene);
        Main.stage.setResizable(false);
        Main.stage.setTitle("RICH AND RUN");
        Main.stage.show();
       }
	
	public void goToEnterNamePage4P(ActionEvent event) throws IOException, InterruptedException{
		Main.root = FXMLLoader.load(getClass().getResource("/EnterNamePage/EnterName4P.fxml"));
        Main.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Main.scene = new Scene(Main.root);
        Main.stage.setScene(Main.scene);
        Main.stage.setResizable(false);
        Main.stage.setTitle("RICH AND RUN");
        Main.stage.show();
       }
	
	public void goToPopUpReadRule(ActionEvent event) throws IOException {
		Main.popUpStage = new Stage();
		Main.pop = FXMLLoader.load(getClass().getResource("/HomePageFXML/realRulePopUp.fxml"));
		Main.popUpStage.setScene(new Scene(Main.pop));
		Main.popUpStage.initModality(Modality.APPLICATION_MODAL);
		Main.popUpStage.initOwner(Main.stage);
		Main.popUpStage.setResizable(false);
		Main.popUpStage.setTitle("READRULE");
		Main.popUpStage.showAndWait();
	}
	
	public void goToPopUpOption(MouseEvent event) throws IOException {
		Main.popUpStage = new Stage();
		Main.pop = FXMLLoader.load(getClass().getResource("/HomePageFXML/option.fxml"));
		Main.popUpStage.setScene(new Scene(Main.pop));
		Main.popUpStage.initModality(Modality.APPLICATION_MODAL);
		Main.popUpStage.initOwner(Main.stage);
		Main.popUpStage.setResizable(false);
		Main.popUpStage.setTitle("OPTION");
		Main.popUpStage.showAndWait();
	}
	
	
	public void closeApp(MouseEvent event) throws IOException, InterruptedException{
		Main.root = FXMLLoader.load(getClass().getResource("Home_Page.fxml"));
		Main.stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Main.stage.close();
       }
	
	public void closePopUpOption(ActionEvent event) throws IOException {
		Main.popUpStage = (Stage) exitOptionButton.getScene().getWindow();
		Main.popUpStage.close();
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
