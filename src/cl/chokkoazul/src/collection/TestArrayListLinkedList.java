package cl.chokkoazul.src.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by cristian.osorio on 05-03-17.
 */
public class TestArrayListLinkedList {

    public static void main(String [] arg){

        List<String> arrayList = new ArrayList();
        List<String> linkedList = new LinkedList();
        long inicio,fin, totalArray, totalLinked;
        for(int i=0;i<10000000;i++){
            arrayList.add("registro numero "+i);
            linkedList.add("registro numero "+i);
        }

        System.out.println("---------------recuperar al inicio en un arraylist");
        inicio = System.currentTimeMillis();
        arrayList.get(0);
        fin = System.currentTimeMillis();
        System.out.println(fin - inicio + " tiempo en recuperar el elemento inicial arraylist");
        totalArray = fin -inicio;

        System.out.println("---------------recuperar al inicio en un linkedlist");
        inicio = System.currentTimeMillis();
        linkedList.get(0);
        fin = System.currentTimeMillis();
        System.out.println(fin - inicio + " tiempo en recuperar el elemento inicial de un linkedlist");
        totalLinked = fin -inicio;
        if(totalArray==totalLinked) System.out.println("Son lo mismo");
        else if(totalArray>totalLinked) System.out.println("Linkedlist es mejor");
        else System.out.println("Arraylist es mejor");

        System.out.println("\n---------------recuperar entre medio en un arraylist");
        inicio = System.currentTimeMillis();
        arrayList.get(100000);
        fin = System.currentTimeMillis();
        System.out.println(fin - inicio + " tiempo en recuperar el elemento entre medio arraylist");
        totalArray = fin -inicio;

        System.out.println("---------------recuperar entre medio en un linkedlist");
        inicio = System.currentTimeMillis();
        linkedList.get(100000);
        fin = System.currentTimeMillis();
        System.out.println(fin - inicio + " tiempo en recuperar el elemento entre medio de un linkedlist");
        totalLinked = fin -inicio;
        if(totalArray==totalLinked) System.out.println("Son lo mismo");
        else if(totalArray>totalLinked) System.out.println("Linkedlist es mejor");
        else System.out.println("Arraylist es mejor");

        System.out.println("\n---------------recuperar al final en un arraylist");
        inicio = System.currentTimeMillis();
        arrayList.get(arrayList.size()-1);
        fin = System.currentTimeMillis();
        System.out.println(fin - inicio + " tiempo en recuperar el elemento al final arraylist");
        totalArray = fin -inicio;

        System.out.println("---------------recuperar al final en un linkedlist");
        inicio = System.currentTimeMillis();
        linkedList.get(arrayList.size()-1);
        fin = System.currentTimeMillis();
        System.out.println(fin - inicio + " tiempo en recuperar el elemento al final de un linkedlist");
        totalLinked = fin -inicio;
        if(totalArray==totalLinked) System.out.println("Son lo mismo");
        else if(totalArray>totalLinked) System.out.println("Linkedlist es mejor");
        else System.out.println("Arraylist es mejor");

        System.out.println("\n---------------insertar al inicio en un arraylist");
        inicio = System.currentTimeMillis();
        arrayList.add(0,"registro al inicio");
        fin = System.currentTimeMillis();
        System.out.println(fin - inicio + " tiempo en insertar un elemento al inicio de arraylist");
        totalArray = fin -inicio;

        System.out.println("---------------insertar al inicio en un linkedlist");
        inicio = System.currentTimeMillis();
        linkedList.add(0,"registro al inicio");
        fin = System.currentTimeMillis();
        System.out.println(fin - inicio + " tiempo en insertar un elemnto al inicio de linkedlist");
        totalLinked = fin -inicio;
        if(totalArray==totalLinked) System.out.println("Son lo mismo");
        else if(totalArray>totalLinked) System.out.println("Linkedlist es mejor");
        else System.out.println("Arraylist es mejor");

        System.out.println("\n---------------insertar entre medio en un arraylist");
        inicio = System.currentTimeMillis();
        arrayList.add(10000,"registro al medio");
        fin = System.currentTimeMillis();
        System.out.println(fin - inicio + " tiempo en insertar un elemento entre medio de arraylist");
        totalArray = fin -inicio;

        System.out.println("---------------insertar entre medio en un linkedlist");
        inicio = System.currentTimeMillis();
        linkedList.add(10000,"registro al medio");
        fin = System.currentTimeMillis();
        System.out.println(fin - inicio + " tiempo en insertar un elemnto entre medio de linkedlist");
        totalLinked = fin -inicio;
        if(totalArray==totalLinked) System.out.println("Son lo mismo");
        else if(totalArray>totalLinked) System.out.println("Linkedlist es mejor");
        else System.out.println("Arraylist es mejor");

        System.out.println("\n---------------insertar al final en un arraylist");
        inicio = System.currentTimeMillis();
        arrayList.add("ultimo registro");
        fin = System.currentTimeMillis();
        System.out.println(fin - inicio + " tiempo en insertar un elemento al final de arraylist");
        totalArray = fin -inicio;

        System.out.println("---------------insertar al final en un linkedlist");
        inicio = System.currentTimeMillis();
        linkedList.add("ultimo registro");
        fin = System.currentTimeMillis();
        System.out.println(fin - inicio + " tiempo en insertar un elemnto al final de linkedlist");
        totalLinked = fin -inicio;
        if(totalArray==totalLinked) System.out.println("Son lo mismo");
        else if(totalArray>totalLinked) System.out.println("Linkedlist es mejor");
        else System.out.println("Arraylist es mejor");





    }
}
