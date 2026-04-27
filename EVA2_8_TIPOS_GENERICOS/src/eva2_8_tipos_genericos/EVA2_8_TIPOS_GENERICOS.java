package eva2_8_tipos_genericos;

public class EVA2_8_TIPOS_GENERICOS {

    public static void main(String[] args) {
        //int, double, char
        //Integer
        int x = 100;
        Integer val = x;
        Prueba<String> prueba = new Prueba<String>("");
        prueba.setDato("Hola");
    }
    
}

class Prueba<T>{
    private T dato;

    public Prueba(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }
    
}