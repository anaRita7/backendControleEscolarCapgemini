package com.br.escolaCAP.contoleEscolar.service;

import java.util.List;

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
		System.out.println(">AlunoServiceImpl> saveAluno()");
		return alunoRepository.save(aluno);
	}


	public AlunoRepository getAlunoRepository() {
		return alunoRepository;
	}


	public void setAlunoRepository(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}


	@Override
	public List<Aluno> findAll() {
		System.out.println(">AlunoServiceImpl> findAll() ");
		return alunoRepository.findAll();
	}
	
}
