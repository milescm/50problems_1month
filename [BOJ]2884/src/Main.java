import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int afterM = M+15;

		if(H < 1) {
			if(afterM < 60) {
				H = 23;
			}
			else {
				afterM -= 60;
			}
		}
		else {
			if(afterM < 60) {
				H -= 1;
			}
			else {
				afterM -= 60;
			}
		}
		System.out.println(H + " " + afterM);
		sc.close();
	}
}