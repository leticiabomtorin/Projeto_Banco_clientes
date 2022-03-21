import java.util.ArrayList;

public class ExecutarClientes {

	public static void main(String[] args) {
		
				
	
		ArrayList<ListaClientes> listaclientes = new ArrayList();
		
		ListaClientes listaclientes1 = new ListaClientes("Ag: 1023 Conta: 87304-0","Ricardo","ricardo@terra.com.br","1234-5678","R$2500");
		ListaClientes listaclientes2 = new ListaClientes("Ag: 2560 Conta: 23453-9","Marcos","marcos@terra.com.br","5555-5555","R$5600");
		ListaClientes listaclientes3 = new ListaClientes("Ag: 6580 Conta: 23450-3","Igor","igor@terra.com.br","4444-4444","R$45.000");
		ListaClientes listaclientes4 = new ListaClientes("Ag: 0023 Conta: 45678-2","Vanessa","vanessa@terra.com.br","2345-7890","R$60.000");
		

		listaclientes.add(listaclientes1);
		listaclientes.add(listaclientes2);
		listaclientes.add(listaclientes3);
		listaclientes.add(listaclientes4);
		
	
		for(ListaClientes c:listaclientes) {
			
			
			System.out.println(c.getAgconta()+" - "+c.getNome()+" - "+c.getEmail()+ " - "+c.getTelefone()+" - "+c.getSaldo());
		}
		
	
		System.out.println("O Total de registro é "+listaclientes.size());
		
		
		
		System.out.println(listaclientes.get(1).getNome());
		

		listaclientes.remove(1);

	
		System.out.println(listaclientes.get(1).getNome());
	}

}
