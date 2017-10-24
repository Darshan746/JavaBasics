
public class BreakDemo {

	public static void main(String args[]) {
		/*for (int i = 1; i <= 20; i++) {
			if (i == 5) {
				break;
			}
			System.out.println(i);
			System.out.println("Hi ");
		}
		System.out.println("Am outside the loop");
		*/
		
		 int i=3;
		switch (i) {
		case 1:
		case 2:
			System.out.println(1);
			break;

		default:
			System.out.println("Hi default");
			break;
		}
	}
}