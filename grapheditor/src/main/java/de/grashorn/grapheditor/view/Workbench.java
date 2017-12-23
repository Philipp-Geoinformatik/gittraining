package de.grashorn.grapheditor.view;

import java.util.function.Consumer;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Workbench extends Application {

	@Override
	public void start(Stage stg) throws Exception {
		Parent bp = new BorderPane();
		Scene scene = new Scene(bp);
		stg.setMaximized(true);
		stg.setScene(scene);
		stg.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
