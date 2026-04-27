package eva2_2_lista_simple;

public class EVA2_2_LISTA_SIMPLE {

    public static void main(String[] args) {
        
        long ini,fin,tiempo;
        Lista lista = new Lista(); 
       /* int[] arreglo = new int[1000000];
        ini = System.nanoTime();
        //operacion
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 1000);
        }
        fin = System.nanoTime();
        tiempo = fin - ini; //tiempo en nanosegundos (mil millonesimas de segundo)
        System.out.println("Arreglo - " + tiempo);
        
        for (int i = 0; i < 1000000; i++) {
            lista.agregar((int)(Math.random()* 1000));
        }
        fin = System.nanoTime();
        tiempo = fin - ini;
        System.out.println("Lista - " + tiempo);
        System.out.println("Tamanio = " + lista.longitud());
        lista.vaciarLista();
        System.out.println("Tamanio = " + lista.longitud());
        lista.imprimirLista();  */      
       lista.agregar(100);
       lista.agregar(200);
       lista.agregar(300);
       lista.agregar(400);
       lista.agregar(500);
       lista.imprimirLista();
        System.out.println("Cantidad de nodos: " + lista.longitud());
        lista.agregarEn(3, -1);
        lista.imprimirLista();
        System.out.println("Cantidad de nodos" + lista.longitud());
    }
}