import java.util.Scanner;

public class Ejer6{
	public static void main(String[] argv){
		Scanner scanner = new Scanner(System.in);

		int TC, a=0, b= 0;
		TC = scanner.nextInt();
		while (TC-- >0) {
			a = scanner.nextInt();
			b = b + a;
		} 
		System.out.println(b);
	}
}

