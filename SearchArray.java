import java.io.*; 
class SearchArray {
	public static void main(String arg[]) { 
		int a[]=new int[10]; 
		DataInputStream ins=new DataInputStream(System.in); 
		int i,n=0,q=0;
		
		try { 
			System.out.print("Enter no. of elements: "); 
			n=Integer.parseInt(ins.readLine()); 
			System.out.println("Enter elements: "); 
			
			for(i=0;i<n;i++) { 
				a[i]=Integer.parseInt(ins.readLine()); 
			} 
			System.out.println("Enter element to be searched: "); 
			q=Integer.parseInt(ins.readLine());
		} catch(IOException e) { }
		
		for(i=0;i<n;i++) { 
			if(a[i]==q) 
				System.out.println("Element found at "+(i+1)+" position."); 
		} 
	} 
}