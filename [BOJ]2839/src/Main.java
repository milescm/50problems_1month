import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int mok = N/5;
		int remain = N%5;
		int fivecount = 0;
		int threecount = 0;
		int count = 0;
		for(int i = 0; i < N/5+1; i++) {
			if(remain % 3 == 0) {
				fivecount = mok;
				threecount = remain / 3;
				count = fivecount+threecount;
				break;
			}
			else {
				mok--;
				if(mok < 0) {
					count = -1;
					break;
				}
				remain = remain + 5;
			}
		}
		System.out.println(count);
	}
}