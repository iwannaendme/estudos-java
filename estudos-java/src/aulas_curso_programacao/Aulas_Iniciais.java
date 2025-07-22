package aulas_curso_programacao;

import java.util.Locale;

public class Aulas_Iniciais {

	public static void main(String[] args) {
//		Printando.
		System.out.println("Hello world!");
//		Printando variáveis.
		int y = 32;
		System.out.println(y);
//		Printando ponto flutuante.
		double x = 10.134567;
		Locale.setDefault(Locale.US);
		System.out.println(x);
		System.out.printf("%.5f%n", x);
		System.out.printf("%.4f%n", x);
		System.out.printf("%.2f%n", x);
		System.out.println("Resultado = " + x + " Metros.");
		System.out.printf("Resulado = %.2f Metros.%n", x);
//		Concatenando diferentes tipos de variáveis no Print.
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d Anos e ganha R$%.2f Reais por mês%n", nome, idade, renda);

	}

}
