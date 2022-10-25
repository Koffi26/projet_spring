package fr.vde.web.controler;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value = "/koff")
public class ControlerEtudiant {
	
	@GetMapping("/student{id}")
	public void getStudentById(@PathVariable long id) {
	}
	
	@PostMapping("/student")
	public void addStudent() {
	}
	
}
