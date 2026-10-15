package plusOne;

public class PlusOneFunc {
    public int[] plusOne(int[] digits) {
        int count = digits.length;
        for (int i = count - 1; i >= 0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] arr = new int[count + 1];
        arr[0] = 1;
        return arr;
    }
}
