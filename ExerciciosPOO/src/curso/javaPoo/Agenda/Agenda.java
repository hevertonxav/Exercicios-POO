package curso.javaPoo.Agenda;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private String nomeAgenda;
	private List<Contato> contatos = new ArrayList<Contato>();

	public String getNomeAgenda() {
		return nomeAgenda;
	}

	public void setNomeAgenda(String nomeAgenda) {
		this.nomeAgenda = nomeAgenda;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	public String obterInfo() {

		String info = "Nome da agenda: " + nomeAgenda + "\n" +
		              "------------------------" + "\n";
		
		if (contatos != null) {
			for (Contato c : contatos) {
				info += c.obterInfo();
			}
		}
		
		return info;
	}

}
