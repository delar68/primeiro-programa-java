package cursojava.executavel;

public class PrimeiraClasseJava {
	public static void main(String[] arg) {

	int nota1 = 40;
	int nota2 = 60;
	int nota3 = 70;
	int nota4 = 80;
	int media = 0;		
	
	media = (nota1 + nota2 + nota3 + nota4) / 4;
	
	if (media >= 70) {
		System.out.println("Aluno Aprovado!" +" "+ "M�dia: " + media );	
	}
	else if (media >= 40 && media <= 69){
		System.out.println("Aluno em Recupera��o!" +" "+ "M�dia: " + media );
	}
	else { 
		System.out.println("Aluno Reprovado!" +" "+ "M�dia: " + media);
	}
	
	
	
}

}