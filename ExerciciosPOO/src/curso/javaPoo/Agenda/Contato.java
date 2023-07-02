package curso.javaPoo.Agenda;

public class Contato {
	
	private String nomeContato;
	private String email;
	private String telefone;
	
	public String getNomeContato() {
		return nomeContato;
	}
	public void setNomeContato(String nomeContato) {
		this.nomeContato = nomeContato;
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
	
	public String obterInfo() {
		
		return "Nome: " + nomeContato + "\n" +
		       "E-mail: " + email + "\n" +
			   "Telefone: " + telefone + "\n" +
		       "------------------------" + "\n";
	
	}
	
	

}
