package sample;

import javafx.scene.Node;

import java.util.logging.Logger;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class CircularLinkedLIst {
    public Pits head = null;
    public Pits tail = null;

    public void addStonesToPit(int data) {
        Pits newPit = new Pits(data);

        if (head == null) {
            head = newPit;
            tail=newPit;
            newPit.next = head;
        } else {
            tail.next = newPit;
            tail = newPit;
            tail.next = head;
        }

    }

    public CircularLinkedLIst createCircle() {
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

        return circleList;
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

        if(head!= null){
            do{
                currentPit = currentPit.next;
            }while(currentPit != head);
        }
    }

    public void show()
    {
        Pits pits = head;

        while (pits.next != head)
        {
            System.out.println(pits.data);
            pits = pits.next;
        }
        System.out.println(pits.data);
    }


}
