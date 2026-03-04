import java.util.ArrayList;
import java.util.List;

public class Pais {
    public String NombrePais;
    public String CapitalPais;
    public Double SuperficiePais;
    public List<Provincia> ProvinciaPais;
    public List<Pais> PaisLimitrofes;

    public Pais(String NombrePais, String CapitalPais, Double SuperficiePais) {
        this.SuperficiePais = SuperficiePais;
        this.NombrePais = NombrePais;
        this.CapitalPais = CapitalPais;
        this.ProvinciaPais = new ArrayList<>();
        this.PaisLimitrofes = new ArrayList<>();
    }

    public String getNombre() {
        return NombrePais;
    }

    public void setNombre(String NombrePais) {
        this.NombrePais = NombrePais;
    }

    public String getCapital() {
        return CapitalPais;
    }

    public void setCapital(String CapitalPais) {
        this.CapitalPais = CapitalPais;
    }

    public void setSuperficie(Double SuperficiePais) {
        this.SuperficiePais = SuperficiePais;
    }

    public Double getsuperficie() {
        return SuperficiePais;
    }

    public void agregarProvincia(Provincia provincia) {
        this.ProvinciaPais.add(provincia);
    }

    public void eliminarProvincia(Provincia provincia) {
        this.ProvinciaPais.remove(provincia);
    }

    public String toString() {
        return "pais:" + NombrePais +
                " \nCapital: " + CapitalPais +
                " \nSuperficie: " + SuperficiePais +
                " \nProvincia: " + ProvinciaPais;
    }

    public List<Provincia> getProvincias() {
        return ProvinciaPais;
    }

    public List<Pais> getLimitrofes() {
        return PaisLimitrofes;
    }

    public void agregarLimitrofe(Pais pais) {
        if (!PaisLimitrofes.contains(pais)) {
            PaisLimitrofes.add(pais);
        }
    }

    public void eliminarLimitrofe(Pais pais) {
        if (!PaisLimitrofes.remove(pais)) {
            System.out.println("El pais no se encuentra entre los limitrofes");
        }
    }

}