package exercicios_curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class Lista1_Q5 {
	public static void main(String []args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, qtd;
		double price, fPrice;
		
		num = sc.nextInt();
		qtd = sc.nextInt();
		price = sc.nextDouble();
		
		fPrice = qtd * price;
		
		System.out.printf("VALOR A PAGAR NA PEÇA %d: R$ %.f\n",num, fPrice);
		
		sc.close();
	}
}
