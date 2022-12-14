package eif.viko.lt.multiscreenjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginController {
  @FXML
  private Button signIn;
  @FXML
  private TextField username;

  @FXML
  public void checkCredentials(ActionEvent event) throws IOException {

    FXMLLoader loader = new FXMLLoader(getClass().getResource("home.fxml"));
    Parent parent = loader.load();

    HomeController homeController = loader.getController();
    homeController.displayWelcomeText(username.getText());

    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    Scene scene = new Scene(parent);
    stage.setScene(scene);
    stage.show();
  }

}
