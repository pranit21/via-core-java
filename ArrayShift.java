import java.util.Scanner;
import java.util.Arrays;
class ArrayShift {
	public static void main(String args[]) {
		int array[] = {2,6,3,4,9,5};
		int position, temp;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Array is: ");
		System.out.print(Arrays.toString(array));

		try {
			System.out.println("\nEnter the position of array from where array to be shifted:");
			position = in.nextInt();
			
			temp = array[position];
			
			for (int i = position; i > 0; i--) {                
				array[i] = array[i-1];
			}

			array[0] = temp;
		
			System.out.println("Shifted Array: ");
			System.out.print(Arrays.toString(array));
		} catch (Exception e) {
			System.out.println("Invalid input");
		}
	}
}