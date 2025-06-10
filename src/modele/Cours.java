package modele;

import java.util.ArrayList;

public class Cours {
    private int id;
    private float tarif;
    private String dateheure;
    private String danse;
    private int duree;
    private String option;
    private ArrayList<Eleve> elevesInscrits;
    private Professeur Professeur;
    private Salle Salle;
    private String Niveau;

    public Cours(int i, float t, String dh, String da, int d, String o, Professeur p, Salle s, String n) {
        this.id = i;
        this.tarif = t;
        this.dateheure = dh;
        this.danse = da;
        this.duree = d;
        this.option = o;
        this.Professeur = p;
        this.Salle = s;
        this.Niveau = n;
        this.elevesInscrits = new ArrayList<Eleve>();
    }

    // getters
    public int getId() {
        return id;
    }

    public float getTarif()
    {
        return tarif;
    }

    public String getDateheure()
    {
        return dateheure;
    }

    public String getDanse()
    {
        return danse;
    }

    public int getDuree()
    {
        return duree;
    }

    public String getOption()
    {
        return option;
    }

    public Professeur getProfesseur()
    {
        return Professeur;
    }

    public Salle getSalle()
    {
        return Salle;
    }

    public String getNiveau()
    {
        return Niveau;
    }

    public ArrayList<Eleve> getElevesInscrits()
    {
        return elevesInscrits;
    }

    // setters
    public void setId(int id)
    {
        this.id = id;
    }

    public void setTarif(float tarif)
    {
        this.tarif = tarif;
    }

    public void setDateheure(String dateheure)
    {
        this.dateheure = dateheure;
    }

    public void setDanse(String danse)
    {
        this.danse = danse;
    }

    public void setDuree(int duree)
    {
        this.duree = duree;
    }

    public void setOption(String option)
    {
        this.option = option;
    }

    public void setProfesseur(Professeur p)
    {
        this.Professeur = p;
    }

    public void setSalle(Salle s)
    {
        this.Salle = s;
    }

    public void setNiveau(String n)
    {
        this.Niveau = n;
    }

    public void setElevesInscrits(ArrayList<Eleve> e)
    {
        this.elevesInscrits = e;
    }

    public void ajouterEleve(Eleve e)
    {
    	this.elevesInscrits.add(e);
    }

    public void supprimerEleve(Eleve e)
    {
    	this.elevesInscrits.remove(e);
    }

    public boolean equals(Object other)
    {
    	Cours c = (Cours)other;
    	return(this.id == c.id);
    }
}