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
    private Professeur professeur;
    private Salle salle;
    private String niveau;

    public Cours(int i, float t, String dh, String da, int d, String o, Professeur p, Salle s, String n, ArrayList<Eleve> e) 
    {
        this.id = i;
        this.tarif = t;
        this.dateheure = dh;
        this.danse = da;
        this.duree = d;
        this.option = o;
        this.elevesInscrits = e;
        this.professeur = p;
        this.salle = s;
        this.niveau = n;
    }

    public Cours(int i, float t, String dh, String da, int d, String o, Professeur p, Salle s, String n) 
    {
        this.id = i;
        this.tarif = t;
        this.dateheure = dh;
        this.danse = da;
        this.duree = d;
        this.option = o;
        this.elevesInscrits = new ArrayList<Eleve>();
        this.professeur = p;
        this.salle = s;
        this.niveau = n;
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

    public ArrayList<Eleve> getElevesInscrits()
    {
        return elevesInscrits;
    }

    public Professeur getProfesseur()
    {
        return professeur;
    }

    public Salle getSalle()
    {
        return salle;
    }

    public String getNiveau()
    {
        return niveau;
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

    public void setElevesInscrits(ArrayList<Eleve> elevesInscrits)
    {
        this.elevesInscrits = elevesInscrits;
    }

    public void setProfesseur(Professeur professeur)
    {
        this.professeur = professeur;
    }
    public void setSalle(Salle salle)
    {
        this.salle = salle;
    }

    public void setNiveau(String niveau)
    {
        this.niveau = niveau;
    }
    
    public boolean equals(Object other)
    {
    	Cours c = (Cours)other;
    	return(this.id == c.id);
    }

    public String toString()
    {
        return "Cours{" +
                "id=" + id +
                ", tarif=" + tarif +
                ", dateheure='" + dateheure + '\'' +
                ", danse='" + danse + '\'' +
                ", duree=" + duree +
                ", option='" + option + '\'' +
                ", elevesInscrits=" + elevesInscrits +
                ", professeur=" + professeur +
                ", salle=" + salle +
                ", niveau='" + niveau + '\'' +
                '}';
    }
    public void afficher()
    {
        System.out.println(this);
    }
    public void ajouterEleve(Eleve e)
    {
        if(!elevesInscrits.contains(e))
        {
            elevesInscrits.add(e);
        }
    }
    public void supprimerEleve(Eleve e)
    {
        if(elevesInscrits.contains(e))
        {
            elevesInscrits.remove(e);
        }
    }
    public void modifierEleve(Eleve e)
    {
        for(Eleve iter : elevesInscrits)
        {
            if(e.equals(iter)) // Comparaison de l'eleve sur l'id seulement
            {
                iter = e;
            }
        }
    }
    public void modifierProfesseur(Professeur p)
    {
        this.professeur = p;
    }
    public void modifierSalle(Salle s)
    {
        this.salle = s;
    }
}