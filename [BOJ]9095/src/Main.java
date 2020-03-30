import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수 N이 주어졌을 때 N을 1,2,3의합으로 나타낼 수 있는 경우의 수 
		int T = sc.nextInt();
		int arr[] = new int[15];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		for(int z = 0; z < T; z++) {
			int N = sc.nextInt();
			for(int i = 4; i <= N; i++) {
				arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
				
			}
			System.out.println(arr[N]);
			
		}
		
		
	}

}
