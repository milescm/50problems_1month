import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for(int i = 1; i <= N; i++) {
			for(int j = N; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i = 1; i < N; i++) {
			for(int k = 1; k <=i; k++) {
				System.out.print(" ");
			}
			for(int j = ((N-1)*2)-i; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		sc.close();
	}
}