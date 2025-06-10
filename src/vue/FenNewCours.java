package vue;

import java.io.File;
import java.io.IOException;

import controleur.Main;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;
import modele.Cours;


public class FenNewCours extends Stage
{
	private CtrlNewCours ctrl;

	public FenNewCours() throws IOException
	{
		this.setTitle("Création d'un nouveau cours");
		this.setResizable(true);
		Scene laScene = new Scene(creerSceneGraph());
		this.setScene(laScene);
	}

	private Pane creerSceneGraph() throws IOException
	{
		File f = new File("C:/Users/Elouan/cours1/demo10/src/main/resources/new.fxml");
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