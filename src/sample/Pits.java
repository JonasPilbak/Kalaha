package sample;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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

    @FXML
    private TextField tfPit7;

    @FXML
    private TextField tfPit8;

    @FXML
    private TextField tfPit9;

    @FXML
    private TextField tfPit10;

    @FXML
    private TextField tfPit11;

    @FXML
    private TextField tfPit4;

    @FXML
    private TextField tfPit6;

    @FXML
    private TextField tfHouseP1;

    @FXML
    private TextField tfHouseP2;

    @FXML
    private TextField tfPit12;

    @FXML
    private TextField tfPit5;

    @FXML
    private TextField tfPit3;

    @FXML
    private TextField tfPit2;

    @FXML
    private TextField tfPit1;




    int value = 0;
    Pits nextPits;
    CircularLinkedLIst cll = new CircularLinkedLIst();

    public Pits(int value){
        this.value = value;
    }


    //Used to test back and forth
    void test() {

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

    void playerTurn(){

        if(pit1.isPressed()) {
            //if(stonesCounter > 0){

        }

            cll.traverseList();
        }

    }

