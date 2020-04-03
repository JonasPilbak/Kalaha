package sample;

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
import java.util.LinkedList;

public class Controller {
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


    @FXML
    public Button newGameButton;

    //Make Pop-Up
    @FXML
    public Button rulesButton;

    @FXML
    public Button closeButton;

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

    public void buttonNames() {

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
    }


    //For security reasons added @FXML , correct me if I'm wrong.
    @FXML
    public void close() {
        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                System.exit(-1);
            }
        });
    }

    public void test() {
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


        head.nextPits = pit2;
        pit2.nextPits = pit3;
        pit3.nextPits = pit4;
        pit4.nextPits = pit5;
        pit5.nextPits = pit6;
        pit6.nextPits = pit7;
        pit7.nextPits = pit8;
        pit8.nextPits = pit9;
        pit9.nextPits = pit10;
        pit10.nextPits = pit11;
        pit11.nextPits = pit12;
        pit12.nextPits = head;

    }

    @FXML
    void cleanup() throws IOException {
        //This is only Pseudo-Idea Collection

        try {

            p2Score.setText("0");
            p1Score.setText("0");
            playerTurn.setText("P1");
            stage.close();
        } catch (NullPointerException e) {
            System.out.println();
        }

    }

    @FXML
    void startGame() throws IOException {

        if (stage == null) {
            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
            stage.setTitle("KALAHA");
            stage.setScene(new Scene(root, 1100, 700));
            stage.show();
        } else if (stage.isShowing()) {
            stage.toFront();
        } else {
            stage.show();
        }
    }


    public void restart(ActionEvent actionEvent) throws IOException {
        cleanup();
        // startGame();


    }

}


