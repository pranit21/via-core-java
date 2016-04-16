import java.util.Random;
public class Min {
	public static void main(String[] args) {
		int a[] = new int [10];
		Random rnd = new Random ();

		for (int i = 0; i< a.length; i++) {
			a[i] = rnd.nextInt(9-0)+0;
			System.out.println(a[i]);
		}

		int min = a[0];          

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}

		System.out.println("Min element: " + min);
	}
}