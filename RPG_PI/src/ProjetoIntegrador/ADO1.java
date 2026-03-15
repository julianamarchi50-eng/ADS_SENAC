package ProjetoIntegrador;

import java.util.Scanner;

public class ADO1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		float valor,desconto,VF;
		
		System.out.println("\nDigite o valor da compra: ");
		valor = leia.nextFloat();
		
		if (valor >=300) {
			desconto =  valor * 0.20f;
	
		} else {
			desconto = valor * 0.15f;
		}
		
		VF = valor - desconto;
		
		System.out.println("\nValor do desconto: " + desconto);
		System.out.println("\nValor final da compra:  " + VF);
		
	
		
	}

}
