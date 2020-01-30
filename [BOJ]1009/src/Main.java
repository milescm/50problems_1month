import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[][] = new int[N][2];
		int result = 0;
		for(int i = 0; i < N; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		sc.close();
		for(int i = 0; i < N; i++) {
			for(int k = 1; i <= arr[i][1]; k++) {
				result = arr[i][0];
				result = (result * k) % 10; 
			}

			System.out.println(result);
		}

	}
}