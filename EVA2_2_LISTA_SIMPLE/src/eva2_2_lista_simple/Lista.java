package eva2_2_lista_simple;

public class Lista {

    private Nodo inicio = null;
    private Nodo fin = null;

    public Lista(){
        this.inicio = null;
    }
//AGREGAR UN NODO:
    //O(N)EFICIENICA PARA MOVERNOS NODO POR NODO
    //O(N)EFICIENICA POR USAR UN NODO FIN
    public void agregar(int valor){

        Nodo nuevo = new Nodo(valor);
        //VAMOS A INSTERTAR UN NODO AL FINAL DE LA LISTA
        //PERO HAY QUE REVISAR EL ESTADO DE LA LISTA
        // SI LA LISTA ESTA VACIA
        if(inicio == null){
            inicio = nuevo;
            fin = nuevo;
        }
        else{
            // movernos hasta el ultimo nodo
           /* Nodo temp = inicio;

            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }

            // conectar el ultimo nodo con el nuevo
            temp.setSiguiente(nuevo);*/
           fin.setSiguiente(nuevo);//conectamos el nuevo nodo
           fin = nuevo; //movemos fin al ultimo nodo
        }
    }
    //EFICIENCIA O(N)
    public void imprimirLista(){

        Nodo temp = inicio;

        while(temp != null){
            System.out.println("[" + temp.getValor() + "]");
            temp = temp.getSiguiente();
        }

        System.out.println("");
    }
    
    //EFICIENCIA O(N)
     public int longitud(){
        int cont = 0;
        Nodo temp = inicio;
        while(temp != null){
            cont++;
            temp = temp.getSiguiente();
        }
        return cont;
    }
    //EFICIENCIA O(1)
    public void vaciarLista(){
    inicio = null;
    fin = null;
    }
    
//0(N)
    public void agregarEn(int posi, int valor){
        //VALIDAR:
        //DE CERO (0) HASTA FIN (N - 1) N ---> LONGITUD
        int tama = longitud();
        if((posi < 0) || (posi >= tama)){//POSICION INCORRECTA
            throw new RuntimeException("La posicion no existe en la lista");

            
        } else {
            Nodo nuevo = new Nodo(valor);
            if(posi ==  0){
                nuevo.setSiguiente(inicio);
                inicio = nuevo;

            }else{ //cualquier otra posicion
                    //TENEMOS QUE MOVERNOS
                Nodo temp = inicio;
                int cont = 0;  
                while(cont < (posi - 1)){//temp tiene que quedar una posicion 
                temp = temp.getSiguiente();
                cont++;
                }
                //CONECTAR
                nuevo.setSiguiente(temp.getSiguiente());
                temp.setSiguiente(nuevo);
            }
        }
    }
}