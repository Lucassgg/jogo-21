package jogo_21;

import java.util.Scanner;

public class turnos {
       
	 // Método para executar um turno de um jogador
    public static int turno(int pontuacaoInicial, String jogador) {
    	
        Scanner scanner = new Scanner(System.in);
        int pontuacao = pontuacaoInicial;
         String resposta = "";
        do {
            System.out.println(jogador + " tem " + pontuacao + ". Pegar outra carta? (s/n)");
            resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                pontuacao += distribuicao_cartas.getCarta();
            }
            else if (resposta.equalsIgnoreCase("n")){
                break;
            }
            if (pontuacao >21) {
            	 System.out.println("passou de 21!");
            	 break;
             }

             
        } while (pontuacao <= 21); 
        return pontuacao;
       
    }
}
