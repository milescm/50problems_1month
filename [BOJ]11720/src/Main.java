import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		String a = sc.next();
		
		String[] b = new String[n];
		for(int i = 0; i < b.length; i++) {			
			b = a.split("");
		}
		
		for(int i = 0; i < b.length; i++) {
			sum = sum + Integer.parseInt(b[i]);
		}
		
		System.out.println(sum);
	}

}
