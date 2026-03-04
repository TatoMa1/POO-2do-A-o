
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MapaMundiController {

    private Mapamundi mundo;

    public MapaMundiController() {
        mundo = new Mapamundi();
    }

    public void listarPaisDeContinente(String nombreContinente) {
        for (Continente continente : mundo.getListaContinentes()) {
            if (continente.getNombre().equalsIgnoreCase(nombreContinente)) {
                System.out.println("Países en el continente " + nombreContinente + ":");
                for (Pais pais : continente.getPais()) {
                    System.out.println("- " + pais.getNombre());
                }
                return;
            }
        }
        System.out.println("No se encontró el continente: " + nombreContinente);
    }

    public void listarProvinciasDePais(String nombrePais) {
        for (Continente continente : mundo.getListaContinentes()) {
            for (Pais pais : continente.getPais()) {
                if (pais.getNombre().equalsIgnoreCase(nombrePais)) {
                    System.out.println("Provincias en el país " + nombrePais + ":");
                    for (Provincia provincia : pais.getProvincias()) {
                        System.out.println("- " + provincia.getNombreProvincia());
                    }
                    return;
                }
            }
        }
        System.out.println("No se encontró el país: " + nombrePais);
    }

    public void listarPaisOrdenadosPorSuperficie() {
        List<Pais> todosLosPais = new ArrayList<>();

        for (Continente continente : mundo.getListaContinentes()) {
            todosLosPais.addAll(continente.getPais());
        }

        todosLosPais.sort(Comparator.comparingDouble(Pais::getsuperficie).reversed());

        System.out.println("Países ordenados por superficie (de mayor a menor):");
        for (Pais pais : todosLosPais) {
            System.out.println(pais.getNombre() + " - " + pais.getsuperficie() + " km²");
        }
    }

    public void compararSuperficie(String nombrePais1, String nombrePais2) {
        Pais pais1 = null;
        Pais pais2 = null;

        for (Continente continente : mundo.getListaContinentes()) {
            for (Pais pais : continente.getPais()) {
                if (pais.getNombre().equalsIgnoreCase(nombrePais1)) {
                    pais1 = pais;
                }
                if (pais.getNombre().equalsIgnoreCase(nombrePais2)) {
                    pais2 = pais;
                }
            }
        }

        if (pais1 == null || pais2 == null) {
            System.out.println("Uno o ambos países no fueron encontrados.");
            return;
        }

        double superficie1 = pais1.getsuperficie();
        double superficie2 = pais2.getsuperficie();

        System.out.println(pais1.getNombre() + ": " + superficie1 + " km²");
        System.out.println(pais2.getNombre() + ": " + superficie2 + " km²");

        if (superficie1 > superficie2) {
            System.out.println(pais1.getNombre() + " es más grande que " + pais2.getNombre());
        } else if (superficie1 < superficie2) {
            System.out.println(pais2.getNombre() + " es más grande que " + pais1.getNombre());
        } else {
            System.out.println("Ambos países tienen la misma superficie.");
        }
    }

    private Pais obtenerPaisPorNombre(String nombrePais) {
        for (Continente continente : mundo.getListaContinentes()) {
            for (Pais pais : continente.getPais()) {
                if (pais.getNombre().equalsIgnoreCase(nombrePais)) {
                    return pais;
                }
            }
        }
        return null;
    }

    public void mostrarLimitrofesDePais(String nombrePais) {
        if (nombrePais == null || nombrePais.isEmpty()) {
            System.out.println("El nombre del país no puede estar vacío.");
            return;
        }

        Pais pais = obtenerPaisPorNombre(nombrePais);
        if (pais == null) {
            System.out.println("El país " + nombrePais + " no existe en el registro.");
            return;
        }

        List<Pais> limitrofes = pais.getLimitrofes();

        if (limitrofes.isEmpty()) {
            System.out.println("El país " + nombrePais + " no tiene países limítrofes registrados.");
        } else {
            System.out.println("Países limítrofes de " + nombrePais + ":");
            for (Pais p : limitrofes) {
                System.out.println("- " + p.getNombre());
            }
        }
    }

}