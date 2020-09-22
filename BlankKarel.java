/*
 * File: BlankKarel.java
 * ---------------------
 * This class is a blank one that you can change at will.
 */

import stanford.karel.*;

public class BlankKarel extends SuperKarel {
	public void run() {
		move();
		checkBox();
		checkBox();
		checkBox();
	}
	
	private void checkBox() {
		if (beepersPresent()) {
			turnLeft();
			move();
			while (beepersPresent()) {
				pickBeeper();
				}
			if (noBeepersPresent()) {
				putBeeper();
				turnAround();
				move();
				move();
			}
			while (beepersPresent()) {
				pickBeeper();
				}
			if(noBeepersPresent());
				putBeeper();
				turnAround();
				move();
				turnRight();
				move();
				move();
			}
		
				if(noBeepersPresent());
					turnLeft();
					move();
					while (beepersPresent()) {
						pickBeeper();
				}
					turnAround();
					move();
					move();
				while (beepersPresent()) {
					pickBeeper();
					}
				turnAround();
				move();
				turnRight();
				move();
				if (frontIsClear()) {
					move();
				}
				
	}
}

