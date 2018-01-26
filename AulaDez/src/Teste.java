import java.awt.Dimension;
import java.io.IOException;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class Teste {
	
	public static void main(String[] args) {
		JEditorPane jep = new JEditorPane();
		jep.setEditable(false);   

		try {
		  jep.setPage("http://www.uol.com");
		}catch (IOException e) {
		  jep.setContentType("text/html");
		  jep.setText("<html>Could not load</html>");
		} 

		JScrollPane scrollPane = new JScrollPane(jep);     
		JFrame f = new JFrame("Test HTML");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(scrollPane);
		f.setSize(new Dimension(800,600));
		f.setVisible(true);
	}
	
}
