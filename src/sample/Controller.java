package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.LinkedList;

public class Controller {

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

    Stage stage;


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


    /**
     * Created the LinkedList
     */
    @FXML
  //  public void test() {
        //Pits pit = new Pits(6);
    //}

        public void test ()
        {
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
            head.pit12.setStyle("-fx-background-color: RED");

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


        public void restart (ActionEvent actionEvent) throws IOException {
            cleanup();
            // startGame();


        }
}


