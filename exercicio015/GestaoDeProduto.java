package exercicio015;
import java.util.Scanner;

public class GestaoDeProduto {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double preco=0;
		String opcao, sul="1", norte="2", leste="3", oeste="4", nordesteA="5", nordesteB="6", centroOesteA="7", centroOesteB="8";
		System.out.println("Informe o preço de custo e o código de origem do produto.");
		System.out.print("Preço de custo: ");
		preco = entrada.nextDouble();
		System.out.print("Código de origem: ");
		opcao = entrada.next();
		if (opcao.equals(sul)) {
			System.out.println("O preço informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Procedência do produto: Sul");
		} else if (opcao.equals(norte)) {
			System.out.println("O preço informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Procedência do produto: Norte");
		} else if (opcao.equals(leste)) {
			System.out.println("O preço informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Procedência do produto: Leste");			
		} else if (opcao.equals(oeste)) {
			System.out.println("O preço informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Procedência do produto: Oeste");			
		} else if (opcao.equals(nordesteA)) {
			System.out.println("O preço informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Procedência do produto: Nordeste");			
		} else if (opcao.equals(nordesteB)) {
			System.out.println("O preço informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Procedência do produto: Nordeste");			
		} else if (opcao.equals(centroOesteA)) {
			System.out.println("O preço informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Procedência do produto: Centro Oeste");			
		} else if (opcao.equals(centroOesteB)) {
			System.out.println("O preço informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Procedência do produto: Centro Oeste");
		} else { 
			System.out.println("O preço informado foi: R$ "+String.format("%.2f", preco));
			System.out.println("Procedência do produto: Importado");
		}
	}
}
