package jogo_21;

public class vitorias_e_derrotas {

	 public static int aposta = 0;
		public void res () {
			
	         aposta = aposta_jogadores.aposta;
			int jogador1 = jogadores.jogador1;
			int jogador2 = jogadores.jogador2;
	        // Inicializa as pontuações do Jogador 1 e do Jogador 2
	        jogador1 = distribuicao_cartas.getCarta() + distribuicao_cartas.getCarta();
	        jogador2 = distribuicao_cartas.getCarta() + distribuicao_cartas.getCarta();

	        // Executa o turno do Jogador 1 e do Jogador 2
	        jogador1 = turnos.turno(jogador1, jogadores.nomeJogador1);
	        jogador2 = turnos.turno(jogador2, jogadores.nomeJogador2);

	        // Exibe a pontuação final
	        System.out.println("pontucao rodada: " +jogadores.nomeJogador1 + " - " + jogador1 + "  /  "+jogadores.nomeJogador2+ " - " + jogador2);
	       
	        // Determina o vencedor e atualiza o contador de vitórias apropriado
	         while (true) {
	        	
	        if ((jogador1 <= 21 && jogador1 > jogador2) || (jogador2 > 21 && jogador1 <= 21)) {
	            System.out.println(jogadores.nomeJogador1 +" vence rodada!");
	            jogadores.vitoriasJogador1++;
	            jogadores.saldoJogador += aposta;
	            jogadores.saldoJogador2 -= aposta;
	            break;
	        }
	        
	        else if ((jogador2 <= 21 && jogador2 > jogador1) || (jogador1 > 21 && jogador2 <= 21)) {
	            System.out.println(jogadores.nomeJogador2 + " vence rodada!");
	            jogadores.vitoriasJogador2++;
	            jogadores.saldoJogador -= aposta;
	            jogadores.saldoJogador2 += aposta;
	            break;
	        }
	       
	        else {
	            System.out.println("Empate!");
	            break;
	        }
		}   
		}
		//método para exibir o resultado no final de cada rodada.
	public void resultadoFinal () {
		
		// Exibe o número de vitórias de cada jogador
        System.out.println("Numero de vitorias - "+ jogadores.nomeJogador1 +": " + jogadores.vitoriasJogador1 + "  /  "+jogadores.nomeJogador2 +": " + jogadores.vitoriasJogador2);
        System.out.println("Dinheiro disponivel : "+jogadores.nomeJogador1 +" R$: "+jogadores.saldoJogador +" / "+jogadores.nomeJogador2 + " R$: "+jogadores.saldoJogador2);
        do {
        if (jogadores.saldoJogador <=0 || jogadores.saldoJogador2 <=0) {
    		System.out.println("um dos jogadores ficou sem saldo, fim de jogo!!");
    		System.exit(0);
    }
        } while (jogadores.saldoJogador <=0 || jogadores.saldoJogador2 <=0);
	}
}
