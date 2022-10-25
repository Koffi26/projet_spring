package fr.vde.web.controler;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import fr.vde.persist.dao.RepositoryKoj;
import org.springframework.beans.factory.annotation.Autowired;
import fr.vde.persist.entities.koj;

import java.util.List;

@RestController
@RequestMapping(value = "/koff")
public class MonControler {

	@Autowired
	private RepositoryKoj repositoryKoj;
	

	@RequestMapping(value = "/test", method = RequestMethod.GET, produces="application/json")
	public String[] test() {
		String[] str = {"juste","un","test"};
		
		koj k = new koj();
		k.setId(1);
		k.setName("ILias");
		k.setEmail("kodddd");
		repositoryKoj.save(k);
		
		k.setId(2);
		k.setName("ibra");
		k.setEmail("Bouge");
		repositoryKoj.save(k);
		
		k.setId(3);
		k.setName("ijjjeyey");
		k.setEmail("direct");
		repositoryKoj.save(k);
		
		k.setId(5);
		k.setName("ibrammouv");
		k.setEmail("Bougement");
		repositoryKoj.save(k);
		
		
		//repositoryKoj.findAllKojById(1);
		return str;
	}
	
	
	@RequestMapping(value = "/find", method = RequestMethod.GET, produces="application/json")
	public List findall() {
		return repositoryKoj.findAll();
	}

}
          

