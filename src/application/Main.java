package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{
	public static Stage stage;
	public static Scene scene;
	public static Parent root;
	
	public static Stage popUpStage;
	public static Scene popUpScene;
	public static Parent pop;
	
	@Override
    public void start(Stage primaryStage) throws Exception{		
		try {
			root = FXMLLoader.load(getClass().getResource("/HomePageFXML/Home_Page.fxml")); 
			scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("RICH AND RUN");
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}