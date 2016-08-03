import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog(null, "Greetings! What is your name?");
JOptionPane.showMessageDialog(null, "Hello " + name + "!");
}

}
