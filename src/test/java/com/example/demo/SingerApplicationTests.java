package com.example.demo;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.demo.Entity.singer;
import com.example.demo.Service.singerServ;
import com.example.demo.repo.singerRepo;

@SpringBootTest
class SingerApplicationTests {
	@Autowired
	private singerServ service; 
	@MockBean
	private  singerRepo repo;
	


	@Test
	 public void TestsingerfindAll() {
		
		
		
		Mockito.when(repo.findAll()).thenReturn(Stream.of(new singer("alka","bollywood",20000.00),new singer("Lata Mangeshker","classical",600000.00)).collect(Collectors.toList()));
		assertEquals(2,service.getAll().size());
	}

	private void assertEquals(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	

}
