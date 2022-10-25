package fr.vde.domaine.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity
@Table(name="KOJ")  
public class koj {   
 
@Id
@Column(name="ID")
private long id;    
private String name;    
private String email;  


public koj()  {}
   
public long getId()   
{    
return id;    
}    
public void setId(long id)   
{    
this.id = id;    
}    
public String getName()   
{    
return name;    
}    
public void setName(String name)   
{    
this.name = name;    
}    
public String getEmail()   
{    
return email;    
}    
public void setEmail(String email)   
{  
this.email = email;    
}    
}   
