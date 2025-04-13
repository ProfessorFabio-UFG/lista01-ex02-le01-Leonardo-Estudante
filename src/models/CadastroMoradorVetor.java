package models;

import java.util.Scanner;

public class CadastroMoradorVetor {
	
public CadastroMoradorVetor() {}
	
	public static void cadastroVetor() {
		Scanner sc = new Scanner(System.in);
		Moradores[] morador = new Moradores[10];
        int i = 0;

        while (i < morador.length) {
            System.out.println("Digite o nome do Morador: ");
            String nome = sc.nextLine();

            System.out.println("Digite o cpf do Morador: ");
            String cpf = sc.nextLine();

            System.out.println("Digite o celular do Morador: ");
            String celular = sc.nextLine();

            System.out.println("Digite a data de nascimento do Morador: ");
            String data = sc.nextLine();

            System.out.println("Digite o sexo do Morador: ");
            String sexo = sc.nextLine();

            System.out.println("Digite o bloco do Morador: ");
            int bloco = sc.nextInt();

            System.out.println("Digite o apartamento do Morador: ");
            int apt = sc.nextInt();

            System.out.println("Digite o código do Morador: ");
            double codigo = sc.nextDouble();
            sc.nextLine(); 

            morador[i] = new Moradores(nome, cpf, celular, data, sexo, bloco, apt, codigo);
            i++;

            System.out.println("Deseja continuar o cadastro? (S/N): ");
            String confirm = sc.nextLine();
            if (confirm.equalsIgnoreCase("N")) {
                break;
            }
        }
		
		for(Moradores m: morador) {
			if(m != null)
			System.out.println(m);
		}
		
		sc.close();
		
	}
}
