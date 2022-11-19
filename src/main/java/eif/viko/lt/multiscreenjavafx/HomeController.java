package eif.viko.lt.multiscreenjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;


public class HomeController {

  @FXML
  private Label welcomeText;

  public void displayWelcomeText(String username){
    welcomeText.setText(username);
  }
  @FXML
  void viewProfile(ActionEvent event) throws IOException {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("view-profile.fxml"));
    Parent parent = loader.load();

    ProfilePreviewController previewController = loader.getController();
    previewController.setName(welcomeText.getText());

    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    Scene scene = new Scene(parent);
    stage.setScene(scene);
    stage.show();
  }

}
