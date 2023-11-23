import java.util.Scanner;
public class Salario {
	public static void main(String [] args) {
		Scanner ler = new Scanner (System.in);
		double salario, salarioDivi;
		
		System.out.println("Escreva o valor do salário: ");
		salario = ler.nextDouble();
		
		salarioDivi = salario*30/100;
		System.out.println("O valor máximo do salário gasto em dívidas é: " + salarioDivi);
		
		ler.close();
	}
}