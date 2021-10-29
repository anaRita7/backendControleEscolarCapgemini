package com.br.escolaCAP.contoleEscolar.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.escolaCAP.contoleEscolar.model.Aluno;
import com.br.escolaCAP.contoleEscolar.service.AlunoService;

@RestController
@RequestMapping("api/aluno")
public class AlunoController {
	private AlunoService alunoService;

	public AlunoController(AlunoService alunoService) {
		super();
		this.alunoService = alunoService;
	}
	
	@PostMapping
	public ResponseEntity<Aluno> saveAluno(Aluno aluno){
		return new ResponseEntity<Aluno>(alunoService.saveAluno(aluno), HttpStatus.CREATED);
		
	}
}
