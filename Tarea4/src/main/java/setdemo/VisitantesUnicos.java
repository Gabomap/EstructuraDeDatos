package setdemo;

public class VisitantesUnicos {

    private ConjuntoADT<String> visitantes;

    public VisitantesUnicos() {
        visitantes = new ConjuntoADT<>();
    }

    public void registrarVisitante(String ip) {

        if (!visitantes.contieneElemento(ip)) {
            visitantes.agregarElemento(ip);
        }
    }

    public int totalVisitantesUnicos() {
        return visitantes.longitud();
    }

    public boolean esVisitanteRegistrado(String ip) {
        return visitantes.contieneElemento(ip);
    }

    public void mostrarVisitantes() {

        System.out.println("Visitantes unicos:");

        for (String ip : visitantes.getElementos()) {
            System.out.println("- " + ip);
        }
    }
}