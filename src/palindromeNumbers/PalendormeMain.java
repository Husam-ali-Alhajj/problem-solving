package palindromeNumbers;

import java.util.Scanner;

public class PalendormeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PalindromeFunction pf = new PalindromeFunction();

        System.out.println("Enter The number you want to check: ");
        int x = sc.nextInt();

        System.out.println(pf.isisPalindrome(x));
    }
}
