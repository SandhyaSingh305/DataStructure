/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 *
 * Implement the MinStack class:
 *
 * MinStack() initializes the stack object.
 * void push(int val) pushes the element val onto the stack.
 * void pop() removes the element on the top of the stack.
 * int top() gets the top element of the stack.
 * int getMin() retrieves the minimum element in the stack.
 * You must implement a solution with O(1) time complexity for each function.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["MinStack","push","push","push","getMin","pop","top","getMin"]
 * [[],[-2],[0],[-3],[],[],[],[]]
 *
 * Output
 * [null,null,null,null,-3,null,0,-2]
 */
class MinStack {

    int[] stack = new int[10000];
    int i = 0;

    public MinStack() {

    }

    public void push(int val) {
        stack[i] = val;
        i++;
        //   System.out.println("Push : "+i+Arrays.toString(stack));

    }

    public void pop() {
        i--;
        stack[i] = 0;

        //    System.out.println("Pop : "+i+" "+Arrays.toString(stack));

    }

    public int top() {
        return stack[i - 1];
    }

    public int getMin() {
        int min = stack[0];
        for (int j = 0; j < i; j++) {
            // System.out.println(min);
            min = min < stack[j] ? min : stack[j];
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */