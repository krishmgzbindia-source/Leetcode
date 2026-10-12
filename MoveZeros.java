
class MoveZeros {
     static void MoveZeros(int[] arr) {
          int i = 0, j = 0;
          int temp = 0;

          while (j < arr.length) {
               if (arr[j] != 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
               }
               j++;
          }
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
          MoveZeros(arr);
          System.out.println(Arrays.toString(arr));
          s.close();
     }
}