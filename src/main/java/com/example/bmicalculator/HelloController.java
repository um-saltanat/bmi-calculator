package com.example.bmicalculator;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {

    BMICalculator calc = new BMICalculator();

    @FXML
    private Label appName;

    @FXML
    private Label weight;

    @FXML
    private TextField inputWeight;

    @FXML
    private Label height;

    @FXML
    private TextField inputHeight;

    @FXML
    private TextField inputWeight2;

    @FXML
    private TextField inputHeight2;

    @FXML
    private Label result;

    @FXML
    private Label status;


    @FXML
    protected void onCalculateButtonClick() {

        if (inputWeight2.getText().isEmpty() && inputHeight2.getText().isEmpty()) {
            String val1 = inputWeight.getText();
            double weight = Double.parseDouble(val1);

            String val2 = inputHeight.getText();
            double height = Double.parseDouble(val2);
            calc.setWeight(weight);
            calc.setHeight(height);
        }
        else if (inputWeight.getText().isEmpty() && inputHeight.getText().isEmpty()) {
            String val3 = inputWeight2.getText();
            double weight2 = Double.parseDouble(val3);

            String val4 = inputHeight2.getText();
            double height2 = Double.parseDouble(val4);

            calc.setWeight2(weight2);
            calc.setHeight2(height2);
        }
        else {
            System.out.println("Error");
        }

        calc.calculate();

        double res = calc.getResult();
        this.result.setText(Double.toString(res));

        this.status.setText(calc.checkStatus());
    }

    @FXML
    protected void onClearButtonClick() {
        inputWeight.setText("");
        inputHeight.setText("");
        inputWeight2.setText("");
        inputHeight2.setText("");
        this.result.setText("00");
    }

    @FXML
    protected void onExitButtonClick() {
        javafx.application.Platform.exit();
    }
}