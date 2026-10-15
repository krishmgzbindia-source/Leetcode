import java.util.Scanner;

public class stockBuySell {

     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.println("enter the size of array");
          int size = s.nextInt();
          int[] arr = new int[size];
          System.out.println("enter the element ");
          for (int i = 0; i < size; i++) {
               arr[i] = s.nextInt();
          }

          int leftmin = arr[0];
          int maxprofit = 0;
          int i = 0;
          while (i < size) {
               if (leftmin < arr[i]) {
                    maxprofit = Math.max(maxprofit, arr[i] - leftmin);
               }

               leftmin = Math.min(leftmin, arr[i]);

               i++;
          }

          System.out.println(maxprofit);
     }
}
