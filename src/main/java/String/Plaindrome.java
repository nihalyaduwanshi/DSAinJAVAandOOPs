package String;

import java.util.Scanner;

public class Plaindrome {
    public static boolean isPalndrome(String str) {
        int i, j;
        for (i = 0, j = str.length() - 1; i < j; i++, j--) {
                char left=str.charAt(i);
                char right=str.charAt(j);
                if(left!=right)
                    break;
        }
        if(i<j)
            return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalndrome("malayalam"));
        System.out.println(isPalndrome("niha"));
    }
}
