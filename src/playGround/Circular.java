package playGround;

public class Circular {
    Node first = new Node(12);
    Node second = new Node(6);
    Node third = new Node(6);
    Node fourth = new Node(6);
    Node fifth = new Node(6);

    Node last;
    Node current;

    public Circular() {
        last = null;

    }

    public void creatList() {
         first = new Node(12);
         second = new Node(6);
         third = new Node(6);
         fourth = new Node(6);
         fifth = new Node(6);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = first;

    }

    public void display() {
        if (last == null) {
            return;
        }
        Node first = last.next;

        while (first != last) {

            System.out.println(first.data + " ");

            first = first.next;
        }
        System.out.println(first.data);
    }

    public void addStones() {


        if(first.data != 0){
            int sentinel = first.data;
            first.data = 0;

            for (int i = sentinel; i > 0 ; i--) {
                second.data++;
                System.out.println("Sec " + second.data);
                third.data++;
                System.out.println("third " + third.data);
                fourth.data++;
                System.out.println("fourth " + fourth.data);
                fifth.data++;
                System.out.println("fifth " + fifth.data);
                first.data++;
                System.out.println("first " + first.data);
            }
        }
    }
}









