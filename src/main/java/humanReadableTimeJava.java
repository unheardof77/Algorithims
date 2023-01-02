public class humanReadableTimeJava {

    public static String makeReadable(int seconds){
        Integer convertedNum = seconds;
        if(convertedNum < 10) return "00:00:0" + convertedNum;
        if(convertedNum < 60) return "00:00:" + convertedNum;

        Integer totalMin = convertedNum / 60;
        Integer totalSeconds = convertedNum % 60;
        String whatSeconds = (totalSeconds < 10)? ":0"+totalSeconds: ":" +totalSeconds;
        if(totalMin < 60 && totalSeconds == 0){
            return (totalMin < 10) ? "00:0"+ totalMin + ":00" :  "00:" + totalMin + ":00";
        } else if(totalMin < 60) {
            return (totalMin < 10) ? "00:0"+ totalMin + whatSeconds :  "00:" + totalMin + whatSeconds;
        }
        Integer hours = totalMin / 60;
        Integer finalMin = totalMin % 60;
        String whatStyleMin = (finalMin < 10)? ":0"+finalMin: ":" + finalMin;
        if(hours < 10){
            return "0" + hours + whatStyleMin + whatSeconds;
        }else{
            return hours + whatStyleMin + whatSeconds;
        }
    }

    static public void main(String[] args){
        System.out.println(makeReadable(10));
    }
}
