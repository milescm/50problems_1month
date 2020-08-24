import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[1000];
		int a = 1;
		int count = 0;
		for(int i = 0; i < 1000; i++) {
			arr[i]=a;
			count++;
			
			if(a==count) {
				a++;
				count=0;
			}
		}
		int input1 = sc.nextInt();
		int input2 = sc.nextInt();
		
		int sum = 0;
		
		for(int i = input1-1; i < input2; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		sc.close();
	}
}