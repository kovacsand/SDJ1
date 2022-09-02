package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.Student;
import model.StudentList;
import model.StudentModelManager;

public class ChangeCountryViewController
{
  private StudentModelManager modelManager;

  @FXML private TextField firstNameField;
  @FXML private TextField lastNameField;
  @FXML private TextField countryField;
  @FXML private ComboBox<Student> studentBox;
  @FXML private Button updateButton;

  public void init(StudentModelManager modelManager)
  {
    this.modelManager = modelManager;
    reset();
  }

  public void reset()
  {
    if(modelManager!=null)
    {
      updateStudentBox();

      Student temp = studentBox.getSelectionModel().getSelectedItem();

      if (temp != null)
      {
        firstNameField.setText(temp.getFirstName());
        lastNameField.setText(temp.getLastName());
        countryField.setPromptText(temp.getCountry());
      }
    }
  }

  public void handleActions(ActionEvent e)
  {
    if (e.getSource() == updateButton)
    {
      String firstName = firstNameField.getText();
      String lastName = lastNameField.getText();
      String country = countryField.getText();

      if (country.equals(""))
      {
        country = "?";
      }

      modelManager.changeCountry(firstName, lastName, country);
      updateStudentBox();
      countryField.setText("");
    }
    else if (e.getSource() == studentBox)
    {
      Student temp = studentBox.getSelectionModel().getSelectedItem();

      if (temp != null)
      {
        firstNameField.setText(temp.getFirstName());
        lastNameField.setText(temp.getLastName());
        countryField.setPromptText(temp.getCountry());
      }
    }
  }

  private void updateStudentBox()
  {
    int currentIndex = studentBox.getSelectionModel().getSelectedIndex();

    studentBox.getItems().clear();

    StudentList students = modelManager.getAllStudents();
    for (int i = 0; i < students.size(); i++)
    {
      studentBox.getItems().add(students.get(i));
    }

    if (currentIndex == -1 && studentBox.getItems().size() > 0)
    {
      studentBox.getSelectionModel().select(0);
    }
    else
    {
      studentBox.getSelectionModel().select(currentIndex);
    }
  }

  public void changeEditableState(boolean bool)
  {
    firstNameField.setEditable(bool);
    lastNameField.setEditable(bool);
  }
}
