package modele;

import java.util.ArrayList;

public class Eleve extends Membre
{
	private int id;
	private String nom;
	private boolean benevole;
	private boolean membre_bureau;
	private ArrayList<Cours> listeInscrit;
	
	public Eleve(int i, String n, boolean b, boolean m)
	{
		this.id = i;
		this.nom = n;
		this.benevole = b;
		this.membre_bureau = m;
		this.listeInscrit = new ArrayList<Cours>();
	}
	
	public Eleve(int i, String n, boolean b, boolean m, ArrayList<Cours> l)
	{
		this.id = i;
		this.nom = n;
		this.benevole = b;
		this.membre_bureau = m;
		this.listeInscrit = l;
	}
	
    // Getters
    public int getId()
    {
        return id;
    }

    public String getNom()
    {
        return nom;
    }

    public boolean isBenevole()
    {
        return benevole;
    }

    public boolean isMembreBureau()
    {
        return membre_bureau;
    }

    public ArrayList<Cours> getListeInscrit()
    {
        return listeInscrit;
    }

    // Setters
    public void setId(int id)
    {
        this.id = id;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void setBenevole(boolean benevole)
    {
        this.benevole = benevole;
    }

    public void setMembreBureau(boolean membre_bureau)
    {
        this.membre_bureau = membre_bureau;
    }

    public void setListeInscrit(ArrayList<Cours> listeInscrit)
    {
        this.listeInscrit = listeInscrit;
    }
}
