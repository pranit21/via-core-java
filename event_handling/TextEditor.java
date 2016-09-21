import java.io.*;
import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
class TextEditor extends Frame implements ActionListener {
	TextArea ta = new TextArea();
	int ch;
	String str = "",str1,f,d;

	TextEditor() throws Exception {
		MenuBar mb = new MenuBar();
		Menu file = new Menu("File");
		Menu edit = new Menu("Edit");

		MenuItem newMenu = new MenuItem("New");
		MenuItem openMenu = new MenuItem("Open");
		MenuItem saveMenu = new MenuItem("Save");
		MenuItem saveasMenu = new MenuItem("Save As");
		MenuItem exitMenu = new MenuItem("Exit");

		MenuItem cutMenu = new MenuItem("Cut");
		MenuItem copyMenu = new MenuItem("Copy");
		MenuItem pasteMenu = new MenuItem("Paste");
		MenuItem selectAllMenu = new MenuItem("Select All");

		add(ta);

		file.add(newMenu);
		file.add(openMenu);
		file.add(saveMenu);
		file.add(saveasMenu);
		file.add(exitMenu);

		edit.add(cutMenu);
		edit.add(copyMenu);
		edit.add(pasteMenu);
		edit.add(selectAllMenu);

		newMenu.addActionListener(this);
		openMenu.addActionListener(this);
		saveMenu.addActionListener(this);
		saveasMenu.addActionListener(this);
		exitMenu.addActionListener(this);

		cutMenu.addActionListener(this);
		copyMenu.addActionListener(this);
		pasteMenu.addActionListener(this);
		selectAllMenu.addActionListener(this);

		mb.add(file);
		mb.add(edit);

		setMenuBar(mb);

		setSize(600,600);
		setVisible(true);
		setTitle("Untitled");

		addWindowListener(new WindowAdapter() {
      		public void windowClosing(WindowEvent e) { dispose(); }
       	});
	}
	public void actionPerformed(ActionEvent ae) {
		FileDialog fd = new FileDialog(this);
		String s = ae.getActionCommand();

		if(s.equals("New")) {
			str = "";
			this.setTitle("Untitled");
			ta.setText(str);
		}
		else if(s.equals("Open")) {
			fd.setMode(FileDialog.LOAD);
			fd.setTitle("Open File");
			fd.setVisible(true);

			d = fd.getDirectory();
			f = fd.getFile();
			try {
				str = "";
				FileInputStream fis = new FileInputStream(d + "\\" + f);
				while((ch = fis.read()) != -1)		// -1 => EOF
					str=str+((char)ch);

				this.setTitle(f);
				ta.setText(str);
				fd.dispose();
			}
			catch(Exception e) {}
		}
		else if(s.equals("Save")) {
			try {
				str = "";
				str = ta.getText();
				FileWriter fw = new FileWriter(d + "\\" + f,false);

				BufferedWriter out = new BufferedWriter(fw);
    			out.write(str);
				out.close();
				this.setTitle(f);
				fd.dispose();
			}
			catch(Exception e) {}
		}
		else if(s.equals("Save As")) {
			fd.setMode(FileDialog.SAVE);
			fd.setTitle("Save As");
			fd.setVisible(true);

			d = fd.getDirectory();
			f = fd.getFile();
			try {
				str = "";
				str = ta.getText();
				FileWriter fw = new FileWriter(d + "\\" + f,false);

				BufferedWriter out = new BufferedWriter(fw);
    			out.write(str);
				out.close();
				this.setTitle(f);
				fd.dispose();
			}
			catch(Exception e) {}
		}
		else if(s.equals("Exit"))
			this.dispose();
		else if(s.equals("Cut")) {
			str = ta.getText();
			str1 = ta.getSelectedText();
			//int p = str.indexOf(str1);
			//int p = ta.getCaretPosition();
			str = str.replace(str1, "");

			//ta.setCaretPosition(p);
			ta.setText(str);
		}
		else if(s.equals("Copy")) {
			str1 = ta.getSelectedText();
			StringSelection ss = new StringSelection(str1);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		}
		else if(s.equals("Paste")) {
			int p = ta.getCaretPosition();
			ta.insert(str1,p);
		}
		else if(s.equals("Select All"))
			ta.selectAll();
	}
	public static void main(String args[]) throws Exception {
		new TextEditor();
	}
}