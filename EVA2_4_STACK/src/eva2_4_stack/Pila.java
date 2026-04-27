package eva2_4_stack;


public class Pila {
     private Nodo inicio; 
    private Nodo fin;
    private int cont;
    
    
    public Pila() {
        this.inicio = null;
        this.fin = null;
        this.cont = 0;
    }

    
    public void imprimirlista() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "] -> ");
            temp = temp.getSiguiente();
        }
        System.out.println("null");
    }

    
    public void imprimirlistainv() {
        Nodo temp = fin;
        while (temp != null) {
            System.out.print("[" + temp.getValor() + "] -> ");
            temp = temp.getPrevio();
        }
        System.out.println("null");
    }

    
    public int longitud() {
        return this.cont;
    }

    
    public void vaciarLista() {
        inicio = null;
        fin = null;
        cont = 0;
    }

   
    public boolean esVacia() {
        return inicio == null;
    }

    
    public void agregar(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (inicio == null) {
            inicio = nuevo; 
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            nuevo.setPrevio(fin);
            fin = nuevo;
        }
        cont++;
    }
    
    public void push(int valor){
        agregar (valor);
    }
    
    public int peek(){
        if(fin != null)
        return fin.getValor();
        else
            throw new RuntimeException("La pila esta vacia");
    }
    
    public int pop(){
    int resu = peek();
    borrarEn(longitud() - 1);
    return resu;
    }
}


   