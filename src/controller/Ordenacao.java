package controller;

public class Ordenacao 
{
	
	public Ordenacao()
	{
		super();
	}

	public int[] quickSort(int[] vetor, int ini, int fim)
	{
		if(fim > ini)
		{
			int posicaoPivoFixo = dividir(vetor, ini, fim);
			quickSort(vetor, ini, posicaoPivoFixo - 1);
			quickSort(vetor, posicaoPivoFixo + 1, fim);
		}
		return vetor;
	}
	
	
	private int dividir(int[] vetor, int ini, int fim)
	{
		int ponteiroEsquerda = ini + 1;
		int ponteiroDireita = fim;
		int pivo = vetor[ini];
		
		while(ponteiroEsquerda <= ponteiroDireita)
		{
			while(ponteiroEsquerda <= ponteiroDireita && vetor[ponteiroEsquerda] <= pivo)
			{
				ponteiroEsquerda++;
			}
			while(ponteiroDireita >= ponteiroEsquerda && vetor[ponteiroDireita] > pivo)
			{
				ponteiroDireita--;
			}
			if(ponteiroEsquerda < ponteiroDireita)
			{
				trocar(vetor, ponteiroEsquerda, ponteiroDireita);
				ponteiroEsquerda++;
				ponteiroDireita--;
			}
		}
		trocar(vetor, ini, ponteiroDireita);
		return ponteiroDireita;
	}
	
	private void trocar(int[] vetor, int i, int j)
	{
		int auxiliar = vetor[j];
		vetor[j] = vetor[i];
		vetor[i] = auxiliar;
	}
	
	
}
