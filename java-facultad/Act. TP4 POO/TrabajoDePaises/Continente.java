import java.util.ArrayList;
import java.util.List;

public class Continente {
    public String NombreContinente;
    public List<Pais> PaisesContinente;

    public Continente(String NombreContinente) {
        this.NombreContinente = NombreContinente;
        this.PaisesContinente = new ArrayList<Pais>();
    }

    public String getNombre() {
        return NombreContinente;
    }

    public void setNombre(String NombreContinente) {
        this.NombreContinente = NombreContinente;
    }

    public List<Pais> getPais() {
        return PaisesContinente;
    }

    public void agregarPais(Pais pais) {
        this.PaisesContinente.add(pais);
    }

    public void eliminarPais(Pais pais) {
        this.PaisesContinente.remove(pais);
    }

    public String toString() {
        return "Continente: " + NombreContinente +
                "\nPais: " + PaisesContinente;
    }

}