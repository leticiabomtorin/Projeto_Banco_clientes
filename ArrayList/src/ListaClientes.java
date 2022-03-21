
public class ListaClientes {


		private String agconta;
		private String nome;
		private String email;
		private String telefone;
		private String Saldo;
		
	
public ListaClientes(String agconta, String nome, String email, String telefone, String saldo) {
	this.agconta = agconta;
	this.nome = nome;
	this.email = email;
	this.telefone = telefone;
	this.Saldo = saldo;
	}


public String getAgconta() {
	return agconta;
}


public void setAgconta(String agconta) {
	this.agconta = agconta;
}


public String getNome() {
	return nome;
}


public void setNome(String nome) {
	this.nome = nome;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getTelefone() {
	return telefone;
}


public void setTelefone(String telefone) {
	this.telefone = telefone;
}


public String getSaldo() {
	return Saldo;
}


public void setSaldo(String saldo) {
	Saldo = saldo;
}

}
