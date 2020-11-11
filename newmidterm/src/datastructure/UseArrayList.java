package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {
    /**
     * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
     * Use For Each loop and while loop with Iterator to retrieve data.
     * Store all the sorted data into one of the databases.
     *
     *                               <>><></></><></>   Array List   <>><></></><></>
     *
     * Autor: ALAEDDINE Kramou
     * date: 10/18/2020
     */

    public static void main(String[] args) {

        //Add value
        ArrayList<String>Priority = new ArrayList<String>();
        Priority.add("Messi");
        Priority.add("Ronaldo");
        Priority.add("Dybala");
        Priority.add("Aguero");

        // retrieve Single Value
        System.out.println(Priority.get(2));
        // remove value
        System.out.println(Priority.remove("Aguero"));
        // retrieve value using for Each loop
        System.out.println("retrieve value using for Each loop: ");
        for (String Players : Priority) {
            System.out.println(Players);
        }
        //retrieve value using Iterator Wile loop
        Iterator value = Priority.iterator();
        System.out.println("retrieve value using iterator: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }


    }
}
