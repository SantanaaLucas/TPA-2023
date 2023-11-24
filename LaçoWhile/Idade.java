import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 1, idade;
		int maior = 0, menor = 0;
		
		while (i<=10){
			
			System.out.println("Qual sua idade? ");
			idade = ler.nextInt();
			
			if (idade >=18) {
				System.out.println("Voc� � maior de idade!");
				maior++;
			}else {
				System.out.println("Voc� � menor de idade!");
				menor++;
			}
			i++;
		}
		System.out.println("A quantidade de maior de idade �: " + maior);
		System.out.println("A quantidade de menor de idade �: " + menor);
	}
}