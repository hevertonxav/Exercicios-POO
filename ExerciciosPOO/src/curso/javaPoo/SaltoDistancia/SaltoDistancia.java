package curso.javaPoo.SaltoDistancia;

import java.util.ArrayList;
import java.util.List;

import curso.javaPoo.InformacoesCurso.Aluno;

public class SaltoDistancia {
	
	private List<Atleta> atletas = new ArrayList<Atleta>();
	
	
	public List<Atleta> getAtletas() {
		return atletas;
	}
	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}
	
	@Override
	public String toString() {
		
		String  infoUm = " " + "\n";
		
		for(Atleta a : atletas) {
			
			infoUm +=  a.toString() + "\n";
			
			
		}
		
		return infoUm;
	
	}
	
    

	
	
	


}
