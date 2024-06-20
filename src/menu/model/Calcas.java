package menu.model;

public class Calcas extends Produtos {

	private int quantidade;
	
	public Calcas(String pecaDeRoupa, int tipo, int quantidade) {
		super(pecaDeRoupa, tipo);
		this.quantidade = quantidade;
		
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void visualizar() {
		super.visualizar();
		System.out.println("Quantidade em estoque: "+this.quantidade);
	}

}
