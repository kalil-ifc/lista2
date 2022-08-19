package exercicio019;
import java.util.Scanner;

public class CalculaEquacaoDoSegundoGrau {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double delta, a, b, c, x1, x2;
		System.out.println("Informe os valores de a, b e c da equação do segundo grau:");		
		System.out.print("Valor de a: ");		
		a = entrada.nextDouble();
		if (a==0) { 
			System.out.println("A equação não é do segundo grau. Programa encerrado.");
		} else {
		System.out.print("Valor de b: ");
		b = entrada.nextDouble();
		System.out.print("Valor de c: ");
		c = entrada.nextDouble();
		
		// cálculo do delta
		delta = (b*b) + (-4 * (a*c) );

		// cálculo de x1 e x2
		if (delta==0) {			
			x1 = (-(b) + Math.sqrt(delta)) / 2 * a;
			System.out.println("x1 = "+String.format("%.2f", x1));
		} else if (delta>0){ 
			x1 = (-(b) + Math.sqrt(delta)) / 2 * a;
			x2 = (-(b) - Math.sqrt(delta)) / 2 * a;
			System.out.println("x1 = "+String.format("%.2f", x1));
			System.out.println("x2 = "+String.format("%.2f", x2));
		} else { 
			System.out.println("A equação não possui raízes. Programa encerrado.");
		}		
		}		
	}
}
