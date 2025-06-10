package controleur;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.stage.Modality;
import javafx.stage.Stage;
import modele.*;
import vue.*;

public class Main extends Application{
	static private FenModifCours fModifCours;
	static private FenSelectionCours fSelecCours;
	
	public void start(Stage f) throws Exception
	{
		
		//initialisation des fenêtres
		fModifCours = new FenModifCours();
		fModifCours.initModality(Modality.APPLICATION_MODAL);
		fSelecCours = new FenSelectionCours();
		fSelecCours.setMinHeight(270);
		fSelecCours.setMinWidth(525);
		fSelecCours.show();
	} 
	
	static public void main(String args[])
	{ 
		Application.launch(args); 
	}
	
	static public void fermerAppli()
	{
		System.exit(0);
	}

	//////////////////////////
	// gestion des fenêtres //
	//////////////////////////
	
	static public void ouvrirNewCours() {
		fSelecCours.show();
	}
	
	static public void ouvrirModifCours()
	{
		fModifCours.show();
	}
	
	static public void fermerModifCours()
	{
		fModifCours.close();
	}

	//////////////////////////////////////////
	// gestion des données : les modifications
	//////////////////////////////////////////
	
	static public void ajouterCours(int i, float t, String dh, String da, int d, String o) { 
		// créer le nouvel employé
		Cours c = new Cours(i, t, dh, da, d, o);
		// enregistrer l'ajout
		EmploiDuTemps.ajouterCours(c);
	}
	
	static public void modifierCours(int i, float t, String dh, String da, int d, String o) { 
		// créer le nouvel employé
		Cours c = new Cours(i, t, dh, da, d, o);
		// appel à la méthode de la classe Donnees pour enregistrer la modif ; Penser à fermer la fenêtre
		EmploiDuTemps.modifierCours(c);	
	}
	

	static public void supprimerCours(Cours c) {
		if(EmploiDuTemps.getCours().contains(c))
		{
			EmploiDuTemps.supprimerCours(c);
		}
	}
	
	public static ObservableList<Cours> getCours()
	{
		return EmploiDuTemps.getCours();
	}

}
