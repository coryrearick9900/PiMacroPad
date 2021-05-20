package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    private TextArea text;

    // This creates a message for simulating opening a program
    public String openProgram(String name) {
        return "Opening "  + name + ".";
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        StackPane pane = new StackPane();

        Button first = new Button("Firefox");
            first.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    new EventHandler<Event>() {
                        @Override
                        public void handle(Event event) {
                            text.clear();
                            text.setText(openProgram("Firefox"));
                        }
                    }
            );
        Button second = new Button("Spotify");
        second.addEventHandler(MouseEvent.MOUSE_CLICKED,
                new EventHandler<Event>() {
                    @Override
                    public void handle(Event event) {
                        text.clear();
                        text.setText(openProgram("Spotify"));
                    }
                }
        );
        Button third = new Button("Discord");
        third.addEventHandler(MouseEvent.MOUSE_CLICKED,
                new EventHandler<Event>() {
                    @Override
                    public void handle(Event event) {
                        text.clear();
                        text.setText(openProgram("Discord"));
                    }
                }
        );
        Button fourth = new Button("Steam");
        fourth.addEventHandler(MouseEvent.MOUSE_CLICKED,
                new EventHandler<Event>() {
                    @Override
                    public void handle(Event event) {
                        text.clear();
                        text.setText(openProgram("Steam"));
                    }
                }
        );

        Button[] allButtons = {first, second, third, fourth};

        text = new TextArea();
            text.setMaxHeight(100);
            text.setDisable(true);

        HBox buttons1 = new HBox(first, second);
            buttons1.setAlignment(Pos.CENTER);
        HBox buttons2 = new HBox(third, fourth);
            buttons2.setAlignment(Pos.CENTER);
        VBox buttons = new VBox(buttons1, buttons2);
            buttons.setAlignment(Pos.CENTER);

        VBox buttonsAndText = new VBox (text, buttons);

        for (Button x: allButtons) {
            x.setAlignment(Pos.CENTER);
            x.setMinWidth(100);
        }



        pane.getChildren().add(buttonsAndText);

        primaryStage.setScene(new Scene(pane, 400, 400));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
