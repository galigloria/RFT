package com.example.loginsetup;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class BejelentkezettCtrl implements Inizializable {
    @FXML
    private Button button_kijelentkezes;
    @FXML
    private Label lbl_udvozles;
    @FXML
   private  Label lbl_felirat;


public void Inicializalas(URL location, ResourceBundle resources)
{
 button_kijelentkezes.setOnAction(new EventHandler<ActionEvent>() {
     @Override
     public void handle(ActionEvent actionEvent) {
      DB.kepernyoCsere(actionEvent,"com.example.loginsetup.fxml",null,null);
     }
 });

}
public void felhasznaloInformacioBeallitas(String felhasznalonev,String kedvencCsatorna)
{
    lbl_udvozles.setText("Üdvözlöm"+felhasznalonev+"!");
    lbl_felirat.setText("Az Ön kedvenc YouTube csatornája"+kedvencCsatorna+"!");
}
}
