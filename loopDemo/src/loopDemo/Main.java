package loopDemo;

public class Main {

	public static void main(String[] args) {
		//for
		for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
			
		}
		System.out.println("Döngü Bitti");
		
		int i=2;
		//while
		while(i<10) {
			System.out.println(i);
			i+=2;
			
		}
		System.out.println("While döngüsü bitti");
		
		//do-while
		int j=1;
		do {
			
			System.out.println(j);
			j+=2;
			
		}while(j<10);
		System.out.println("do-while bitti");

	}

}
