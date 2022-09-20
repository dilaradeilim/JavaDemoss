package switchDemo;

public class Main {
	// ctrl+shıft+f

	public static void main(String[] args) {
		char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel:Geçtiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("İyi: Geçtiniz");
			break;
		case 'D':
			System.out.println("fena değil: Geçtiniz");
			break;
		case 'F':
			System.out.println("Kaldınız");
			break;
		default:
			System.out.println("geçersiz not girdiniz");

		}

	}

}
