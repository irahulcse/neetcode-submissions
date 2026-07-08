class MinStack {

    private final Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);

    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {
        Stack<Integer> temp = new Stack<>();
        int mini = stack.peek();

        while (!stack.empty()) {
            mini = Math.min(mini, stack.peek());
            temp.push(stack.pop());
        }
        while (!temp.empty()) {
            stack.push(temp.pop());
        }

        return mini;

    }
}
