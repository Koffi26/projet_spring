package fr.vde.persist.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.vde.domaine.entities.Etudiant;
import java.util.List;

//INSERT INTO STUDENT  (ID, AGE, NAME, FIRSTNAME, DATEINSCRIPTION) VALUES  (1, 27, 'Kodi', 'Isssa', '25/10/2022')
@Repository
public interface RepositoryEtudiant extends JpaRepository<Etudiant,Long> {

	
}
