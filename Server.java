

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
            head.customerhold.setShopping(false);
        } else {
            Node run = head;
            if (run.next != null) {
                run = run.next;
            }
            run.next = new Node(value);
            run.next.customerhold.setCheckout(true);
            run.next.customerhold.setShopping(false);

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

    public int Queuecheck(){
        if(head==null){
            return 0;
        }

        else{
            int value=1;
            Node run = head;
            if (run.next != null) {
                run = run.next;
                value+=1;
            }
            return value;

        }
    }

    public customer top(){
        return head.customerhold;
    }
    public boolean empty(){
        if (head==null){
            return true;
        }
        else{
            return false;
        }
    }
}
