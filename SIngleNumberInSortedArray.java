import java.util.Scanner;

public class SIngleNumberInSortedArray {
     static int SingleInsortedArray(int[] arr) {
          int start = 0;
          int end = arr.length - 1;

          while (start < end) {
               int mid = start + (end - start) / 2;

               if (mid % 2 == 0) {
                    if (arr[mid] == arr[mid + 1])
                         start = mid + 2;
                    else
                         end = mid;
               } else {
                    if (arr[mid] == arr[mid - 1])
                         start = mid + 1;
                    else
                         end = mid;
               }
          }

          return arr[start];
     }

     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.println("enter the size of array");
          int size = s.nextInt();
          int[] arr = new int[size];
          System.out.println("enter the element of array");
          for (int i = 0; i < size; i++) {
               arr[i] = s.nextInt();
          }

          System.out.println(SingleInsortedArray(arr));
     }
}
