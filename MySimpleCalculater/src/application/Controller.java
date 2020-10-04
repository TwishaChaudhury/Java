package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
	@FXML
	private TextField num1;
	
	@FXML
	private TextField num2;
	
	@FXML
	private TextField res;
	
	public void add(ActionEvent event) {
		int n1 = Integer.parseInt(num1.getText());
		int n2 = Integer.parseInt(num2.getText());
		
		int r = n1 + n2;
		res.setText(r+"");
	}
	
	public void subtract(ActionEvent event) {
		int n1 = Integer.parseInt(num1.getText());
		int n2 = Integer.parseInt(num2.getText());
		
		int r = n1 - n2;
		res.setText(r+"");}
}