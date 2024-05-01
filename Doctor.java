import java.util.List;

public class Doctor {
    private String Nombres;
    private String Apellidos;
    private String Estado;

    public Doctor(String nombres, String apellidos, String estado){
        Nombres=nombres;
        Apellidos=apellidos;
        Estado= estado;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }
}
