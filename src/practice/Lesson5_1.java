package practice;

class Car1 {
	private int no;
	
	public void setNo(int n) {
		no = n;
	}
	
	public void display() {
		System.out.println("ナンバーは" + no + "です");
	}
}

class Taxi1 extends Car1 {
	private int price;
	
	public void start() {
		price = 420;
	}
	
	public void run() {
		price += 80;
	}
	
	public void display() {
		System.out.println("料金は" + price + "円です");
	}
}

public class Lesson5_1 {

	public static void main(String[] args) {
		
		Taxi1 t1 = new Taxi1();
		t1.setNo(2525);
		t1.start();
		t1.run();
		t1.display();
	}

}
