package SwingView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class PesquisarLivrosTela {
	JFrame frame = new JFrame("Livraria Redesprou");
	JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	public void exibir() {
		
		
		//Cria o MenuBar
		JMenuBar menuBar = new JMenuBar();
		JMenu menuPesquisa = new JMenu("Pesquisar");
		JMenuItem itemPesquisa = new JMenuItem("Pesquisa");
		menuPesquisa.add(itemPesquisa);
		menuBar.add(menuPesquisa);
		
		String[] opcoes = {"Selecione", "Listar Todos"};
		JComboBox<String> combo = new JComboBox<String>(opcoes);
		combo.setSelectedIndex(0);
		panel.add(combo);
		panel.setBackground(Color.BLACK);
		panel.setPreferredSize(new Dimension(415, 348));
		frame.add(panel);
		
				
		
		frame.setJMenuBar(menuBar);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(440, 350);
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
