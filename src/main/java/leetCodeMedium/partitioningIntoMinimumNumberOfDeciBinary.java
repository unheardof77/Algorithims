package leetCodeMedium;

import java.util.Objects;

public class partitioningIntoMinimumNumberOfDeciBinary {

    public static int minPartitions(String n){
        int count = 0;
        boolean stillPositive = true;
        while(stillPositive){
            stillPositive = false;
            StringBuilder subString = new StringBuilder();
            for(int i=0;i<n.length();i++){
                int sub = n.charAt(i) == '0'? 0: 1;
                if(sub ==1)stillPositive =true;
                int par = switch (n.charAt(i)) {
                    case '0' -> 0;
                    case '1' -> 1;
                    case '2' -> 2;
                    case '3' -> 3;
                    case '4' -> 4;
                    case '5' -> 5;
                    case '6' -> 6;
                    case '7' -> 7;
                    case '8' -> 8;
                    default -> 9;
                };
                subString.append(par - sub);
            }
            n = subString.toString();
            count++;
        }
        return count -1;
    }


}
