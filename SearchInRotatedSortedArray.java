import java.util.Scanner;

public class SearchInRotatedSortedArray {
  static int SearchInRotatedSortedArrayF(int[] arr, int num) {
    int left = 0;
    int right = arr.length;
    int mid = -1;
    while (left < right) {
      mid = left + (right - left) / 2;
      if (arr[mid] == num)
        return mid;
      if (arr[left] <= arr[mid]) {
        if (arr[left] <= num && num < arr[mid]) {
          right = mid - 1;
        } else {
          left = mid + 1;
        }
      } else {
        if (arr[mid + 1] <= num && num < arr[right]) {
          left = mid + 1;
        } else {
          right = mid - 1;
        }
      }
    }

    return mid;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the size of array ");
    int size = s.nextInt();
    int[] arr = new int[size];
    System.out.println("enter the elements of arrays");
    for (int i = 0; i < size; i++) {
      arr[i] = s.nextInt();
    }
    System.out.println("enter the targeted number");
    int num = s.nextInt();
    System.out.println(SearchInRotatedSortedArray(arr, num));

  }

}
