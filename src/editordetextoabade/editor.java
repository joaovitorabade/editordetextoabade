package editordetextoabade;

import javax.swing.JFrame;
import javax.swing.JTextPane;

public class editor extends JFrame  {
	
	public editor () {
		JTextPane Texto = new JTextPane () ;
		
		this.add(Texto);
		this.setTitle("Editor de texto");
		this.setSize(400,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new editor ();


	}

}
