package com.behnrockerdev.app.Models;

import com.behnrockerdev.app.Enums.FanSpeed;
import com.behnrockerdev.app.Enums.SpinDirection;

public class Fan {
	protected FanSpeed currentSpeed;
	protected SpinDirection currentDirection;
	
	public Fan() {
		currentDirection = SpinDirection.CLOCKWISE;
		currentSpeed = FanSpeed.OFF;
	}
	
	public String GetCurrentDirection() {
		return currentDirection.toString();
	}
	
	public String GetCurrentSpeed() {
		return currentSpeed.toString();
	}
}
