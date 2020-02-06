import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int arr[] = new int[N];

		double narr[] = new double[N];
		int max = 0;
		double sum = 0;
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			if(max < arr[i]) {
				max = arr[i];
			}
		}

		for(int i = 0; i < N; i++) {
			narr[i] = Double.valueOf(arr[i]);	
				narr[i] = arr[i]/(double)max*100;
		}

		for(int i = 0; i < N; i++) {
			sum += narr[i];
		}
		sum = sum/N;
		System.out.println(sum);

	}

}
