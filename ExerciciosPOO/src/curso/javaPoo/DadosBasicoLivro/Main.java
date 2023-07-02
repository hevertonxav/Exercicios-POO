package curso.javaPoo.DadosBasicoLivro;

/*
Crie uma classe Livro que represente os dados
básicos de um livro,sem se preocupar com a sua finalidade.
*/

public class Main {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.nome = "Java: Como Programar";
		livro.autor = " Paul Deitel e Harvey Deitel";
		livro.editora = "Pearson Universidades";
		livro.edicao = 10;
		livro.numeroPaginas = 968;
		livro.idioma = "português";
		
		System.out.println("Nome: " + livro.nome);
		System.out.println("Autor: " + livro.autor);		
		System.out.println("Editora: " + livro.editora);		
		System.out.println("Edição: " + livro.edicao + "ª");		
		System.out.println("Páginas: " + livro.numeroPaginas);		
		System.out.println("Idioma: " + livro.idioma);		

	}

}
