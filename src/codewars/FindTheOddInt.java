package codewars;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindTheOddInt {
    public static int findIt(int[] a) {

        Set<Integer> intList = new HashSet<Integer>();
        for(Integer x : a){
            intList.add(x);
        }
        Map<Integer, Integer> mapForCount = new HashMap<>();
        for(Integer number: intList){
            mapForCount.put(number, 0);
        }
        for(Integer x : a){
            if (mapForCount.containsKey(x)){
                int newCount = mapForCount.get(x) + 1;
                mapForCount.put(x, newCount) ;
            }
        }

        int odd = 0;
        for (Map.Entry<Integer, Integer> entry: mapForCount.entrySet()){
            if(entry.getValue() % 2 == 1){
                odd = entry.getKey();
                break;
            }
        }

        return odd;
    }
}
