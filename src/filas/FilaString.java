package filas;

public class FilaString {
    final int N =3;
    String dados[] = new String[N];
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

    public  void enqueue(String elem){
        if (isfull()){
            System.out.println("Fila cheia");
        } else {
            dados[fim]=elem;
            cont++;
            fim = (fim+1)%N;
        }
    }

    public String dequeue(){
        String elem = dados[ini];
        cont--;
        ini = (ini+1)%N;
        return elem;
    }

    public String first(){
        return dados[ini];
    }
}
