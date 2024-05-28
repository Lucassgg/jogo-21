package jogo_21;

import java.util.Random;
import java.util.Scanner;

public class distribuicao_cartas {
	
	// Método para gerar uma carta aleatória
    
     public static int getCarta() {
        Random rand = new Random();
        return rand.nextInt(10) + 1;
    }
     //método para não quebrar o codigo caso os dados colocados na main sejam diferentes do esperado.
     public static String formataDados(String dado){
   	   return dado.replaceAll("[^0-9]+", "");
   	}
        
}
