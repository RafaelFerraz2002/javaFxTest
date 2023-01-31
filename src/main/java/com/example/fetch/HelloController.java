package com.example.fetch;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import org.springframework.web.client.RestTemplate;

public class HelloController {

    private final String API_BASE_URL = "http://localhost:8080/api/players";

    @FXML
    private ListView<String> playersListView;

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void getAllPlayersFromApi() {
        //get players from api and add to listView
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(API_BASE_URL, String.class);
        System.out.println(result);
        ObservableList<String> items = FXCollections.observableArrayList(result);
        playersListView.setItems(items);
    }
}