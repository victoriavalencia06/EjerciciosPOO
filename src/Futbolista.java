public class Futbolista extends Persona {
    private int id;
    private int dorsal;
    private String demostracion;

    public Futbolista() {

    }

    public Futbolista(int idPersona, String nombre, String apellido, int edad, int id, int dorsal, String demostracion) {
        super(idPersona, nombre, apellido, edad);
        this.id = id;
        this.dorsal = dorsal;
        this.demostracion = demostracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemostracion() {
        return demostracion;
    }

    public void setDemostracion(String demostracion) {
        this.demostracion = demostracion;
    }

    public void jugarPartido() {
        System.out.println("Esta jugando un partido");
    }

    public void entrenar() {
        System.out.println("Está entrenando.");
    }

    @Override
    public void concentrarse() {
        System.out.println("El futbolista esta concentrado");
    }

    @Override
    public void viajar() {
        System.out.println("El fultbolista esta viajando");
    }
}
