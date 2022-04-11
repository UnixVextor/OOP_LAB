package src;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javafx.application.*;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class Pro1_64010806_12 extends Application{
    private TextField tfAnnualInterestRate = new TextField();
    private TextField tfNumberOfYears = new TextField();
    private TextField tfLoanAmount = new TextField();
    private TextField tfMonthlyPayment = new TextField();
    private TextField tfTotalPayment = new TextField();
    private Button btCalculate = new Button("Calculate");
    private Button btSave = new Button("Save");
    private Button btLoad = new Button("Load");
    private Button btClear = new Button("Clear");
    
    @Override 
    public void start(Stage window){
    
        GridPane  Pane = new GridPane();
        Pane.setHgap(5);
        Pane.setVgap(5);
        Pane.add(new Label("Annual Interest Rate:"),0,0);   
        Pane.add(tfAnnualInterestRate,1,0);
        Pane.add(new Label("Number of Years:"),0,1);
        Pane.add(tfNumberOfYears,1,1);
        Pane.add(new Label("Loan Amount:"),0,2);
        Pane.add(tfLoanAmount,1,2);
        Pane.add(new Label("Monthly Payment:"),0,3);
        Pane.add(tfMonthlyPayment,1,3);
        Pane.add(new Label("Total Payment:"),0,4);
        Pane.add(tfTotalPayment,1,4);
        Pane.add(btCalculate,1,5);
        Pane.add(btSave,0,5);
        Pane.add(btLoad,0,5);
        Pane.add(btClear,1,5);


        Pane.setAlignment(Pos.CENTER);
        tfAnnualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        tfLoanAmount.setAlignment(Pos.BOTTOM_RIGHT);
        tfNumberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfTotalPayment.setAlignment(Pos.BOTTOM_RIGHT);
        tfMonthlyPayment.setEditable(false);
        tfTotalPayment.setEditable(false);
        GridPane.setHalignment(btCalculate,HPos.RIGHT);
        GridPane.setHalignment(btClear,HPos.LEFT);
        GridPane.setHalignment(btSave,HPos.LEFT);
        GridPane.setHalignment(btLoad,HPos.RIGHT);
        


        btCalculate.setOnAction(e -> calculateLoanPayment());
        btClear.setOnAction(e -> ClearButton());
        btSave.setOnAction(e -> SaveData());
        btLoad.setOnAction(e -> ReadData());
        Scene scene = new Scene(Pane,400,250);
        window.setTitle("LoanCalculator");
        window.setScene(scene);
        window.show();
    }
    private void calculateLoanPayment(){
        double InterestRate = Double.parseDouble(tfAnnualInterestRate.getText());
        int Years = Integer.parseInt(tfNumberOfYears.getText());
        double loanAmount = Double.parseDouble(tfLoanAmount.getText());

        Loan loan = new Loan(InterestRate,Years,loanAmount);
        tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
        tfTotalPayment.setText(String.format("$%.2f",loan.getTotalPayment()));
    }

    private void ClearButton(){
        tfAnnualInterestRate.clear();
        tfLoanAmount.clear();
        tfMonthlyPayment.clear();
        tfNumberOfYears.clear();
        tfTotalPayment.clear();
    }

    private void SaveData(){
        try {
            String InterestRate = tfAnnualInterestRate.getText() + " ";
            String Years = tfNumberOfYears.getText() + " ";
            String loanAmount =tfLoanAmount.getText() + " ";
            FileOutputStream file = new FileOutputStream(new File("WEEK11/Pro3/loan.dat"));
            BufferedOutputStream writer = new BufferedOutputStream(file);

            writer.write(InterestRate.getBytes());
            writer.write(Years.getBytes());
            writer.write(loanAmount.getBytes());
            writer.flush();
            writer.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }   
    }

    private void ReadData(){
        try {
            FileInputStream file = new FileInputStream(new File("WEEK11/Pro3/loan.dat"));
            BufferedInputStream reader = new BufferedInputStream(file);

            int ch;
            String ReadData = " ";
            while((ch = reader.read()) != -1){
                ReadData += (char)ch;
            }
            String[] splitData = ReadData.split(" ");
            tfAnnualInterestRate.setText(splitData[1]);
            tfNumberOfYears.setText(splitData[2]);
            tfLoanAmount.setText(splitData[3]);
            reader.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
