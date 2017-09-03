package lab1;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	private String nome;
	
	private List<Turma> turmas;
	
	public Aluno(String nome, String mat) {
		this.nome = nome;
		this.turmas = new ArrayList<>();
	}

	/**
	 * Quais as disciplinas de um aluno;
	 * @return
	 */
	public void getDisciplinas() {
		System.out.print("\nDisciplinas do(a) aluno(a) " + this.nome + ": ");
		
		List<Disciplina> d = new ArrayList<>();
		
		for (Turma turma : this.turmas) {
			for (Disciplina disciplina : turma.getDisciplinas()) {
				d.add(disciplina);
			}
		}
		int t = d.size();
				
		for (int i = 0; i < t-2; i++) {
			System.out.print(d.get(i) + ", ");
		}
		
		if (t >= 2)
			System.out.print(d.get(t-2) + " e ");
		if (t >= 1)
			System.out.println(d.get(t-1));
	}
	
	/**
	 * Qual o horário de um aluno;
	 * @return
	 */
	public void getHorarios() {
		System.out.println("\nHorários de " + this.nome + ": ");
		
		for (Turma turma : turmas) {
			for (Disciplina d : turma.getDisciplinas()) {
				System.out.println(d + " -> " + d.getHorario());
			}
		}
	}

	@Override
	public String toString() {
		return nome;
	}
	
	/**
	 * Adiciona a turma a lista de turmas do aluno
	 * */
	public void addTurma(Turma t) {
		this.turmas.add(t);
	}
}
