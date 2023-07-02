package curso.javaPoo.LivroLivraria;

/*
Usando o resultado do exercício anterior como base,
crie uma classe “LivroDeLivraria” que represente os
dados básicos de um livro que está à venda em uma
livraria. 
*/

public class Main {

	public static void main(String[] args) {

		LivroDeLivraria livraria = new LivroDeLivraria();

		livraria.nome = "Java: Como Programar";
		livraria.tipoCapa = "capa comum";
		livraria.preco = 362.40;
		livraria.autor = " Paul Deitel e Harvey Deitel";
		livraria.editora = "Pearson Universidades";
		livraria.isbn10 = "‎ 8543004799";
		livraria.isbn13 = "978-8543004792";
		livraria.edicao = 10;
		livraria.numeroPaginas = 968;
		livraria.idioma = "português";
		livraria.dimensoes.largura = 28;
		livraria.dimensoes.comprimento = 20.8;
		livraria.dimensoes.espessura = 3.8;

		System.out.println("Nome: " + livraria.nome);
		System.out.println("Tipo de capa: " + livraria.tipoCapa);
        System.out.printf("Preço: R$ %.2f \n", livraria.preco);
		System.out.println("Autor: " + livraria.autor);
		System.out.println("Editora: " + livraria.editora);
		System.out.println("ISBN-10: " + livraria.isbn10);
		System.out.println("ISBN-13: " + livraria.isbn13);
		System.out.println("Edição: " + livraria.edicao + "ª");
		System.out.println("Páginas: " + livraria.numeroPaginas);
		System.out.println("Idioma: " + livraria.idioma);
		System.out.println("Dimensões: " + livraria.dimensoes.largura + " x " + livraria.dimensoes.comprimento + " x "
				+ livraria.dimensoes.espessura);

	}

}
