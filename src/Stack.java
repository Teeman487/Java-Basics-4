public class Stack {
    private int[] array;
    private int stackTop;

    public Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
    }
    public boolean push(int element) {  // is changing the state of the Stack object // and you cant allow multiple threads to change the cuurent state in such a way bcus if you allow multiple threads to have access to functions that keep changing your state then you will run into incosistency soon

            if (isFull()) return false;  // if  Stack isFull
            ++ stackTop;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            array[stackTop] = element;  // array[0] = 1  // collecting element or variable into array collection // stackTop will be our first index
            return true;
        }
    public int pop() { // is changing the state of the current object
            if (isEmpty()) return Integer.MIN_VALUE;
            int obj =array[stackTop];  // array[-1]
            array[stackTop] = Integer.MIN_VALUE; // array[-1] = -2147483648
            try {
                Thread.sleep(1000);
            } catch (Exception e) {}
            stackTop --; // stackTop = stackTop - 1 = -1 -1 =-2
            return obj;  // array[-2]
        }

    public boolean isEmpty() {
        return stackTop < 0 ; // return true
    }

    public boolean isFull() { // not changing or updating the current state
     return stackTop >= array.length -1; //       array.length=capacity=1  // -1>=-2   true
    }

}
