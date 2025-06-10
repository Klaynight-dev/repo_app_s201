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

	public int getId()
	{
		return this.id;
	}

	public String getNom()
	{
		return this.nom;
	}

	public String getDanse()
	{
		return this.danse;
	}

	public ArrayList<Cours> getEnseigne()
	{
		return this.enseigne;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public void setNom(String nom)
	{
		this.nom = nom;
	}

	public void setDanse(String danse)
	{
		this.danse = danse;
	}

	public void setEnseigne(ArrayList<Cours> enseigne)
	{
		this.enseigne = enseigne;
	}
}
