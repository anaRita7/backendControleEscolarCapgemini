package com.br.escolaCAP.contoleEscolar;

import java.sql.Date;
import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.br.escolaCAP.contoleEscolar.model.Aluno;
import com.br.escolaCAP.contoleEscolar.repository.AlunoRepository;
import com.br.escolaCAP.contoleEscolar.service.AlunoService;
import com.br.escolaCAP.contoleEscolar.service.AlunoServiceImpl;

@SpringBootApplication
public class ContoleEscolarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContoleEscolarApplication.class, args);
	}
	
}
