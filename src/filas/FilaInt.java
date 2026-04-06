package filas;

public class FilaInt {
    final int N =3;
    int dados[] = new int[N];
    int ini,fim,cont;

    public void init(){
        ini = fim = cont = 0;
    }
    public boolean isEmpty(){
        return (cont==0);
    }
    public boolean isfull(){
        return (cont== N);
    }

    public  void enqueue(int elem){
        if (isfull()){
            System.out.println("Fila cheia");
        } else {
            dados[fim]=elem;
            cont++;
            fim = (fim+1)%N;
        }
    }
}
