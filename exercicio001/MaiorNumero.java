package exercicio1;
import java.util.Scanner;

public class MaiorNumero {
	public static void main (String[] args) {
		// entradas
		Scanner entrada = new Scanner (System.in);
		int numero1, numero2, maior=0;
		System.out.println("Digite dois numeros.");
		System.out.print("Numero1: ");
		numero1 = entrada.nextInt();
		System.out.print("Numero2: ");
		numero2 = entrada.nextInt();
		
		// processos e saídas
		if (numero1 > numero2) { 
			maior = numero1;
		} else if (numero1<numero2) {
			maior=numero2;
		} else {
			System.out.print ("Os numeros são iguais");
		}
		System.out.println("\nMaior numero: " + maior);
		}
	}
