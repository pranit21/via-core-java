// Demonstrate Dialog box.
import java.awt.*;
import java.awt.event.*;
import java.io.*;
class FileDialogDemo extends Frame implements ActionListener {
	Button open, save;
	String f, d;
	TextArea ta = new TextArea();
	FileDialogDemo() {
		setSize(600, 600);
		setVisible(true);
		
		setLayout(new FlowLayout());
		
		add(open = new Button("Open"));
		add(save = new Button("Save"));
		add(ta);
		
		open.addActionListener(this);
		save.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				dispose();
			}
		});
	}
	public void actionPerformed(ActionEvent ae) {
		FileDialog fd = new FileDialog(this);
		String str = ae.getActionCommand();
		int ch;
		if(str.equals("Open")) {
			fd.setMode(FileDialog.LOAD);
			fd.setTitle("Open File");
			fd.setVisible(true);
			
			d = fd.getDirectory();
			f = fd.getFile();
			try {
				str = "";
				FileInputStream fis = new FileInputStream(d + File.separator + f);
				while((ch = fis.read()) != -1)		// -1 => EOF
					str=str+((char)ch);

				ta.setText(str);
				fd.dispose();
			}
			catch(Exception e) {}
		} else if(str.equals("Save")) {
			fd.setMode(FileDialog.SAVE);
			fd.setTitle("Save As");
			fd.setVisible(true);

			d = fd.getDirectory();
			f = fd.getFile();
			try {
				str = ta.getText();
				FileWriter fw = new FileWriter(d + File.separator + f, false);

				BufferedWriter out = new BufferedWriter(fw);
    			out.write(str);
				out.close();
				this.setTitle(f);
				fd.dispose();
			}
			catch(Exception e) {}
		}
	}

	
	public static void main(String args[]) {
		new FileDialogDemo();
	}
}