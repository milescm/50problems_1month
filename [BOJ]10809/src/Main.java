import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		char b;
		int count[] = new int[26];
		for(int i = 0; i < count.length; i++) {
			count[i] = -1;
		}
		for(int i = 0; i < a.length(); i++) {
			b = a.charAt(i);
			switch(b) {
			case 'a' :
				if(count[0] == -1) {
					count[0] = i;					
				}
				break;
			case 'b' :
				if(count[1] == -1) {
					count[1] = i;					
				}
				break;
			case 'c' :
				if(count[2] == -1) {
					count[2] = i;					
				}
				break;
			case 'd' :
				if(count[3] == -1) {
					count[3] = i;					
				}
				break;
			case 'e' :
				if(count[4] == -1) {
					count[4] = i;					
				}
				break;
			case 'f' :
				if(count[5] == -1) {
					count[5] = i;					
				}
				break;
			case 'g' :
				if(count[6] == -1) {
					count[6] = i;					
				}
				break;
			case 'h' :
				if(count[7] == -1) {
					count[7] = i;					
				}
				break;
			case 'i' :
				if(count[8] == -1) {
					count[8] = i;					
				}
				break;
			case 'j' :
				if(count[9] == -1) {
					count[9] = i;
				}
				break;
			case 'k' :
				if(count[10] == -1) {
					count[10] = i;
				}
				break;
			case 'l' :
				if(count[11] == -1) {
					count[11] = i;
				}
				break;
			case 'm' :
				if(count[12] == -1) {
					count[12] = i;
				}
				break;
			case 'n' :
				if(count[13] == -1) {
					count[13] = i;
				}
				break;
			case 'o' :
				if(count[14] == -1) {
					count[14] =i;
				}
				break;
			case 'p' :
				if(count[15] == -1) {
					count[15] = i;
				}
				break;
			case 'q' :
				if(count[16] == -1) {
					count[16] = i;
				}
				break;
			case 'r' :
				if(count[17] == -1) {
					count[17] = i;
				}
				break;
			case 's' :
				if(count[18] == -1) {
					count[18] = i;
				}
				break;
			case 't' :
				if(count[19] == -1) {
					count[19] = i;
				}
				break;

			case 'u' :
				if(count[20] == -1) {
					count[20] = i;
				}
				break;

			case 'v' :
				if(count[21] == -1) {
					count[21] = i;
				}
				break;

			case 'w' :
				if(count[22] == -1) {
					count[22] = i;
				}
				break;

			case 'x' :
				if(count[23] == -1) {
					count[23] = i;
				}
				break;

			case 'y' :
				if(count[24] == -1) {
					count[24] = i;
				}
				break;

			case 'z' :
				if(count[25] == -1) {
					count[25] = i;
				}
				break;




			}
		}
		
		for(int i = 0; i < count.length; i++) {
			System.out.print(count[i] + " ");
		}
	}

}

