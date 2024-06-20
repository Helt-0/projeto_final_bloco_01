package menu.controller;


import menu.model.Produtos;
import menu.repository.MenuRepository;


import java.util.ArrayList;



public class MenuController implements MenuRepository{

	private ArrayList<Produtos> listaProdutos = new ArrayList<Produtos>();
	int tipo = 0, moletom, jeans;


	@Override
	public void cadastrar(Produtos produtos) {
		listaProdutos.add(produtos);
		System.out.println("\nA peça: "+ produtos.getPecaDeRoupa()+ " do tipo " + produtos.getTipo()+ " foi cadastrada com sucesso");
	}

	@Override
	public void listarTodos() {
		if(listaProdutos.isEmpty()) {System.out.println("Estoque vazio...");}
		else {
			for (var produtos : listaProdutos) {
				produtos.visualizar();
			}
		}
	}

	@Override
	public void procurarPorTipo(int tipo) {
		var produtos = buscarNaCollection(tipo);

		if (produtos != null) {produtos.visualizar();}
		else {System.out.println("\nA calça do tipo "+ tipo +" não foi encontrada");}
	}

	@Override
	public void atualizarEstoque(Produtos produtos) {
		var buscaProduto = buscarNaCollection(produtos.getTipo());

		if (buscaProduto != null) { 
			listaProdutos.set(listaProdutos.indexOf(buscaProduto), produtos);
			System.out.println("\nA quantidade da peça do tipo: " + produtos.getTipo() + 
					" foi atualizada com sucesso!");
		}else {
			System.out.println("\nNão existe estoque para a peça do tipo " + produtos.getTipo()+"!");
		}

	}

	@Override
	public void deletar(int tipo) {
		var produtos = buscarNaCollection(tipo);

		if (produtos != null) {
			if(listaProdutos.remove(produtos) == true) {System.out.println("\nA peça do tipo"+ tipo + "foi removida do estoque!");
			}
		}else {System.out.println("\nNão existe peça do tipo "+ tipo+ " no estoque!");}

	}

	public Produtos buscarNaCollection(int tipo) {
		for (var produtos : listaProdutos) {
			if (produtos.getTipo() == tipo) {
				return produtos;
			}
		}
		return null;
	}

}
