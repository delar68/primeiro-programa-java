package cursojava.executavel;

public class PrimeiraClasseJava {
	public static void main(String[] arg) {

	int nota1 = 40;
	int nota2 = 30;
	int nota3 = 10;
	int nota4 = 80;
	int media = 0;		
	
	media = (nota1 + nota2 + nota3 + nota4) / 4;
	
		/* Operações lógicas aninhadas: São operações dentro de operações */
	
	if (media >= 50) {
		if (media >= 70) {
			System.out.println("Aluno está aprovado");
		} else {
			System.out.println("Aluno está em recuperação");
		}
		
	}else {
		System.out.println("Aluno está reprovado");
	}
	
	
	
}

}