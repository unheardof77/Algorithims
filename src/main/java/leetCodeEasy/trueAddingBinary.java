package leetCodeEasy;

public class trueAddingBinary {
//this is adding binary without converting it to a number first
    //need to iterate from the end of both strings comparing wether it is a 1 and 1, 1 and 0, or 0 and 0.
    //1 and 1 carry one to next spot
    //1 and 0 = 1 in that spot
    //0 and 0 = 0 in that spot
    public static String addBinary(String a, String b){
        String larger;
        String smaller;
        if(a.length()> b.length()){
            larger = a;
            smaller= b;
        }else{
            larger = b;
            smaller = a;
        }
        StringBuilder builtString = new StringBuilder();
        for(int i=smaller.length(); i< larger.length();i++){
            builtString.append('0');
        }
        String evenString = builtString.append(smaller).toString();
        StringBuilder finalString = new StringBuilder();
        int iterations = 0;
        int length = evenString.length();
        char carry ='0';
        while(iterations < length){
            int position = length - iterations -1;
            char largerChar = larger.charAt(position);
            char evenChar = evenString.charAt(position);
            if(carry == '1'){
                if(largerChar == '0' && evenChar == '0'){
                    carry = '0';
                    finalString.append('1');
                }else if(largerChar == '0' && evenChar == '1' || largerChar == '1' && evenChar == '0'){
                    finalString.append(0);
                }else{
                    finalString.append('1');
                }
            }else{
                if(largerChar == '0' && evenChar == '0'){
                    finalString.append('0');
                }else if(largerChar == '0' && evenChar == '1' || largerChar == '1' && evenChar == '0'){
                    finalString.append('1');
                }else{
                    carry = '1';
                    finalString.append('0');
                }
            }
            iterations++;
        }
        if(carry == '1')finalString.append('1');
        return finalString.reverse().toString();
    }
}
