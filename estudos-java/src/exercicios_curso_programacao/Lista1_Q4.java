package exercicios_curso_programacao;
import java.util.Locale;
import java.util.Scanner;

public class Lista1_Q4 {
	public static void main(String []args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num, hour;
		double phour, salary;
		
		num = sc.nextInt();
		hour = sc.nextInt();
		phour = sc.nextDouble();
		
		salary = hour * phour;
		
		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f\n", salary);
		
		sc.close();
	}
}
