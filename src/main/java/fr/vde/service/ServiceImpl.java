package fr.vde.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;

import fr.vde.domaine.entities.Etudiant;
import java.util.List;

@Service
public class ServiceImpl implements Iservice {
	
	 private static final Logger logger = LoggerFactory.getLogger(ServiceImpl.class);
	
	@Override
	public void ajoutEtudiant(Etudiant e){
		//TODO
		// JpaRepository.save(e);
	}
	
	@Override
	public Etudiant etudiantById(long id) {
		return null;
	}
	
	@Override
	public List<Etudiant> getAllEtudiant() {
		return null;
	}
	
	@Override
	public void majEtudiant(Etudiant e) {
	}
	
	@Override
	public void supEtudiant(Etudiant e) {
	}
	
	
}
