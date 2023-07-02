package curso.javaPoo.InformacoesCurso;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private String nomeAluno;
	private String matricula;
	private List<Nota> notas = new ArrayList<Nota>();

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public List<Nota> getNotas() {
		return notas;
	}

	public void setNotas(List<Nota> notas) {
		this.notas = notas;
	}

	public String toString() {

		String infoTres = "Nome do aluno: " + nomeAluno + "\n";
		infoTres += "Matrícula: " + matricula + "\n";

		for (Nota n : notas) {
			infoTres += n.toString();
		}
		
		infoTres += "Média: " + calcularMedia() + "\n";
		infoTres +=  "Resultado: " + (aprovarAluno() ? "Aprovado" : "Reprovado");

		return infoTres;

	}

	public double calcularMedia() {

		double somaNotas = 0;

		for (Nota nota : notas) {
			
			somaNotas += nota.getNota();

		}
		
		return somaNotas/notas.size();
	
	}
	
	
	public boolean aprovarAluno() {
		
		double media = this.calcularMedia();
		
		if(media >= 7) {
		
			return true;
		
		} else {
			
			return false;
		
		}
	}
	
	

}
