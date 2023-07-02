package curso.javaPoo.AprovacaoAluno;

/*
Escreva uma classe para representar um Aluno. Adicione atributos relacionados 
às características de um Aluno, como nome, matricula, curso que está matriculado, 
nome de 3 disciplinas que está cursando e as notas dessas 3 disciplinas. Desenvolva
um método para verificar se o aluno está aprovado (nota maior ou igual a 7) em uma
determinada disciplina. Escreva um programa para testar essa classe, que pede as 
informações do aluno ao usuário e ao final informa o nome das disciplinas, 
mostra as notas e mostra se o aluno foi aprovado ou não.
*/


public class Main {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();

		aluno.nome = "Fernando Sousa";
		aluno.matricula = "202356784";
		aluno.curso = "Análise e Desenvolvimento de Sistemas";

		Disciplina disciplina1 = new Disciplina();
		disciplina1.disciplina = "Java POO";
		disciplina1.nota = 8.5;

		Disciplina disciplina2 = new Disciplina();
		disciplina2.disciplina = "Banco de Dados";
		disciplina2.nota = 5;

		Disciplina disciplina3 = new Disciplina();
		disciplina3.disciplina = "Front End";
		disciplina3.nota = 10;

		aluno.disciplinas.add(disciplina1);
		aluno.disciplinas.add(disciplina2);
		aluno.disciplinas.add(disciplina3);

		
		System.out.println("Aluno: " + aluno.nome);
		System.out.println("Matrícula: " + aluno.matricula);
		System.out.println("Curso: " + aluno.curso);
		System.out.println(" ");

		
		System.out.println("|Disciplina     | Nota |  Situação |");

		for (Disciplina disciplina : aluno.disciplinas) {

			System.out.printf("%1s%1s\t%1s%5.1f%2s%10s%2s\n","|", disciplina.disciplina, "|", disciplina.nota, "|",
					(aluno.consutarAprovacao(disciplina.nota) ? "Aprovado" : "Reprovado"),"|");

		}

	}

}
