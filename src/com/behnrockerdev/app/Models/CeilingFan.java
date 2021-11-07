package com.behnrockerdev.app.Models;

import com.behnrockerdev.app.Enums.FanSpeed;
import com.behnrockerdev.app.Enums.SpinDirection;

public class CeilingFan extends Fan {
	public void PullSpeedCord() throws Exception {
		switch (currentSpeed) {
			case OFF:
				currentSpeed = FanSpeed.LOW;
				break;
			case LOW:
				currentSpeed = FanSpeed.MEDIUM;
				break;
			case MEDIUM:
				currentSpeed = FanSpeed.HIGH;
				break;
			case HIGH:
				currentSpeed = FanSpeed.OFF;
				break;
			default:
				throw new Exception(String.format("Not expected speed value: %s", currentSpeed.toString()));
		}
	}
	
	public void PullDirectionCord() {		
		if (currentDirection.equals(SpinDirection.CLOCKWISE)) {
			currentDirection = SpinDirection.COUNTERCLOCKWISE;
		} else {
			currentDirection = SpinDirection.CLOCKWISE;
		}
	}
}
