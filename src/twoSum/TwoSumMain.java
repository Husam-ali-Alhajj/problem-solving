package twoSum;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TwoSumMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        TwoSumFunction ts = new TwoSumFunction();

        System.out.println("How many numbers you want to enter: ");
        int arr_size = sc.nextInt();
        ArrayList<Integer> num = new ArrayList<>();

        System.out.println("Enter numbers: ");
        for (int i = 0; i < arr_size; i++){
            num.add(sc.nextInt());
        }

        System.out.println("Enter the target you're looking for:");
        int target = sc.nextInt();

        if (ts.twoSum(num,target) == null){
            System.out.println("There are no numbers equal the target.");
            System.exit(1);
        }else {
            System.out.println("The answer is: " + Arrays.toString(ts.twoSum(num, target)));
        }
    }
}
