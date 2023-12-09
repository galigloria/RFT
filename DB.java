package com.example.loginsetup;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.title;

public class DB {
    public static void kepernyoCsere(ActionEvent event,String fxmlFile,String felhasznalonev, String kedvencCSatorna)
    {
        Parent szulo=null;
        if(felhasznalonev != null  && kedvencCSatorna!=null )
        {
            try{
                FXMLLoader betolt= new FXMLLoader(DB.class.getResource(fxmlFile));
                szulo = betolt.load();
                BejelentkezettCtrl bejelentkezettCtrl= betolt.getController();
                bejelentkezettCtrl.felhasznaloInformacioBeallitas(felhasznalonev,kedvencCSatorna);
            }
             catch (IOException e) {
                e.printStackTrace();
            }

        }
        else{
           try {
              szulo = FXMLLoader.load(DB.class.getResource(fxmlFile));
           } catch (IOException e) {
              e.printStackTrace();
           }
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle(String.valueOf(title));
        stage.setScene(new Scene(szulo, 600,400));
        stage.show();




    }
}
