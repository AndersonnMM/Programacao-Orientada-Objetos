package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import Model.Categoria;

public class CategoriaController {
	CadastroCategoriaView cadCategoria;
	List <Categoria> listaCategoria= new ArrayList<Categoria>();
	
	public CategoriaController(CadastroCategoriaView cadastroCategoria){
	    cadCategoria= cadastroCategoria;
	    cadastroCategoria.setBotaoBehavior(new BotaoBehavior());
	  }

	  class BotaoBehavior implements ActionListener{

	    @Override
	    public void actionPerformed(ActionEvent e) {
	      Categoria categoria = new Categoria();
	      String id = cadCategoria.getId();
	      String nomeCategoria= cadCategoria.getNome();
	      

	      categoria.setIdCategoria(id);
	      categoria.setNome(nomeCategoria);
	      
	      listaCategoria.add(categoria);
	      
	      listarCategoriasCadastradas(listaCategoria);
	    }

	  }
	  
	  public void listarCategoriasCadastradas(List<Categoria> listaCategoria) {
		  for (Categoria c:listaCategoria) {
			  System.out.println("Id da Categoria: "+c.getIdCategoria());
			  System.out.println("Nome da Categoria: "+c.getNome());
		  }
	  }
}
