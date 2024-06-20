package menu.repository;

import menu.model.Produtos;

public interface menuRepository {

	//CRUD do menu
	public void cadastrar(Produtos produtos);
	public void listarTodos();
	public void procurarPorTipo(int tipo);
	public void atualizarEstoque(Produtos produtos);
	public void deletar(int tipo);


}
