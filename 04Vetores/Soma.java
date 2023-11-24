import java.util.Scanner;
public class Soma {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			final int TAM = 10;
			int i, a[], b[], c[];
			a = new int[TAM];
			b = new int[TAM];
			c = new int[TAM];
			
			for(i = 0; i<TAM; i++) {
				System.out.println("Insira o "+(i+1)+"º valor de A:");
				a[i] = sc.nextInt();
			}
			
			for(i = 0; i<TAM; i++) {
				System.out.println("Insira o "+(i+1)+"º valor de B:");
				b[i] = sc.nextInt();
			}
			
			System.out.print("A [] = "+"[ ");
			for(i = 0; i<TAM; i++) {
				System.out.print(a[i]+" ");
			}
			
			System.out.print("]\n");
			System.out.print("B [] = "+"[ ");
			for(i = 0; i<TAM; i++) {
				System.out.print(b[i]+" ");
				c[i]= a[i]+b[i];
			}
			
			
			System.out.print("]\n");
			
			
			System.out.print("C [] = "+"[ ");
			for(i = 0; i<TAM; i++) {
				System.out.print(c[i]+" ");
			}
			System.out.print("]\n");	
		}
	}