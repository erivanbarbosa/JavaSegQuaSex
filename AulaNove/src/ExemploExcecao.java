import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class ExemploExcecao {

	public static void main(String[] args) {
		PrintStream ps = System.out;
		File file = new File("G:asdf");
		
		int[] array = {1, 2, 3, 4};
		
		try {
			FileInputStream leitor = new FileInputStream(file);
			
			System.out.println("Iniciando o bloco try");
			Character ch = (char) leitor.read();
			int i = Integer.parseInt(ch.toString());
			
			ps.println(array[i]);
		} catch( ArrayIndexOutOfBoundsException e ) {
			ps.println("O limite do array é [1 ... 3] ");
			ps.println(e.getMessage());
		} catch( IOException e ) {
			ps.println("Erro de entrada/saida");
			ps.println(e.getMessage());
		} catch( NumberFormatException e ) {
			ps.println("Erro de formatação do numero");
			ps.println(e.getMessage());
		} finally {
			ps.println("Sempre passo por aqui!");
		}
		

	}

}
