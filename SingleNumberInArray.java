import java.util.Scanner;

public class SingleNumberInArray {
     static int Single(int[] arr) {
          int i = 0;
          int j = arr.length;
          int num = 0;
          while (i < j) {
               num = arr[i] ^ num;
               i++;
          }
          return num;
     }

     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.println("enter the size of array ");
          int size = s.nextInt();
          int[] arr = new int[size];
          System.out.println("enter the element of array");
          for (int i = 0; i < size; i++) {
               arr[i] = s.nextInt();
          }

          System.out.println(Single(arr));
     }

}
