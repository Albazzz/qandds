public class Stack {
    private Node top;
    private int leght;
    public Stack() {
        this.top = null;
        this.leght = 0;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.setNext(top);
        top = newNode;
        leght++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("rong");
            return -1;
        }
        int poppedData = top.getData();
        top = top.getNext();
        leght--;
        return poppedData;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("rong");
            return -1;
        }
        return top.getData();
    }

    public int getLeght() {
        return leght;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(0);
        stack.push(5);
        stack.push(4);
        System.out.println("do dai " + stack.getLeght());
        System.out.println("pop" + stack.pop());
        System.out.println("do dai " + stack.getLeght());
    }
}
