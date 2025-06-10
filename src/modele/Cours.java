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

    public Cours(int i, float t, String dh, String da, int d, String o, ArrayList<Eleve> e)
    {
        this.id = i;
        this.tarif = t;
        this.dateheure = dh;
        this.danse = da;
        this.duree = d;
        this.option = o;
        this.elevesInscrits = e;
    }
    
    public Cours(int i, float t, String dh, String da, int d, String o)
    {
        this.id = i;
        this.tarif = t;
        this.dateheure = dh;
        this.danse = da;
        this.duree = d;
        this.option = o;
        this.elevesInscrits = new ArrayList<Eleve>();
    }

    // getters
    public int getId()
    {
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
    
    public boolean equals(Object other)
    {
    	Cours c = (Cours)other;
    	return(this.id == c.id);
    }
}