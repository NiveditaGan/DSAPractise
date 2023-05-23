import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;

public class dsaQueues {
    static dsaQueues queue = new dsaQueues();
    static int rear = -1;
    public static void main(String[] args){
        // enque deque on Array Queue
        int a[] = new int[6];
        queue.enqueueArray(a, 3);
        queue.enqueueArray(a, 5);
        queue.enqueueArray(a, 8);
        queue.enqueueArray(a, 21);
        queue.enqueueArray(a, 42);
        queue.enqueueArray(a, 7);
        System.out.println(Arrays.toString(a));
        int removedElement = queue.dequeueArray(a);
        System.out.println("Element removed for Queue Array::: "+removedElement);
        System.out.println(Arrays.toString(a));

        //enque deque in stack queue
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();

        queue.enqueStack(stack1, 56);
        queue.enqueStack(stack1, 6);
        queue.enqueStack(stack1, 61);
        queue.enqueStack(stack1, 5);
        queue.enqueStack(stack1, 12);
        queue.enqueStack(stack1, 89);
        queue.enqueStack(stack1, 21);
        System.out.println(stack1);
        System.out.println("Element removed for Queue Stack::: "+queue.dequeStack(stack1, stack2));
        System.out.println(stack1);

        //java inbuilt arraydequeue method ---> https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(5);
        arrayDeque.add(15);
        arrayDeque.add(50);
        arrayDeque.add(3);
        arrayDeque.add(34);
        arrayDeque.add(21);
        arrayDeque.add(7);
        System.out.println(arrayDeque);
        arrayDeque.remove();
        System.out.println(arrayDeque);
        arrayDeque.remove(50);
        System.out.println(arrayDeque);
        System.out.println("Peeked Value is :::"+arrayDeque.peek());

        //reverse a queue
        queue.revQueue(arrayDeque);
        System.out.println("Reversed Queue is :::"+arrayDeque);

        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.add(5);
        priorityQueue.add(15);
        priorityQueue.add(50);
        priorityQueue.add(3);
        priorityQueue.add(34);
        priorityQueue.add(21);
        priorityQueue.add(7);

        System.out.println(priorityQueue);
        System.out.println(priorityQueue);

        priorityQueue.remove();
        priorityQueue.remove();
        System.out.println(priorityQueue);
    }

    public void enqueueArray(int a[], int value){
        rear++;
        a[rear]=value;
    }

    public int dequeueArray(int a[]){
        int element = a[0];
        for(int i=0;i<rear;i++){
            a[i]=a[i+1];
        }
        rear --;
        return element;
    }

    public void enqueStack(Stack<Integer> stack, int value){
        stack.push(value);
    }

    public int dequeStack(Stack<Integer> stack1, Stack<Integer> stack2){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int removedelement = stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }

        return removedelement;
    }

    public void revQueue(ArrayDeque queue){
        Stack<Integer> stack1=new Stack<Integer>();
        while(!queue.isEmpty()){
            stack1.push((Integer) queue.remove());
        }
        while(!stack1.isEmpty()){
            queue.add(stack1.pop());
        }
    }

    public void priorityQueue(){

    }
}
