import java.util.Scanner;

public class containerMostWater {
     static  int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxvol = 0;
        while(left  <  right){
            int ht = Math.min(height[right] , height[left]);
            int wt = right - left;
            int vol = ht * wt;
            maxvol = Math.max(vol , maxvol);

           if (height[left] < height[right]) {
               left++;
               } else {
                   right--;
               }
          }

        return maxvol;
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
          System.out.println(maxArea(arr));
    }
}
