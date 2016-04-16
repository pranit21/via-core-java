class Pascal { 
	public static void main(String[] args) { 
		int N = Integer.parseInt(args[0]);
		int[][] pascal  = new int[N+1][];

		// initialize first row
		pascal[1] = new int[1 + 2];
		pascal[1][1] = 1;

		// fill in Pascal's triangle
		for (int i = 2; i <= N; i++) {
			pascal[i] = new int[i + 2];
			for (int j = 1; j < pascal[i].length - 1; j++)
				pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
		}

		// print results
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j < pascal[i].length - 1; j++) {
				System.out.print(pascal[i][j] + " ");
			}
			System.out.println();
		}
	}
}