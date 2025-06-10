package modele;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EmploiDuTemps
{
	private int semaine;
	private static ObservableList<Cours> cours  = FXCollections.observableArrayList(new Cours(0, 0, "golem", "minuit", "zouk", 30, "rien",
			new Professeur(0, "rien", "zouk"),
			new Salle(0, "olympia", true, false, false), "grand maître"));

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
		for(Cours iter : cours)
		{
			if(c == iter) // Comparaison du cours sur l'id seulement
			{
				iter = c;
			}
		}
	}
	
	public static ObservableList<Cours> getCours()
	{
		return cours;
	}
}