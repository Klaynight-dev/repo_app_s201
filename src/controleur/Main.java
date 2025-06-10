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
	static private FenNewCours fNewCours;
	
	public void start(Stage f) throws Exception
	{
		
		//initialisation des fenêtres
		
		EmploiDuTemps.chargementDonnees();

		fModifCours = new FenModifCours();
		fModifCours.initModality(Modality.APPLICATION_MODAL);
		fNewCours = new FenNewCours();
		fNewCours.initModality(Modality.APPLICATION_MODAL);
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
	
	static public void ouvrirNewCours()
	{
		fNewCours.show();
	}

	static public void ouvrirModifCours(Cours c)
	{
		fModifCours.afficherCours(c);
		fModifCours.show();
	}
	
	static public void fermerModifCours()
	{
		fModifCours.close();
	}
	static public void fermerNewCours()
	{
		fNewCours.close();
	}

	//////////////////////////////////////////
	// gestion des données : les modifications
	//////////////////////////////////////////
	
	static public void ajouterCours(int i, float t, String j,String h, String da, int d, String o, Professeur p, Salle s, String n) {
		// créer le nouvel employé
		Cours c = new Cours(i, t, j,h, da, d, o, p, s, n);
		// enregistrer l'ajout
		EmploiDuTemps.ajouterCours(c);
	}
	
	static public void modifierCours(int i, float t, String j,String h, String da, int d, String o, Professeur p, Salle s, String n) {
		// créer le nouvel employé
		Cours c = new Cours(i, t, j,h, da, d, o, p, s, n);
		// appel à la méthode de la classe Donnees pour enregistrer la modif ; Penser à fermer la fenêtre
		EmploiDuTemps.modifierCours(c);
		fModifCours.close();
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
