package lab1;

import java.util.ArrayList;
import java.util.List;

public class Turma {
	
	private List<Aluno> alunos;
	private List<Disciplina> disciplinas;
	
	
	public Turma() {
		this.alunos = new ArrayList<>();
		this.disciplinas = new ArrayList<>();
	}


	public List<Aluno> getAlunos() {
		return alunos;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	/**
	 * Adiciona um aluno à turma
	 * @param a1
	 */
	public void addAluno(Aluno a1) {
		this.alunos.add(a1);
		a1.addTurma(this);
	}

	/**
	 * Adiciona uma disciplina à turma
	 * @param disciplina
	 */
	public void addDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}
}
