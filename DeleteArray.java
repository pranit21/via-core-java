import java.io.*; 
class DeleteArray { 
	public static void main(String arg[]) { 
		int a[]=new int[10]; 
		DataInputStream ins=new DataInputStream(System.in); 
		int i,n=0,q=0; 
		int ctr=0; 
		
		try { 
			System.out.print("Enter no. of elements: "); 
			n=Integer.parseInt(ins.readLine()); 
			System.out.println("Enter elements: "); 
			
			for(i=0;i<n;i++) 
				a[i]=Integer.parseInt(ins.readLine()); 
			
			System.out.println("Enter element to be deleted: "); 
			q=Integer.parseInt(ins.readLine()); 
		} catch(IOException e) {}
		
		for(i=0;i<n;i++) { 
			if(a[i]==q) { 
				for(int k=i;k<n-1;k++) 
					a[k]=a[k+1]; 
			ctr++; 
		} 
	} 
	if(ctr==0) 
		System.out.println("Element not found."); 
	else { 
		for(i=0;i<(n-ctr);i++) 
			System.out.print(a[i]+"\t"); 
		} 
	} 
}