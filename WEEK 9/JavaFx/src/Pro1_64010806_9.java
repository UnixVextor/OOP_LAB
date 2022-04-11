package JavaFx.src;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Pos;
 
public class Pro1_64010806_9 extends Application {
	protected TextField Amount = new TextField();
	protected TextField numberOfYears = new TextField();
	protected TextArea textArea = new TextArea();

	@Override 
	public void start(Stage primaryStage) {
		numberOfYears.setPrefColumnCount(2);
		Amount.setPrefColumnCount(7);
		textArea.setPrefColumnCount(30);

		Button bt = new Button("Show Table");

		HBox paneForControl = new HBox(10);
		paneForControl.setAlignment(Pos.CENTER);
		paneForControl.getChildren().addAll(new Label("Loan Amount"), Amount,new Label("Number of Years"), numberOfYears,bt);

	

		BorderPane pane = new BorderPane();
		pane.setTop(paneForControl);
		pane.setCenter(textArea);

		bt.setOnAction(e ->{
			print();
		});

		Scene scene = new Scene(pane);
		primaryStage.setTitle("Loan GUI");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	private void print(){
		String output = "";
		double monthlyInterestRate; // Monthly interest rate
		double monthlyPayment;	// Monthly payment
		
		// Add table header
		output += "Interest Rate       Monthly Payment          Total Payment\n";
		
		// Calculate and add table with interest rates to output
		for (double i = 5.0; i <= 8; i += 0.25) {
			monthlyInterestRate = i / 1200;
			monthlyPayment = Double.parseDouble(Amount.getText()) * 
				monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate,
				Double.parseDouble(numberOfYears.getText()) * 12));

			output += String.format("%-24.2f%-34.2f%-8.2f\n", i, 
				monthlyPayment, (monthlyPayment * 12) * 
				Double.parseDouble(numberOfYears.getText()));
		}

		textArea.setText(output);
	}
}