package ru.itpark.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label expression;

    @FXML
    private Label result;

    public ResourceBundle getResources() {
        return resources;
    }

    public void setResources(ResourceBundle resources) {
        this.resources = resources;
    }

    public URL getLocation() {
        return location;
    }

    public void setLocation(URL location) {
        this.location = location;
    }

    public Label getExpression() {
        return expression;
    }

    public void setExpression(Label expression) {
        this.expression = expression;
    }

    public Label getResult() {
        return result;
    }

    public void setResult(Label result) {
        this.result = result;
    }

    @FXML
    void numberProcess(ActionEvent event) {

    }

    @FXML
    void operatorProcess(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert expression != null : "fx:id=\"expression\" was not injected: check your FXML file 'calculator.fxml'.";
        assert result != null : "fx:id=\"result\" was not injected: check your FXML file 'calculator.fxml'.";

    }
}
