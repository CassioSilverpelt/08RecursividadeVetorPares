package view;

import controller.VetorParesController;

public class VetorParesPrincipal {
	public static void main (String[] args) {
		VetorParesController vetCon = new VetorParesController();
		int[] vetor = {0, 13, 24, 18, 15, 31, 32, 14, 28, 53, 52, 44, 18};
		int tam = vetor.length-1;
		
		System.out.println("A quantidade de números pares no vetor é de: " + vetCon.vetorParesContar(vetor, tam));		
	}
}
