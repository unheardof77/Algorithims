import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class validParentheses {

    public static boolean validParentheses(String parens){
        if(parens.charAt(0) == ')') return false;
        String[] arrayOfChar = parens.split("");
        List<String> listArrayOfChar = new ArrayList<String>(Arrays.asList(arrayOfChar));
        for(int i = 0; i< listArrayOfChar.size(); i++){
            String firstCompare = listArrayOfChar.get(i);
            boolean firstI = true;
            for(int j = 0; j< listArrayOfChar.size(); j++){
                String secondCompare = listArrayOfChar.get(j);
                if(firstCompare.equals("(") && secondCompare.equals(")") && firstI){
                    listArrayOfChar.remove("(");
                    listArrayOfChar.remove(")");
                    firstI = false;
                }
            }
        }
        System.out.println(listArrayOfChar.toString());
        if(listArrayOfChar.contains("(") || listArrayOfChar.contains(")")){
            return false;
        }
        while(listArrayOfChar.contains("(") || listArrayOfChar.contains(")")){
        }
        return true;
    }

}
