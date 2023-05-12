package exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Main{
	

public static void main(String[] args) {
    // Cadastro das categorias
    Categoria categoria1 = new Categoria(1, "Ficção");
    Categoria categoria2 = new Categoria(2, "Não Ficção");
    Categoria categoria3 = new Categoria(3, "Infantil");
    Categoria categoria4 = new Categoria(4, "Romance");

    // Cadastro dos livros
    Livro livro1 = new Livro(1, "O Senhor dos Anéis", "J.R.R. Tolkien", 1954, categoria1);
    Livro livro2 = new Livro(2, "1984", "George Orwell", 1949, categoria1);
    Livro livro3 = new Livro(3, "O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943, categoria3);
    Livro livro4 = new Livro(4, "O Poder do Hábito", "Charles Duhigg", 2012, categoria2);
    Livro livro5 = new Livro(5, "A Coragem de Ser Imperfeito", "Brené Brown", 2010, categoria2);
    Livro livro6 = new Livro(6, "A Menina que Roubava Livros", "Markus Zusak", 2005, categoria1);
    Livro livro7 = new Livro(7, "A Culpa é das Estrelas", "John Green", 2012, categoria4);
    Livro livro8 = new Livro(8, "A Casa das Sete Mulheres", "Leticia Wierzchowski", 2002, categoria4);
    Livro livro9 = new Livro(9, "O Caçador de Pipas", "Khaled Hosseini", 2003, categoria1);
    Livro livro10 = new Livro(10, "A História de Amor de Romeu e Julieta", "William Shakespeare", 1597, categoria4);

    // Adiciona os livros a uma lista
    List<Livro> listaLivros = new ArrayList<>();
    listaLivros.add(livro1);
    listaLivros.add(livro2);
    listaLivros.add(livro3);
    listaLivros.add(livro4);
    listaLivros.add(livro5);
    listaLivros.add(livro6);
    listaLivros.add(livro7);
    listaLivros.add(livro8);
    listaLivros.add(livro9);
    listaLivros.add(livro10);
    for (Livro livro : listaLivros) {
        System.out.println("Livro: " + livro.getNome() + " | Categoria: " + livro.getCategoria().getNome());
    }
}
}
