package Week15.Calculator;

import javafx.scene.control.TextField;

public class CalculatorController {

    public TextField inputTF1;
    public TextField inputTF2;
    public TextField resultTF;

    public void addNumbers() {
        try {
            double d1 = new Double(inputTF1.getText());
            double d2 = new Double(inputTF2.getText());

            double result = d1 + d2;

            resultTF.setText("" + result);
        } catch (NumberFormatException e) {
            resultTF.setText("Not a Number");
        }
    }

    public void subtractNumbers() {
        try {
            double d1 = new Double(inputTF1.getText());
            double d2 = new Double(inputTF2.getText());

            double result = d1 - d2;

            resultTF.setText("" + result);
        } catch (NumberFormatException e) {
            resultTF.setText("Not a Number");
        }
    }

    public void multiplyNumbers() {
        try {
            double d1 = new Double(inputTF1.getText());
            double d2 = new Double(inputTF2.getText());

            double result = d1 * d2;

            resultTF.setText("" + result);
        } catch (NumberFormatException e) {
            resultTF.setText("Not a Number");
        }
    }

    public void divideNumbers() {
        try {
            double d1 = new Double(inputTF1.getText());
            double d2 = new Double(inputTF2.getText());

            double result = d1 / d2;

            resultTF.setText("" + result);
        } catch (NumberFormatException e) {
            resultTF.setText("Not a Number");
        }
    }
}
