package lab1;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	
	private String nome;
	
	private List<Disciplina> disciplinas;
	
	public Professor(String nome) {
		this.nome = nome;
		this.disciplinas = new ArrayList<>();
	}

	/**
	 * Quais disciplinas um professor esta ministrando;
	 * @return
	 */
	public void getDisciplinas() {
		System.out.print("\nDisciplinas do(a) prof. " + this.nome + ": ");
		int t = this.disciplinas.size();
		
		for (int i = 0; i < t-2; i++) {
			System.out.print(disciplinas.get(i) + ", ");
		}
		
		if (t >= 2)
			System.out.print(disciplinas.get(t-2) + " e ");
		if (t >= 1)
			System.out.println(disciplinas.get(t-1));
		
	}
	
	/**
	 * Qual o horário de um professor;
	 * @return
	 */
	public void getHorarios() {
		System.out.println("\nHorários de " + this.nome + ": ");
		
		for (Disciplina disciplina : disciplinas) {
			System.out.println(disciplina + " -> " + disciplina.getHorario());
		}
	}

	/**
	 * Adiciona uma disciplina a lista de disciplinas do professor
	 * @param disciplina
	 */
	public void addDisciplina(Disciplina disciplina) {
		this.disciplinas.add(disciplina);
	}
}
