//Interview question of Microsoft
//Using two stacks implemented on for normal value holding and another for minimum value holding
//Time and Space Complexity =O(1)
class MinStack {
    Stack<Integer> s;
    Stack<Integer> minStack;
    int min;
    public MinStack() {
        s = new Stack<>();
        minStack = new Stack<>();
        min = Integer.MAX_VALUE;
        minStack.push(min); 
    }
    
    public void push(int val) {
        min = Math.min(min,val);
        s.push(val);
        minStack.push(min);
    }
    
    public void pop() {
        s.pop();
        minStack.pop();
        min = minStack.peek();
    }
    
    public int top() {
        return s.peek();
        
    }
    
    public int getMin() {
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