import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class ProductOfArrayExceptItSelf {
     static Vector<Integer> ProductOfArray(int[] arr) {
          Vector<Integer> mine = new Vector<>(Collections.nCopies(arr.length, 1));
          for (int i = 1; i < mine.size(); i++) {
               mine.set(i, mine.get(i - 1) * arr[i - 1]);
          }
          int i = arr.length;
          int suf = 1;
          while (i > 0) {
               mine.set(i - 1, mine.get(i - 1) * suf);
               suf *= arr[i - 1];
               i--;
          }
          return mine;
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

          System.out.println(ProductOfArray(arr));
     }
}
