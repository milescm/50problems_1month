import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		int front,end,newa = 0;
		int count = 0;

		while(true) {
			if(count == 0) {
				front = a/10;
				end = a % 10;
				newa = front+end;
				if(newa<10) {
					newa = end*10 + newa%10;
					count++;	
					if(newa == a) {
						break;
					}
				}
				else {
					newa = end*10 + newa%10;
					count++;
					if(newa == a) {
						break;
					}
				}
			}
			else {
				front = newa / 10;
				end = newa % 10;
				newa = front+end;
				//newa = end*10 + newa%10;
				if(newa<10) {
					newa = end*10 + newa;
					count++;	
					if(newa == a) {
						break;
					}
				}
				else {
					newa = end*10 + newa%10;
					count++;
					if(newa == a) {
						break;
					}
				}

			}
		}
		System.out.println(count);
	}
}