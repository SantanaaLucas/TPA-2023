import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade, anoAtual, anoNasc, velho, novo;
		
		System.out.println("Digite seu ano de nascimento: ");
		anoNasc = sc.nextInt();
		
		System.out.println("Digite o ano atual: ");
		anoAtual = sc.nextInt();
		
		
		idade = anoAtual - anoNasc;	
		
		
		System.out.println("Sua idade �: " + idade);
		
		
		velho = idade;
		novo = idade;
		
		
		for(int i = 2; i<=10; i++) {
			
			System.out.println("Insira seu ano de nascimento: ");
			anoNasc = sc.nextInt();
			System.out.println("Insira o ano atual: ");
			anoAtual = sc.nextInt();
			idade = anoAtual - anoNasc;
			System.out.println("Insirea a sua idade �: " + idade);
			if(idade < velho) {
				velho = idade;
			}else {
				novo = idade;
			}	
		}	
		System.out.println("O mais velho �: " + velho);
		System.out.println("O mais novo �: " + novo);
	}
}