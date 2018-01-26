import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class ExemploLeituraFile {

	public static void main(String[] args) {
		
		String  path = "C:\\Users\\JAVA SAB VESP\\Desktop\\meuArquivo.txt";

		try {
			File file = new File(path);
			FileReader fr;
			fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			
			while( br.ready() ) {
				String linha = br.readLine();
				System.out.println(linha);
			}
			
			br.close();
			fr.close();
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		

	}

}
