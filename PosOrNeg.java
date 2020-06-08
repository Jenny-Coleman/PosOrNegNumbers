import javax.swing.JOptionPane;

public class PosOrNeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number", "0"));
		
		if (num < 0) {
			System.out.println("Number is negative");		
		}
		else {
			System.out.println("Number is positive");
		}
	}
}
