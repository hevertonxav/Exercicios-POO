package curso.javaPoo.InformacoesCurso;

/*
Escreva uma classe para representar um Curso que
tem nome e horário. Cada curso tem um Professor,
que possui nome, departamento e email. Cada Curso
também pode ter vários alunos (tipo Aluno).Cada
Aluno tem nome, matricula e 4 notas. Escreva um
programa teste que crie um Curso com 5 alunos e
que peça para o usuário entrar com as 4 notas de
cada aluno. Ao final, imprima a média de cada aluno,
se o mesmo está aprovado (media maior ou igual a 7),
e qual é a média da turma.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Curso curso = new Curso();

		System.out.println("Digite o nome do curso: ");
		curso.setNomeCurso(scan.nextLine());
		
		System.out.println("Digite o horário do curso: ");
		curso.setHorarioCurso(scan.next());

		Professor professor = new Professor();

		System.out.println("Digite o nome do professor: ");
		professor.setNomeProfessor(scan.nextLine());
        
		scan.nextLine();
		
		System.out.println("Digite o departamento dele: ");
		professor.setDepartamento(scan.nextLine());

		System.out.println("Digite o email dele: ");
		professor.setEmail(scan.nextLine());

		curso.setProfessor(professor);

		for (int pos = 0; pos <= 4; pos++) {

			Aluno aluno = new Aluno();

			System.out.println("Digite o nome do " + (pos + 1) + "º aluno: ");
			aluno.setNomeAluno(scan.nextLine());
			
			System.out.println("Digite a  matrícula dele: ");
			aluno.setMatricula(scan.next());

			curso.getAlunos().add(aluno);

			for (int i = 0; i <= 3; i++) {

				Nota nota = new Nota();

				System.out.println("Digite a " + (i + 1) + "º nota do aluno: ");
				nota.setNota(scan.nextDouble());

				aluno.getNotas().add(nota);

			}
			
			scan.nextLine();

		}
		
		
		System.out.println(curso.toString());
	
	}
}
