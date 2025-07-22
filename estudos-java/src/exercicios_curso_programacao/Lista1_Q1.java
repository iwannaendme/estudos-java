//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
package exercicios_curso_programacao;
import java.util.Scanner;

public class Lista1_Q1 {
	
	public static void main(String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, result;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		result = num1 + num2;
		System.out.println("SOMA = "+result);
		
		sc.close();
	}
}
