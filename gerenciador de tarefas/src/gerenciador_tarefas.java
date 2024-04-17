import java.util.ArrayList;

public class gerenciador_tarefas {

	ArrayList<tarefas> tarefa = new ArrayList<tarefas>();
	
	public void novaTarefa (tarefas novaTarefa) {
		tarefa.add(novaTarefa);
	}
	
	public void remover (int posicao) {
		tarefa.remove(posicao);
		
	}
	
	public void alterarTarefa (int posicao, tarefas nome) {
		tarefa.set(posicao, nome);
		
	}
	
	public void marcarConcluida (int posicao) {
		tarefas t = tarefa.get(posicao -1);
		t.concluido = true;
		
	}
	
	public void listar () {
		for (tarefas tarefa : tarefa) {
			System.out.printf("(%s) %s - %s \n",tarefa.concluido ? "X" : " ", tarefa.codigo, tarefa.descricao);
		}
	}
	
	
}
