package unit;

import fr.vde.web.controler.ControlerEtudiant;
import fr.vde.service.Iservice;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(controllers = ControlerEtudiant.class)
public class ControlerEtudiantUnitTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private Iservice service;

}
