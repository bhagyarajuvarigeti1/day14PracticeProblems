import java.util.*;

public class StacksAndQueues {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(56);
        stack.push(30);
        stack.push(70);
        System.out.println(stack);
       /** while (!stack.empty()) {
            System.out.println(stack.peek());
            System.out.println(stack.pop());
            System.out.println(stack);
        }*/
        Queue<Integer> queue = new LinkedList<>();
        queue.addAll(stack);
        System.out.println(queue);
        ArrayDeque<Integer> arr = new ArrayDeque<>();
        arr.addAll(stack);
        System.out.println(arr);
    }

}
