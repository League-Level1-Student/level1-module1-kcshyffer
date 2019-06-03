package _05_vault;

import java.util.Random;

public class Vault {
	public static void main(String[] args) {
		Vault vault2 = new Vault();
		//vault2.tryCode();
	}
	int code;
	
	Vault (){
		Random rand = new Random();
		code = rand.nextInt(1000001);
	}
	
	boolean tryCode(int guess) {
		if (guess == code) {
			System.out.println("You unlocked the vault!");
			return true;
		}
		else{
			System.out.println("Sorry, wrong code.");
			return false;
		}
		
	
	}
	
}
