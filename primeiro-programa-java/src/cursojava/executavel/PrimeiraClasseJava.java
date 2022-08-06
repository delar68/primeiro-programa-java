package cursojava.executavel;

public class PrimeiraClasseJava {
	public static void main(String[] arg) {

	int nota1 = 50;
	int nota2 = 60;
	int nota3 = 80;
	int nota4 = 80;
	int media = 0;		
	
	media = (nota1 + nota2 + nota3 + nota4) / 4;
	
	/* Condições lógica com IF e ELSE*/
	
	/*if (media >= 70) {
		System.out.println("Aluno Aprovado!" +" "+ "Média: " + media );	
	}
	else if (media >= 40 && media <= 69){
		System.out.println("Aluno em Recuperação!" +" "+ "Média: " + media );
	}
	else { 
		System.out.println("Aluno Reprovado!" +" "+ "Média: " + media);
	}*/
	
	
	/* Operadores ternários são para micro validações */
	
	/*String saidaResultado;
	
	saidaResultado = media >= 70 ? "Aluno Aprovado" : "Aluno Reprovado";
	
	System.out.println(saidaResultado);
	*/
	
	/* Segunda Situação: com operadores ternários dentro de uma outra ternario
	 * 
	 * media >= 70 ? "Aluno Aprovado" - a primeira setença tem que ser verdadeira o que vem depois
	 * ": " é a condição falsa ou neste caso abaixo seria uma outra condição e depois do segundo
	 * " : " é falso.
	 */
	
    String saidaResultado;
	
	saidaResultado = media >= 70 ? "Aluno Aprovado" : (media >= 50 && media <= 69) ? 
			                  "Aluno em Recuperação" : "Aluno Reprovado";
	
	System.out.println(saidaResultado);
	
	
}

}