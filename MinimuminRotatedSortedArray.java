import java.util.Scanner;

public class MinimumInRotatedSortedArray {

    static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = s.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter the elements of rotated sorted array:");
        for (int i = 0; i < size; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println("Minimum element = " + findMin(nums));
    }
}
