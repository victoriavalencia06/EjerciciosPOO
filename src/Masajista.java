public class Masajista extends Persona {
    private int id;
    private String titulacion;
    private int aniosExperiencia;

    public Masajista() {

    }

    public Masajista(int idPersona, String nombre, String apellido, int edad, int id, String titulacion, int aniosExperiencia) {
        super(idPersona, nombre, apellido, edad);
        this.id = id;
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }
}
