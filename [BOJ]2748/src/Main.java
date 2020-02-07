import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if(N == 0) {
			System.out.println(0);
		}
		if(N == 1) {
			System.out.println(1);
		}

		if(N == 2) {
			System.out.println(1);
		}

		if(N > 2) {
			int a[] = new int[N+1];
			a[0] = 0;
			a[1] = 1;
			a[2] = 1;
			for(int i = 3; i <= N; i++) {
				a[i] = a[i-2]+a[i-1];
			}
			System.out.println(a[N]);	
		}
	}
}