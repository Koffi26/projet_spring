package fr.vde.persist.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import fr.vde.domaine.entities.Etudiant;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class RepositoryEtudiantTest{

	@Autowired
    private TestEntityManager entityManager;
    
    @Autowired
    RepositoryEtudiant repositoryEtudiant;
    
    
    @Test
    void whenFindById_thenReturnEtudiant() {
        // GIVEN
        final Etudiant e = new Etudiant();
        e.setId(1);
        this.entityManager.persist(e);
        this.entityManager.flush();

        // WHEN
        final Etudiant eBDD = this.repositoryEtudiant.getById(1l);

        // THEN
        assertEquals(1l, eBDD.getId());
    }
}
