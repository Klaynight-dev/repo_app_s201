package modele;

public class Salle
{
	private int id;
	private String nom;
	private boolean disponible;
	private boolean chaussure_danse;
	private boolean vestiaire_obligatoire;
	
	public Salle(int id, String n, boolean disp, boolean chd, boolean vesto)
	{
		this.id = id;
		this.nom = n;
		this.disponible = disp;
		this.chaussure_danse = chd;
		this.vestiaire_obligatoire = vesto;
	}
	
	
	public int getId() {
		return id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public boolean getDiponible() {
		return disponible;
	}
	
	public boolean getChaussureDanse() {
		return chaussure_danse;
	}
	
	public boolean getVestiaireObligatoire() {
		return vestiaire_obligatoire;
	}
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setnom(String n) {
		this.nom = n;
	}
	
	public void setDisponible(boolean disp) {
		this.disponible = disp;
	}
	
	public void setChaussureDanse(boolean chd) {
		this.chaussure_danse = chd;
	}
	
	public void setVestiaireObligatoire(boolean vesto) {
		this.vestiaire_obligatoire = vesto;
	}
	
}
