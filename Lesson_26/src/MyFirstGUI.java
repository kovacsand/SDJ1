import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyFirstGUI extends Application
{
  private Scene scene;
  private HBox mainPane;

  private CheckBox okCheckBox, cancelCheckBox;

  private Label textLabel1, textLabel2;
  private TextField textField1, textField2;

  private Button okButton, cancelButton, clearButton;

  private MyListener listener;

  public void start(Stage window)
  {
    window.setTitle("Align");

    listener = new MyListener();

    okCheckBox = new CheckBox("Exit on OK");
    cancelCheckBox = new CheckBox("Exit on Cancel");

    okCheckBox.setPadding(new Insets(3, 0, 3, 0));
    cancelCheckBox.setPadding(new Insets(3, 0, 3, 0));

    VBox leftPane = new VBox(10);
    leftPane.setMinWidth(150);
    leftPane.setMaxWidth(150);
    leftPane.setPadding(new Insets(5, 20, 5, 15));
    leftPane.setAlignment(Pos.CENTER_LEFT);
    leftPane.getChildren().add(okCheckBox);
    leftPane.getChildren().add(cancelCheckBox);

    textLabel1 = new Label("X:");
    textLabel1.setPadding(new Insets(0, 3, 0, 0));
    textField1 = new TextField();
    textField1.setMinWidth(50);
    textField1.setMaxWidth(50);
    textLabel2 = new Label("Y:");
    textLabel2.setPadding(new Insets(0, 3, 0, 0));
    textField2 = new TextField();
    textField2.setMinWidth(50);
    textField2.setMaxWidth(50);

    GridPane middlePane = new GridPane();
    middlePane.setVgap(15);
    middlePane.setMinWidth(75);
    middlePane.setMaxWidth(75);
    middlePane.setPadding(new Insets(10, 5, 10, 5));
    middlePane.setAlignment(Pos.CENTER);
    middlePane.addRow(0, textLabel1, textField1);
    middlePane.addRow(1, textLabel2, textField2);

    okButton = new Button("OK");
    okButton.setMinWidth(80);
    okButton.setMaxWidth(80);
    okButton.setOnAction(listener);
    cancelButton = new Button("Cancel");
    cancelButton.setMinWidth(80);
    cancelButton.setMaxWidth(80);
    cancelButton.setOnAction(listener);
    clearButton = new Button("Clear");
    clearButton.setMinWidth(80);
    clearButton.setMaxWidth(80);
    clearButton.setOnAction(listener);

    VBox rightPane = new VBox(5);
    rightPane.setMinWidth(125);
    rightPane.setMaxWidth(125);

    rightPane.setAlignment(Pos.CENTER);
    rightPane.getChildren().addAll(okButton, cancelButton, clearButton);

    mainPane = new HBox();
    mainPane.getChildren().addAll(leftPane, middlePane, rightPane);

    scene = new Scene (mainPane, 350, 100);
    window.setScene(scene);
    window.setResizable(false);
    window.show();
  }

  private class MyListener implements EventHandler<ActionEvent>
  {
    public void handle(ActionEvent e)
    {
      if (e.getSource() == okButton)
      {
        if (okCheckBox.isSelected())
          System.exit(0);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setContentText("x: " + textField1.getText() + "\ny: " + textField2.getText());
        alert.showAndWait();
      }
      if (e.getSource() == cancelButton)
      {
        if (cancelCheckBox.isSelected())
          System.exit(0);
      }
      if (e.getSource() == clearButton)
      {
        textField1.setText("");
        textField2.setText("");
      }
    }
  }
}
