import javax.swing.JOptionPane;

public class Snoopy {
public static void main(String[] args) {
	String boy_or_girl = JOptionPane.showInputDialog(null, "Are you a boy or girl?");
	JOptionPane.showMessageDialog(null, "I don't think you are a(n) "+ boy_or_girl );
	JOptionPane.showInputDialog(null, " What game do you like?");
	JOptionPane.showMessageDialog(null, "M:TG is better!" );
	JOptionPane.showInputDialog(null,"What is your favorite movie?");
	JOptionPane.showMessageDialog(null,"Sharknado is better!");
}
}
