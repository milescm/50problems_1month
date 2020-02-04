import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int [10];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}      
		sc.close();
		for(int i = 0; i < 10; i++) {
			map.put(a[i]%42, 0);
		}
		System.out.println(map.size());
	}
}