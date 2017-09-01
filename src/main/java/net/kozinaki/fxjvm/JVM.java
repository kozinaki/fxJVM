package net.kozinaki.fxjvm;

import com.sun.javafx.sg.prism.web.NGWebView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.scene.paint.*;
import javafx.event.*;
import javafx.scene.text.*;
import javafx.geometry.*;
import javafx.*;


public class JVM extends Application {

    @Override
    public void start(Stage primaryStage) {
        Parent root = null;
        try {
            root = FXMLLoader.load(getClass().getResource("/jvm.fxml"));
        } catch(IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("FXML Welcome");
        primaryStage.setScene(scene);
        primaryStage.show();
        /*Button btn = new Button();
        btn.setText("Hello World!");

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World");
            }
        });

        StackPane topPane = new StackPane();
        topPane.setStyle("-fx-background-color: #E6EB10;");
        topPane.setBackground(new Background(new BackgroundFill(Color.web("#888888"), CornerRadii.EMPTY, Insets.EMPTY)));
        Label titleLabel = new Label();
        titleLabel.setText("ETERNAL MACHINE");
        titleLabel.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        topPane.getChildren().add(titleLabel);

        VBox rootPane = new VBox();
        rootPane.setPadding(new Insets(15));
        rootPane.setSpacing(10);
        rootPane.setStyle("-fx-background-color: #336699;");
        rootPane.getChildren().add(topPane);

        HBox middlePane = new HBox();

        VBox left = new VBox();
        left.setStyle("-fx-background-color: #89DBEC");
        Label titleLabel1 = new Label();
        titleLabel1.setText("ETERNAL MACHINE");
        titleLabel1.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        left.getChildren().add(titleLabel1);
        left.setPadding(new Insets(10));

        StackPane stack = new StackPane();
        stack.setStyle("-fx-background-color: #909090");
        Label mid = new Label();
        mid.setText("test");
        stack.getChildren().add(mid);
        stack.setPadding(new Insets(30));
        left.getChildren().add(stack);

        StackPane right = new StackPane();
        right.setStyle("-fx-background-color: #89DBEC");
        Label titleLabel2 = new Label();
        titleLabel2.setText("ETERNAL MACHINE");
        titleLabel2.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        right.getChildren().add(titleLabel2);

        middlePane.setSpacing(10);
        middlePane.getChildren().add(left);
        middlePane.getChildren().add(right);
        middlePane.setHgrow(left, Priority.ALWAYS);
        middlePane.setHgrow(right, Priority.ALWAYS);

        rootPane.getChildren().add(middlePane);
        rootPane.getChildren().add(btn);

        Scene scene = new Scene(rootPane, 800, 600);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();*/
    }

}