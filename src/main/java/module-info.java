module eif.viko.lt.multiscreenjavafx {
  requires javafx.controls;
  requires javafx.fxml;


  opens eif.viko.lt.multiscreenjavafx to javafx.fxml;
  exports eif.viko.lt.multiscreenjavafx;
}