package modele;

public class Admin
{
	private String nom;
	private int id;
	private EmploiDuTemps administre;
	
	public Admin(String n, int i)
	{
		this.nom =  n;
		this.id = i;
	}
	
	public Admin(String n, int i, EmploiDuTemps e)
	{
		this.nom =  n;
		this.id = i;
		this.administre = e;
	}
	
	public String getNom()
	{
		return this.nom;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public EmploiDuTemps getAdministre()
	{
		return this.administre;
	}
}