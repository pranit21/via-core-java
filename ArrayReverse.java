import java.util.Arrays;
class ArrayReverse {
	public static void main(String args[]) {
		int a[] = {2,5,34,45,4};
		int N = a.length;
		int temp;
		
		for (int i = 0; i < N/2; i++) {
			temp = a[N-i-1];
			a[N-i-1] = a[i];
			a[i] = temp;
		}
		
		System.out.print(Arrays.toString(a));
	}
}