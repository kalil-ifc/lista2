package exercicio2;
import java.util.Scanner;

public class NumeroPositivoNegativoZero {
	public static void main (String [] args) {

		//	entradas
		Scanner entrada = new Scanner (System.in);
		int numero;
		System.out.println("Digite um número.");
		System.out.print("Número: ");
		numero = entrada.nextInt();
		
		// processos e saídas
		if (numero > 0) { 
			System.out.println("O número é positivo");
		} else if (numero < 0) {
			System.out.println("O número é negativo");
		} else { 
			System.out.println("O número é zero");
		}
	}
}
