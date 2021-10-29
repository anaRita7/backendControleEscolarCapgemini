package com.br.escolaCAP.contoleEscolar.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="aluno")
public class Aluno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "codaluno")
	private int codAluno;
	
	@Column(name = "nomealuno", nullable = false)
	private String nomeAluno;
	
	@Column(name = "cpfaluno")
	private String cpfAluno;
		
	@Column(name = "datanascimento")
	private java.sql.Date dataNascimento;
		
	@Column(name = "datamatricula")
	private java.sql.Date dataMatricula;
		
	@Column(name = "nomepai")
	private String nomePai;
		
	@Column(name = "nomemae")
	private String nomeMae;
		
	@Column(name = "responsavel")
	private String responsavel;
		
	@Column(name = "foneresponsavel")
	private String foneResponsavel;
		
	@Column(name = "matriculado")
	private boolean matriculado;

	public int getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(int codAluno) {
		this.codAluno = codAluno;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getCpfAluno() {
		return cpfAluno;
	}

	public void setCpfAluno(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}

	public java.sql.Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(java.sql.Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public java.sql.Date getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(java.sql.Date dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getFoneResponsavel() {
		return foneResponsavel;
	}

	public void setFoneResponsavel(String foneResponsavel) {
		this.foneResponsavel = foneResponsavel;
	}

	public boolean isMatriculado() {
		return matriculado;
	}

	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}
			
}
