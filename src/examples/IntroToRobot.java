package examples;

import org.jointheleague.graphical.robot.Robot;

public class IntroToRobot {
	public static void main(String args[]) {
		Robot c3po = new Robot();
		
		c3po.penDown();
		c3po.setPenWidth(20);
		c3po.setSpeed(25);
		
		c3po.setRandomPenColor();
		for(int i=0;i < 4; i++) {
			c3po.move(-100);
			c3po.turn(-90);
		}
		
		c3po.setRandomPenColor();
		for(int i=0;i < 4; i++) {
			c3po.move(-100);
			c3po.turn(90);
		}
		
		c3po.setRandomPenColor();
		for(int i=0;i < 4; i++) {
			c3po.move(100);
			c3po.turn(-90);
		}
		
		c3po.setRandomPenColor();
		for(int i=0;i < 4; i++) {
			c3po.move(100);
			c3po.turn(90);
		}
	}
}
