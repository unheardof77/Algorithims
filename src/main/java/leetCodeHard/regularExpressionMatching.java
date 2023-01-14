package leetCodeHard;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpressionMatching {
    public boolean isMatch(String s, String p){
        if(s == null || p == null)return false;

        for(int i =0; i< p.length(); i++){
            if(p.charAt(i) == '*'){

            }else if(p.charAt(i) == '.'){

            }else{

            }
        }
        return true;
    }
}
