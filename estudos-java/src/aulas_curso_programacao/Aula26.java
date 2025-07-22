// Entrada de Dados (leitura de dados)
package aulas_curso_programacao;
//Importar para inicializar
import java.util.Scanner;

public class Aula26 {

	public static void main(String[] args) {
		//Criar objeto Scanner
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next(); // Para introduzir Strings
		System.out.println("Você digitou: " + x);
		
		int y;
		y = sc.nextInt(); // Para introduzir Int
		System.out.println("Você digitou: " + y);
		
		double z;
		z = sc.nextDouble(); // Para introduzir Double (com , / Para que seja introduzido com . deve ser inicializado a funcção Locale.us)
		System.out.println("Você digitou: " + z); 
//		System.out.printf("Você digitou : %.2f%n", z); - Para que ele imprima com , Ex: 10,3
		//Finalizar o objeto Scanner
		
		char c;
		c = sc.next().charAt(0); // Para introduzir Char, a função "charAt()" serve para pegar um unico char de uma string
		System.out.println("Você digitou: " + c);
		
		sc.close();
	}

}
