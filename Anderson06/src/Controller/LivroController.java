package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import Model.Livro;
import View.CadastroLivroView;

public class LivroController {
	CadastroLivroView cadLivro;
	List <Livro> listaLivro = new ArrayList<Livro>();
	
	public LivroController(CadastroLivroView cadastroLivro){
	    cadLivro = cadastroLivro;
	    cadastroLivro.setBotaoBehavior(new BotaoBehavior());
	  }

	  class BotaoBehavior implements ActionListener{

	    @Override
	    public void actionPerformed(ActionEvent e) {
	      Livro livro = new Livro();
	      String id = cadLivro.getId();
	      String nomeLivro = cadLivro.getNome();
	      String autorLivro = cadLivro.getAutor();
	      String dataPublicacao = cadLivro.getData();

	      livro.setIdLivro(id);
	      livro.setNome(nomeLivro);
	      livro.setAutor(autorLivro);
	      Date data = new Date();
	      livro.setAno_publicacao(data);
	      listaLivro.add(livro);
	      
	      listarLivrosCadastrados(listaLivro);
	   
	    }

	  }
	  
	  public void listarLivrosCadastrados(List<Livro> listaLivros) {
		  for (Livro l:listaLivros) {
			  System.out.println("Id do Livro: "+l.getIdLivro());
			  System.out.println("Nome do Livro: "+l.getNome());
			  System.out.println("Autor do Livro: "+l.getAutor());
			  System.out.println("Data de Publicação: "+l.getAno_publicacao());

		  }
	  }
}
