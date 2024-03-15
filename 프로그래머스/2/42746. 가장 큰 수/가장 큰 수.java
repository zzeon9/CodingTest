import java.util.*;
import java.io.*;

class Solution {
    public String solution(int[] numbers) {
        String strNum[] = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            strNum[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strNum, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        
        if(strNum[0].equals("0"))
            return "0";
        
        
        return String.join("", strNum);
    }
}