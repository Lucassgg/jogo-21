import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		 Scanner scan = new Scanner (System.in);
		 gerenciador_tarefas gerenciador = new gerenciador_tarefas();
		 int opcao = 0;
		 
		 do {
		 System.out.println("===== menu ======");
		 System.out.println("1. nova tarefa");
		 System.out.println("2. listar");
		 System.out.println("3. remover");
		 System.out.println("4. alterar");
		 System.out.println("5. marcar concluido");
		 System.out.println("0. sair");
		 opcao = scan.nextInt();
		 
		 switch (opcao) {
		 case 1:
			 System.out.println("codigo: ");
			 scan.nextLine();
			 String cod = scan.nextLine();
			 System.out.println("descricao: ");
			 String des = scan.nextLine();
			 tarefas novaTarefa = new tarefas();
			 novaTarefa.codigo = cod;
			 novaTarefa.descricao = des;
			 gerenciador.novaTarefa(novaTarefa);
			 break;
			 
		 case 2:
			 gerenciador.listar();
			 break;
			 
		 case 3:
			 System.out.println("qual a posicao?");
			 int pos1 = scan.nextInt();
			 gerenciador.remover(pos1);
			 break;
			 
		 case 4:
			 System.out.println("qual a posicao?");
			 int pos2 = scan.nextInt();
			 System.out.println("qual a tarefa?");
			 String tarefa = scan.next();
			 System.out.println("qual o codigo?");
			 String cod2 = scan.next();
			 tarefas novaTarefa1 = new tarefas();
			 novaTarefa1.descricao = tarefa;
			 novaTarefa1.codigo = cod2;
			 gerenciador.alterarTarefa(pos2, novaTarefa1);
			 break;
		 case 5:
			 System.out.println("qual a posicao?");
			 int posicao = scan.nextInt();
			 gerenciador.marcarConcluida(posicao);
		 }
		 } while (opcao !=0);
	}
}
