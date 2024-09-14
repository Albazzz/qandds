public class Queue {
    private Node trc;
    private Node sau;
    private int lenght;

    public Queue() {
        this.trc = null;
        this.sau = null;
        this.lenght = 0;
    }

    public boolean isempty() {
        return lenght == 0;
    }

    public Node getTrc() {
        return trc;
    }

    public void setTrc(Node trc) {
        this.trc = trc;
    }

    public Node getSau() {
        return sau;
    }

    public void setSau(Node sau) {
        this.sau = sau;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void enqueue(int data) {
        Node newnode = new Node(data);
        if (isempty()) {
            trc = newnode;
        } else {
            sau.setNext(newnode);
        }
        sau = newnode;
        lenght++;
    }

    public int dequeue() {
        if (isempty()) {
            System.out.println("rong");
            return -1;
        }
        int data = trc.getData();
        trc = trc.getNext();
        lenght--;
        if (lenght == 0) {
            sau = null;
        }
        return data;
    }

    public static void main(String[] args) {
        Queue myq = new Queue();
        myq.enqueue(3);
        myq.enqueue(1);
        myq.enqueue(2);
        myq.enqueue(5);
        myq.enqueue(7);
        System.out.println("do dai cua queue la " + myq.getLenght());
        System.out.println(myq.dequeue());
        System.out.println("do dai cua queue la " + myq.getLenght());
    }
}
