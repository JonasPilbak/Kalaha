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

    Stage stage;







    //For security reasons added @FXML , correct me if I'm wrong.
    @FXML
    public void close(){
        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(-1);
            }
        });
    }


    @FXML
    void cleanup() throws IOException {
        //This is only Pseudo-Idea Collection
        p2Score.setText("0");
        p1Score.setText("0");
        playerTurn.setText("P1");
        stage.close();
    }

    @FXML
    void startGame() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("KALAHA");
        stage.setScene(new Scene(root, 1100, 700));
        stage.show();
    }


    public void restart(ActionEvent actionEvent) throws IOException {

        startGame();
        cleanup();


    }
}

