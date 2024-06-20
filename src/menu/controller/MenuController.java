package menu.controller;

import menu.model.Calcas;
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
		for (var produtos : listaProdutos) {
			produtos.visualizar();
		}
		
	}

	@Override
	public void procurarPorTipo(int tipo) {
		
	}

	@Override
	public void atualizarEstoque(Produtos produtos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletar(int tipo) {
		// TODO Auto-generated method stub
		
	}

	
	
}
