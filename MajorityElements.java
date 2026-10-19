import java.util.Scanner;

public class MajorityElements {
    static int MajorityElement(int[] arr) {
        int num = arr[0];
        int freq = 1;

        for (int i = 1; i < arr.length; i++) {
            if (freq == 0) {
                num = arr[i];
                freq = 1;
            } else if (num == arr[i]) {
                freq++;
            } else {
                freq--;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int size = s.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        System.out.println(MajorityElement(arr));

    }
}
