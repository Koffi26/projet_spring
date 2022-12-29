package fr.vde.web.controler;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import fr.vde.domaine.entities.Etudiant;
//import fr.vde.web.controler.ControlerEtudiant;
import fr.vde.service.ServiceImpl;


@WebMvcTest(ControlerEtudiant.class)
@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = App.class)
//@SpringBootTest(classes = ControlerEtudiant.class)
//@AutoConfigureMockMvc
public class ControlerEtudiantUnitTest {
	
	private List<Etudiant> list;
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ServiceImpl services;
	
	@BeforeEach
    public void setUp() {
		System.out.println("@BeforeEach ControlerEtudiantUnitTest");
        final Etudiant e = new Etudiant();
        e.setId(4l);

        Mockito.when(this.services.etudiantById(4))
                .thenReturn(e);
    }
	
	@Test
	public void testcontextLoads(ApplicationContext context) throws Exception {
	    assertThat(context.getBean(ControlerEtudiant.class)).isNotNull();
	}
	
	@Test
	public void testG() throws Exception {
		//Given
		final Etudiant e = new Etudiant();
		e.setId(1);
		//service = new ServiceImpl();
		
		//When
		Mockito.when(this.services.etudiantById(1)).thenReturn(e);
		
		mockMvc.perform(get("http://localhost:8081/koff/student/1"))
			.andExpect(status().isOk());
	}
	
	@Test
	public void testGetAll() throws Exception {
		//Given
		
		final Etudiant e1 = new Etudiant();
		final Etudiant e2 = new Etudiant();
		e1.setId(1);
		e1.setId(2);
		List<Etudiant> list = new ArrayList<Etudiant>();
		list.add(e1);
		list.add(e2);
		
		//When
		Mockito.when(this.services.getAllEtudiant()).thenReturn(list);
		
		mockMvc.perform(get("http://localhost:8081/koff/student"))
			.andExpect(status().isOk());
	}
}
