import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String input = "";
		
		input=sc.next();
		int count = 0;
		if(input == "c=") {
			count++;
		}
		else if(input == "c-") {
			count++;			
		}

		else if(input == "dz=") {
			count++;
		}
		else if(input == "d-") {
			count++;
		}
		else if(input == "lj") {
			count++;
		}

		else if(input == "nj") {
			count++;
		}

		else if(input =="s=") {
			count++;
		}

		else if(input == "z=") {
			count++;
		}

		else {
			count++;
		}

		System.out.println(count);
	}

}
