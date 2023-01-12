package leetCodeMedium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class longestSubStringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s){
        int highLength =0;
        for(int j = 0; j <s.length();j++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = j; i < s.length(); i++) {
                char apChar = s.charAt(i);
                Pattern pattern = Pattern.compile(Pattern.quote(String.valueOf(apChar)));
                Matcher matcher = pattern.matcher(stringBuilder.toString());
                if (matcher.find()) break;
                stringBuilder.append(apChar);
                highLength = Math.max(highLength, stringBuilder.length());
            }
            if(highLength > s.length() - j)return highLength;
        }
        return  highLength;
    }
}
