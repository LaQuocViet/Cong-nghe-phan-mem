
public class Hoanvi {
	public static void main(String[] args) {
		int a = 4, b = 8;
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.printf("a = %d, b = %d", a, b);
	}
}
