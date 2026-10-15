package plusOne;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOneMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PlusOneFunc pof = new PlusOneFunc();

        System.out.println("What is the number of digits you want to create the array: ");
        int ans = sc.nextInt();

        int[] digits = new int[ans];

        for (int i = 0; i < digits.length; i++){
            System.out.println("Enter the number: ");
            digits[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(pof.plusOne(digits)));
        sc.close();
    }
}
