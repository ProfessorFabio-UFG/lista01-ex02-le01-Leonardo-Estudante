package models;

import java.util.Scanner;

public class CadastroMorador {

	public CadastroMorador() {
	}

	public static void cadastro() {
		Scanner sc = new Scanner(System.in);
		Moradores morador;

		while (true) {
			// Entrada de Dados
			System.out.println("Digite o nome do Morador: ");
			String nome = sc.next();

			System.out.println("Digite o cpf do Morador: ");
			String cpf = sc.next();

			System.out.println("Digite o celular do Morador: ");
			String celular = sc.next();

			System.out.println("Digite a data de nascimento do Morador: ");
			String data = sc.next();

			System.out.println("Digite o sexo do Morador: ");
			String sexo = sc.next();

			System.out.println("Digite o bloco do Morador: ");
			int bloco = sc.nextInt();

			System.out.println("Digite o apartamento do Morador: ");
			int apt = sc.nextInt();

			System.out.println("Digite o código do Morador: ");
			double codigo = sc.nextDouble();
			sc.nextLine();

			// Instancia de moradores
			morador = new Moradores(nome, cpf, celular, data, sexo, bloco, apt, codigo);

			System.out.println(morador);

			System.out.println("Deseja continuar o cadastro? (S/N): ");
			String confirm = sc.nextLine();
			if (confirm.equalsIgnoreCase("N")) {
				break;
			}

		}

		sc.close();
	}
}
