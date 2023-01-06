package leetCodeEasy;

import java.util.ArrayList;
import java.util.List;

public class plusOneEasy {
    //need to loop through the array starting from the end
    //add one to end digit if 9 then carry one and repeat
    // return the reverse of the array
    static public int[] plusOne(int[] digits){
        int length = digits.length +1;
        for(int i=0; i< digits.length; i++){
            if(digits[digits.length -1 -i] != 9){
                length = digits.length;
                break;
            }
        }
        int[] arr = new int[length];
        int carry = 1;
        for(int i = 0; i< digits.length; i++){
            int digit = carry == 1? digits[digits.length -1-i] + carry : digits[digits.length -1-i];
            if(digit == 10){
                arr[digits.length -1 -i] = 0;
            }else{
                carry = 0;
                arr[digits.length -1 -i] = digit;
            }
        }
        if(carry == 1) arr[0] = 1;
        return arr;
    }
}
