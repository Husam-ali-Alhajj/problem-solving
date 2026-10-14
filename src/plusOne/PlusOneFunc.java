package plusOne;

public class PlusOneFunc {
    public int[] plusOne(int[] digits) {
        int count = digits.length;
        int last = digits[digits.length - 1];

        if (last < 9){
            digits[digits.length - 1] += 1;

        }else if (last == 9){
            for (int i = count - 1; i >= 0; i--){
                if (digits[i] != 9){
                    continue;
                }else {
                    int[] arr = new int[count + 1];
                    arr[0] = 1;
                    for (int j = 1; j < arr.length; j++){
                        arr[j] = 0;
                    }
                    return arr;
                }
            }
            digits[digits.length - 2] += 1;
            digits[digits.length - 1] = 0;
        }


        return digits;
    }
}
