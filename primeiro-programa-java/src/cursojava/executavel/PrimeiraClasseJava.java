package cursojava.executavel;

public class PrimeiraClasseJava {
	public static void main(String[] arg) {

	int nota1 = 40;
	int nota2 = 30;
	int nota3 = 10;
	int nota4 = 80;
	int media = 0;		
	
	media = (nota1 + nota2 + nota3 + nota4) / 4;
	
		/* Opera��es l�gicas aninhadas: S�o opera��es dentro de opera��es */
	
	if (media >= 50) {
		if (media >= 70) {
			System.out.println("Aluno est� aprovado");
		} else {
			System.out.println("Aluno est� em recupera��o");
		}
		
	}else {
		System.out.println("Aluno est� reprovado");
	}
	
	
	
}

}