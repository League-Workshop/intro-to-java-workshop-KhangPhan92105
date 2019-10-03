package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot bob = new Robot();
	bob.setSpeed(400);
	bob.penDown();
	for(int i=0; i<4; i++) {
		bob.move(200);
	bob.turn(90);
	}
	for(int i=0; i<4; i++) {
		bob.move(200);
		bob.turn(-90);
	}
	bob.turn(180);
	for(int i=0; i<4; i++) {
		bob.move(200);
		bob.turn(90);
	}
	for(int i=0; i<4; i++) {
		bob.move(200);
		bob.turn(-90);
	}
	
	
	
	
		
		
	}
}
