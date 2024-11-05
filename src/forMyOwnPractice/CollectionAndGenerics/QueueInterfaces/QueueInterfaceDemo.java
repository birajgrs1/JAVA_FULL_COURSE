package forMyOwnPractice.CollectionAndGenerics.QueueInterfaces;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {
    public static void main(String[] args) {
        /*
        Queue<Integer> queue = new LinkedList<Integer>();

        //Adding
        queue.add(10);
        queue.offer(20); //another adding method
        queue.offer(30);
        queue.offer(40);
        queue.add(50);

//        for(Integer i : queue){
//            System.out.println( i);
//        }
        System.out.println(queue);

        //Displaying the head of the queue
        System.out.println(queue.peek());

        //Removing elements from the queue
        if(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        System.out.println(queue);


         */

        Deque<String> dq = new ArrayDeque<>();

        //Adding
        dq.offer("a");
        dq.offer("b");
        dq.offer("c");
        dq.add("d");
        dq.offerLast("e");

        System.out.println(dq);
        dq.offerFirst("f");
        System.out.println(dq);

        //Removing
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);

        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);


    }
}
