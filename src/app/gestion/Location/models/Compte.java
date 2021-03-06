package app.gestion.Location.models;



import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Compte generated by hbm2java
 */
@Entity
@Table(name="COMPTE"
    ,schema="LOC"
)
public class Compte  implements java.io.Serializable {


     private String login;
     private String motPasse;
     private Set<Locataire> locataires = new HashSet<Locataire>(0);

    public Compte() {
    }

	
    public Compte(String login) {
        this.login = login;
    }
    public Compte(String login, String motPasse, Set<Locataire> locataires) {
       this.login = login;
       this.motPasse = motPasse;
       this.locataires = locataires;
    }
   
     @Id 

    
    @Column(name="LOGIN", unique=true, nullable=false, length=30)
    public String getLogin() {
        return this.login;
    }
    
    public void setLogin(String login) {
        this.login = login;
    }

    
    @Column(name="MOT_PASSE", length=30)
    public String getMotPasse() {
        return this.motPasse;
    }
    
    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="compte")
    public Set<Locataire> getLocataires() {
        return this.locataires;
    }
    
    public void setLocataires(Set<Locataire> locataires) {
        this.locataires = locataires;
    }




}


