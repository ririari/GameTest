package test;

import java.util.Random;

import org.newdawn.slick.Animation;

public class BadGuy extends Solid {
	
	private String number = "1";
	private Random random = new Random();

	
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public BadGuy(float x, float y, Animation am) {
		this.x = x;
		this.y = y;
		this.am = am;
		int firstNum = random.nextInt(12)+1;
		int secondNum = random.nextInt(12)+1;
		int finalNum = firstNum * secondNum;
		number = ""+finalNum;
		
		
		
	}
	

}
