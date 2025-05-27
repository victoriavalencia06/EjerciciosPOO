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

    public void dirigirPartido() {
        System.out.println("Está dirigiendo un partido.");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Está dirigiendo un entrenamiento.");
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador esta dirigiendo un entrenamiento");
    }

    @Override
    public void viajar() {
        System.out.println("El entrenador esta viajando");
    }
}
