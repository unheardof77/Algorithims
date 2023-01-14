package leetCodeMedium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringToIntAtoi {

    public static int myAtoi(String s){
        StringBuilder num = new StringBuilder();
        boolean negative = false;
        boolean positive = false;
        for(int i =0; i< s.length(); i++){
            char compare = s.charAt(i);
            Pattern pattern = Pattern.compile("[0-9]");
            Matcher matcher = pattern.matcher(String.valueOf(compare));
            if(positive && compare == '+' || negative && compare == '-') {
                break;
            }else if(negative && positive){
                return 0;
            }else if(matcher.find()) {
                num.append(compare);
            }else if(compare == '-') {
                if(num.length()> 0)break;
                negative = true;
            }else if(compare == '+'){
                if(num.length()> 0)break;
                positive = true;
            }else if (compare != ' ' && num.length() >= 0 || !matcher.find() && num.length() >0 || positive && !matcher.find()){
                break;
            }
        }
        String numString = num.toString();
        long total = 0;
        long multiply = 1;
        for(int i=0; i< numString.length();i++){
            char number = numString.charAt(numString.length()-1-i);
            if( numString.charAt(0) != '0' && numString.length() > 10 && !negative) return Integer.MAX_VALUE;
            if( numString.charAt(0) != '0' && numString.length() > 10) return Integer.MIN_VALUE;
            switch (number) {
                case '0' -> total = total + (long)0 * multiply;
                case '1' -> total = total + multiply;
                case '2' -> total = total + (long)2 * multiply;
                case '3' -> total = total + (long)3 * multiply;
                case '4' -> total = total + (long)4 * multiply;
                case '5' -> total = total + (long)5 * multiply;
                case '6' -> total = total + (long)6 * multiply;
                case '7' -> total = total + (long)7 * multiply;
                case '8' -> total = total + (long)8 * multiply;
                case '9' -> total = total + (long)9 * multiply;
            }
            if(total >= Integer.MAX_VALUE && !negative) return Integer.MAX_VALUE;
            if((total * -1) <= Integer.MIN_VALUE && negative) return Integer.MIN_VALUE;
            multiply = multiply * (long)10;
        }
        if(negative) return (int) total * -1;
        return (int) total;
    }
}
