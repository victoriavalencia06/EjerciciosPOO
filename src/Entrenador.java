public class Entrenador extends Persona {
    private int id;
    private int idFederacion;

    public Entrenador() {

    }

    public Entrenador(int idPersona, String nombre, String apellido, int edad, int id, int idFederacion) {
        super(idPersona, nombre, apellido, edad);
        this.id = id;
        this.idFederacion = idFederacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
}
