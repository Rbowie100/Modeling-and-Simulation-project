

public class server {

    public class Node {
        Node next;
        customer customerhold;

        Node(customer value) {
            customerhold = value;
            next = null;
        }
    }

    Node head;
    Node tail;

    public void QueueAdd(customer value) {
        if (head == null) {
            
            head = new Node(value);
            head.customerhold.setCheckout(true);
        } else {
            Node run = head;
            if (run.next != null) {
                run = run.next;
            }
            run.next = new Node(value);
            run.next.customerhold.setCheckout(true);

        }
    }

    public void Queueremove() {
        if (head.next != null) {
            head.customerhold.setLeft(true);
            head.customerhold.setCheckout(false);
            head = head.next;
        } else {
            head.customerhold.setLeft(true);
            head.customerhold.setCheckout(false);
            head = null;
        }

    }
}
