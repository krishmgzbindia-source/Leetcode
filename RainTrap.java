import java.util.Scanner;;

public class RainTrap {

     static int Raintrap(int[] arr) {
          int left = 0;
          int right = 0;
          int leftmax = 0;
          int rightmax = 0;
          int ans = 0;

          while (left < right) {
               leftmax = Math.max(leftmax, arr[left]);
               rightmax = Math.max(rightmax, arr[right]);

               if (arr[left] < arr[right]) {
                    ans += leftmax - left;
                    left++;
               } else {
                    ans += rightmax - right;
                    right--;
               }

          }
          return ans;
     }

     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.println("enter the size of array");
          int size = s.nextInt();
          int[] arr = new int[size];
          for (int i = 0; i < size; i++) {
               arr[i] = s.nextInt();
          }

          System.out.println(Raintrap(arr));
     }

}
