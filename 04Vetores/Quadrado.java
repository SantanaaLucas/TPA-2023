import java.util.Scanner;
public class Quadrado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int TAM = 10;
		int i, a[], b[], c[];
		a = new int[TAM];
		b = new int[TAM];
		
		for(i = 0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º valor de A:");
			a[i] = sc.nextInt();
			b[i] = a[i]*a[i];
		}
		
		System.out.print("A [] = "+"[ ");
		for(i = 0; i<TAM; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.print("]\n");
		
		System.out.print("B [] = "+"[ ");
		for(i = 0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.print("]");	
	}
}