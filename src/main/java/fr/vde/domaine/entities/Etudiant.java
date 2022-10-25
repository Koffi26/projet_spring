package fr.vde.domaine.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;



@Table(name="STUDENT") 
@Entity
public class Etudiant {

public Etudiant()  {}

@Id
@Column(name="ID")  
private long id ;
@Column(name="NAME") 
private String nom;  
@Column(name="FIRSTNAME")   
private String prenom; 
@Column(name="AGE")  
private int age;
@Column(name="DATEINSCRIPTION") 
private String dateInscription; 




	public long getId() {    
		return id;    
	}    
	public void setId(long id) {    
		this.id = id;
	}

public String getNom()   
{    
return nom;    
}    
public void setNom(String nom)   
{    
this.nom = nom; 
}

public String getPrenom()   
{    
return prenom;    
}  
public void setPrenom(String prenom)   
{    
this.prenom = prenom; 
}
public int getAge()   
{    
return age;    
}    
public void setAge(int age)   
{    
this.age = age;
}

public String getDateInscription()   
{    
return dateInscription;    
}    
public void setDateInscription(String dateInscription)   
{    
this.dateInscription= dateInscription; 
}



}
