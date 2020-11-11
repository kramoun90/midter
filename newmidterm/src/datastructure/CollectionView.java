package datastructure;

import java.util.HashMap;
import java.util.Map;

/**
 *Map is created and inserted some data.Retrieve the Collection view of values present in map
 *
 *Autor: ALAEDDINE Kramou
 * date: 10/01/2020
 */
public class CollectionView {

public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");

        for (Map.Entry mp:map.entrySet()) {
                System.out.println("States are: "+mp.getKey()+" - "+mp.getValue());
        }


}

}
