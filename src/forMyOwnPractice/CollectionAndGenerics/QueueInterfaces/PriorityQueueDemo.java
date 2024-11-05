package forMyOwnPractice.CollectionAndGenerics.QueueInterfaces;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(40);
        priorityQueue.add(20);
        priorityQueue.add(50);
        priorityQueue.add(10);
        priorityQueue.add(30);

        System.out.println("Priority Queue after adding elements: " + priorityQueue);

        System.out.println("Peek (Head Element): " + priorityQueue.peek());

        System.out.println("Poll (Removing Head Element): " + priorityQueue.poll());
        System.out.println("Priority Queue after polling: " + priorityQueue);

        boolean removed = priorityQueue.remove(30);
        System.out.println("Is 30 removed? " + removed);
        System.out.println("Priority Queue after removing 30: " + priorityQueue);

        boolean contains20 = priorityQueue.contains(20);
        System.out.println("Does the queue contain 20? " + contains20);

        int size = priorityQueue.size();
        System.out.println("Size of the priority queue: " + size);

        priorityQueue.clear();
        System.out.println("Priority Queue after clearing: " + priorityQueue);
    }
}
