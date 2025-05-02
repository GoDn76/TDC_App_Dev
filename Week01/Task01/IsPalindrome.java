import java.util.Scanner;

public class IsPalindrome {
    public static boolean isPalindrome(String str) {
                char[] chars = str.toCharArray();
                for (int i = 0; i < chars.length - 1; i++) {
                    if (chars[i] != chars[chars.length - 1 - i]) {
                        return false;
                    }
                }
                return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String lStr = str.toLowerCase();
        if(isPalindrome(lStr)) {
            System.out.println(str + " is a Palindrome String");
        }else{
            System.out.println(str + " is not a Palindrome String");
        }
    }
}
