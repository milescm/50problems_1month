import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		char b = 0;
		int num = 0;
		int max = 0;
		for(int i = 0; i < a.length(); i++) {
			b = a.charAt(i);
			if('A' <= b) {
				if(b <= 'C') {
					num = 3;
				}
			}

			if('D' <= b) {
				if(b <= 'F') {
					num = 4;
				}
			}

			if('G' <= b) {
				if(b <='I') {
					num = 5;
				}
			}

			if('J' <= b) {
				if(b <= 'L') {
					num = 6;
				}
			}

			if('M' <= b) {
				if(b <= 'O') {
					num = 7;
				}
			}

			if('P' <= b) {
				if(b <= 'S') {
					num = 8;
				}
			}

			if('T' <= b) {
				if(b <= 'V') {
					num = 9;
				}
			}

			if('W' <= b) {
				if(b <= 'Z') {
					num = 10;
				}
			}
			if(b < 'A')
			{
				if(b > 'Z')
					num = 11;
			}
			max = max + num;
		}

		System.out.println(max);


	}

}
