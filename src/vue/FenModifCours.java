package vue;

import java.io.File;
import java.io.IOException;

import controleur.Main;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import modele.Cours;


public class FenModifCours extends Stage {

    private CtrlModifCours ctrl;

    public FenModifCours() throws IOException {
        this.setTitle("Sélection des cours");
        this.setResizable(true);
        Scene laScene = new Scene(creerSceneGraph());
        this.setScene(laScene);
    }

    private Pane creerSceneGraph() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/edit.fxml"));
        Pane racine = loader.load();
        ctrl = loader.getController();
        return racine;
    }

	public void afficherCours(Cours cours) {
		ctrl.afficherCours(cours);
	}
}