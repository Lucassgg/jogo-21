package jogo_21;

import java.util.Scanner;

public class aposta_jogadores {

	 public static int aposta;
     static Scanner scan = new Scanner (System.in);
     //método para o jogador 1 colocar o valor da aposta e validar esse valor.
	public static int getAposta() {
        do {
            System.out.println(jogadores.nomeJogador1 + ", quanto você gostaria de apostar? Seu saldo atual é " + jogadores.saldoJogador);

            if (scan.hasNextInt()) {
                aposta = scan.nextInt();
                if (aposta > jogadores.saldoJogador) {
                    System.out.println("A aposta não pode ser maior que 100. Tente novamente.");
                } else if (aposta <= 0) {
                    System.out.println("A aposta deve ser maior que 0. Tente novamente.");
                } else if (aposta > jogadores.saldoJogador || aposta > jogadores.saldoJogador2) {
                    System.out.println("Você não tem saldo suficiente para essa aposta! Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scan.next(); 
            }
        } while (aposta <= 0 || aposta > 100 || aposta > jogadores.saldoJogador || aposta > jogadores.saldoJogador2);

        return aposta;
    }
	
	//método para o jogador 2 colocar o valor da aposta e validar esse valor.
   public static int getAposta2() {
       do {
           System.out.println(jogadores.nomeJogador2 + ", quanto você gostaria de apostar? Seu saldo atual é " + jogadores.saldoJogador2);

           if (scan.hasNextInt()) {
               aposta = scan.nextInt();
               if (aposta > jogadores.saldoJogador2) {
                   System.out.println("A aposta não pode ser maior que 100. Tente novamente.");
               } else if (aposta <= 0) {
                   System.out.println("A aposta deve ser maior que 0. Tente novamente.");
               } else if (aposta > jogadores.saldoJogador || aposta > jogadores.saldoJogador2) {
                   System.out.println("Você não tem saldo suficiente para essa aposta! Tente novamente.");
               }
           } else {
               System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
               scan.next(); 
               aposta = -1;
           }
       } while (aposta <= 0 || aposta > 100 || aposta > jogadores.saldoJogador || aposta > jogadores.saldoJogador2);

       return aposta;
   }
   }