package curso.javaPoo.LivroBiblioteca;

/*
Usando o resultado do modelo “Livro” como base,
crie uma classe “LivroDeBiblioteca” que represente
os dados básicos de um livro de uma biblioteca, que
pode ser emprestado a leitores.
*/

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
        LivroDeBiblioteca livro = new LivroDeBiblioteca();
		
		livro.nome = "Java: Como Programar";
		livro.autor = "Paul Deitel e Harvey Deitel";
		livro.editora = "Pearson Universidades";
		livro.edicao = 10;
		livro.idioma = "português";
		livro.paginas = 968;
		
		
		livro.emprestado = true;
		livro.dataEntrega = new Date();
		livro.emprestadoA = "Heverton Xavier";
		
		System.out.println("Nome: " + livro.nome);
	    System.out.println("Autor: " +  livro.autor);
		System.out.println("Editora: " + livro.editora);
		System.out.println("Edição: " + livro.edicao + "ª");		
		System.out.println("Páginas: " + livro.paginas);		
		System.out.println("Idioma: " + livro.idioma);		

		System.out.println("Emprestado: " +  (livro.emprestado ? "sim" : "não"));
		System.out.println("Data de Entrega: " + livro.dataEntrega);
		System.out.println("Emprestado à: " + livro.emprestadoA);

	}

}
