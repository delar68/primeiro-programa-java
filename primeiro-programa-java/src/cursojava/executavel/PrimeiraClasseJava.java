package cursojava.executavel;

public class PrimeiraClasseJava {
	public static void main(String[] arg) {

	int nota1 = 50;
	int nota2 = 60;
	int nota3 = 80;
	int nota4 = 80;
	int media = 0;		
	
	media = (nota1 + nota2 + nota3 + nota4) / 4;
	
	/* Condi��es l�gica com IF e ELSE*/
	
	/*if (media >= 70) {
		System.out.println("Aluno Aprovado!" +" "+ "M�dia: " + media );	
	}
	else if (media >= 40 && media <= 69){
		System.out.println("Aluno em Recupera��o!" +" "+ "M�dia: " + media );
	}
	else { 
		System.out.println("Aluno Reprovado!" +" "+ "M�dia: " + media);
	}*/
	
	
	/* Operadores tern�rios s�o para micro valida��es */
	
	/*String saidaResultado;
	
	saidaResultado = media >= 70 ? "Aluno Aprovado" : "Aluno Reprovado";
	
	System.out.println(saidaResultado);
	*/
	
	/* Segunda Situa��o: com operadores tern�rios dentro de uma outra ternario
	 * 
	 * media >= 70 ? "Aluno Aprovado" - a primeira seten�a tem que ser verdadeira o que vem depois
	 * ": " � a condi��o falsa ou neste caso abaixo seria uma outra condi��o e depois do segundo
	 * " : " � falso.
	 */
	
    String saidaResultado;
	
	saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 50 && media <= 69) ? 
			                  "Aluno em Recupera��o" : "Aluno Reprovado";
	
	System.out.println(saidaResultado);
	
	
}

}