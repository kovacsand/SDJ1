package view;

import model.Student;
import model.StudentList;
import model.StudentModelManager;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentManagementGUI extends Application
{
   private StudentModelManager modelManager;

   private VBox mainPane;

   private TabPane tabPane;
   private Tab allStudentsTab;
   private Tab changeCountryTab;
   private Tab studentFromCountryTab;

   private TextArea allStudentsArea;

   private Button getButton;
   private Button updateButton;

   private VBox allStudentsPane;

   private VBox changeCountryPane;
   private HBox changeCountryTopPane;
   private FlowPane comboPane;

   private Label firstNameLabel;
   private Label lastNameLabel;
   private Label countryLabel;

   private GridPane changeCountryInputPane;

   private ComboBox<Student> studentBox;
   private TextField firstNameField;
   private TextField lastNameField;
   private TextField countryField;

   private Label studentCountryLabel;
   private TextField studentCountryField;
   private TextArea studentCountryArea;
   private Button studentCountryButton;
   private FlowPane studentCountryPane;
   private ComboBox studentCountryComboBox;

   private FlowPane imagePane;
   private Image logo;
   private ImageView logoView;

   private MenuBar menuBar;

   private Menu fileMenu;
   private Menu editMenu;
   private Menu aboutMenu;

   private MenuItem exitMenuItem;
   private MenuItem aboutMenuItem;

   private CheckMenuItem editAreaMenuItem;
   private CheckMenuItem editFieldsMenuItem;
   private CheckMenuItem editCountryMenuItem;


   private MyActionListener listener;
   private MyTabListener tabListener;

   public void start(Stage window)
   {
      window.setTitle("Student Management GUI");

      modelManager = new StudentModelManager("students.bin");

      listener = new MyActionListener();
      tabListener = new MyTabListener();

      tabPane = new TabPane();
      tabPane.getSelectionModel().selectedItemProperty().addListener(tabListener);

      allStudentsTab = new Tab("All Students");
      changeCountryTab = new Tab("Change Country");
      studentFromCountryTab = new Tab("Students from Country");

      allStudentsArea = new TextArea();
      allStudentsArea.setPrefRowCount(16);
      allStudentsArea.setPrefColumnCount(50);
      allStudentsArea.setEditable(false);

      getButton = new Button("Get Students");
      getButton.setOnAction(listener);
      updateButton = new Button("Update");
      updateButton.setOnAction(listener);

      allStudentsPane = new VBox(10);
      allStudentsPane.setAlignment(Pos.CENTER);
      allStudentsPane.getChildren().add(allStudentsArea);
      allStudentsPane.getChildren().add(getButton);

      changeCountryPane = new VBox(20);
      changeCountryPane.setPadding(new Insets(10));

      changeCountryTopPane = new HBox(20);

      studentBox = new ComboBox<Student>();
      studentBox.setOnAction(listener);

      comboPane = new FlowPane();
      comboPane.setAlignment(Pos.BASELINE_RIGHT);
      comboPane.setPrefWidth(200);
      comboPane.getChildren().add(studentBox);

      firstNameLabel = new Label("First name:");
      lastNameLabel = new Label("Last name:");
      countryLabel = new Label("Country:");

      firstNameField = new TextField();
      firstNameField.setEditable(false);
      lastNameField = new TextField();
      lastNameField.setEditable(false);
      countryField = new TextField();

      changeCountryInputPane = new GridPane();
      changeCountryInputPane.setHgap(5);
      changeCountryInputPane.setVgap(5);
      changeCountryInputPane.addRow(0, firstNameLabel, firstNameField);
      changeCountryInputPane.addRow(1, lastNameLabel, lastNameField);
      changeCountryInputPane.addRow(2, countryLabel, countryField);

      changeCountryTopPane.getChildren().add(changeCountryInputPane);
      changeCountryTopPane.getChildren().add(comboPane);

      logo = new Image("file:img/vialogoah.gif");
      logoView = new ImageView(logo);
      imagePane = new FlowPane();
      imagePane.setPrefHeight(200);
      imagePane.setAlignment(Pos.BOTTOM_CENTER);
      imagePane.getChildren().add(logoView);

      changeCountryPane.getChildren().add(changeCountryTopPane);
      changeCountryPane.getChildren().add(updateButton);
      changeCountryPane.getChildren().add(imagePane);

//THIS IS MY STUFFFFFFF------------------------------------------------------------------------------

      studentCountryLabel = new Label("Country: ");
      studentCountryField = new TextField();
      studentCountryField.setEditable(false);
      studentCountryButton = new Button("Get Students");
      studentCountryButton.setOnAction(listener);
      studentCountryArea = new TextArea();
      studentCountryComboBox = new ComboBox<String>();
      studentCountryComboBox.setOnAction(listener);


      studentCountryPane = new FlowPane();
      studentCountryPane.getChildren().addAll(studentCountryLabel, studentCountryField, studentCountryComboBox, studentCountryButton, studentCountryArea);
//---------------------------------------------------------------------------------------------

      allStudentsTab.setContent(allStudentsPane);
      changeCountryTab.setContent(changeCountryPane);
      studentFromCountryTab.setContent(studentCountryPane);

      tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
      tabPane.getTabs().add(allStudentsTab);
      tabPane.getTabs().add(changeCountryTab);
      tabPane.getTabs().add(studentFromCountryTab);

      exitMenuItem = new MenuItem("Exit");
      exitMenuItem.setOnAction(listener);

      aboutMenuItem = new MenuItem("About");
      aboutMenuItem.setOnAction(listener);

      editAreaMenuItem = new CheckMenuItem("Edit student area");
      editAreaMenuItem.setOnAction(listener);

      editFieldsMenuItem = new CheckMenuItem("Edit name fields");
      editFieldsMenuItem.setOnAction(listener);

      editCountryMenuItem = new CheckMenuItem("Edit country field");
      editCountryMenuItem.setOnAction(listener);

      fileMenu = new Menu("File");
      editMenu = new Menu("Edit");
      aboutMenu = new Menu("About");

      fileMenu.getItems().add(exitMenuItem);

      editMenu.getItems().add(editAreaMenuItem);
      editMenu.getItems().add(editFieldsMenuItem);
      editMenu.getItems().add(editCountryMenuItem);

      aboutMenu.getItems().add(aboutMenuItem);

      menuBar = new MenuBar();

      menuBar.getMenus().add(fileMenu);
      menuBar.getMenus().add(editMenu);
      menuBar.getMenus().add(aboutMenu);

      mainPane = new VBox();
      mainPane.getChildren().add(menuBar);
      mainPane.getChildren().add(tabPane);

      Scene scene = new Scene(mainPane, 520, 390);

      window.setScene(scene);
      window.setResizable(false);
      window.show();
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

   private void updateStudentArea()
   {
      StudentList students = modelManager.getAllStudents();
      allStudentsArea.setText(students.toString());
   }

   private void updateCountryBox()
   {
      int currentIndex = studentCountryComboBox.getSelectionModel().getSelectedIndex();

      studentCountryComboBox.getItems().clear();

      String[] countries = modelManager.getAllCountries();
      for (int i = 0; i < countries.length; i++)
      {
         studentCountryComboBox.getItems().add(countries[i]);
      }

      if (currentIndex == -1 && studentCountryComboBox.getItems().size() > 0)
      {
         studentCountryComboBox.getSelectionModel().select(0);
      }
      else
      {
         studentCountryComboBox.getSelectionModel().select(currentIndex);
      }
   }

   private class MyActionListener implements EventHandler<ActionEvent>
   {
      public void handle(ActionEvent e)
      {
         if (e.getSource() == getButton)
         {
            updateStudentArea();
         }
         else if (e.getSource() == updateButton)
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
         else if (e.getSource() == studentCountryButton)
         {
            studentCountryArea.setText("");
            StudentList temp = modelManager.getStudentsFrom(studentCountryField.getText());
            for (int i = 0; i < temp.size(); i++)
               studentCountryArea.appendText(temp.get(i).toString() + "\n");
         }
         else if (e.getSource() == studentCountryComboBox)
         {
            String temp = (String) studentCountryComboBox.getSelectionModel().getSelectedItem();

            if (temp != null)
            {
               studentCountryField.setText(temp);
            }
         }

         else if (e.getSource() == exitMenuItem)
         {
            Alert alert = new Alert(AlertType.CONFIRMATION,
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
               allStudentsArea.setEditable(true);
            }
            else
            {
               allStudentsArea.setEditable(false);
            }
         }

         else if (e.getSource() == editFieldsMenuItem)
         {
            if (editFieldsMenuItem.isSelected())
            {
               firstNameField.setEditable(true);
               lastNameField.setEditable(true);
            }
            else
            {
               firstNameField.setEditable(false);
               lastNameField.setEditable(false);
            }
         }

         else if (e.getSource() == editCountryMenuItem)
         {
            if (editCountryMenuItem.isSelected())
               studentCountryField.setEditable(true);
            else
               studentCountryField.setEditable(false);
         }

         else if (e.getSource() == aboutMenuItem)
         {
            Alert alert = new Alert(AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("About");
            alert.setContentText("This is just a little program that demonstrates some of the GUI features in Java");
            alert.showAndWait();
         }
      }
   }

   private class MyTabListener implements ChangeListener<Tab>
   {
      public void changed(ObservableValue<? extends Tab> tab, Tab oldTab, Tab newTab)
      {
         if (newTab == allStudentsTab)
         {
            updateStudentArea();
         }
         else if (newTab == changeCountryTab)
         {
            updateStudentBox();
         }
         else if (newTab == studentFromCountryTab)
         {
            updateCountryBox();
         }
      }
   }
}
