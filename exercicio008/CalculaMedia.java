package exercicio008;
import java.util.Scanner;

public class CalculaMedia {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota1=0, nota2=0;		
		System.out.println("Informe duas notas parciais.");
		System.out.print("Nota 1: ");
		nota1 = entrada.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = entrada.nextDouble();		
		if (((nota1+nota2)/2) < 7) { 
			System.out.println("Reprovado");
		} else {
			System.out.println("Aprovado");
		}
	}
}
