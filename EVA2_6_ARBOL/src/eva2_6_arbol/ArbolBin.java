package eva2_6_arbol;

public class ArbolBin {
    private Nodo raiz;
    
    public ArbolBin(){
        raiz = null; //arbol vacio
    }
    public void agregar (int valor){
    //VERIFICAMOS SI HAY NODOS EN EL ARBOL
    //SI EL ARBOL ESTA VACIO: FACIL
    
    if(raiz == null){ //la raiz es el nuevo nodo
        raiz = new Nodo(valor);
    } else{//RECURSIVIDAD
        agregarRecu(raiz,valor);
    }
    }
    //O(log2N)// --> SOLO SI EL ARBOL ES BALANCEADO:
    //O(N) --> 
    private void agregarRecu(Nodo actual, int valor){
        if (valor < actual.getValor()){//LADO IZQUIERDO
            if(actual.getIzquierda()== null){//ESPACIO DISPONIBLE
                //INSERTAMOS
            Nodo nuevo = new Nodo(valor);
            actual.setIzquierda(nuevo);//agregamos el nuevo nodo 
            }else{//ESPACIO OCUPADO
                //MOVERNOS
                agregarRecu(actual.getIzquierda(),valor);
            
            }
            }if (valor > actual.getValor()){//LADO DERECHO
                if(actual.getDerecha()== null){//ESPACIO DISPONIBLE
                    //INSERTAMOS
                Nodo nuevo = new Nodo(valor);
                actual.setDerecha(nuevo);//agregamos el nuevo nodo 
                }else{//ESPACIO OCUPADO
                    //MOVERNOS
                    agregarRecu(actual.getDerecha(),valor);
             }
            }
        }   
    public void imprimirPreOrder(){
        imprimirPreOrderRec(raiz);//Iniciamos en root
    }
    //O(N) ---> IMPRIMIR(VISITAR) TODOS LOS NODOS DEL ARBOL
    public void imprimirPreOrderRec(Nodo actual){
        if(actual != null){
        System.out.print("[" + actual.getValor() + "]"); //VISITAR EL NODO
        //RECORRER EL LADO IZQ
        imprimirPreOrderRec(actual.getIzquierda());
        //RECORRER EL LADO DER
        imprimirPreOrderRec(actual.getDerecha());
        }
    }
        public void imprimirPosOrder(){
        imprimirPosOrderRec(raiz);//Iniciamos en root
    }
        public void imprimirPosOrderRec(Nodo actual){
        if(actual != null){

        imprimirPreOrderRec(actual.getIzquierda());//RECORRER EL LADO IZQ
        
        imprimirPreOrderRec(actual.getDerecha());//RECORRER EL LADO DER
        
        System.out.print("[" + actual.getValor() + "]");//VISITAR EL NODO
        }
    }
        
    public void imprimirInOrder(){
        imprimirInOrderRec(raiz);//Iniciamos en root
    }
        public void imprimirInOrderRec(Nodo actual){
        if(actual != null){

        imprimirPreOrderRec(actual.getIzquierda());//RECORRER EL LADO IZQ
        
                System.out.print("[" + actual.getValor() + "]");//VISITAR EL NODO
        
        
        imprimirPreOrderRec(actual.getDerecha());//RECORRER EL LADO DER
        
        }
    }

    }
    
