package curso.javaPoo.AprovacaoAluno;

import java.util.ArrayList;
import java.util.List;


public class Aluno {
	
	String nome;
	String matricula;
	String curso;
	
	List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	boolean consutarAprovacao( double nota) {
		
		return nota >= 7;
		
	}

	
	
	
	

}
