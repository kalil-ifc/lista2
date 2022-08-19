package exercicio022;
import java.util.Scanner;

public class DecompoeUmNumero {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int centena, dezena, unidade, num;
		System.out.println("Informe um número inteiro menor que 1000.");
		System.out.print("Número: ");
		num=entrada.nextInt();
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println("\n   ::: Você digitou ::: ");
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// Outros números
		System.out.println("\n   ::: Veja estes testes com outros números :::\n ");
		
		// a)
		num=326;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");

		// b)
		num=300;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// c)
		num=100;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// d)
		num=320;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// e)
		num=310;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// f)
		num=305;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// g)
		num=101;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// h)
		num=311;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// i)
		num=111;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// j)
		num=25;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// k)
		num=20;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// l)
		num=10;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// m)
		num=21;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// n)
		num=11;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// o)
		num=11;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// p)
		num=1;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// q)
		num=7;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");
		
		// r)
		num=16;
		centena = num / 100;
		dezena = (num%100) / 10;
		unidade = ((num%100)%10);
		System.out.println(num+" = "+centena+" centenas, "+dezena+" dezenas e "+unidade+" unidades");		
	}
}
