package modele;

import java.util.ArrayList;

public class Professeur
{
	int id;
	String nom;
	String danse;
	ArrayList<Cours> enseigne;
	
	public Professeur(int i, String n, String d)
	{
		this.id = i;
		this.nom = n;
		this.danse = d;
		this.enseigne = new ArrayList<Cours>();
	}
	
	public Professeur(int i, String n, String d, ArrayList<Cours> e)
	{
		this.id = i;
		this.nom = n;
		this.danse = d;
		this.enseigne = e;
	}
}
