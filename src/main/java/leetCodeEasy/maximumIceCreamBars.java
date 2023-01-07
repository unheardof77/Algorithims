package leetCodeEasy;

public class maximumIceCreamBars {
    public static int[] bubbleSort(int[] array){
        boolean sorted = false;
        while(!sorted){
            sorted = true;
            for(int i = 0; i < array.length -1; i++){
                if(array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i +1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        return array;
    }
    public static int maxIceCream(int[]costs, int coins){
        int[] sorted = bubbleSort(costs);
        int count = 0;
        int total = 0;
        for(int i=0; i < costs.length; i++){
            if(total + sorted[i] < coins){
                total += sorted[i];
                count++;
            }
        }
        return count;
    }
}
