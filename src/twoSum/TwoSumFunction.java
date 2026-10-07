package twoSum;

import java.util.ArrayList;

public class TwoSumFunction {
    public int[] twoSum(ArrayList<Integer> num, int target){
        for (int i = 0; i < num.size(); i++){
            for (int j = i + 1; j < num.size(); j++){
                if (num.get(i) + num.get(j) == target){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
