package sample;

import java.util.logging.Logger;

import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;

public class CircularLinkedLIst {
    private Pits head = null;
    private Pits tail = null;

    public void addStonesToPit(int value) {
        Pits newPit = new Pits(value);

        if (head == null) {
            head = newPit;
        } else {
            tail.nextPits = newPit;
        }

        tail = newPit;
        tail.nextPits = head;
    }

    private CircularLinkedLIst createCircle() {
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
            if (currentPit.value == valueToDelete) {
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
