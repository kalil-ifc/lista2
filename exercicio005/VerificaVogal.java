package exercicio005;
import java.util.Scanner;

public class VerificaVogal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String letra, a="a", e="e", i="i", o="o", u="u";
		System.out.println("Escreva uma letra para o sistema verificar.");
		System.out.print("Letra: ");
		letra = entrada.next();
		
		if (letra.equals(a)  || letra.equals(e) || letra.equals(i) || letra.equals(o) || letra.equals(u)) {
			System.out.println("É uma vogal");
		} else {
			System.out.println("Não é uma vogal");
		}
	}
}
