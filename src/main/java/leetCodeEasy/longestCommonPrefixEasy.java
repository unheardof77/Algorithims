package leetCodeEasy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class longestCommonPrefixEasy {
    //need  to build string by taking the first index of each string
    //then adding the next index
    //of course only if it matches
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder builtStr = new StringBuilder();
        int iterations = 0;
        int charCount = 0;
        while(iterations < strs.length){
            if(strs[iterations].equals("") || strs.length == 1)return strs[iterations];
            boolean firstFor = true;
            for( int i = 0; i< strs[iterations].length(); i++){
                Pattern pattern = Pattern.compile("^"+builtStr.toString());
                Matcher matcher = pattern.matcher(strs[iterations]);
                if(matcher.find() && firstFor && builtStr.length() < strs[iterations].length()){
                    firstFor = false;
                    builtStr.append(strs[iterations].charAt(charCount));
                    charCount++;
                }

            }
            iterations++;
        }
        return builtStr.deleteCharAt(charCount -1).toString();
    }
}
