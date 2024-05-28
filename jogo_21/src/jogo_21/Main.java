package jogo_21;

import java.util.Random;
import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {

    	Scanner scan = new Scanner (System.in);
    	String opcao = "";
    	
    	do {
    	System.out.println("==== menu ====");
    	System.out.println("1. Nome dos jogadores");
    	System.out.println("2. Fazer aposta");
    	System.out.println("3. iniciar rodada");
    	System.out.println("0. Sair");
    	opcao = scan.next();
    	
    	switch (opcao) {
    	case "1":
    		jogadores nomes = new jogadores ();
    		System.out.println("Informe o nome do jogador 1");
    		String n1 = scan.next();
    		System.out.println("Informe o nome do jogador 2");
    		String n2 = scan.next();
            nomes.nomeJogador1 = n1;
            nomes.nomeJogador2 = n2;
            break;
            
            case "2":
    		aposta_jogadores.getAposta();
    		aposta_jogadores.getAposta2();
    		break;
    		
    	  case "3":
          vitorias_e_derrotas placar = new vitorias_e_derrotas ();
            placar.res();
    		placar.resultadoFinal();
    		break;
    		
    	
    	case "0":
    		System.exit(0);
    	default:
    		System.out.println("opcao invalida");
    		System.out.println("");
    		break;
    		
    		
    	}
        
    	} while (opcao != "0");
    	
    	 distribuicao_cartas.formataDados(opcao);
}
    
    
}
