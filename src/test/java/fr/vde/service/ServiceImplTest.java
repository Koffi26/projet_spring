package fr.vde.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import fr.vde.persist.dao.RepositoryEtudiant;
import fr.vde.domaine.entities.Etudiant;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

//@WebAppConfiguration
//@SpringBootTest(classes = ServiceImpl.class)
@ExtendWith(SpringExtension.class)
public class ServiceImplTest {
	
	@TestConfiguration
	static class ServiceImplTestContextConfiguration {
		@Bean
		public ServiceImpl serviceImpl() {
			return new ServiceImpl();
		}
	}
	
	@Autowired
	private ServiceImpl service;
	
	@MockBean
	private RepositoryEtudiant repositoryEtudiant;
	
	@BeforeEach
    public void setUp() {
		System.out.println("@BeforeEach ServiceImplTest");
        final Etudiant e = new Etudiant();
        e.setId(4l);

        Mockito.when(this.repositoryEtudiant.getById(e.getId()))
                .thenReturn(e);
    }

	@Test
	public void getAll_should_work() {
		System.out.println("--> ServiceImplTest");
		List<Etudiant> list = service.getAllEtudiant();
		assertThat(list).isEmpty();
	}

}
