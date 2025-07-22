// Funções matemáticas 
package aulas_curso_programacao;

public class Aula28 {

	public static void main(String[] args) {
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);// A recebe Raiz Quadrada de 3 (x)
		B = Math.sqrt(y);// B recebe Raiz Quadrada de 4 (y)
		C = Math.sqrt(25.0);// C recebe Raiz Quadrada de 25
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y);// A recebe resultado de 3 elevado a 4 (x elevado a y)
		B = Math.pow(x, 2.0);// B recebe resultado de 3 elevado a 2 (x elevado a 2)
		C = Math.pow(5.0, 2.0);// C recebe Resultado de 5 elevado a 2
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);// A recebe o valor absoluto de y
		B = Math.abs(z);// B recebe o valor absoluto de z OU SEJA transforma o valor de Z em positivo.
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

	}

}
