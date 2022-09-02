package view;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class CalculateController
{
  @FXML private ComboBox<String> shapesBox;
  @FXML private TextField field;
  @FXML private Label sideLabel;
  @FXML private Button button;
  @FXML private Label areaLabel;
  @FXML private Label outlineLabel;

  @FXML private TabPane tabPane;
  @FXML private Tab firstTab;
  @FXML private Tab secondTab;
  @FXML private TextField firstTextField;
  @FXML private TextField secondTextField;

  private MyTabListener myTabListener;

  public void initialize()
  {
    shapesBox.getItems().addAll("Circle", "Equilateral triangle", "Square");
    shapesBox.getSelectionModel().selectFirst();
    secondTextField.setText("asdfasdf");
  }

  private void calculate()
  {

    firstTextField.setText("Hellooo");

    myTabListener = new MyTabListener();

    tabPane.getSelectionModel().selectedItemProperty().addListener(myTabListener);

    double area = 0, outline = 0;
    String shape = shapesBox.getSelectionModel().getSelectedItem();
    if (shape.equals("Circle"))
    {
      outlineLabel.setText("Circumference: ");
      sideLabel.setText("Radius: ");
      double radius = Double.parseDouble(field.getText());
      area = radius * radius * Math.PI;
      outline = 2 * radius * Math.PI;
    }
    if (shape.equals("Equilateral triangle"))
    {
      outlineLabel.setText("Perimeter: ");
      sideLabel.setText("Side: ");
      double side = Double.parseDouble(field.getText());
      area = Math.sqrt(3) / 4 * side * side;
      outline = 3 * side;
    }
    if (shape.equals("Square"))
    {
      outlineLabel.setText("Perimeter: ");
      sideLabel.setText("Side: ");
      double side = Double.parseDouble(field.getText());
      area = side * side;
      outline = 4 * side;
    }

    areaLabel.setText(areaLabel.getText() + area);
    outlineLabel.setText(outlineLabel.getText() + outline);
  }

  public void onClick(ActionEvent e)
  {
    if (e.getSource() == button)
      calculate();
    if (e.getSource() == shapesBox)
    {
      String shape = shapesBox.getSelectionModel().getSelectedItem();
      if (shape.equals("Circle"))
      {
        areaLabel.setText("Area: ");
        outlineLabel.setText("Circumference: ");
        sideLabel.setText("Radius: ");
        field.setText("");
      }
      if (shape.equals("Equilateral triangle"))
      {
        areaLabel.setText("Area: ");
        outlineLabel.setText("Perimeter: ");
        sideLabel.setText("Side: ");
        field.setText("");
      }
      if (shape.equals("Square"))
      {
        areaLabel.setText("Area: ");
        outlineLabel.setText("Perimeter: ");
        sideLabel.setText("Side: ");
        field.setText("");
      }
    }
  }

  private class MyTabListener implements ChangeListener<Tab>
  {
    public void changed(ObservableValue<? extends Tab> tab, Tab oldTab, Tab newTab)
    {
      firstTextField.setText("MRMSTMGHDF");
      if (newTab == firstTab)
      {
        firstTextField.setText("Hmm");
      }
      else if (newTab == secondTab)
      {
        secondTextField.setText("interesting");
      }
    }
  }
}
