package fr.vde.web.controler;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import fr.vde.domaine.entities.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import fr.vde.service.ServiceImpl;



@RestController
@RequestMapping(value = "/koff")
public class ControlerEtudiant {


	private static final Logger logger = LoggerFactory.getLogger(ControlerEtudiant.class);

	@Autowired
	private ServiceImpl service ;
	
	@GetMapping("/student/{id}")
	public Etudiant getStudentById(@PathVariable long id) {
		logger.info("uri: /student/"+id);
		return service.etudiantById(id);
	}
	
	@PostMapping("/student")
	public void addStudent() {
	}
	
}
