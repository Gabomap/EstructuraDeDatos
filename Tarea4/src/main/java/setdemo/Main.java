package setdemo;

public class Main {

    public static void main(String[] args) {
        
        System.out.println("   VISITANTES UNICOS DE UNA PAGINA");
        System.out.println();

        VisitantesUnicos pagina = new VisitantesUnicos();

        System.out.println("PRUEBA 1: Registrar visitantes");
        System.out.println();

        pagina.registrarVisitante("192.168.1.10");
        pagina.registrarVisitante("192.168.1.25");
        pagina.registrarVisitante("192.168.1.10");
        pagina.registrarVisitante("192.168.1.32");
        pagina.registrarVisitante("192.168.1.25");

        System.out.println("Se registraron 5 visitas.");
        System.out.println("Visitantes unicos: "
                + pagina.totalVisitantesUnicos());

        System.out.println();

        System.out.println("PRUEBA 2: Verificar visitantes");
        System.out.println();

        System.out.println(
                "192.168.1.10 registrada: "
                        + pagina.esVisitanteRegistrado("192.168.1.10")
        );

        System.out.println(
                "192.168.1.99 registrada: "
                        + pagina.esVisitanteRegistrado("192.168.1.99")
        );

        System.out.println();

        System.out.println("PRUEBA 3: Mostrar visitantes unicos");
        System.out.println();

        pagina.mostrarVisitantes();

        System.out.println();

        System.out.println("Resultado esperado: 3 visitantes");
    }
}