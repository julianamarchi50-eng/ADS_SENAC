package ProjetoIntegrador;

import java.util.Scanner;

public class ADO1_EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner(System.in);
		
        int ano;
		
		System.out.println("\nDigite um ano com 4 digítos: ");
		ano = leia.nextInt();
		
		if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("\nAno Bissexto");
			
		} else { 
			System.out.println("\nNão é bissexto");
			
		}
	}

}
