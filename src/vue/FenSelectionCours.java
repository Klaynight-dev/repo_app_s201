package vue;

import java.io.File;
import java.io.IOException;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


public class FenSelectionCours extends Stage
{
	
	private CtrlSelectionCours ctrl;
	
	public FenSelectionCours() throws IOException
	{
		this.setTitle("Sélection des cours");
		this.setResizable(true);
		Scene laScene = new Scene(creerSceneGraph());
		this.setScene(laScene);
	}

	private Pane creerSceneGraph() throws IOException
	{
		File f = new File("/home/etuinfo/mquentel/Documents/IHM/fxDOO/main_SAE_201.fxml");
		FXMLLoader loader;
		loader = new FXMLLoader(f.toURI().toURL());
		Pane racine = loader.load();
		ctrl = loader.getController();
		return racine;
	}
}

