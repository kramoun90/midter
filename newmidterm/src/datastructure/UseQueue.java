package datastructure;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
 * Use For Each loop and while loop with Iterator to retrieve data.
 *
 *                          <>><></></><></>   Queue   <>><></></><></>
 * Autor: ALAEDDINE Kramou
 * date: 10/18/2020
 */
public class UseQueue {

    public static void main(String[] args) {

        //Add value
        Queue<String> queue = new PriorityQueue<>();
        queue.add("Italy");
        queue.add("France");
        queue.add("England");
        queue.add("Spain");
        queue.add("Germany");

        // peek Single Value
        System.out.println(queue.peek());

        // remove value
        System.out.println(queue.remove("France"));

        // retrieve value using for Each loop
        System.out.println("retrieve value using for Each loop: ");
        for (String countries : queue) {
            System.out.println(countries);
        }
        //pool Retrieve and remove the head of the queue
        System.out.println(queue.poll());

        //retrieve value using Iterator Wile loop
        Iterator value = queue.iterator();
        System.out.println("retrieve value using iterator: ");
        while (value.hasNext()) {
            System.out.println(value.next());
        }

    }
}