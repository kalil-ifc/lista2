package exercicio016;
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
		
		if ((media>0) && (media<3)) { 
			System.out.println("Reprovado");
		} else if ((media>3) && (media<6.9)) {
			System.out.println("Em Exame");
		} else if ((media>7) && (media<10)) { 
			System.out.println("Aprovado");
		}		
	}
}
