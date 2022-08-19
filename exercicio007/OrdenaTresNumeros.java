package exercicio007;
import java.util.Scanner;

public class OrdenaTresNumeros {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);		
		int numero[] = new int [4]; 
		int menor=0, meio=0, maior=0;
		System.out.println("Informe três números inteiros.");
		for (int i=1; i<4; i++) { 			
			System.out.print("Número "+i+" : ");
			numero[i] = entrada.nextInt();
		}
		// Maior		
		for (int i=1; i<4; i++) {
			if (maior==0) { 
				maior=numero[i];
			} else if (numero[i] > maior) { 
					maior = numero[i];
				}
			}
		// Menor e Meio
		for (int i=1; i<4; i++) {
			if (menor==0) { 
				menor=numero[i];
			} else if (numero[i] < menor) { 
					menor = numero[i];
				}
			if (meio==0) {
				meio=maior;
			} else if ((numero[i] < meio) && (menor < meio) ) {
				meio = numero [i];
			}
		}
		System.out.println("A ordem decrescente é "+ maior+" , "+meio+" e "+menor);
	}
}
