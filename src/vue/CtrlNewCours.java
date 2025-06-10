package vue;

import controleur.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import modele.Cours;

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
    	/*int idProf = Integer.parseInt(this.getId().getSelectionModel().getSelectedItem());
    	if (cbSuperieur.getSelectionModel().getSelectedIndex()==0 || cbSuperieur.getSelectionModel().getSelectedIndex()==-1) {
    		sup = -1;
    	} else {
    		sup = Integer.parseInt(cbSuperieur.getSelectionModel().getSelectedItem());
    	}
    	float sal;
    	if (txtSalaire.getText().isEmpty()) {
    		sal = -1;
    	} else {
    		sal = Float.parseFloat(txtSalaire.getText());
    	} 
    	float prime;
    	if (txtPrime.getText().isEmpty()) {
    		prime = -1;
    	} else {
    		prime = Float.parseFloat(txtPrime.getText());
    	} 
    	Main.modifierEmploye( 	Integer.parseInt(txtMatricule.getText()),
								txtNom.getText(),
								txtPoste.getText(),
								sup,
								dpDateEmbauche.getValue().getYear(),
								dpDateEmbauche.getValue().getMonthValue(),
								dpDateEmbauche.getValue().getDayOfMonth(),
								sal,
								prime,
								Integer.parseInt(cbDepartement.getSelectionModel().getSelectedItem())
    	);*/
    }

    @FXML
    void handleCancel(ActionEvent event)
    {
    	Main.fermerNewCours();
    }

	void afficherCours(Cours cours) {
        professeurField.setText((cours.getProfesseur()).getNom());
        coursNameField.setText(cours.getDanse());
        niveauField.setText(cours.getNiveau());
        horaireField.setText(cours.getHoraire());
        jourField.setText(cours.getJour());
        dureeField.setText(String.valueOf(cours.getDuree()));
        optionDureeField.setText(cours.getOption());
        lieuSalleField.setText((cours.getSalle()).getNom());
    }
    


    
}
