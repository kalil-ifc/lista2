package exercicio011;
import java.util.Scanner;

public class BoasVindasCurso {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String matutino="M", vespertino="V", noturno="N", opcao;
				
		System.out.println("Qual turno você estuda?");
		System.out.println("Informe M para Matutino, V para Vespertino ou N para Noturno");
		System.out.print("Opção: ");
		opcao = entrada.next();
		if (opcao.equals(matutino)) {
			System.out.println("Bom Dia!");
		} else if (opcao.equals(vespertino)) {
			System.out.println("Boa Tarde!");
		} else if (opcao.equals(noturno)) {
			System.out.println("Boa Noite!"); 
		} else {
			System.out.println("Opção inválida!");
		}
	}
}
