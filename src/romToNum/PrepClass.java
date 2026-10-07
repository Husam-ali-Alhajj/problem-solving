package romToNum;

import java.util.Scanner;

public class PrepClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Conversion con = new Conversion();
        char[] romNum = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

        System.out.println("Enter any roman number: ");
        String ans = sc.nextLine().toUpperCase();

        char[] check = ans.toCharArray();
        boolean status = true;

        for (char c : check) {
            boolean found = false;
            for (char character : romNum) {
                if (c == character) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                status = false;
                break;
            }
        }
        if (!status) {
            System.out.println("The number You Entered contains an invalid input");
            System.exit(1);
        }
        System.out.println("The answer is: " + con.toNum(check));
    }
}
