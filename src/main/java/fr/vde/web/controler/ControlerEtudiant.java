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
import org.springframework.web.bind.annotation.RequestBody;
import java.util.Map;



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
	
	/**
	 * curl -X POST localhost:8081/koff/student -H "Content-Type:application/json" -d '{"id":"2","name":"name2","date":"12/12/1989", "firstname":"firstname2"}'
	 */
	@PostMapping("/student")
	public void addStudent(@RequestBody Map<String, String> map) {
		
		Etudiant etudiant = new Etudiant();
		
		etudiant.setId(Long.parseLong(map.get("id")));
		etudiant.setNom(map.get("name"));
		etudiant.setPrenom(map.get("firstname"));
		etudiant.setDateInscription(map.get("date"));
		
		service.ajoutEtudiant(etudiant);
	}
	
}
