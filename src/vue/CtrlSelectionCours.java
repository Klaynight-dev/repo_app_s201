package vue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Alert.AlertType;
import controleur.Main;
import modele.*;
import vue.*;

public class CtrlSelectionCours {

    @FXML
    private TableColumn<Cours, String> jourColumn;

    @FXML
    private TableColumn<Cours, String> horaireColumn;

    @FXML
    private TableColumn<Cours, String> professeurColumn;

    @FXML
    private TableColumn<Cours, Integer> dureeColumn;

    @FXML
    private TableColumn<Cours, String> optionDureeColumn;

    @FXML
    private TableView<Cours> courseTable;

    @FXML
    private TableColumn<Cours, String> lieuSalleColumn;

    @FXML
    private TableColumn<Cours, String> coursNameColumn;

    @FXML
    private TableColumn<Cours, String> niveauColumn;

    @FXML
    void handleAddCourse(ActionEvent event) {
    	Main.ouvrirNewCours();
    }

    @FXML
    void handleEditCourse(ActionEvent event) {
        Cours selectedCours = courseTable.getSelectionModel().getSelectedItem();
        if (selectedCours != null) {
            Main.ouvrirModifCours(); //selectedCours
        }
    }

    @FXML
    void handleDeleteCourse(ActionEvent event) {
    	Cours selectedCours = courseTable.getSelectionModel().getSelectedItem();
        if (selectedCours != null) {
            Main.supprimerCours(selectedCours);
        }
    }

    // clic sur bouton Ajouter
    @FXML
    void clicAjouter(ActionEvent event) {
        Main.ouvrirNewCours();
    }

    // clic sur bouton Modifier
    @FXML
    void clicModifier(ActionEvent event) {
        Cours selectedCours = courseTable.getSelectionModel().getSelectedItem();
        if (selectedCours != null) {
            Main.ouvrirModifCours();
        }
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
    void initialize() {
        jourColumn.setText("Jour");
        horaireColumn.setText("Horaire");
        professeurColumn.setText("Professeur");
        dureeColumn.setText("Durée (min)");
        optionDureeColumn.setText("Option Durée");
        lieuSalleColumn.setText("Lieu/Salle");
        coursNameColumn.setText("Nom du Cours");
        niveauColumn.setText("Niveau");

    	jourColumn.setCellValueFactory(new PropertyValueFactory<>("jour"));
        horaireColumn.setCellValueFactory(new PropertyValueFactory<>("horaire"));
        professeurColumn.setCellValueFactory(new PropertyValueFactory<>("professeur"));
        dureeColumn.setCellValueFactory(new PropertyValueFactory<>("duree"));
        optionDureeColumn.setCellValueFactory(new PropertyValueFactory<>("option"));
        lieuSalleColumn.setCellValueFactory(new PropertyValueFactory<>("lieuSalle"));
        coursNameColumn.setCellValueFactory(new PropertyValueFactory<>("danse"));
        niveauColumn.setCellValueFactory(new PropertyValueFactory<>("niveau"));

        courseTable.setItems(Main.getCours());
        courseTable.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

}