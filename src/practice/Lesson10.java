package practice;

abstract class Vehicle {
	protected int crewNum;
	
	public abstract void showCrewNum();
}

interface Stopable {
	void stop();
}

class Bus10 extends Vehicle implements Stopable {
	
	public Bus10(int crewNum) {
		super.crewNum = crewNum;
	}
	
	public void showCrewNum() {
		System.out.println("バスの乗客 : " + super.crewNum + "名");
	}
	
	public void stop() {
		System.out.println("次止まります");
	}
}

class Taxi10 extends Vehicle implements Stopable {
	
	public Taxi10(int crewNum) {
		super.crewNum = crewNum;
	}
	
	public void showCrewNum() {
		System.out.println("タクシーの乗客 : " + super.crewNum + "名");
	}
	
	public void stop() {
		System.out.println("ここで降ります");
	}
	
}

class Train10 extends Vehicle {
	
	public Train10(int crewNum) {
		super.crewNum = crewNum; 
	}
	
	public void showCrewNum() {
		System.out.println("電車の乗客 : " + super.crewNum + "名");
	}
}

public class Lesson10 {

	public static void main(String[] args) {
		
		Vehicle[] v = new Vehicle[3];
		v[0] = new Taxi10(4); // 型変換
		v[1] = new Train10(160); // 型変換
		v[2] = new Bus10(80); // 型変換
		
		for(int i = 0; i < v.length; i++) {
			v[i].showCrewNum(); // ポリモフィズム
			if(v[i] instanceof Stopable) {
				Stopable s = (Stopable)v[i];
				s.stop();
			}
		}

	}

}
