package practice;

class Car2 {
	private int no;
	
	public Car2(int no) {
		this.no = no;
	}
	
	public void display() {
		System.out.println("ナンバーは" + no + "です");
	}
}

class Taxi2 extends Car2 {
	private int price;
	
	public Taxi2(int no) {
		this(no, 0);
	}
	
	public Taxi2(int no, int price) {
		super(no);
		this.price = price;
	}
	
	public void start() {
		price = 420;
	}
	
	public void run() {
		price += 80;
	}
	
	public void display() {
		super.display();
		System.out.println("料金は" + price + "円です");
	}
}

public class Lesson5_2 {

	public static void main(String[] args) {
		
		Taxi2 t2 = new Taxi2(2525);
		t2.start();
		t2.run();
		t2.display();
	}

}
