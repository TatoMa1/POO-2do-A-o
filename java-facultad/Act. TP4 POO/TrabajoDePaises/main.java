public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    MapaMundiController controller = new MapaMundiController();

    System.out.println("continentes con datos disponibles:");
    System.out.println("America, Europa");
    System.out.println("Ingrese el nombre del continente: ");
    String continente = scanner.nextLine();

    controller.listarPaisDeContinente(continente);
    System.out.println();
    System.out.print("Ingrese el nombre del país: ");
    String pais = scanner.nextLine();

    controller.listarProvinciasDePais(pais);

    System.err.println("");
    System.err.println("Paises ordenados por superficie");
    System.err.println("");
    controller.listarPaisOrdenadosPorSuperficie();
    System.out.println("");
    System.out.print("Ingrese el nombre del primer país para comparar: ");
    String pais1 = scanner.nextLine();
    System.out.print("Ingrese el nombre del segundo país para comparar: ");
    String pais2 = scanner.nextLine();
    controller.compararSuperficie(pais1, pais2);
    System.out.println("");
    System.out.print("Desea buscar los paises limitrofes de algun pais? (si/no): ");
    String respuesta = scanner.nextLine();
    if (respuesta.equalsIgnoreCase("si")) {
        System.out.print("Ingrese el nombre del país: ");
        String paisLimite = scanner.nextLine();
        controller.mostrarLimitrofesDePais(paisLimite);
    } else {
        System.out.println("No se buscaron paises limitrofes.");
    }

    scanner.close();

}