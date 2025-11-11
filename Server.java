

public class server {
    int number=0;

    public class Node {
        public Node next;
        public customer customerhold;

        Node(customer value) {
            customerhold = value;
            next = null;
        }
    }

   public Node head;
   public Node tail;

    public void QueueAdd(customer value) {
        number++;
        if (head == null) {

            head = new Node(value);
            head.customerhold.setCheckout(true);
            head.customerhold.setShopping(false);
        }
        else {
            Node run = head;
            while (run.next != null) {
                run = run.next;
            }
            run.next = new Node(value);
            run.next.customerhold.setCheckout(true);
            run.next.customerhold.setShopping(false);

        }
    }

    public void Queueremove() {
        number--;
        this.head.customerhold.setLeft(true);
        this.head.customerhold.setCheckout(false);

        if (this.head.next == null) {
           this.head = null;
        }
        else {

            this.head = head.next;


        }
    }

        public int Queuecheck () {
            if (head == null) {
                return 0;
            } else {
                int value = 1;
                Node run = head;
                if (run.next != null) {
                    run = run.next;
                    value += 1;
                }
                return value;

            }
        }

        public customer top () {
            return head.customerhold;
        }
        public boolean isempty () {
            if (head == null) {
                return true;
            } else {
                return false;
            }
        }
    }
