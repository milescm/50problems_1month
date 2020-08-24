import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		Map<String, Integer> a = new HashMap<String, Integer>(in);
		for(int i = 0; i < in; i++) {
			String input = sc.next();
			if(! a.containsKey(input)) {
				a.put(input, 1);				
			}
			else {
				a.put(input,a.get(input)+1);
			}
		}
		
		int max = 0;
		for(String z : a.keySet()) {
			max = Math.max(max, a.get(z));
		}
		
		ArrayList<String> as = new ArrayList<String>(a.keySet());
		Collections.sort(as);
		
		for(String z : as) {
			if(a.get(z) == max) {
				System.out.println(z);
				break;
			}
		}
		
		sc.close();
	}
}