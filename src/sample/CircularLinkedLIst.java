package sample;

import java.util.logging.Logger;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class CircularLinkedLIst {
    public Pits head = null;
    public Pits tail = null;

    public void addStonesToPit(int value) {
        Pits newPit = new Pits(value);

        if (head == null) {
            head = newPit;
            tail=newPit;
            newPit.nextPits = head;
        } else {
            tail.nextPits = newPit;
            tail = newPit;
            tail.nextPits = head;
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


    public void deleteStonesFromPit(int valueToDelete) {
        Pits currentPit = head;

        if (head != null) {
            if (valueToDelete == currentPit.value) {
                head = head.nextPits;
                tail.nextPits = head;
            } else {
                do {
                    Pits nextPits = currentPit.nextPits;
                    if (nextPits.value == valueToDelete) {
                        currentPit.nextPits = nextPits.nextPits;
                        break;
                    }
                    currentPit = currentPit.nextPits;
                } while (currentPit != head);
            }
        }
    }

    public void traverseList() {
        Pits currentPit = head;

        if(head!= null){
            do{
                currentPit = currentPit.nextPits;
            }while(currentPit != head);
        }
    }


}
