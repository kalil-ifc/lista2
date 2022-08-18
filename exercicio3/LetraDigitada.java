package exercicio3;
import java.util.Scanner;

public class LetraDigitada {
	public static void main(String[] args) {
		
		// entradas
		Scanner entrada = new Scanner(System.in);
		String opcao, feminino = "F", masculino = "M";
		System.out.println("Escreva F para Feminino ou M para Masculino.");
		System.out.print("Opção: ");
		opcao = entrada.next();
		
		// processos e saídas
		if (opcao.equals(feminino)) {
			System.out.println("A opção foi Feminino");
		} else if (opcao.equals(masculino)) {
			System.out.println("A opção foi Masculino");
		} else {
			System.out.println("Opção inválida!");
		}
	}
}
