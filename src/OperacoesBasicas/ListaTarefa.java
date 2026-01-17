package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List <Tarefas> tarefasList;

    public ListaTarefa() {
        this.tarefasList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasList.add(new Tarefas(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefas> tarefasparaRemover = new ArrayList<>();
            for (Tarefas t : tarefasList){
                if (t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasparaRemover.add(t);
                }
            }
            tarefasList.removeAll(tarefasparaRemover);
        }

        public int obterNumeroTotalTarefas(){
             return tarefasList.size();
        }
        public boolean obterDescricoesTarefas(){
            System.out.println(tarefasList);
            return false;
        }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("O NUMERO TOTAL DE ELEMENTOS NA LISTA É:" + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 3");
        System.out.println("O NUMERO TOTAL DE ELEMENTOS NA LISTA É:" + listaTarefa.obterNumeroTotalTarefas());


        System.out.println("O NUMERO TOTAL DE ELEMENTOS NA LISTA É:" + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }

    }



