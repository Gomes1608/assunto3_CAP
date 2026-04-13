package exercicio3Alunos;

import filas.FilaInt;

import java.util.Scanner;

public class AtendimentoAlunos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaInt fila = new FilaInt();
        fila.init();
        int opc;
        int rm;
        do {
            System.out.println("1 - Insere aluno na fila");
            System.out.println("2 - Atende aluno");
            System.out.println("3 - Encerra atendimento");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Digite o rm do aluno: ");
                    rm = sc.nextInt();
                    fila.enqueue(rm);
                    break;
                case 2:
                    if (fila.isEmpty()){
                        System.out.println("Não tem alunos na fila");
                    }else {
                        System.out.println("Aluno: "+fila.dequeue()+" sera atendido agora");
                    }
                    break;
                case 3:
                    if (!fila.isEmpty()){
                        System.out.println("Ainda existem alunos na fila");
                        opc = 0;
                    }
                    System.out.println("Atendimento encerrado");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (opc!=3);
    }
}
