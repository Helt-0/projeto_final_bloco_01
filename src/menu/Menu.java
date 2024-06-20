package menu;

import java.util.Scanner;

import menu.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		int opcao;
		String produto;
		
		Scanner leia = new Scanner(System.in);
		
		while(true) {
			System.out.println(Cores.TEXT_PURPLE_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                PONTO DE ESTILO                      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar/cadastrar um produto           ");
			System.out.println("            2 - Listar todas os Produtos             ");
			System.out.println("            3 - Buscar Conta por Id                  ");
			System.out.println("            4 - Atualizar produto                    ");
			System.out.println("            5 - Deletar produto                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
		
		opcao = leia.nextInt();
		
		if(opcao==6) {
			System.out.println("\nPonto de Estilo: Onde a moda encontra a sua essência!\n");
			sobre();
			leia.close();
			System.exit(0);
			}
		
		}
		
		
	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Lucas Vasconcelos ");
		System.out.println("lucas.costa@genstudents.org");
		System.out.println("https://github.com/Helt-0");
		System.out.println("*********************************************************");
	}

}
