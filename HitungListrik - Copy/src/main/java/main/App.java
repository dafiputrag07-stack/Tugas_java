
package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import static javafx.application.Application.launch;

public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = loadFXML("primary");

        scene = new Scene(root);

        stage.setTitle("Hitung Listrik");
        stage.setScene(scene);

        stage.sizeToScene();

        stage.setResizable(false);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
            App.class.getResource(
                "/com/mycompany/hitunglistrik/" + fxml + ".fxml"
            )
        );

        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}
