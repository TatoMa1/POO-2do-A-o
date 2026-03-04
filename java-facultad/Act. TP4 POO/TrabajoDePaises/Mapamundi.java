import java.util.*;

public class Mapamundi {
    public List<Continente> listaContinentes;

    public Mapamundi() {
        listaContinentes = new ArrayList<>();

        Continente america = new Continente("America");
        Continente europa = new Continente("Europa");
        Continente asia = new Continente("Asia");
        Continente africa = new Continente("Africa");
        Continente oceania = new Continente("Oceania");
        Continente antartida = new Continente("Antartida");

        listaContinentes.addAll(Arrays.asList(america, europa, asia, africa, oceania, antartida));

        Pais argentina = new Pais("Argentina", "Buenos Aires", 3761274.00);
        Pais uruguay = new Pais("Uruguay", "Montevideo", 176215.00);
        Pais brasil = new Pais("Brasil", "Brasilia", 8510417.77);
        Pais chile = new Pais("Chile", "Santiago", 756945.00);
        Pais paraguay = new Pais("Paraguay", "Asuncion", 406752.00);
        Pais bolivia = new Pais("Bolivia", "La Paz", 1098581.00);
        Pais espania = new Pais("Espania", "Madrid", 505992.00);
        Pais francia = new Pais("Francia", "Paris", 649801.00);
        Pais italia = new Pais("Italia", "Roma", 302070.00);
        Pais portugal = new Pais("Portugal", "Lisboa", 92212.00);

        america.agregarPais(argentina);
        argentina.agregarLimitrofe(uruguay);
        argentina.agregarLimitrofe(brasil);
        argentina.agregarLimitrofe(chile);
        argentina.agregarLimitrofe(paraguay);
        argentina.agregarLimitrofe(bolivia);

        america.agregarPais(uruguay);
        uruguay.agregarLimitrofe(argentina);
        uruguay.agregarLimitrofe(brasil);

        america.agregarPais(brasil);
        brasil.agregarLimitrofe(argentina);
        brasil.agregarLimitrofe(uruguay);
        brasil.agregarLimitrofe(chile);
        brasil.agregarLimitrofe(paraguay);

        america.agregarPais(chile);
        chile.agregarLimitrofe(argentina);
        chile.agregarLimitrofe(bolivia);

        america.agregarPais(paraguay);
        paraguay.agregarLimitrofe(argentina);
        paraguay.agregarLimitrofe(bolivia);
        paraguay.agregarLimitrofe(brasil);

        america.agregarPais(bolivia);
        bolivia.agregarLimitrofe(argentina);
        bolivia.agregarLimitrofe(paraguay);
        bolivia.agregarLimitrofe(brasil);
        bolivia.agregarLimitrofe(chile);

        europa.agregarPais(espania);
        espania.agregarLimitrofe(francia);
        espania.agregarLimitrofe(portugal);

        europa.agregarPais(francia);
        francia.agregarLimitrofe(espania);
        francia.agregarLimitrofe(italia);

        europa.agregarPais(italia);
        italia.agregarLimitrofe(francia);

        europa.agregarPais(portugal);
        portugal.agregarLimitrofe(espania);

        Provincia entreRios = new Provincia("Entre Ríos");
        Provincia buenosAires = new Provincia("Buenos Aires");
        Provincia santaFe = new Provincia("Santa Fe");
        Provincia corrientes = new Provincia("Corrientes");
        Provincia cordoba = new Provincia("Cordoba");
        Provincia salta = new Provincia("Salta");
        Provincia paysandu = new Provincia("Paysandu");
        Provincia canelones = new Provincia("Canelones");
        Provincia rocha = new Provincia("Rocha");
        Provincia maldonado = new Provincia("Maldonado");

        argentina.agregarProvincia(entreRios);
        argentina.agregarProvincia(buenosAires);
        argentina.agregarProvincia(santaFe);
        argentina.agregarProvincia(corrientes);
        argentina.agregarProvincia(cordoba);

        uruguay.agregarProvincia(salta);
        uruguay.agregarProvincia(paysandu);
        uruguay.agregarProvincia(canelones);
        uruguay.agregarProvincia(rocha);
        uruguay.agregarProvincia(maldonado);
    }

    public Set<Pais> getPais(String nombreContinente) {
        for (Continente continente : listaContinentes) {
            if (continente.getNombre().equalsIgnoreCase(nombreContinente)) {
                return new HashSet<>(continente.getPais());
            }
        }
        return Collections.emptySet();
    }

    public Set<Provincia> getProvincias(String nombrePais) {
        for (Continente continente : listaContinentes) {
            for (Pais pais : continente.getPais()) {
                if (pais.getNombre().equalsIgnoreCase(nombrePais)) {
                    return new HashSet<>(pais.getProvincias());

                }
            }
        }
        return Collections.emptySet();
    }

    public List<Continente> getListaContinentes() {
        return listaContinentes;
    }
}
