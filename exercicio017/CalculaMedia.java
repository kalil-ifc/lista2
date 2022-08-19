package exercicio017;
import java.util.Scanner;

public class CalculaMedia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota1=0, nota2=0, media=0;
		System.out.println("Informe duas notas parciais.");
		System.out.print("Nota 1: ");
		nota1 = entrada.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = entrada.nextDouble();
		
		// calculo da média
		media = (nota1+nota2)/2;
		
		// relatorio
		System.out.println("\n::::::Relatorio::::::");
		System.out.println("Nota 1: "+nota1);
		System.out.println("Nota 2: "+nota2);
		System.out.println("Média: "+media);
		if (media>=9 && media<10) { 
			System.out.println("Conceito: A");
			System.out.println("Resultado: Aprovado");
		} else if (media>=7.5 && media<9) {
			System.out.println("Conceito: B");
			System.out.println("Resultado: Aprovado");
		} else if (media>=6 && media<7.5) { 
			System.out.println("Conceito: C");
			System.out.println("Resultado: Aprovado");
		} else if (media>=4 && media<6) { 
			System.out.println("Conceito: D");
			System.out.println("Resultado: Reprovado");
		} else if (media>=0 && media<4) { 
			System.out.println("Conceito: E");
			System.out.println("Resultado: Reprovado");
		}
	}
}
