package lab1;

import java.util.Calendar;

public class CA {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Alberto", "09874648");
		Aluno a2 = new Aluno("João", "2453245646");
		Aluno a3 = new Aluno("Maria", "4849210");
		Aluno a4 = new Aluno("José", "234082292");
		Aluno a5 = new Aluno("Marcos", "9374972");
		
		Turma turmaIC = new Turma();
		turmaIC.addAluno(a1);
		turmaIC.addAluno(a2);
		turmaIC.addAluno(a3);
		turmaIC.addAluno(a4);
		turmaIC.addAluno(a5);
		
		Professor zezitoProf = new Professor("Zezito");
		Disciplina ic = new Disciplina("IC", zezitoProf, turmaIC, new Horario(Calendar.MONDAY, 20, 0));
		
		Turma turmaWEB = new Turma();
		turmaWEB.addAluno(a1);
		turmaWEB.addAluno(a2);
		turmaWEB.addAluno(a3);
		
		Disciplina web = new Disciplina("WEB", zezitoProf, turmaWEB, new Horario(Calendar.WEDNESDAY, 18, 30));
		
		Turma turmaLab = new Turma();
		turmaLab.addAluno(a1);
		
		Professor joseProf = new Professor("José");
		
		Disciplina lab = new Disciplina("LAB", joseProf, turmaLab, new Horario(Calendar.THURSDAY, 20, 0));
		
		zezitoProf.getDisciplinas();
		joseProf.getDisciplinas();
		
		zezitoProf.getHorarios();
		joseProf.getHorarios();
		
		a1.getDisciplinas();
		a4.getDisciplinas();
		
		a1.getHorarios();
		a4.getHorarios();
		
		web.getAlunos();
		ic.getAlunos();
		lab.getAlunos();
		
		web.getQtdAlunos();
		lab.getQtdAlunos();
		ic.getQtdAlunos();
	}
}
