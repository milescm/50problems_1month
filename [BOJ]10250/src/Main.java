import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			int order = sc.nextInt();
			int col = (order/H)+1;
			int row = (order%H);
			if(row == 0) {
				col = col-1;
				row = H;
			}
			System.out.print(row);
			if(row >= 10) {
				if(col < 10) {
					System.out.print("0");
				}
			}
			else {
				if(col < 10) {
					System.out.print("0");
				}
			}
			System.out.println(col);			
		}
	}
}
