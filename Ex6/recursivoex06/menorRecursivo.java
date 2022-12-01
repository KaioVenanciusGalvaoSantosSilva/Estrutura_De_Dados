package recursivoex06;

public class menorRecursivo {
	
	public static int menor(int v[], int inicio, int fim) {
		int meio = (inicio + fim) / 2;
		int n1, n2;
		if (meio > inicio) {
			n1 = menor(v, inicio, meio);
			n2 = menor(v, meio + 1, fim);
		} else {
			n1 = v[inicio];
			n2 = v[fim];
		}
		if (n1 < n2)
			return n1;
		else
			return n2;
	}
}