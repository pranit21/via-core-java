import java.io.*;
class CreateFile
{ 
	public static void main(String[] args) throws IOException 
	{
		File f = new File ("myfile.txt");
		if(!f.exists())
		{ 
			f.createNewFile(); 
			System.out.println("New file \"myfile.txt\" has been created to the current directory"); 
		}
	}
}  
