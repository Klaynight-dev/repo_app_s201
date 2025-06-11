package vue;

import java.time.LocalDate;

import controleur.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import modele.Cours;
import modele.Professeur;
import modele.Salle;

public class CtrlNewCours {

	@FXML
	private TextField idField;

    @FXML
    private TextField professeurField;

    @FXML
    private TextField niveauField;

    @FXML
    private TextField horaireField;

    @FXML
    private TextField jourField;

    @FXML
    private TextField salleField;

    @FXML
    private TextField tarifField;
    
    @FXML
    private TextField dureeField;

    @FXML
    private TextField danseField;
    
    @FXML
    void handleOk(ActionEvent event)
    {			
		Main.ajouterCours(
				Integer.parseInt(idField.getText()), // id
				Float.parseFloat(tarifField.getText()), // tarif
				jourField.getText(), // jour
				horaireField.getText(), //horaire
				danseField.getText(), // danse
				Integer.parseInt(dureeField.getText()), // duree
				new Professeur(professeurField.getText(), danseField.getText()), // professeur
				new Salle(salleField.getText(), true, false, false), // salle
				niveauField.getText() // niveau
				);

    }

    @FXML
    void handleCancel(ActionEvent event)
    {
    	Main.fermerNewCours();
    }
    
    public void effacer() {
    	idField.clear();
    	professeurField.clear();
    	niveauField.clear();
    	horaireField.clear();
    	jourField.clear();
    	salleField.clear();
    	tarifField.clear();
    	dureeField.clear();
    	danseField.clear();
    }

}
