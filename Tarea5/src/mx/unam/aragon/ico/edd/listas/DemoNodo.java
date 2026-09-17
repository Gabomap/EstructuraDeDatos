package mx.unam.aragon.ico.edd.listas;

public class DemoNodo {

    public static void main(String[] args) {

        Nodo<String> head = new Nodo<>("Aa");

        head.setSiguiente(new Nodo<>("De"));

        head.getSiguiente().setSiguiente(new Nodo<>("Mc"));

        head.getSiguiente()
                .getSiguiente()
                .setSiguiente(new Nodo<>("Bb"));

        System.out.println("ESTADO INICIAL DE LA LISTA");
        System.out.println(head);

        System.out.println();
        System.out.println("DATO DEL PRIMER NODO:");
        System.out.println(head.getDato());

        Nodo<String> ultimo = head;

        while (ultimo.getSiguiente() != null) {
            ultimo = ultimo.getSiguiente();
        }

        System.out.println();
        System.out.println("ESTADO DEL ULTIMO NODO:");
        System.out.println(ultimo);

        Nodo<String> nodoDe = head.getSiguiente();
        Nodo<String> nodoMc = nodoDe.getSiguiente();

        Nodo<String> nodoFe = new Nodo<>("Fe");

        nodoDe.setSiguiente(nodoFe);
        nodoFe.setSiguiente(nodoMc);

        System.out.println();
        System.out.println("LISTA DESPUES DE INSERTAR Fe:");
        System.out.println(head);

        Nodo<String> nuevoFinal = new Nodo<>("Zz");

        ultimo = head;

        while (ultimo.getSiguiente() != null) {
            ultimo = ultimo.getSiguiente();
        }

        ultimo.setSiguiente(nuevoFinal);

        System.out.println();
        System.out.println("LISTA DESPUES DE INSERTAR Zz:");
        System.out.println(head);

        Nodo<String> nuevoInicio = new Nodo<>("Aa");

        nuevoInicio.setSiguiente(head);

        head = nuevoInicio;

        System.out.println();
        System.out.println("LISTA FINAL:");
        System.out.println(head);
    }
}