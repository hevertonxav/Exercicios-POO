
/*
Em uma competição de salto em distância cada atleta tem direito a cinco saltos.
No final da série de saltos de cada atleta, o melhor e o pior resultados são
eliminados.

O seu resultado fica sendo a média dos três valores restantes.
Você deve fazer um programa que receba o nome e as cinco distâncias alcançadas
pelo atleta em seus saltos e depois informe a média dos saltos conforme a
descrição acima informada (retirar o melhor e o pior salto e depois
calcular a média).

Faça uso de uma lista para armazenar os saltos.
Os saltos são informados na ordem da execução, portanto não são ordenados.
O programa deve ser encerrado quando não for informado o nome do atleta.
A saída do programa deve ser conforme o exemplo abaixo:
    
    Atleta: Rodrigo Curvêllo
    Primeiro Salto: 6.5 m
    Segundo Salto: 6.1 m
    Terceiro Salto: 6.2 m
    Quarto Salto: 5.4 m
    Quinto Salto: 5.3 m

    Melhor salto:  6.5 m
    Pior salto: 5.3 m
    Média dos demais saltos: 5.9 m

    Resultado final:
    Rodrigo Curvêllo: 5.9 m
*/






package curso.javaPoo.SaltoDistancia;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		
		SaltoDistancia info = new SaltoDistancia();
	
		int cont = 0;
		int escolha = 0;
		
        
		do {
			
			cont ++;
			
			String nomeAtleta = JOptionPane.showInputDialog("Digite o nome do " + cont + "º atleta: ");
			
			Atleta atleta = new Atleta();
			
			atleta.setNome(nomeAtleta);
			
			info.getAtletas().add(atleta);
			
			double[] saltos = new double[5];
			String[] infoDistancia = new String[5];
			
			for(int pos = 0; pos <= 4; pos++) {
				
				 infoDistancia[pos] = JOptionPane.showInputDialog("Digite a distância do " + (pos + 1) + "º salto: ");
                 saltos[pos] = Double.valueOf(infoDistancia[pos]);
                 
               
			}
			
	 
            escolha = JOptionPane.showConfirmDialog(null, "Deseja adicionar o próximo atleta?");
			
		    atleta.setSaltos(saltos);
		
		} while(escolha == 0);
		
		
		System.out.println(info.toString());
		
			
		}
		
	
	}
