package view;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import model.StudentModelManager;

public class MainViewController
{
  @FXML AllStudentsViewController allStudentsViewController;
  @FXML ChangeCountryViewController changeCountryViewController;

  @FXML TabPane tabPane;
  @FXML Tab allStudentsTab;
  @FXML Tab changeCountryTab;
  @FXML MenuItem exitMenuItem;
  @FXML private CheckMenuItem editFieldsMenuItem;
  @FXML private CheckMenuItem editAreaMenuItem;
  @FXML MenuItem aboutMenuItem;

  private StudentModelManager modelManager;

  public void initialize()
  {
    modelManager = new StudentModelManager("students.bin");
    allStudentsViewController.init(modelManager);
    changeCountryViewController.init(modelManager);
  }

  public void tabChanged(Event event)
  {
    if(allStudentsTab.isSelected())
    {
      allStudentsViewController.reset();
    }
    else if (changeCountryTab.isSelected())
    {
      changeCountryViewController.reset();
    }
  }

  public void handleActions(ActionEvent e)
  {
    if (e.getSource() == exitMenuItem)
    {
      Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
          "Do you really want to exit the program?",
          ButtonType.YES, ButtonType.NO);
      alert.setTitle("Exit");
      alert.setHeaderText(null);

      alert.showAndWait();

      if (alert.getResult() == ButtonType.YES)
      {
        System.exit(0);
      }
    }
    else if (e.getSource() == editAreaMenuItem)
    {
      if (editAreaMenuItem.isSelected())
      {
        allStudentsViewController.changeEditableState(true);
      }
      else
      {
        allStudentsViewController.changeEditableState(false);
      }
    }
    else if (e.getSource() == editFieldsMenuItem)
    {
      if (editFieldsMenuItem.isSelected())
      {
        changeCountryViewController.changeEditableState(true);
      }
      else
      {
        changeCountryViewController.changeEditableState(false);
      }
    }
    else if (e.getSource() == aboutMenuItem)
    {
      Alert alert = new Alert(Alert.AlertType.INFORMATION);
      alert.setHeaderText(null);
      alert.setTitle("About");
      alert.setContentText("This is just a little program that demonstrates some of the GUI features in Java");
      alert.showAndWait();
    }
  }
}