package vue;

import controleur.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import modele.*;

public class CtrlModifCours {
	
	@FXML
	private TextField idField;

    @FXML
    private TextField professeurField;

    @FXML
    private TextField optionField;

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
		Main.modifierCours(
				Integer.parseInt(idField.getText()), // id
				Float.parseFloat(tarifField.getText()), // tarif
				jourField.getText(), // jour
				horaireField.getText(), //horaire
				danseField.getText(), // danse
				Integer.parseInt(dureeField.getText()), // duree
				optionField.getText(), // option
				new Professeur(professeurField.getText(), danseField.getText()), // professeur
				new Salle(salleField.getText(), true, false, false), // salle
				niveauField.getText() // niveau
				);

    }

    @FXML
    void handleCancel(ActionEvent event)
    {
    	Main.fermerModifCours();
    }

	void afficherCours(Cours cours) {
		idField.setText(String.valueOf(cours.getId()));
		idField.setDisable(true);
		
        professeurField.setText((cours.getProfesseur()).getNom());
        
        danseField.setText(cours.getDanse());
        
        niveauField.setText(cours.getNiveau());
        
        horaireField.setText(cours.getHoraire());
        
        jourField.setText(cours.getJour());
        
        dureeField.setText(String.valueOf(cours.getDuree()));
        
        tarifField.setText(String.valueOf(cours.getTarif()));
        
        optionField.setText(cours.getOption());
        
        salleField.setText((cours.getSalle()).getNom());
        
        
    }
	


    
}
