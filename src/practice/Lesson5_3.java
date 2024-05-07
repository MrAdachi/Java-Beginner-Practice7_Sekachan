package practice;

class Car3 {
	Car3(){
		System.out.println("Car()"); // ①-1 // ④-1
	}
	
	Car3(int no){
		System.out.println("Car(int no)"); // ②-1 // ③-1
	}
}

class Taxi3 extends Car3 {
	
	Taxi3() {
		this(9999);
		System.out.println("Taxi()"); // ③-3
	}
	
	Taxi3(int no) {
		super(no);
		System.out.println("Taxi(int no)"); // ②-2 // ③-2
	}
	
	Taxi3(String no) {
		System.out.println("Taxi(String no)"); // ④-2
	}
}

public class Lesson5_3 {

	public static void main(String[] args) {
		
		Car3 c = new Car3();
		System.out.println("-----");
		Taxi3 t1 = new Taxi3(2525);
		System.out.println("-----");
		Taxi3 t0 = new Taxi3();
		System.out.println("-----");
		/* サブクラスをインスタンス化した場合、
		 * まずスーパークラスのコンストラクタ(super())が実行されてから
		 * サブクラスのコンストラクタが実行される。　※要注意！
		 */
		Taxi3 t2 = new Taxi3("2525");
	}

}
