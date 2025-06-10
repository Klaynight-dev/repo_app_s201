package vue;

import controleur.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CtrlNewCours {

    @FXML
    private TextField professeurField;

    @FXML
    private TextField optionDureeField;

    @FXML
    private TextField coursNameField;

    @FXML
    private TextField niveauField;

    @FXML
    private TextField horaireField;

    @FXML
    private TextField jourField;

    @FXML
    private TextField lieuSalleField;

    @FXML
    private TextField dureeField;

    @FXML
    void handleOk(ActionEvent event)
    {

    }

    @FXML
    void handleCancel(ActionEvent event)
    {
        Main.fermerModifCours();
    }


    
}
