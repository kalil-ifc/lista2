package exercicio006;
import java.util.Scanner;

public class ParOuImpar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero, troca;
		System.out.println("Escreva um número para conversão.");
		System.out.print("Número: ");
		numero = entrada.nextInt();
		if (numero%2 == 0) {
			troca = numero+1;
			System.out.println("Seu número " + numero + " era par e agora é ímpar: " + troca);
		} else {
			troca = numero+1;
			System.out.println("Seu número " + numero + " era ímpar e agora é par: " + troca);
		}
	}
}
