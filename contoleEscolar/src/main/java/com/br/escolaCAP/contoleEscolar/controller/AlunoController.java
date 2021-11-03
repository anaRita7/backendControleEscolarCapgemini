package com.br.escolaCAP.contoleEscolar.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.escolaCAP.contoleEscolar.model.Aluno;
import com.br.escolaCAP.contoleEscolar.service.AlunoService;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController {
	private AlunoService alunoService;

	public AlunoController(AlunoService alunoService) {
		super();
		this.alunoService = alunoService;
	}
	
	@GetMapping("")
	public String index() {
		System.out.println("/");
	    return "This is Home page";
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Aluno>> findAll() {
		System.out.println(">AlunoController> findAll()");
        return new ResponseEntity<>(alunoService.findAll(), HttpStatus.OK);
    }

	@PostMapping("/all")
	public ResponseEntity<Aluno> saveAluno(@RequestBody Aluno aluno){
		System.out.println(">AlunoController> saveAluno()");
		return new ResponseEntity<Aluno>(alunoService.saveAluno(aluno), HttpStatus.CREATED);		
	}
}
