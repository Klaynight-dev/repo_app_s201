package modele;

import java.util.ArrayList;

public class Professeur
{
	private static int nbProf = 0;
	int id;
	String nom;
	String danse;
	ArrayList<Cours> enseigne;
	
	public Professeur(String n, String d)
	{
		this.id = nbProf;
		this.nom = n;
		this.danse = d;
		this.enseigne = new ArrayList<Cours>();
		nbProf++;
	}
	
	public Professeur(String n, String d, ArrayList<Cours> e)
	{
		this.id = nbProf;
		this.nom = n;
		this.danse = d;
		this.enseigne = e;
		nbProf++;
	}

	public int getId() {
		return id;
	}
	
	public String getNom() {
		return nom;
	}

	public String getDanse() {
		return danse;
	}

	public ArrayList<Cours> getEnseigne() {
		return enseigne;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setDanse(String danse) {
		this.danse = danse;
	}

	public void setEnseigne(ArrayList<Cours> enseigne) {
		this.enseigne = enseigne;
	}

	public void ajouterCours(Cours c)
	{
		if(!this.enseigne.contains(c))
		{
			this.enseigne.add(c);
		}
	}

	public void supprimerCours(Cours c)
	{
		if(this.enseigne.contains(c))
		{
			this.enseigne.remove(c);
		}
	}
	@Override
	public String toString()
	{
		return this.nom + " enseignant " + this.danse;
	}
	public void afficher()
	{
		System.out.println(this);
	}
	public boolean equals(Object other)
	{
		Professeur p = (Professeur)other;
		return(this.id == p.id);
	}
	public void modifierProfesseur(Professeur p)
	{
		this.id = p.id;
		this.nom = p.nom;
		this.danse = p.danse;
		this.enseigne = p.enseigne;
	}
	public void modifierCours(Cours c)
	{
		for(Cours iter : enseigne)
		{
			if(c == iter)
			{
				iter = c;
			}
		}
	}
}
