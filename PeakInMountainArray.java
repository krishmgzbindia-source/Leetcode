import java.util.Scanner;

public class PeakInMountainArray {
     static int PeakIndexInMountainArray(int[] arr) {
          int left = 0;
          int right = arr.length - 1;
          int mid = 0;
          while (left < right) {
               mid = (left + right) / 2;
               if (arr[mid] < arr[mid + 1])
                    left = mid + 1;
               else
                    right = mid;

          }
          return left;
     }

     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.println("enter the size of array");
          int size = s.nextInt();
          int[] arr = new int[size];
          System.out.println("enter the elements of array");
          for (int i = 0; i < size; i++) {
               arr[i] = s.nextInt();
          }

          System.out.println(PeakIndexInMountainArray(arr));
     }
}
