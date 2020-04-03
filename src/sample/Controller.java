package sample;

import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Controller {
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
    public Button pit7;
    @FXML
    public Button pit8;
    @FXML
    public Button pit9;
    @FXML
    public Button pit10;
    @FXML
    public Button pit11;
    @FXML
    public Button pit12;
    @FXML
    public Button P1House;
    @FXML
    public Button P2House;

    ArrayList<Button> allThePits = new ArrayList<Button>(Arrays.asList(new Button[]{pit1, pit2, pit3, pit4, pit5, pit6, pit7, pit8, pit9, pit10, pit12, pit11, P1House, P2House}));




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

    @FXML
    public Button newGamePits;

    //Make Pop-Up
    @FXML
    public Button rulesPits;

    @FXML
    public Button closePits;

    @FXML
    private Label playerTurn;

    @FXML
    private Label p2Score;

    @FXML
    private Label p1Score;

    @FXML
    private LinkedList<Integer> list = new LinkedList<>();
    int value = 6;
    int startValue = 0;
    Stage stage;
    @FXML
    private TextField tfPit7;



    public void getTfPitPoperty() {
        String player1Score = tfHouseP1.getText();
        String player2Score = tfHouseP2.getText();

        this.p1Score.textProperty().bind((ObservableValue<? extends String>) tfHouseP1);
        this.p2Score.textProperty().bind((ObservableValue<? extends String>) tfHouseP2);

    }

    //For security reasons added @FXML , correct me if I'm wrong.
    @FXML
    public void close() {
        closePits.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                System.exit(-1);
            }
        });
    }


    void traverselLogic() {
        /**
         * Explanation for the gameMovement logic:
         * When we pick up the 12 Stones, we get 12
         * moves which we can take. Also we take all
         * the stones out of one pit, so the
         * head[pressed].data = 0;
         * thereafter, we wanna drop
         * one into the next pit.
         * This happens in the following.
         */
        Pits getHead = new Pits(6);
        Pits getPit2 = new Pits(6);
        Pits getPit3 = new Pits(6);
        Pits getPit4 = new Pits(6);
        Pits getPit5 = new Pits(6);
        Pits getPit6 = new Pits(6);
        Pits getPit7 = new Pits(6);
        Pits getPit8 = new Pits(6);
        Pits getPit9 = new Pits(6);
        Pits getPit10 = new Pits(6);
        Pits getPit11 = new Pits(6);
        Pits getPit12 = new Pits(6);

        getHead.data = 6;
        getPit2.data = 6;
        getPit3.data = 6;
        getPit4.data = 6;
        getPit5.data = 6;
        getPit6.data = 6;
        getPit7.data = 6;
        getPit8.data = 6;
        getPit9.data = 6;
        getPit10.data = 6;
        getPit11.data = 6;
        getPit12.data = 6;
        ArrayList<Pits> allPits = new ArrayList<Pits>(Arrays.asList(new Pits[]{getHead, getPit2, getPit3, getPit4, getPit5, getPit6, getPit7, getPit8, getPit9, getPit10, getPit11, getPit12}));
        /**
         * @param sentinel is supposed to be the temp storing the total amount of stones from the button
         *                 clicked :) TODO
         */
        int sentinel;

        if (getHead.data != 0) {
            int stonesInHead = getHead.data;
            int stonesIn2 = getPit2.data;
            int stonesIn3 = getPit3.data;
            int stonesIn4 = getPit4.data;
            int stonesIn5 = getPit5.data;
            int stonesIn6 = getPit6.data;
            int stonesIn7 = getPit7.data;
            int stonesIn8 = getPit8.data;
            int stonesIn9 = getPit9.data;
            int stonesIn10 = getPit10.data;
            int stonesIn11 = getPit11.data;
            int stonesIn12 = getPit12.data;

            sentinel = getHead.data;
            //This is supposed to be the clicked button "taking" all the stones out
            getHead.data = 0;

            for (ArrayList<Pits> i = allPits; i != null; i.listIterator(1).nextIndex()) {
                for (ArrayList<Pits> AP:allPits) {
                    /**
                     * We have to bind the textField / value to a change listener
                     * from there we can go ahead and iterator by adding one.
                     *
                     * SEE Franks example on Discord for an example
                     */

                }
                System.out.println(i.listIterator().nextIndex());



            }


        }
    }

    @FXML
    void cleanup() throws IOException {
        //This is only Pseudo-Idea Collection

        try {


           Pits getHead = new Pits(6);
            Pits  getPit2 = new Pits(6);
            Pits  getPit3 = new Pits(6);
            Pits   getPit4 = new Pits(6);
            Pits  getPit5 = new Pits(6);
            Pits   getPit6 = new Pits(6);
            Pits  getPit7 = new Pits(6);
            Pits  getPit8 = new Pits(6);
            Pits  getPit9 = new Pits(6);
            Pits  getPit10 = new Pits(6);
            Pits  getPit11 = new Pits(6);
            Pits  getPit12 = new Pits(6);

/*
            getHead.next = getPit2;
            getPit2.next = getPit3;
            getPit3.next = getPit4;
            getPit4.next = getPit5;
            getPit5.next = getPit6;
            getPit6.next = getPit7;
            getPit7.next = getPit8;
            getPit8.next = getPit9;
            getPit9.next = getPit10;
            getPit10.next = getPit11;
            getPit11.next = getPit12;
            getPit12.next = getHead;

 */

            tfPit1.textProperty().setValue("" + value);
            tfPit2.textProperty().setValue("" + value);
            tfPit3.textProperty().setValue("" + value);
            tfPit4.textProperty().setValue("" + value);
            tfPit5.textProperty().setValue("" + value);
            tfPit6.textProperty().setValue("" + value);
            tfPit7.textProperty().setValue("" + value);
            tfPit8.textProperty().setValue("" + value);
            tfPit9.textProperty().setValue("" + value);
            tfPit10.textProperty().setValue("" + value);
            tfPit11.textProperty().setValue("" + value);
            tfPit12.textProperty().setValue("" + value);
            tfHouseP1.textProperty().setValue("" + startValue);
            tfHouseP2.textProperty().setValue("" + startValue);
            traverselLogic();
            stage.close();
            startGame();

        } catch (NullPointerException e) {
            System.out.println(e);
        }

    }

    @FXML
    void startGame() throws IOException {

        if (stage == null) {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            stage.setTitle("KALAHA");
            stage.setScene(new Scene(root, 1100, 700));
            if (stage.isShowing()) {
                cleanup();
            }
            //startInputListener TODO
            stage.show();
        }
    }

    /**
     * Need that, todo :O
     */
    /*private void startInputListener() {


    }

     */
    public void restart(ActionEvent actionEvent) throws IOException {
        cleanup();
        // startGame();
    }

    ;
};



