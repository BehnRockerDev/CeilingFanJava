package com.behnrockerdev.app;

import java.util.Scanner;

import com.behnrockerdev.app.Models.CeilingFan;

public class Program {

	private static CeilingFan Fan;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		Fan = new CeilingFan();
		
		boolean showMenu = true;
		while (showMenu) {
			showMenu = MainMenu();
		}
	}
	
	private static boolean MainMenu() throws Exception {
		Scanner in = new Scanner(System.in);
		
		ClearConsole();
		System.out.println("============WELCOME TO FAN============");
		System.out.println("\r\nFAN STATUS");
		FanStatus();
		
		System.out.println("\r\nChoose an option:");
		System.out.println("1) Pull Direction Cord");
		System.out.println("2) Pull Speed Cord");
		System.out.println("3) Exit");
        System.out.print("\r\nSelect an option: ");
		
        String input = in.nextLine();
        
        switch (input) {
	        case "1":
	        	ChangeDirection();
	        	return true;
			case "2":
				IncrementSpeed();
				return true;
			case "3":
				return false;
			default:
				return true;
        }
        
	}
	
	public static void ChangeDirection() {
		Fan.PullDirectionCord();
	}
	
	//This does not work if the console is run within the IDE. Running .jar file via command line works fine
	public static void ClearConsole() {
        try {                        
            if(System.getProperty("os.name").contains("Windows")){        
                ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } else {
                ProcessBuilder pb = new ProcessBuilder("clear");
                Process startProcess = pb.inheritIO().start();
                startProcess.waitFor();
            } 
        } catch (Exception e){
            System.out.println(e);
        }
    }
	
	public static void FanStatus() {
		System.out.println(String.format("Direction: %s", Fan.GetCurrentDirection()));
		System.out.println(String.format("Speed: %s", Fan.GetCurrentSpeed()));
	}
	
	public static void IncrementSpeed() throws Exception {
		Fan.PullSpeedCord();
	}

}
