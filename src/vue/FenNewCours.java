package vue;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class FenNewCours extends Stage {

    private CtrlModifCours ctrl;

    public FenNewCours() throws IOException {
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
}