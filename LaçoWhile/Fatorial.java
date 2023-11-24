import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
	     Scanner in = new Scanner(System.in);
	     int num = 1, i;
	     
	     System.out.println("Escolha um n�mero");
	     i = in.nextInt();
	     
	     while(i!=1) {
	    	 
	    	 num = num*i;
	    	 i--;
	     }
	     System.out.println(num);
	}
}