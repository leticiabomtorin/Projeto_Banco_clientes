import java.util.Scanner;

public class NumeracaoLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] clientes = new String[5];
		Scanner teclado = new Scanner(System.in);
		
		for(int contador=0; contador<4; contador++) {
		System.out.println("Coloque o "+contador+" �, clientes:" );
		clientes[contador]=teclado.next();

		}
		
			int contagem=1;
		for(int retorno=0; retorno<5; retorno++) {
			System.out.println(contagem+"-"+clientes[retorno]);
			contagem++;
		}
	}

}
