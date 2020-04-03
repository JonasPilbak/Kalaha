package sample;

public class CircularLinkedLIst {
    public Pits head = null;
    public Pits tail = null;
    private Object pit2;
    private Object pit3;
    private Object pit4;
    private Object pit5;
    private Object pit6;
    private Object pit7;
    private Object pit8;
    private Object pit9;
    private Object pit10;
    private Object pit11;
    private Object pit12;

    public void addStonesToPit(int data) {
        Pits newPit = new Pits(data);

        if (head == null) {
            head = newPit;
            tail = newPit;
            newPit.next = head;
        } else {
            tail.next = newPit;
            tail = newPit;
            tail.next = head;
        }

    }


    public void deleteStonesFromPit(int dataToDelete) {
        Pits currentPit = head;

        if (head != null) {
            if (dataToDelete == currentPit.data) {
                head = head.next;
                tail.next = head;
            } else {
                do {
                    Pits next = currentPit.next;
                    if (next.data == dataToDelete) {
                        currentPit.next = next.next;
                        break;
                    }
                    currentPit = currentPit.next;
                } while (currentPit != head);
            }
        }
    }

    public void traverseList() {
        Pits currentPit = head;

        if (head != null) {
            do {

                currentPit = currentPit.next;

            } while (currentPit != head);
        }
    }

    public void show() {
        Pits pits = head;

        while (pits.next != head) {
            System.out.println(pits.data);
            pits = pits.next;
        }
        System.out.println(pits.data);
    }

    void doCircleList() {
        CircularLinkedLIst circleList = new CircularLinkedLIst();
        circleList.addStonesToPit(6);
        circleList.addStonesToPit(6);
        circleList.addStonesToPit(6);
        circleList.addStonesToPit(6);
        circleList.addStonesToPit(6);
        circleList.addStonesToPit(6);
        circleList.addStonesToPit(6);
        circleList.addStonesToPit(6);
        circleList.addStonesToPit(6);
        circleList.addStonesToPit(6);
        circleList.addStonesToPit(6);
        circleList.addStonesToPit(6);


        Pits head = new Pits(6);
        Pits pit2 = new Pits(6);
        Pits pit3 = new Pits(6);
        Pits pit4 = new Pits(6);
        Pits pit5 = new Pits(6);
        Pits pit6 = new Pits(6);
        Pits pit7 = new Pits(6);
        Pits pit8 = new Pits(6);
        Pits pit9 = new Pits(6);
        Pits pit10 = new Pits(6);
        Pits pit11 = new Pits(6);
        Pits pit12 = new Pits(6);

        head.next = pit2;
        pit2.next = pit3;
        pit3.next = pit4;
        pit4.next = pit5;
        pit5.next = pit6;
        pit6.next = pit7;
        pit7.next = pit8;
        pit8.next = pit9;
        pit9.next = pit10;
        pit10.next = pit11;
        pit11.next = pit12;
        pit12.next = head;
    }
}