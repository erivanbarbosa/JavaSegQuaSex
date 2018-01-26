import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExemploEscritaFile {

	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\Users\\JAVA SAB VESP\\Desktop\\meuArquivo.txt");
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter( fw );
			
			System.out.println("Escrendo no arquivo!");
			bw.write( "Mensagem qualquer");
			bw.newLine();
			bw.write("Mensagem de baixo");
			
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}

}
