import java.util.Scanner;
public class Temperatura {
       public static void main (String args[]) {
       Scanner ler = new Scanner(System.in);   
       int fah, celcius;
       
       System.out.println ("Insira a temperatura em Fahrenheit ");
       fah = ler.nextInt();
       
       celcius = (f-32)*5/9;
       System.out.println ("Apresente a temperatura em Celsius: " + celcius);
       ler.close();   	   
       }
}
