package menu.model;

public abstract class Produtos {
	
	private String pecaDeRoupa;
	private int tipo;
	
	public Produtos(String pecaDeRoupa,int tipo) {
		this.pecaDeRoupa = pecaDeRoupa;
		this.tipo = tipo;
	}


	public String getPecaDeRoupa() {
		return pecaDeRoupa;
	}

	
	public void setPecaDeRoupa(String pecaDeRoupa) {
		this.pecaDeRoupa = pecaDeRoupa;
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public void visualizar() {

		String modelo = "";

		switch(this.tipo) {
		case 1:
			modelo = "Moletom";
			break;
		case 2:
			modelo = "Jeans";
			break;
		}

		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do estoque :");
		System.out.println("***********************************************************");
		System.out.println("Peça de roupa: " + this.pecaDeRoupa);
		System.out.println("tipo: " + modelo);
		
	}
	
}
