package lab1;

import java.util.List;

public class Disciplina {
	
	private String nome;

	private Turma turma;
	private Horario horario;
	
	public Disciplina(String nome, Professor professor, Turma turma, Horario horario) {
		this.nome = nome;
		this.horario = horario;
		
		professor.addDisciplina(this);
		
		this.turma = turma;
		turma.addDisciplina(this);
	}
	
	/**
	 * Quais os alunos de uma dada disciplina;
	 * @return
	 */
	public void getAlunos() {
		System.out.print("\nAlunos da disciplina " + this.nome + ": ");
		List<Aluno> alunos = this.turma.getAlunos();
		int t = alunos.size();
		
		for (int i = 0; i < t-2; i++) {
			System.out.print(alunos.get(i) + ", ");
		}
		
		if (t >= 2)
			System.out.print(alunos.get(t-2) + " e ");
		if (t >= 1)
			System.out.println(alunos.get(t-1));
	}
	
	/**
	 * Qual o número de alunos de uma disciplina.
	 * @return
	 */
	public void getQtdAlunos() {
		System.out.print("\nQuantidade de alunos da disciplina " + this.nome + ": ");
		
		System.out.println(turma.getAlunos().size());
	}

	public Horario getHorario() {
		return this.horario;
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
