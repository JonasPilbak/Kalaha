package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
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

    int value = 6;
    Pits nextPits;

    private IntegerProperty noofSeed = new SimpleIntegerProperty();
    CircularLinkedLIst cll = new CircularLinkedLIst();

    public Pits(int value){

        this.value = value;
    }


    public void buttonNames()
    {

        pit2.setText("" + value);
        pit3.setText("" + value);
        pit4.setText("" + value);
        pit5.setText("" + value);
        pit6.setText("" + value);
        pit7.setText("" + value);
        pit8.setText("" + value);
        pit9.setText("" + value);
        pit10.setText("" + value);
        pit11.setText("" + value);
        pit12.setText("" + value);
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


    




