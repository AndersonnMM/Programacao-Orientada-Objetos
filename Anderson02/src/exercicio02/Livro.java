package exercicio02;


public class Livro {
    private int id;
    private String nome;
    private String autor;
    private int ano;
    private Categoria categoria;

    public Livro(int id, String nome, String autor, int ano, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
