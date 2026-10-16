import java.util.Scanner;

public class Subsequences {

    static boolean Subsequence(String str1, String str2) {
        int i = 0;
        int j = 0;

        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j))
                j++;

            i++;
        }
        return j == str2.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter first string ");
        String str1 = s.next();
        System.out.println("enter second string");
        String str2 = s.next();

        System.out.println(Subsequence(str1, str2));
    }

}
