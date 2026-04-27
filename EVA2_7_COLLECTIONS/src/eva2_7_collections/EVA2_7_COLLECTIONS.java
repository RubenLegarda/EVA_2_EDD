package eva2_7_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class EVA2_7_COLLECTIONS {

    public static void main(String[] args) {

        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.add(100);
        lista.add(200);
        lista.add(300);
        lista.add(400);
        lista.add(500);
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);
        //ARRAYLIST
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Hola");
        arrayList.add("");
        arrayList.add("Mundo");
        arrayList.add("Cruel");
        arrayList.add("!!!");
        System.out.println(arrayList);
        arrayList.remove(3);
        System.out.println("Tamanio del arrayList = " + arrayList.size());
        System.out.println(arrayList);
        //QUEUE
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(100);
        queue.add(200);
        queue.add(300);
        queue.add(400);
        System.out.println(queue.peek());//lee el primer elemento
        System.out.println(queue.poll());//nuestro pop: lee y elimina el primer elemento
        System.out.println(queue);
        //STACK
        Stack<String> stack = new Stack<String>();
        arrayList.add("Hola");
        arrayList.add("");
        arrayList.add("Mundo");
        arrayList.add("Cruel");
        arrayList.add("!!!");
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        
    }
    
}
