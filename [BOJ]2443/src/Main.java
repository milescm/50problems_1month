import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		// N = 5
		for(int i = 1; i <= N; i++) {
			for(int k = 1; k < i; k++) {
				System.out.print(" ");
			}
			for(int j = i; j <= 2*N-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	}

}
