package modele;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EmploiDuTemps
{
	private int semaine;
	private static ObservableList<Cours> cours  = FXCollections.observableArrayList();
	
	
	static public void chargementDonnees() {
		cours.add(new Cours(0, 35, "14 juillet", "Minuit", "Zouk", 30,
				new Professeur("Mehmoud", "Zouk"),
				new Salle("Olympia", true, false, false), "Grand maître"));
		
		cours.add(new Cours(1, 28, "12 novembre", "Midi", "Macarena", 60,
				new Professeur("Mehmet", "Macarena"),
				new Salle("Cigale", true, false, false), "Nul"));

		cours.add(new Cours(2, 45, "11 septembre", "Matin", "Salsa", 30,
				new Professeur("Elouan", "Salsa"),
				new Salle("Bercy", true, false, false), "Mage noir"));


	}

	public EmploiDuTemps(int s)
	{
		this.semaine = s;
	}
	
	public EmploiDuTemps(int s, ArrayList<Cours> c)
	{
		this.semaine = s;
	}
	
	public static void ajouterCours(Cours c)
	{
		cours.add(c);
	}
	
	public static void supprimerCours(Cours c)
	{
		if(cours.contains(c))
		{
			cours.remove(c);
		}
	}
	
	@Override
	public String toString()
	{
		return "Emploi du temps de la semaine " + this.semaine + " avec les cours " + this.cours;
	}
	
	public void afficher()
	{
		System.out.println(this);
	}
	
	public static void modifierCours(Cours c)
	{		
		boolean trouve = false;
		int i=0;
		while (!trouve && i < cours.size())
		{
			if ( cours.get(i).getId() == c.getId())
			{
				cours.set(i, c);
				trouve = true;
			}
			i++;
		}
	}
	
	public static ObservableList<Cours> getCours()
	{
		return cours;
	}
}