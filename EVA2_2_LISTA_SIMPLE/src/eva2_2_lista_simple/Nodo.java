package eva2_2_lista_simple;

public class Nodo {

    private int valor;
    private Nodo siguiente;

    public Nodo(int valor){
        this.valor = valor;
        this.siguiente = null;
    }

    public Nodo(int valor, Nodo siguiente){
        this.valor = valor;
        this.siguiente = siguiente;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }

    public int getValor(){
        return valor;
    }

    public void setValor(int valor){
        this.valor = valor;
    }
}
