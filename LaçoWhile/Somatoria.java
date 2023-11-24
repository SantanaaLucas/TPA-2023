public class Somatoria {
	public static void main(String[] args) {
		int i = 1, r = 0, num;
		
		while (i<=100) {
			
			num = r;
			r = i + r;
			System.out.println(i + " + " + num + " = " + r );
			i++;
			
		}	
	}
}