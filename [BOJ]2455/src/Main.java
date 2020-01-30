import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[4][2];
		int people = 0;
		int max = 0;
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < 4; i++) {
				people -= arr[i][0];
				people += arr[i][1];
				if(max < people) {
					max = people;
				}
		}
		System.out.println(max);

	}

}
