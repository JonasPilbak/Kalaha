package sample;

public class LinkedList {
    Pits last;

    public LinkedList() {
        last = null;

    }

    public void creatList() {
        Pits first = new Pits(12);
        Pits second = new Pits(6);
        Pits third = new Pits(6);
        Pits fourth = new Pits(6);
        Pits fifth = new Pits(6);
        Pits sixth = new Pits(6);
        Pits seventh = new Pits(6);
        Pits eight = new Pits(6);
        Pits ninth = new Pits(6);
        Pits tenth = new Pits(6);
        Pits eleventh = new Pits(6);
        Pits twelfth = new Pits(6);



        // Pits Current = new Pits(0);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eight;
        eight.next = ninth;
        ninth.next = tenth;
        tenth.next = eleventh;
        eleventh.next = twelfth;
        twelfth.next = fifth;
        last = twelfth;
    }

    public void display() {
        if (last == null) {
            return;
        }
        Pits first = last.next;

        while (first != last) {

            System.out.println(first.data + " ");

            first = first.next;
        }
        System.out.println(first.data);
    }

    public void addStones() {


        Pits first = new Pits(12);
        Pits second = new Pits(6);
        Pits third = new Pits(6);
        Pits fourth = new Pits(6);
        Pits fifth = new Pits(6);
        Pits sixth = new Pits(6);
        Pits seventh = new Pits(6);
        Pits eight = new Pits(6);
        Pits ninth = new Pits(6);
        Pits tenth = new Pits(6);
        Pits eleventh = new Pits(6);
        Pits twelfth = new Pits(6);



       // Pits Current = new Pits(0);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eight;
        eight.next = ninth;
        ninth.next = tenth;
        tenth.next = eleventh;
        eleventh.next = twelfth;
        twelfth.next = fifth;
        last = twelfth;



        first.data--;
        second.data = second.data + 1;
        System.out.println(first.data);
        System.out.println(second.data);


        for (int i = 0; i < first.data; i++) {


        }










/*

            System.out.println(first.data);

            Pits second = first.next;
            System.out.println(second.data);
            Pits third = second.next;
            System.out.println(third.data);
            Pits fourth = third.next;
            System.out.println(fourth.data);
            Pits fifth = fourth.next;
            System.out.println(fifth.data);

                        first.next.data++;
            first.data--;
            System.out.println(second.data);
            System.out.println(third.data);
            System.out.println(fourth.data);
            System.out.println(fifth.data);

        if (first.data == 0 && first.next != last.next )
        {

        }

 */
    }





}



    
