package exercicio030;
import java.util.Scanner;

public class CalculaPreco {
	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		double quilosMorango=0, quilosMaca=0, quilosSoma=0, precoMorango=2.5, precoMaca=1.8, precoSoma=0;
		System.out.println("Informe a quantidade de Morango e Maçã em kg.");
		System.out.print("Morango: ");
		quilosMorango = entrada.nextDouble();
		System.out.print("Maçã: ");
		quilosMaca = entrada.nextDouble();
		
		// cálculos
		quilosSoma=quilosMorango+quilosMaca;
		if (quilosMorango>5) { 
			precoMorango=quilosMorango*(precoMorango-0.3);
		} else  { 
			precoMorango=quilosMorango*precoMorango;
		}
		if (quilosMaca>5) { 
			precoMaca=quilosMaca*(precoMaca-0.3);
		} else { 
			precoMaca=quilosMaca*precoMaca;
		}
		precoSoma=precoMorango+precoMaca;
		if (precoSoma > 25 || quilosSoma > 8) { 
			precoSoma=precoSoma-(precoSoma*0.10);
		}
		
		// relatório
		System.out.println("Total a pagar: "+String.format("%.2f", precoSoma));
	}
}
