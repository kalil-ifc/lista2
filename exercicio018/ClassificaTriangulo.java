package exercicio018;
import java.util.Scanner;

public class ClassificaTriangulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double lado1=0, lado2=0, lado3=0;		
		System.out.println("Informe os três lados de um triângulo");
		System.out.print("Lado 1: : ");
		lado1 = entrada.nextDouble();
		System.out.print("Lado 2: : ");
		lado2 = entrada.nextDouble();
		System.out.print("Lado 3: : ");
		lado3 = entrada.nextDouble();
		if (lado1==lado2 && lado2==lado3) {
			System.out.println("Triângulo Equilátero");
		} else if (lado1==lado2 || lado1==lado3 || lado2==lado3) {
			System.out.println("Triângulo Isósceles");
		} else {
			System.out.println("Triângulo Escaleno");
		}
	}
}
