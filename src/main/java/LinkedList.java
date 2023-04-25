


public class LinkedList<T> {
    private Node head;

    public LinkedList() {
        head = null;
    }


    public class Node {
        public T data;
        public Node next;

        public Node(T data) {
            this.data = data;
            next = null;
        }
    }


    public void add(T data) {
        Node newNode = new Node(data);
        Node currentNode = head;
        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }

            currentNode.next = newNode;
        }
    }

    public void remove(T data) {
        Node currentNode = head;
        Node previousNode = null;

        while (currentNode.next != null) {

            if (currentNode.data == data) {
                if (currentNode == head) {
                    head = currentNode.next;
                } else {
                    previousNode.next = currentNode.next;
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }
    public void print(){
        Node currentNode=head;
        if(head!=null){
            System.out.print(head.data+" ");
        }

        while(currentNode.next!=null){
            currentNode=currentNode.next;
            System.out.print(currentNode.data+" ");
        }
    }
}
