package jogo_21;

import java.util.ArrayList;



public class jogadores {

	ArrayList<jogadores> nomes = new ArrayList <jogadores> ();
	 // Contadores para o número de vitórias do Jogador 1 e do Jogador 2
	 public static int vitoriasJogador1 = 0;
	 public static int vitoriasJogador2 = 0;
	 
	 public static String nomeJogador1;  
	 public static String nomeJogador2;

	 public static int jogador1;
	 public static int jogador2;
	 
	 public static int saldoJogador = 100;
	 public static int saldoJogador2 = 100;
	 
	 //serve para não resetar o saldo depois de cada rodada.
	 public void saldoJogador1 (int saldoInicial) {
		 jogadores.saldoJogador = saldoInicial; 
	 }
	 public void saldoJogador2 (int saldoInicial) {
		 jogadores.saldoJogador = saldoInicial;
	 }
	 //serve para salvar os nomes dos jogadores.
	 public void adicionarNomes(jogadores n) {
			nomes.add(n);
		}
}
