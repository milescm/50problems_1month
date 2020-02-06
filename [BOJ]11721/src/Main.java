import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "";
		String b[] = new String[10];
		a = sc.next();
		int count=0;
		b = a.split("");		
		for(int i = 0; i < a.length(); i++) {
			System.out.print(b[i]);
			count++;
			if(count%10 == 0) {
				System.out.println("");
			}		
		}
	}
}