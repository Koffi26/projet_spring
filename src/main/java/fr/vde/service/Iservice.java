package fr.vde.service;

import fr.vde.domaine.entities.Etudiant;
import java.util.List;

public interface Iservice {
	
	public void ajoutEtudiant(Etudiant e);
	
	public Etudiant etudiantById(long id);
	
	public List<Etudiant> getAllEtudiant();
	
	public void majEtudiant(Etudiant e);
	
	public void supEtudiant(Etudiant e);
	
}
