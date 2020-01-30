import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a;
		int count = 0;
		for(int j = 0; j < 3; j++) {
			for(int i = 0; i < 4; i++) {
				a = sc.nextInt();
				if(a == 0) {
					count++;
				}
			}
			if(count == 0) {
				System.out.println("E");
			}
			else if(count == 1) {
				System.out.println("A");
			}
			else if(count == 2) {
				System.out.println("B");
			}
			else if(count == 3) {
				System.out.println("C");
			}
			else if(count == 4) {
				System.out.println("D");
			}
			count = 0;
		}

	}

}
