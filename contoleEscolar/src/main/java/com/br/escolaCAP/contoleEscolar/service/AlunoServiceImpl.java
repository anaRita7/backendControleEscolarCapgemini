package com.br.escolaCAP.contoleEscolar.service;

import org.springframework.stereotype.Service;

import com.br.escolaCAP.contoleEscolar.model.Aluno;
import com.br.escolaCAP.contoleEscolar.repository.AlunoRepository;

@Service
public class AlunoServiceImpl implements AlunoService{

	private AlunoRepository alunoRepository;
	
	
	public AlunoServiceImpl(AlunoRepository alunoRepository) {
		super();
		this.setAlunoRepository(alunoRepository);
	}


	@Override
	public Aluno saveAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}


	public AlunoRepository getAlunoRepository() {
		return alunoRepository;
	}


	public void setAlunoRepository(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}
	
}
