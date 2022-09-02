package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CalculateAreaGUIFXML extends Application
{
  public void start(Stage stage) throws Exception
  {
    stage.setTitle("Calculator");
    FXMLLoader loader = new FXMLLoader();
    loader.setLocation(getClass().getResource("CalculateAreaGUI.fxml"));
    Scene scene = new Scene(loader.load());

    scene.getRoot().setUserData("asd");
    System.out.println(scene.getRoot().getUserData());

    stage.setScene(scene);
    stage.show();
  }
}
