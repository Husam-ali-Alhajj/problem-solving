package romToNum;

import java.util.HashMap;
import java.util.Map;

public class Conversion {
    public int toNum(char[] s){
        Map<Character, Integer> rom = new HashMap<>();
        rom.put('I', 1);
        rom.put('V', 5);
        rom.put('X', 10);
        rom.put('L', 50);
        rom.put('C', 100);
        rom.put('D', 500);
        rom.put('M', 1000);

        int x;
        int y;
        int num = 0;

        for (int i = 0; i < s.length-1; i++){
            x = rom.get(s[i]);
            y = rom.get(s[i+1]);
            if ( x < y){
                num -= x;
            }else{
                num += x;
            }
        }
        num += rom.get(s[s.length - 1]);

        return num;
    }
}
