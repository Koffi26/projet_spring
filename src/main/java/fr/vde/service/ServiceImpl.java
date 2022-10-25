package fr.vde.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import fr.vde.domaine.entities.Etudiant;
import fr.vde.persist.dao.RepositoryEtudiant;
import java.util.List;
import java.util.ArrayList;

@Service
public class ServiceImpl implements Iservice {
	
	 private static final Logger logger = LoggerFactory.getLogger(ServiceImpl.class);
	 
	 @Autowired
	 private RepositoryEtudiant repo;
	
	@Override
	public void ajoutEtudiant(Etudiant e){
		//TODO
		// JpaRepository.save(e);
		repo.save(e);
	}
	
	@Override
	public Etudiant etudiantById(long id) {
		return repo.getById(id);
	}
	
	@Override
	public List<Etudiant> getAllEtudiant() {
		return repo.findAll();
	}
	
	@Override
	public void majEtudiant(Etudiant e) {
		repo.save(e);
	}
	
	@Override
	public void supEtudiant(long id) {
		List<Long> list = new ArrayList<Long>();
		list.add(id);
		repo.deleteAllByIdInBatch(list);
	}
	
	
}
