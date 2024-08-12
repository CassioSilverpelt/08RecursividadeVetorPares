package controller;

public class VetorParesController {
	public VetorParesController() {
		super();
	}
	
	public int vetorParesContar(int[] vet, int tam) {
		if (tam < 0) {return 0;}
		else if (vet[tam] % 2 == 0 && vet[tam] != 0) {return 1 + vetorParesContar(vet, (tam-1));}
		else {return 0 + vetorParesContar(vet, (tam-1));}
	}
	
}
