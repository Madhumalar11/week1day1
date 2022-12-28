package week1.day1;

public class Bike {
public void SoundHorn() {
		
		System.out.println("Sound horn");
	}

	public void ApplyBreak() {
	
		System.out.println("Applied break");
	}

	public static void main(String[] args) {
		Car a=new Car();
		a.SoundHorn();
		a.ApplyBreak();
		
		Bike b=new Bike();
		b.ApplyBreak();
		b.SoundHorn();
		

	}

}
