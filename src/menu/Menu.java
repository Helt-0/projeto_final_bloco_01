package menu;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import menu.controller.MenuController;
import menu.model.Calcas;
import menu.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		int opcao, tipo, quantidade;
		String pecaDeRoupa;
		
		Scanner leia = new Scanner(System.in);
		
		MenuController produtos = new MenuController();
		
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
			System.out.println("            3 - Buscar produto por tipo              ");
			System.out.println("            4 - Atualizar estoque                    ");
			System.out.println("            5 - Deletar do estoque                   ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);
		
			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao=0;
				
			}			
		
		if(opcao==6) {
			System.out.println("\nPonto de Estilo: Onde a moda encontra a sua essência!\n");
			sobre();
			leia.close();
			System.exit(0);
			}
		
		switch (opcao) {
		case 1:
			System.out.println("Criar/cadastrar um produto\n\n");
			
			System.out.println("Qual peça você deseja cadastrar ?");
			leia.skip("\\R?");
			pecaDeRoupa = leia.nextLine();
			
			System.out.println("Digite o tipo do produto (1 para moletom, 2 para Jeans): ");
			tipo = leia.nextInt();
			
			System.out.println("Quantas peças desse mesmo tipo ?");
			quantidade = leia.nextInt();
			
			produtos.cadastrar(new Calcas( pecaDeRoupa,tipo, quantidade));
			
			keyPress();
			break;
	
		case 2:
			System.out.println("Listar todas os Produtos  \n\n");
			
			produtos.listarTodos();

			keyPress();
			break;
		
		case 3:
			System.out.println("Consultar dados da Conta - por número\n\n");

			keyPress();
			break;
		
		case 4:
			System.out.println("Atualizar estoque\n\n");

			keyPress();
			break;
		
		case 5:
			System.out.println("Deletar produto\n\n");

			keyPress();
			break;
		
		default:
			System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n");
			
			keyPress();
			break;
	}
		
		
		}
		
		
	}
	
public static void keyPress() {
		
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
			System.in.read();
		} catch (IOException e) {
			
			System.out.println("Você pressionou algo diferente de enter!");
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
