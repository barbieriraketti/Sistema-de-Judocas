package org.fpij.jitakyoei.facade;

import java.util.List;

import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Professor;

public interface AppFacade {

	public abstract void createAluno(Aluno aluno);
	public abstract void updateAluno(Aluno aluno);
	public abstract List<Aluno> searchAluno(Aluno aluno);
	public abstract void listAlunos();
	
	public abstract void createProfessor(Professor professor);
	public abstract void updateProfessor(Professor professor);
	public abstract void searchProfessor(Professor professor);
	public abstract void listProfessores();

	public abstract void createEntidade(Entidade entidade);
	public abstract void updateEntidade(Entidade entidade);
	public abstract List<Entidade> searchEntidade(Entidade entidade);
	public abstract void listEntidade();
}