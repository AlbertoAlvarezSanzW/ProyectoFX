package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;

public class Controller {

    public Label verificacionPass;
    public Label idLabelPassword;
    public PasswordField passwordOroginal;
    Password pas = new Password();
    String nombre = "";

    @FXML
    public Button idBoton;

    @FXML
    public void mostrarContrasena(){

    }


    @FXML
    public void mostrarContenidoBoton(ActionEvent evento){
        idBoton.setText("Botón pulsado");
    }



}
