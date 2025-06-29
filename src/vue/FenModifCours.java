package vue;

import java.io.File;
import java.io.IOException;

import controleur.Main;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import modele.Cours;


public class FenModifCours extends Stage
{
	
	private CtrlModifCours ctrl;
	
	public FenModifCours() throws IOException
	{
		this.setTitle("Modification du cours");
		this.setResizable(false);
		Scene laScene = new Scene(creerSceneGraph());
		this.setScene(laScene);
	}

	private Pane creerSceneGraph() throws IOException
	{
		File f = new File("src/ressources2/edit.fxml");
		FXMLLoader loader;
		loader = new FXMLLoader(f.toURI().toURL());
		Pane racine = loader.load();
		ctrl = loader.getController();
		return racine;
	}
	public void afficherCours(Cours cours) {
		ctrl.afficherCours(cours);
	}
}