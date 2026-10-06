package ListaPerros;

public class Principal {


    public static void main(String[] args) {

        ListaPerrosADT<Perro> perros = new ListaPerrosADT<>();

        System.out.println("¿La lista se encuentra vacía?");
        System.out.println(perros.estaVacia());

        perros.transversal();

        System.out.println("\n===== AGREGANDO PERROS =====");

        perros.agregar(new Perro("Chihuahua", 2, true));
        perros.agregar(new Perro("Dalmata", 4, false));
        perros.agregar(new Perro("Perro Amarillo", 5, false));

        perros.transversal();

        System.out.println("\n\nNúmero de perros: " + perros.getTamanio());

        System.out.println("\n===== INSERTANDO UN PERRO =====");

        perros.agregarDespuesDe(
                new Perro("Chihuahua", 2, true),
                new Perro("Pug", 3, true)
        );

        perros.transversal();

        System.out.println("\n\n===== QUITANDO EL PRIMERO =====");

        perros.eliminarElPrimero();
        perros.transversal();

        System.out.println("\n\n===== QUITANDO EL ÚLTIMO =====");

        perros.eliminarElUltimo();
        perros.transversal();

        System.out.println("\n\n===== AGREGANDO AL PRINCIPIO =====");

        perros.agregarAlInicio(new Perro("Pibble", 5, false));
        perros.transversal();

        System.out.println("\n\n===== AGREGANDO AL FINAL =====");

        perros.agregarAlFinal(new Perro("Pastor Aleman", 10, true));
        perros.transversal();

        System.out.println("\n\n===== MODIFICANDO UN PERRO =====");

        perros.actualizar(
                new Perro("Dalmata", 4, false),
                new Perro("Golden Retriever", 3, true)
        );

        perros.transversal();

        System.out.println("\n\n===== BUSCAR PERRO =====");

        Perro buscado = new Perro("Pibble", 5, false);
        int posicion = perros.buscar(buscado);

        if (posicion != -1) {
            System.out.println("El perro fue encontrado en la posición: " + posicion);
        } else {
            System.out.println("El perro no fue encontrado.");
        }

        System.out.println("\n===== LISTA FINAL =====");
        perros.transversal();

        System.out.println("\n\n¿La lista está vacía?");
        System.out.println(perros.estaVacia());
    }

}
