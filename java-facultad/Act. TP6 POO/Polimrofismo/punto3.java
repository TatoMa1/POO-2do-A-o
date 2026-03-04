
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

interface ImpactoEcologico {
    double obtenerImpactoEcologico();

    String getIdentificacion();
}

class Edificio implements ImpactoEcologico {
    private final String nombre;
    private final double consumoKWhMensual;
    private final double factorEmisionKgCO2PorKWh;

    public Edificio(String nombre, double consumoKWhMensual, double factorEmisionKgCO2PorKWh) {
        this.nombre = nombre;
        this.consumoKWhMensual = consumoKWhMensual;
        this.factorEmisionKgCO2PorKWh = factorEmisionKgCO2PorKWh;
    }

    @Override
    public double obtenerImpactoEcologico() {
        return consumoKWhMensual * 12.0 * factorEmisionKgCO2PorKWh;
    }

    @Override
    public String getIdentificacion() {
        return "Edificio: " + nombre;
    }
}

class Auto implements ImpactoEcologico {
    private final String marcaModelo;
    private final double consumoLitrosPor100km;
    private final double kmPorAnio;
    private final double kgCO2PorLitroCombustible;

    public Auto(String marcaModelo, double consumoLitrosPor100km, double kmPorAnio, double kgCO2PorLitroCombustible) {
        this.marcaModelo = marcaModelo;
        this.consumoLitrosPor100km = consumoLitrosPor100km;
        this.kmPorAnio = kmPorAnio;
        this.kgCO2PorLitroCombustible = kgCO2PorLitroCombustible;
    }

    @Override
    public double obtenerImpactoEcologico() {
        double litrosAnuales = (kmPorAnio / 100.0) * consumoLitrosPor100km;
        return litrosAnuales * kgCO2PorLitroCombustible;
    }

    @Override
    public String getIdentificacion() {
        return "Auto: " + marcaModelo;
    }
}

class Bicicleta implements ImpactoEcologico {
    private final String descripcion;
    private final double kmPorAnio;
    private final double kgCO2PorKm;

    public Bicicleta(String descripcion, double kmPorAnio, double kgCO2PorKm) {
        this.descripcion = descripcion;
        this.kmPorAnio = kmPorAnio;
        this.kgCO2PorKm = kgCO2PorKm;
    }

    @Override
    public double obtenerImpactoEcologico() {
        return kmPorAnio * kgCO2PorKm;
    }

    @Override
    public String getIdentificacion() {
        return "Bicicleta: " + descripcion;
    }
}

public class punto3 {
    public static void main(String[] args) {
        List<ImpactoEcologico> objetos = new ArrayList<>();

        objetos.add(new Edificio("Torre Central", 1200.0, 0.4));
        objetos.add(new Edificio("Escuela N°12", 400.0, 0.35));

        objetos.add(new Auto("Ford Fiesta 1.6", 7.5, 15000, 2.31));
        objetos.add(new Auto("Toyota Prius", 4.5, 12000, 2.31));

        objetos.add(new Bicicleta("Urbana cromada", 2000, 0.02));
        objetos.add(new Bicicleta("Plegable", 800, 0.02));

        DecimalFormat df = new DecimalFormat("#,##0.00");

        System.out.println("Impactos ecológicos anuales (kg CO2e):");
        for (ImpactoEcologico obj : objetos) {
            double impacto = obj.obtenerImpactoEcologico();
            System.out.println(obj.getIdentificacion() + " -> " + df.format(impacto) + " kg CO2e");
        }
    }
}
