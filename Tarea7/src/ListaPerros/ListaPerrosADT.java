package ListaPerros;

public class ListaPerrosADT<T> {

    private Nodo<T> cabeza;

    public ListaPerrosADT() {
        cabeza = null;
    }

    public void agregar(T dato) {

        Nodo<T> nuevo = new Nodo<>(dato);

        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        Nodo<T> actual = cabeza;

        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }

        actual.setSiguiente(nuevo);
    }

    public void transversal() {

        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo<T> actual = cabeza;

        while (actual != null) {
            System.out.print("| " + actual.getDato() + " ");
            actual = actual.getSiguiente();
        }
    }

    public int getTamanio() {

        int contador = 0;
        Nodo<T> actual = cabeza;

        while (actual != null) {
            contador++;
            actual = actual.getSiguiente();
        }

        return contador;
    }

    public void agregarDespuesDe(T referencia, T dato) {

        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        Nodo<T> actual = cabeza;

        while (actual != null && !actual.getDato().equals(referencia)) {
            actual = actual.getSiguiente();
        }

        if (actual != null) {
            Nodo<T> nuevo = new Nodo<>(dato, actual.getSiguiente());
            actual.setSiguiente(nuevo);
        }
    }

    public void eliminarElPrimero() {

        if (cabeza == null) {
            System.out.println("No hay elementos para eliminar.");
            return;
        }

        cabeza = cabeza.getSiguiente();
    }

    public void eliminarElUltimo() {

        if (cabeza == null) {
            System.out.println("La lista está vacía.");
            return;
        }

        if (cabeza.getSiguiente() == null) {
            cabeza = null;
            return;
        }

        Nodo<T> actual = cabeza;

        while (actual.getSiguiente().getSiguiente() != null) {
            actual = actual.getSiguiente();
        }

        actual.setSiguiente(null);
    }

    public void agregarAlInicio(T dato) {

        Nodo<T> nuevo = new Nodo<>(dato, cabeza);
        cabeza = nuevo;
    }

    public void agregarAlFinal(T dato) {

        agregar(dato);
    }

    public void actualizar(T referencia, T nuevoDato) {

        Nodo<T> actual = cabeza;

        while (actual != null) {

            if (actual.getDato().equals(referencia)) {
                actual.setDato(nuevoDato);
                return;
            }

            actual = actual.getSiguiente();
        }
    }

    public int buscar(T dato) {

        Nodo<T> actual = cabeza;
        int posicion = 0;

        while (actual != null) {

            if (actual.getDato().equals(dato)) {
                return posicion;
            }

            actual = actual.getSiguiente();
            posicion++;
        }

        return -1;
    }

    public boolean estaVacia() {

        return cabeza == null;
    }

}
