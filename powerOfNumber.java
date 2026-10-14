import java.util.Scanner;;
public class powerOfNumber {
    static int pow(int num, int pow) {
    int ans = 1;
    if (pow < 0) {
    num = 1 / num;
    pow = -pow;
    }
    while (pow > 0) {
    if (pow % 2 == 1) {
    ans *= num;
    }
    num *= num;
    pow /= 2;
    }
    return ans;
    }

    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter the number ");
    int num = s.nextInt();
    System.out.println("enter the power of a number");
    int pow = s.nextInt();
    System.out.println(pow(num, pow));
    }
}
