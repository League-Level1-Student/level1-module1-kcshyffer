package _01_race_car;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import javax.swing.JOptionPane;

public class RaceCarRunner {
	public static void main(String[] args) {
		/* Do the following things without changing the RaceCar class */
		
		// 1. Create a RaceCar and place it in 5th position
		
		RaceCar car = new RaceCar("Lamborghini", 5);
		
		// 2. Print the RaceCar's position in the race
		int position = car.getPositionInRace();
		System.out.println("Your car's position is " + position + ".");
		// 3. Crash the RaceCar
		car.crash();
		position = car.getPositionInRace();
		System.out.println("Your car's position is " + position + ".");
		// 4. If the car is damaged. Bring it in for a pit stop.
		car.isDamaged();
		// 5. Help the car move into first place.
		car.overtake();
	}
}
