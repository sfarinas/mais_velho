package arranjoMaisVelho;

import java.util.Scanner;

public class maisVelho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int indiceMaisVelho = 0;
		int maior = 0;
		
		System.out.println("Quantas pessoas vc ira digitar : ");
		int n = sc.nextInt();sc.nextLine();
		
		String[] nome = new String[n];
		int [] idade = new int[n];
		
		for (int i = 0; i < nome.length; i++) {
			System.out.printf("Dados da %da pessoa \n" , i+1);
			System.out.printf("Nome : \n" );
			nome[i] = sc.nextLine();
			System.out.printf("Idade : \n" );
			idade[i] = sc.nextInt();sc.nextLine();
			
			if (idade[i] > maior ) {
				maior = idade[i];
				indiceMaisVelho = i;
			}
		}
		System.out.println("PESSOA MAIS VELHO É O " + nome[indiceMaisVelho]);
	}
}
