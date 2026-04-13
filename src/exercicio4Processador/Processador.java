package exercicio4Processador;

import filas.FilaInt;

import java.util.Scanner;

public class Processador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        int opc;
        int pid=0;
        do {
            System.out.println("1 - Insere o processo na tela");
            System.out.println("2 - Executa o processo");
            System.out.println("3 - Shutdown");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Digite o pid do processo que está sendo submetido: ");
                    pid = sc.nextInt();
                    fila.enqueue(pid);
                    break;
                case 2:
                    if (fila.isEmpty()){
                        System.out.println("Não existem processos na fila");
                    }else {
                        System.out.println("Processo: "+pid+" será executado");
                        System.out.println("--- Execução ---");
                        System.out.println("O Processo concluiu? (1 - sim): ");
                        int resp = sc.nextInt();
                        if (resp ==1){
                            System.out.println("O Processo "+ pid +" foi concluido");
                        } else {
                            System.out.println("O Processo voltou para a fila");
                            fila.enqueue(pid);
                        }
                    }
                    break;
                case 3:
                    if (!fila.isEmpty()){
                        System.out.println("Ainda existem processos em execução (fila não está vazia)");
                        System.out.println("Quer encerrar todos? (1-sim): ");
                        int resp = sc.nextInt();
                        if (resp==1){
                            while (!fila.isEmpty()){
                                System.out.println("Encerrando processo "+fila.dequeue());
                            }
                        } else {
                            opc =0;
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (opc!=3);
        System.out.println("Shutdown ...");
    }

}
