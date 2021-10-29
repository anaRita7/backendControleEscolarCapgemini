package com.br.escolaCAP.contoleEscolar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.escolaCAP.contoleEscolar.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer>{
	

}
