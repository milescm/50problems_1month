import java.util.Scanner;
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      int k[] = new int[m];
      int n[] = new int[m];
      for(int w = 0; w < m; w++) {
         k[w] = sc.nextInt();
         n[w] = sc.nextInt();
      }
      for(int l = 0; l < m; l++) {
         int a[][] = new int[k[l]+1][n[l]+1];
         for(int z = 0; z <= n[l]; z++) {
            a[0][z] = z;
         }
         for(int i = 1; i <= k[l]; i++) {
            for(int q = 0; q <= n[l]; q++) {
               for(int u = 0; u <= q; u++) {
                  a[i][q] += a[i-1][u];                  
               }
            }
         }
         System.out.println(a[k[l]][n[l]]);
      }
   }
}