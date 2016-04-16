import java.util.Random;
public class Max {
	public static void main(String[] args) {
		int a[] = new int [10];
		Random rnd = new Random ();

		for (int i = 0; i< a.length; i++) {
			a[i] = rnd.nextInt(99);
			System.out.println(a[i]);
		}

		int max = a[0];          

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		System.out.println("Max element: " + max);
	}
}