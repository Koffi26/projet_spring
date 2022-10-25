package fr.vde.persist.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import fr.vde.persist.entities.koj;
import java.util.List;


@Repository
public interface RepositoryKoj extends JpaRepository<koj,Long> {

	//public List<koj> findAllKoj();
	public koj findAllKojById(long id);
}
