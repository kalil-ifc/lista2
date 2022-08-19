package exercicio013;
import java.util.Scanner;

public class CalculaSalario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valorHora=0, salario=0, descontoIr=0, descontoInss=0, descontoFgts=0, totalDescontos=0, salarioLiquido=0; 
		int quantidadeHoras=0, relatorioIr=0;
		System.out.println("Informe o valor da hora trabalhada e quantidade de horas no mês.");
		System.out.print("Valor da hora: ");
		valorHora = entrada.nextDouble();
		System.out.print("Quantidade de horas: ");
		quantidadeHoras = entrada.nextInt();
		
		// calculo do salario
		salario = valorHora * quantidadeHoras;
		
		// a)
		if (salario < 900) { 
			descontoIr = 0;
			relatorioIr = 0;
		} else if (salario > 900 && salario < 1500) {
			descontoIr = salario*0.05;
			relatorioIr = 5;
		} else if (salario > 1500 && salario < 2500) { 
			descontoIr = salario*0.10;
			relatorioIr = 10;
		} else if (salario > 2500) { 
			descontoIr = salario*0.20;
			relatorioIr = 20;
		} else { 
			System.out.println("Dados Incoretos!");
		}
		
		// b
		descontoInss = salario*0.10;
		
		// c
		descontoFgts = salario*0.11;
		
		// Total de descontos
		totalDescontos = descontoIr+descontoInss+descontoFgts;
		
		// Salario Líquido
		salarioLiquido = salario - totalDescontos;
		
		// relatorio
		System.out.println("Salario Bruto: ("+valorHora+" * "+quantidadeHoras+")     : R$ "+ String.format("%.2f", salario));
		System.out.println("(-) IR ("+relatorioIr+"%)          : R$ "+String.format("%.2f",descontoIr));
		System.out.println("(-) INSS (10%)          : R$ "+String.format("%.2f",descontoInss));
		System.out.println("(-) FGTS (11%)          : R$ "+ String.format("%.2f",descontoFgts));
		System.out.println("Total de descontos          : R$ "+String.format("%.2f",totalDescontos));
		System.out.println("Salário Líquido          : R$ "+ String.format("%.2f",salarioLiquido));
	}
}
