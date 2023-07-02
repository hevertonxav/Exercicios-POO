package curso.javaPoo.InformacoesCurso;

import java.util.ArrayList;
import java.util.List;

import curso.javaPoo.Agenda.Contato;

public class Curso {

	private String nomeCurso;
	private String horarioCurso;
	private Professor professor;
	private List<Aluno> alunos = new ArrayList<Aluno>();

	public String getNomeCurso() {
		return nomeCurso;
	}

	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getHorarioCurso() {
		return horarioCurso;
	}

	public void setHorarioCurso(String horarioCurso) {
		this.horarioCurso = horarioCurso;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public String toString() {

		String infoUm = "Nome do curso " + nomeCurso + "\n";
		infoUm += "Horário do curso " + horarioCurso + "\n";
		infoUm += professor.toString() + "\n";

		for (Aluno a : alunos) {

			infoUm += a.toString() + "\n";
			infoUm += " " + "\n";
			infoUm += "--------------------------------------" + "\n";
			infoUm += " " + "\n";

		}
		
		infoUm += "Média da turma: " + calcularMediaTurma();

		return infoUm;

	}

	
	public double calcularMediaTurma() {

		double somaMediasAlunos = 0;

		for (Aluno aluno : alunos) {
			
			somaMediasAlunos +=  aluno.calcularMedia();

		}

		return somaMediasAlunos/alunos.size();
	
	}

}
