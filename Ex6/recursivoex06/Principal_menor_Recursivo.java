package recursivoex06;

public class Principal_menor_Recursivo {

	public static void main(String[] args) {

		//6) Considerando que voc� fez a quest�o 5 corretamente, 
		//escreva um algoritmo recursivo que encontra o MENOR elemento do vetor de inteiros sem usar nenhum la�o.
		
		
		int vetor[] = new int [3];
		vetor[0]= 19;
		vetor[1]= 4;
		vetor[2]= 20;
		
		System.out.println(menorRecursivo.menor(vetor, 0, vetor.length-1));
	}
}