package application;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

/**
 * Created by robertsg on 12/7/2015.
 */
public class Player extends BorderPane {
    Media media;
    MediaPlayer player;
    MediaView view;
    MediaBar bar;

    public Player(String file) {
        media = new Media(file);
        player = new MediaPlayer(media);
        view = new MediaView(player);

        Pane mpane = new Pane();
        mpane.getChildren().add(view);
        setCenter(mpane);
        setStyle("-fx-background-color: darkgray");

        bar = new MediaBar(player);
        setBottom(bar);

        player.play();
    }
}
