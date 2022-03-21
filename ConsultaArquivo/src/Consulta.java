import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Consulta {
public static void main(String[] args)  {

	String mostra="";
	String nomeArq="c:\\listaclientes.txt"; 
	String linha="";
	
	
	File arq = new File(nomeArq);
	
	
	if(arq.exists()) {
		mostra="Arquivo -"+nomeArq+" aberto com sucesso";
		
		mostra+=" Tamanho do arquivo "+Long.toString(arq.length())+" bytes";
		System.out.println(mostra);
		

		try {
			FileReader reader = new FileReader(nomeArq);
			BufferedReader leitor = new BufferedReader(reader);
			
			while(true) {
				linha=leitor.readLine();
				 System.out.println(linha);
				 if(linha==null)
					 break;
			}
		} catch (Exception erro) {
			System.out.println(mostra+"arquivo");
		}
	}
}
}
