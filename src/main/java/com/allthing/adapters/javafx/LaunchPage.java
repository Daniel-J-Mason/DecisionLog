package com.allthing.adapters.javafx;

import com.allthing.application.service.DecisionService;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.io.IOException;
import java.net.URISyntaxException;

@SpringBootApplication(scanBasePackages = "com.allthing.adapters.config")
public class LaunchPage extends Application{
    
    public static ConfigurableApplicationContext springContext;
    private FXMLLoader fxmlLoader;
    
    @Override
    public void start(Stage window) throws IOException, URISyntaxException {
        window.setTitle("Decision Log");
        window.setResizable(false);
        fxmlLoader.setLocation(getClass().getResource("/fxml/launchPage.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        window.setScene(scene);
        //window.getIcons().add(new Image(Objects.requireNonNull(LaunchPage.class.getResourceAsStream("/images/REST-ICO-128.png"))));
        window.show();
    }
    
    @Override
    public void stop() throws Exception {
        springContext.stop();
    }
    
    @Override
    public void init() throws Exception {
        springContext = SpringApplication.run(LaunchPage.class);
        fxmlLoader = new FXMLLoader();
        fxmlLoader.setControllerFactory(springContext::getBean);
    }
}
