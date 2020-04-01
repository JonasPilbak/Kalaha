package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.LinkedList;

public class Pits {

    @FXML
    public Button pit12;

    @FXML
    public Button pit11;

    @FXML
    public Button pit10;

    @FXML
    public Button pit9;

    @FXML
    public Button pit8;

    @FXML
    public Button pit7;

    @FXML
    public Button pit1;

    @FXML
    public Button pit2;

    @FXML
    public Button pit3;

    @FXML
    public Button pit4;

    @FXML
    public Button pit5;

    @FXML
    public Button pit6;

    int value;
    Pits nextPits;
    CircularLinkedLIst cll = new CircularLinkedLIst();

    public Pits(int value){
        this.value = value;
    }

  
    void test() {
        if(pit1.isPressed()){

        }
    }

    void playerTurn(){

        if(pit1.isPressed()) {
            //if(stonesCounter > 0){

        }

            cll.traverseList();
        }

    }


    



}
