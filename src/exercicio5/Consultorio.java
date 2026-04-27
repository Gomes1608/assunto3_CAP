package exercicio5;

import filas.FilaInt;
import filas.FilaString;

import java.util.Scanner;

public class Consultorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FilaString fila = new FilaString();
        fila.init();
        int opc;
        do {
            System.out.println("1 - Insere paciente na fila");
            System.out.println("2 - Atende paciente");
            System.out.println("3 - Encerra atendimento");
            opc = sc.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Digite o nome do Paciente: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    fila.enqueue(nome);
                    break;
                case 2:
                    if (fila.isEmpty()){
                        System.out.println("Não tem pacientes na fila");
                    }else {
                        System.out.println("Paciente: "+fila.dequeue()+" sera atendido agora");
                    }
                    break;
                case 3:
                    if (!fila.isEmpty()){
                        System.out.println("Ainda existem pacientes na fila");
                        opc = 0;
                    }else {
                    System.out.println("Atendimento encerrado");
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (opc!=3);
    }
}
