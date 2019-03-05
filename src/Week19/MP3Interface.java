package Week19;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Random;

public class MP3Interface extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("MP3 Player");

        VBox vBox = new VBox();

        ListView songView = new ListView();
        songView.setPrefHeight(100);
        ObservableList<String> songList = FXCollections.observableArrayList("No Good", "Lost Cause", "3's and 7's");
        songView.setItems(songList);

        HBox hBox = new HBox();
        Button play = new Button("Play");
        Button stop = new Button("Stop");
        Button next = new Button("Next");
        Button shuffle = new Button("Random");

        Label playing = new Label("Select a song to play");

        hBox.getChildren().addAll(play, stop, next, shuffle);
        vBox.getChildren().addAll(songView, hBox, playing);

        play.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int index = songView.getSelectionModel().getSelectedIndex();
                if (index != -1){
                    playing.setText("Now playing: " + songList.get(index));
                }
            }
        });

        stop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                playing.setText("Select a song to play");
            }
        });

        next.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!playing.getText().equals("Select a song to play")){

                }
            }
        });

        shuffle.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Random random = new Random();
                String playingString = playing.getText();
                while(true){
                    String randomSong = songList.get(random.nextInt(songList.size()));
                    if(!randomSong.equals(playingString)){
                        playing.setText(randomSong);
                        break;
                    }
                }
            }
        });

        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
