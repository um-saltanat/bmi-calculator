package com.example.bmicalculator;

/**
 * Represents a BMI Calculator.
 *
 * @author Saltanat Umarova.
 * @since 29.10.2023
 * @version 1.0
 */
public class BMICalculator {

    private double weight;
    private double height;
    private double weight2;
    private double height2;
    private double result;

    /**
     * A non-return method that calculates your BMI based on weight and height parameters.
     */
    public void calculate() {
        if (this.weight != 0 && this.height != 0) {
            this.result = this.weight / (this.height * this.height * 0.0001);
        }
        else {
            this.result = this.weight2 / (this.height2 * this.height2) * 703;
        }
    }

    /**
     * A method that check your status based on the BMI results.
     * @return A String representing the user's BMI status.
     */
    public String checkStatus() {
        if (this.result < 18.5) {
            return "Underweight";
        }
        else if (this.result >= 18.5 && this.result <= 24.9) {
            return "Normal";
        }
        else if (this.result >= 25 && this.result <= 29.9) {
            return "Overweight";
        }
        else if (this.result > 29.9) {
            return "Obese";
        }
        else {
            return "-";
        }
    }

    /**
     * Gets the weight in kg.
     * @return contains the user's weight.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight.
     * @param weight represents user's weight in kg.
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    /**
     * Gets the height.
     * @return contains the user's height in cm.
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height.
     * @param height represents the user's height in cm.
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the weight in lbs.
     * @return contains the user's weight.
     */
    public double getWeight2() {
        return weight2;
    }

    /**
     * Sets the weight.
     * @param weight2 represents user's weight in lbs.
     */
    public void setWeight2(double weight2) {
        this.weight2 = weight2;
    }

    /**
     * Gets the height.
     * @return contains the user's height in inches.
     */
    public double getHeight2() {
        return height2;
    }

    /**
     * Sets the height.
     * @param height2 represents the user's height in inches.
     */
    public void setHeight2(double height2) {
        this.height2 = height2;
    }

    /**
     * Gets the BMI results.
     * @return contains BMI result.
     */
    public double getResult() {
        return result;
    }

    /**
     * Sets the BMI result.
     * @param result represents the BMI result.
     */
    public void setResult(double result) {
        this.result = result;
    }
}
