package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiarioObras {

	public static List<Obra> obras = new ArrayList<>();
	public static List<Relatorio> relatorio = new ArrayList<>();
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		boolean rodar = true;
		int idObra = 1;
		int idRelatorio = 1;

		try (Scanner scanner = new Scanner(System.in)) {
			do {
				System.out.print("\n=====Menu======\n\n");
				System.out.println("1. Cadastrar Obra");
				System.out.println("2. Listar Obras");
				System.out.println("3. Criar Relatório");
				System.out.println("4. Listar Relatórios");
				System.out.println("5. Sair\n");
				System.out.print("Digite a opção desejada: ");

				switch (scanner.nextInt()) {
					case 1:
						System.out.println("\nOpção Cadastrar Obras Selecionado\n");	
						Cadastrar.cadastrarObra(idObra);
						idObra++;
						break;
					case 2:
						System.out.println("\nOpção Listar Obras Selecionado");	
						Listar.listarObras();
						break;
					case 3:
						System.out.println("\nOpção Criar Relatórios Selecionado");
						Cadastrar.criarRelatorio(idRelatorio);
						idRelatorio++;
						break;
					case 4:
						System.out.println("\nOpção Listar Relatórios Selecionado");
						Listar.listarRelatorios();
						break;
					case 5:
						rodar = false;
						System.out.println("\nFinalizando...");
						break;
					default:
						System.out.println("\nOpção Inválida!");
						break;
				}
			} while (rodar);
		}
	}
}
