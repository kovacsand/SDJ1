package view;

import model.StudentModelManager;

import javafx.application.Application;
import javafx.stage.Stage;

public class StartGUI extends Application
{
  public void start(Stage window) throws Exception
  {
    StudentModelManager modelManager = new StudentModelManager("students.bin");
    ViewHandler viewHandler = new ViewHandler(modelManager);
    viewHandler.start(window);
  }
}
