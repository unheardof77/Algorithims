package codeWars.level5;

public class rgbToHexConversion {
    //need to divide r by 16 store the quotient and remaninder
    //if remainder above 9 then add corresponding letter to string else the remainder
    //repeat till we get 0;
    public static String whatAppend(int checked){
        StringBuilder built = new StringBuilder();
        if(checked >= 255){
            return "FF";
        }else if(checked <= 0){
            return "00";
        }
        while(built.length() < 2) {
            int remainder = checked % 16;
            checked = checked / 16;
            switch (remainder) {
                case 10 -> built.append('A');
                case 11 -> built.append('B');
                case 12 -> built.append('C');
                case 13 -> built.append('D');
                case 14 -> built.append('E');
                case 15 -> built.append('F');
                default -> built.append(remainder);
            }
        }
        return built.reverse().toString();
    }

    public static String rgb(int r, int g, int b){
        return whatAppend(r) + whatAppend(g) + whatAppend(b);
    }
}
