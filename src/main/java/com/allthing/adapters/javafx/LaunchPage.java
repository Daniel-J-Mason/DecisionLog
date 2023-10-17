package com.allthing.adapters.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;

public class LaunchPage extends Application{
    
    /**
     * @param window
     * @throws IOException
     * @throws URISyntaxException
     * Creates a window with some basic settings and uses mainView.fxml for window configuration
     */
    @Override
    public void start(Stage window) throws IOException, URISyntaxException {
    
        window.setTitle("Decision Log");
        window.setResizable(false);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/launchPage.fxml"));
        Parent root = loader.load();
        
        Scene scene = new Scene(root);
        window.setScene(scene);
        //window.getIcons().add(new Image(Objects.requireNonNull(LaunchPage.class.getResourceAsStream("/images/REST-ICO-128.png"))));
        window.show();
    }
}
