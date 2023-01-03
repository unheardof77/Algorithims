package leetCodeEasy;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class addBinaryEasy {


    public static BigInteger convertToDecimal(String binaryString){
        BigInteger number = new BigInteger("0");
        BigInteger two = new BigInteger("2");
        for(int i=0; i< binaryString.length(); i++){
            BigInteger currentEx = two.pow(i);
            int currentBin = (binaryString.charAt(binaryString.length() -1 -i));
            if(currentBin == 1){
                number = number.add(currentEx);
            }
        }
        return number;
    }

    public static String addBinary(String a, String b){
        if(a.equals("0")&& b.equals("0")) return "0";
        BigInteger total = convertToDecimal(a).add(convertToDecimal(b));
        List<BigInteger> listOfEx = new ArrayList<>();
        BigInteger possibleEx = new BigInteger("0");
        int iterations = 0;
        BigInteger two = new BigInteger("2");
        while(possibleEx.compareTo(total) < 0){
            possibleEx = two.pow(iterations);
            if(total.compareTo(possibleEx) < 0)continue;
            listOfEx.add(possibleEx);
            iterations++;
        }
        StringBuilder finalString = new StringBuilder();
        for(int i =0; i< listOfEx.size(); i++){
            BigInteger ex = listOfEx.get(listOfEx.size()-1-i);
            if(total.compareTo(ex) > 0 || total.compareTo(ex) == 0 ){
                total = total.subtract(ex);
                finalString.append("1");
            }else{
                finalString.append("0");
            }
        }
        return finalString.toString();
    }
}
