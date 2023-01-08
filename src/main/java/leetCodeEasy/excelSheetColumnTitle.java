package leetCodeEasy;

public class excelSheetColumnTitle {


    public static String convertToTitle(int columnNumber){
        StringBuilder built = new StringBuilder();
        boolean iterating = true;
        while(iterating){

            int remainder = (columnNumber) % 26;
            int inRange = columnNumber <= 26 && columnNumber >= 0 ? Math.max(columnNumber, remainder): remainder ;
            System.out.println(inRange);
            switch(inRange){
                case 1 -> built.append('A');
                case 2 -> built.append('B');
                case 3 -> built.append('C');
                case 4 -> built.append('D');
                case 5 -> built.append('E');
                case 6 -> built.append('F');
                case 7 -> built.append('G');
                case 8 -> built.append('H');
                case 9 -> built.append('I');
                case 10 -> built.append('J');
                case 11 -> built.append('K');
                case 12 -> built.append('L');
                case 13 -> built.append('M');
                case 14 -> built.append('N');
                case 15 -> built.append('O');
                case 16 -> built.append('P');
                case 17 -> built.append('Q');
                case 18 -> built.append('R');
                case 19 -> built.append('S');
                case 20 -> built.append('T');
                case 21 -> built.append('U');
                case 22 -> built.append('V');
                case 23 -> built.append('W');
                case 24 -> built.append('X');
                case 25 -> built.append('Y');
                case 26 -> built.append('Z');
                default -> iterating = false;
            }
            columnNumber = (columnNumber) / 26;
        }
        return built.reverse().toString();
    }
}
