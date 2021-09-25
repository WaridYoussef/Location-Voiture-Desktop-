package app.gestion.Location.models;
// Generated 10-f�vr.-2020 1:53:13 by Hibernate Tools 4.3.1


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Voiture generated by hbm2java
 */
@Entity
@Table(name="VOITURE"
    ,schema="LOC"
)
public class Voiture  implements java.io.Serializable {


     private String idv;
     private String nomv;
     private List<Exemplaire> exemplaires = new ArrayList<Exemplaire>(0);
     private List<Fabricant> fabricants = new ArrayList<Fabricant>(0);

    public Voiture() {
    }

	
    public Voiture(String idv) {
        this.idv = idv;
    }
    public Voiture(String idv, String nomv, List<Exemplaire> exemplaires, List<Fabricant> fabricants) {
       this.idv = idv;
       this.nomv = nomv;
       this.exemplaires = exemplaires;
       this.fabricants = fabricants;
    }
   
     @Id 

    
    @Column(name="IDV", unique=true, nullable=false, length=7)
    public String getIdv() {
        return this.idv;
    }
    
    public void setIdv(String idv) {
        this.idv = idv;
    }

    
    @Column(name="NOMV", length=30)
    public String getNomv() {
        return this.nomv;
    }
    
    public void setNomv(String nomv) {
        this.nomv = nomv;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="voiture")
    public List<Exemplaire> getExemplaires() {
        return this.exemplaires;
    }
    
    public void setExemplaires(List<Exemplaire> exemplaires) {
        this.exemplaires = exemplaires;
    }

@ManyToMany(fetch=FetchType.LAZY)
    @JoinTable(name="FABRICATION", schema="LOC", joinColumns = { 
        @JoinColumn(name="IDV", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="IDF", nullable=false, updatable=false) })
    public List<Fabricant> getFabricants() {
        return this.fabricants;
    }
    
    public void setFabricants(List<Fabricant> fabricants) {
        this.fabricants = fabricants;
    }

    @Override
    public String toString() {
        return  nomv;
    }




}

