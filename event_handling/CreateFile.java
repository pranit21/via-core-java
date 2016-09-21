import java.io.*;
class CreateFile {
	public static void main(String[] args) {
		try {
			File f;
			FileWriter fw;
			for(int i=0; i<4; i++) {
				f = new File("abc"+i);
				f.mkdir();
				
				f = new File(f.getAbsolutePath() + "/" + "abc"+i+".txt");
				f.createNewFile();
				
				fw = new FileWriter(f);
				fw.write("abc");
				fw.close();
			}
		} catch(Exception e) {
			
		}
	}
}