
package eva2_1_referencias;


public class EVA2_1_REFERENCIAS {

    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo miObj = new Ejemplo();
        miObj.valor = 100;
        miObj.otro = new Ejemplo();
        miObj.otro.valor = 200;
        miObj.otro.otro = new Ejemplo();
        miObj.otro.otro.valor = 300;
        System.out.println("MiObj = " + miObj.valor);
        System.out.println("MiObj.otro = " + miObj.otro.valor);
        System.out.println("MiObj.otro.otro = " + miObj.otro.otro.valor);

        
    }
    
}


class Ejemplo{
    int valor;
    Ejemplo otro;
}