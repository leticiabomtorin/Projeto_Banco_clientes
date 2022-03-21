import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Gravacao {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		String[] agconta = {"Agencia: 1024 Conta: 25804-2", "Agencia:0025 Conta:1245-2","Agencia: 5478 Conta:25803-5", "Agencia: 0002 Conta: 98563-0"};
		String[] nome = {"Ricardo","Marcos","Igor","Vanessa"};		
		
		
		
		FileWriter arquivo = new FileWriter("c:\\listaclientes.txt");
		PrintWriter gravarArquivo = new PrintWriter(arquivo);
		
		gravarArquivo.printf("Agencia"+"%n");
		for (int registros=0; registros<4; registros++) {			
			gravarArquivo.printf(agconta[registros]+"%n");			
		}
		gravarArquivo.printf("Nome das pessoas"+"%n");		
		for (int registros=0; registros<4; registros++) {			
			gravarArquivo.printf(nome[registros]+"%n");			
		}
		
		arquivo.close();
		System.out.println("Arquivo gerado na unidade c:\\listaclientes.txt");
	}

}

