import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int i = 1, num, r;
		
		System.out.println("Qual tabuada você quer saber? ");
		num = ler.nextInt();
		
		while (i<=10) {
			
			r = num*i;
			System.out.println(num + " x " + i + " = " + r );
			i++;
		}
	}
}