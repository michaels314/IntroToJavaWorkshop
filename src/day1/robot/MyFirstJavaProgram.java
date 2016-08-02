package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot R2D2= new Robot();
int x= 180;
for (int i = 0; i < 4; i++) {
R2D2.setSpeed(10);
R2D2.setPenColor(Color.ORANGE);
R2D2.penDown();
R2D2.move(x);
R2D2.turn(90);	
}

	}
}
