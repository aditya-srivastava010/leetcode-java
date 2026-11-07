class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minst = new Stack<>();

    public MinStack() {}

    public void push(int value) {
        st.push(value);
        if (minst.isEmpty() || value <= minst.peek()) {
            minst.push(value);
        } else {
            minst.push(minst.peek());
        }
    }

    public void pop() {
        st.pop();
        minst.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return minst.peek();
    }
}