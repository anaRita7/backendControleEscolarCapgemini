package com.br.escolaCAP.contoleEscolar.service;

import java.util.List;

import com.br.escolaCAP.contoleEscolar.model.Aluno;

public interface AlunoService {

	Aluno saveAluno(Aluno aluno);

	List<Aluno> findAll();

	
}
