package vue;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
            Main.ouvrirModifCours(selectedCours);
        }
    }

    @FXML
    void handleDeleteCourse(ActionEvent event) {
        Cours selectedCours = courseTable.getSelectionModel().getSelectedItem();
        if (selectedCours != null) {
            Main.supprimerCours(selectedCours);
        }
    }

    @FXML
    void initialize() {
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