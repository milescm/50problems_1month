import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 0;
		int count = 0;
		int b,c;
		while(N != a) {
			if(count == 0) {

				b = N/10;
				c = N%10;
				a = b+c;
				if(a < 10) {

				}
			}
			else {

				b = a/10;
				c = a%10;
			}
			a = a+b+c;
			count++;
		}
		System.out.println(count);

	}

}
