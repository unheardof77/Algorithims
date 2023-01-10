package codeWars.level5;

import java.util.*;

public class directionsReduction {

    public static String[] dirReduc(String[] arr){
        List<String> newArray = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>(4);
        for(String str : arr){
            Integer hashVal = hashMap.getOrDefault(str, null);
            if(hashVal == null){
                hashMap.put(str, 1);
            }else{
                hashMap.replace(str, hashVal+1);
            }
        }
        int northAmt = hashMap.getOrDefault("NORTH", 0) - hashMap.getOrDefault("SOUTH", 0);
        int southAmt = hashMap.getOrDefault("SOUTH", 0) - hashMap.getOrDefault("NORTH", 0);
        int westAmt = hashMap.getOrDefault("WEST", 0) - hashMap.getOrDefault("EAST", 0);
        int eastAmt = hashMap.getOrDefault("EAST", 0) - hashMap.getOrDefault("WEST", 0);
        for (String s : arr) {
            if (s.equals("NORTH") && northAmt > 0) {
                newArray.add("NORTH");
                northAmt--;
            } else if (s.equals("SOUTH") && southAmt > 0) {
                newArray.add("SOUTH");
                southAmt--;
            } else if (s.equals("WEST") && westAmt > 0) {
                newArray.add("WEST");
                westAmt--;
            } else if (s.equals("EAST") && eastAmt > 0) {
                newArray.add("EAST");
                eastAmt--;
            }
        }
        String[] arrr = new String[newArray.size()];
        return newArray.toArray(arrr);
    }
}
