package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.StudentList;
import model.StudentModelManager;

public class AllStudentsViewController
{
  private StudentModelManager modelManager;

  @FXML private Button getButton;
  @FXML private TextArea allStudentsArea;

  public void init(StudentModelManager modelManager)
  {
    this.modelManager = modelManager;
    reset();
  }

  public void reset()
  {
    if(modelManager!=null)
    {
      updateStudentArea();
    }
  }

  public void handleActions(ActionEvent e)
  {
    if (e.getSource() == getButton)
    {
      updateStudentArea();
    }
  }

  private void updateStudentArea()
  {
    StudentList students = modelManager.getAllStudents();
    allStudentsArea.setText(students.toString());
  }

  public void changeEditableState(boolean bool)
  {
    allStudentsArea.setEditable(bool);
  }
}
