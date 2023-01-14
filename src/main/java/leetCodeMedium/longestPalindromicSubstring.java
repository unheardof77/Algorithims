package leetCodeMedium;

import java.util.ArrayList;
import java.util.List;

public class longestPalindromicSubstring {

    public static String longestPalindrome(String s){
        String longestPal = "";
        if(s.length()==1)return s;
        for(int i =0; i< s.length(); i++){
            StringBuilder leftList = new StringBuilder();
            StringBuilder rightList =new StringBuilder();
            int originalI = i;
            for(int j=0; j<s.length() -i; j++){
                char leftMostCompare = s.charAt(i);
                char rightMostCompare = s.charAt(s.length()-1-j);
                if(leftMostCompare == rightMostCompare){
                    if(i != s.length()-1-j && i +1 != s.length() -1-j){
                        leftList.append(leftMostCompare);
                        rightList.append(rightMostCompare);
                        i++;
                    }else{
                        leftList.append(leftMostCompare);
                        break;
                    }
                }else if(i +1 == s.length() -1-j){
                    leftList.append(leftMostCompare);
                    rightList.append(rightMostCompare);
                    break;
                }else if(!leftList.isEmpty()){
                    i  = originalI;
                    break;
                }
            }
            leftList.append(rightList.reverse());
            longestPal = longestPal.length() > leftList.length()? longestPal: leftList.toString();
            System.out.println(longestPal);
        }
        return longestPal;
    }
}
