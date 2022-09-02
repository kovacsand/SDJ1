import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import java.io.IOException;

public class App extends Application
{
  private Scene scene, scene2;
  private FlowPane flowPane, flowPane2;
  private MyListener listener;
  private Button button, button2;
  private TextField textField;
  private Stage window;

  public void start(Stage stage)
  {
    window = stage;
    window.setTitle("Window 1");

    listener = new MyListener();

    button = new Button("Switch window");
    button.setOnAction(e -> window.setScene(scene2));

    button2 = new Button("Go back");
    button2.setOnAction(e -> window.setScene(scene));

    flowPane = new FlowPane();
    flowPane.getChildren().add(button);

    scene = new Scene(flowPane, 400, 400);

    textField = new TextField("Hello World");

    flowPane2 = new FlowPane();
    flowPane2.getChildren().add(textField);
    flowPane2.getChildren().add(button2);
    scene2 = new Scene(flowPane2, 400, 400);

    window.setScene(scene);
    window.show();


    class MyListener implements EventHandler<ActionEvent>
    {
      public void handle(ActionEvent e)
      {
//        if (e.getSource() == button)
//        {
//          System.out.println("Clicked");
//          window.setScene(scene2);
//          window.show();
//        }
      }
    }
  }

  private class MyListener implements EventHandler<ActionEvent>
  {
    public void handle(ActionEvent e)
    {
      if (e.getSource() == button)
      {
        System.out.println("Clicked");

      }
    }
  }
}
