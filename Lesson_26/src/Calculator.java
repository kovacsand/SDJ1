import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.ArrayList;

public class Calculator extends Application
{
  private Scene scene;
  private VBox mainPane;
  private HBox textPane;
  private GridPane buttonsPane;

  private TextField textField;
  private Label textLabel;

  private ArrayList<Button> numberButtons;

  private Button decimalButton, equalsButton, addButton, subtractButton, multiplyButton, divideButton, deleteButton;

  private MyListener listener;

  public void start(Stage window)
  {
    window.setTitle("Calculator");

    listener = new MyListener();

    textField = new TextField();
    textField.setMinWidth(300);
    textField.setMaxWidth(300);
    textField.setMinHeight(30);
    textField.setMaxHeight(30);
    textLabel = new Label();
    textLabel.setMinWidth(240);
    textLabel.setMaxWidth(240);
    textLabel.setMinHeight(30);
    textLabel.setMaxHeight(30);


    numberButtons = new ArrayList<>(10);


    for (int i = 0; i <= 9; i++)
    {
      numberButtons.add(new Button(i + ""));
      numberButtons.get(i).setMinWidth(75);
      numberButtons.get(i).setMaxWidth(75);
      numberButtons.get(i).setMinHeight(75);
      numberButtons.get(i).setMaxHeight(75);
      numberButtons.get(i).setFont(Font.font("verdana", FontWeight.BOLD, 30));
      numberButtons.get(i).setOnAction(listener);
    }

    decimalButton = new Button(".");
    decimalButton.setMinWidth(75);
    decimalButton.setMaxWidth(75);
    decimalButton.setMinHeight(75);
    decimalButton.setMaxHeight(75);
    decimalButton.setFont(Font.font("verdana", FontWeight.BOLD, 30));
    decimalButton.setOnAction(listener);
    equalsButton = new Button("=");
    equalsButton.setMinWidth(75);
    equalsButton.setMaxWidth(75);
    equalsButton.setMinHeight(75);
    equalsButton.setMaxHeight(75);
    equalsButton.setFont(Font.font("verdana", FontWeight.BOLD, 30));
    equalsButton.setOnAction(listener);
    addButton = new Button("+");
    addButton.setMinWidth(75);
    addButton.setMaxWidth(75);
    addButton.setMinHeight(75);
    addButton.setMaxHeight(75);
    addButton.setFont(Font.font("verdana", FontWeight.BOLD, 30));
    addButton.setOnAction(listener);
    subtractButton = new Button("-");
    subtractButton.setMinWidth(75);
    subtractButton.setMaxWidth(75);
    subtractButton.setMinHeight(75);
    subtractButton.setMaxHeight(75);
    subtractButton.setFont(Font.font("verdana", FontWeight.BOLD, 30));
    subtractButton.setOnAction(listener);
    multiplyButton = new Button("*");
    multiplyButton.setMinWidth(75);
    multiplyButton.setMaxWidth(75);
    multiplyButton.setMinHeight(75);
    multiplyButton.setMaxHeight(75);
    multiplyButton.setFont(Font.font("verdana", FontWeight.BOLD, 30));
    multiplyButton.setOnAction(listener);
    divideButton = new Button("/");
    divideButton.setMinWidth(75);
    divideButton.setMaxWidth(75);
    divideButton.setMinHeight(75);
    divideButton.setMaxHeight(75);
    divideButton.setFont(Font.font("verdana", FontWeight.BOLD, 30));
    divideButton.setOnAction(listener);

    buttonsPane = new GridPane();

    buttonsPane.addRow(0, numberButtons.get(7), numberButtons.get(8), numberButtons.get(9), divideButton);
    buttonsPane.addRow(1, numberButtons.get(4), numberButtons.get(5), numberButtons.get(6), multiplyButton);
    buttonsPane.addRow(2, numberButtons.get(1), numberButtons.get(2), numberButtons.get(3), subtractButton);
    buttonsPane.addRow(3, numberButtons.get(0), decimalButton, equalsButton, addButton);

    deleteButton = new Button("C");
    deleteButton.setMinWidth(60);
    deleteButton.setMaxWidth(60);
    deleteButton.setMinHeight(30);
    deleteButton.setMaxHeight(30);
    deleteButton.setFont(Font.font("verdana", FontWeight.BOLD, 12));
    deleteButton.setOnAction(listener);

    textPane = new HBox();
    textPane.getChildren().addAll(textLabel, deleteButton);

    mainPane = new VBox();
    mainPane.getChildren().addAll(textPane, textField, buttonsPane);


    scene = new Scene (mainPane, 300, 360);
    window.setScene(scene);
    window.setResizable(false);
    window.show();
  }

  private class MyListener implements EventHandler<ActionEvent>
  {
    double firstNumber = 0, secondNumber = 0;
    char operand = 'x';
    public void handle(ActionEvent e)
    {
      for (int i = 0; i < numberButtons.size(); i++)
        if (e.getSource() == numberButtons.get(i))
          textField.appendText(i + "");
      if (e.getSource() == addButton && operand == 'x')
      {
        firstNumber = Double.parseDouble(textField.getText());
        textLabel.setText(firstNumber + "+");
        textField.setText("");
        operand = '+';
      }
      if (e.getSource() == subtractButton && operand == 'x')
      {
        firstNumber = Double.parseDouble(textField.getText());
        textLabel.setText(firstNumber + "-");
        textField.setText("");
        operand = '-';
      }
      if (e.getSource() == multiplyButton && operand == 'x')
      {
        firstNumber = Double.parseDouble(textField.getText());
        textLabel.setText(firstNumber + "*");
        textField.setText("");
        operand = '*';
      }
      if (e.getSource() == divideButton && operand == 'x')
      {
        firstNumber = Double.parseDouble(textField.getText());
        textLabel.setText(firstNumber + "/");
        textField.setText("");
        operand = '/';
      }
      if (e.getSource() == decimalButton)
      {
        if (Double.parseDouble(textField.getText()) % 1 == 0)
          textField.appendText(".");
      }
      if (e.getSource() == equalsButton)
      {
        secondNumber = Double.parseDouble(textField.getText());
        textField.setText("");
        if (operand == '+')
          textLabel.setText(firstNumber + secondNumber + "");
        if (operand == '-')
          textLabel.setText(firstNumber - secondNumber + "");
        if (operand == '*')
          textLabel.setText(firstNumber * secondNumber + "");
        if (operand == '/')
          textLabel.setText(firstNumber / secondNumber + "");
        firstNumber = 0;
        secondNumber = 0;
        operand = 'x';
      }
    }
  }
}
