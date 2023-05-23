import java.util.Stack;

public class dsaStack {
    static dsaStack stackobj = new dsaStack();
    Stack<Integer> stack=new Stack<Integer>();
    public static void main(String[] args){
        stackobj.stackJavaUtil();

        //reverse a stack using 2 temporary stacks
        stackobj.revstackwithtemp();

        //insert element at a given index
        stackobj.insertElementAtAGivenIndex(3,120);

        //find minimum number present in a stack
        stackobj.findMinValueOfStack();

    }

    public void stackJavaUtil(){
        stack.push(54);
        stack.push(4);
        stack.push(32);
        stack.push(42);
        stack.push(14);
        stack.push(12);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        int peekedItemValue=stack.peek();
        System.out.println(peekedItemValue);
        //java util stack inbuilt methods
        System.out.println(stack.contains(42));
        stack.insertElementAt(100,3);
        System.out.println(stack);
    }

    public void revstackwithtemp(){
        Stack<Integer> stack1=new Stack<Integer>();
        Stack<Integer> stack2=new Stack<Integer>();

        System.out.println("Before Reverse:::: " +stack);
        moveElement(stack, stack1);
        moveElement(stack1, stack2);
        moveElement(stack2, stack);
        System.out.println("After Reverse:::: " +stack);
    }

    public void moveElement(Stack<Integer> stack1, Stack<Integer> stack2){
        int peekedValue;
        while (!stack1.isEmpty()){
            peekedValue=stack1.peek();
            stack2.push(peekedValue);
            stack1.pop();
        }
    }

    public void insertElementAtAGivenIndex(int index, int value){
        Stack<Integer> stack1=new Stack<Integer>();
        int peekValue;
        for(int i=1;i<(stack.size()-index);i++){
            peekValue=stack.peek();
            stack1.push(peekValue);
            stack.pop();
        }
        stack.push(value);
        while(!stack1.isEmpty()){
            peekValue=stack1.peek();
            stack.push(peekValue);
            stack1.pop();
        }
        System.out.println(stack);
    }

    public void findMinValueOfStack(){
        int min=stack.peek();
        stack.pop();
        while(!stack.isEmpty()){
            if(stack.peek()<min){
                min=stack.peek();
            }
            stack.pop();
        }
        System.out.println("Minimum number of the Stack is::: "+min);
    }
}
