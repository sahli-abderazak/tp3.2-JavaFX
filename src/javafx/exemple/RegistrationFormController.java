package javafx.exemple;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Window;
public class RegistrationFormController {
 @FXML
 private TextField nameField;
 
 @FXML
 private TextField emailField;
 @FXML
 private PasswordField passwordField;
 @FXML
 private Button submitButton;
 
 @FXML
 private Button exitButton;
 
 
 @FXML
 protected void handleeSubmitButtonAction(ActionEvent event)
 {
	 Platform.exit();
 }
 
@FXML
protected void handleSubmitButtonAction(ActionEvent event)
{
 Window owner = submitButton.getScene().getWindow();
if((nameField.getText().isEmpty())&&(emailField.getText().isEmpty())&&(passwordField.getText().isEmpty())) {
Alert alert = new Alert(AlertType.INFORMATION);
 alert.setTitle("Form Error!");
 alert.setHeaderText(null);
 alert.setContentText("Please enter your name");
 alert.initOwner(owner);
 alert.show();}
 //……Vous faites le test pour tous les autres champs>
 //... …………………
else {
	Alert alert = new Alert(AlertType.INFORMATION);
	 alert.setTitle("Form Error!");
	 alert.setHeaderText(null);
	 alert.setContentText("Welcome " + nameField.getText());
	 alert.initOwner(owner);
	 alert.show();
}}}
