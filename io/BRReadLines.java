import java.io.*;
class BRReadLines {
	public static void main(String args[]) throws IOException
	{
		// create a BufferedReader using System.in
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out, true);
		String str;
		
		System.out.println("Enter lines of text.");
		System.out.println("Enter 'q' to quit.");
		
		do {
			str = br.readLine();
			System.out.println("You entered: "+str);
			pw.println(str);
		} while(!str.equals("q"));
	}
}