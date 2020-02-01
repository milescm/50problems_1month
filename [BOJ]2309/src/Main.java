import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		nanjainge nan[] = new nanjainge[9];
		int sum = 0;
		int tmp = 0;
		int index = 0,index2 = 0;
		int min = 0;
		int temp = 0;
		int res[] = new int[7];
		int count = 0;
		for(int i = 0; i < nan.length; i++) {
			nan[i] = new nanjainge(sc.nextInt());
			nan[i].isnanjainge = false;
		}

		for(int i = 0; i < nan.length-1; i++) {
			min = i;
			for(int k = i+1; k < nan.length; k++) {
				if(nan[min].height > nan[k].height) {
					min = k;
				}
			}
			temp = nan[min].height;
			nan[min].height = nan[i].height;
			nan[i].height = temp;

		}





		for(int i = 0; i < nan.length; i++) {
			sum += nan[i].height;
		}
		tmp = sum;

		for(int i = 0; i < nan.length; i++) {
			sum = tmp;
			sum = sum - nan[i].height;
			for(int k = 1; k < nan.length; k++) {
				sum = sum - nan[k].height;
				if(sum == 100) {
					index = i;
					index2 = k;
					break;
				}
				else {
					sum = sum + nan[k].height;
				}

			}
		}

		for(int i = 0; i < nan.length; i++) {

			if((i == index) || (i == index2)) {
				continue;
			}
			else {
				//				nan[i].isnanjainge = true;
				res[count++] = nan[i].height;
			}
		}

		for(int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}





}

class nanjainge{
	int height;
	boolean isnanjainge;

	public nanjainge(int hei) {
		this.height = hei;
	}
}
