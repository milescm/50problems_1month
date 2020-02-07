import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double res[] = new double[N];
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			double sum = 0;
			double count = 0.0;
			int arr[] = new int[a];
			for(int j = 0; j < a; j++) {
				arr[j] = sc.nextInt();
			}
			for(int j = 0; j < a; j++) {
				sum += arr[j];
			}
			sum = sum/(double)a;
			for(int j = 0; j < a; j++) {
				if(sum<arr[j]) {
					count++;
				}
			}
			count = (double)(count / (double)a) * 100;
			res[i] = count;		
		}
		for(int i = 0; i < N; i++) {
			System.out.println(String.format("%.3f", res[i])+"%");
		}
	}
}