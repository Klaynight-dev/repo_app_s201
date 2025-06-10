package vue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import controleur.Main;
import modele.*;
import vue.*;

public class CtrlSelectionCours
{
	
    @FXML
    private TableColumn<?, ?> jourColumn;

    @FXML
    private TableColumn<?, ?> horaireColumn;

    @FXML
    private TableColumn<?, ?> professeurColumn;

    @FXML
    private TableColumn<?, ?> dureeColumn;

    @FXML
    private TableColumn<?, ?> optionDureeColumn;

    @FXML
    private TableView<Cours> courseTable;

    @FXML
    private TableColumn<?, ?> lieuSalleColumn;

    @FXML
    private TableColumn<?, ?> coursNameColumn;

    @FXML
    private TableColumn<?, ?> niveauColumn;

    @FXML
    void handleAddCourse(ActionEvent event)
    {
    	Main.ouvrirModifCours();
    }

    @FXML
    void handleEditCourse(ActionEvent event)
    {
    	Main.ouvrirModifCours();
    }

    @FXML
    void handleDeleteCourse(ActionEvent event)
    {
    	
    }
    
 // clic sur bouton Ajouter
    @FXML void clicAjouter(ActionEvent event) {
    	Main.ouvrirNewCours();
    }
    
    // clic sur bouton Modifier
    @FXML void clicModifier(ActionEvent event) {
    	Main.ouvrirModifCours();
    }
    
    // clic sur bouton Supprimer
    @FXML void clicSupprimer(ActionEvent event) {
    	Alert alert = new Alert(
    			AlertType.CONFIRMATION,
    			"Voulez-vous vraiment supprimer cet employé ?",
    			ButtonType.YES,
    			ButtonType.NO
    			);
    	alert.setTitle("Confirmation de suppression");
    	alert.showAndWait();
    	if(alert.getResult()== ButtonType.YES) {
    		Main.supprimerCours(courseTable.getSelectionModel().getSelectedItem());
    	}
    }
    
    @FXML
    void initialize()
    {
    	courseTable.setItems(Main.getCours());
    	courseTable.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

}
