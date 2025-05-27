public class Main {
    public static void main(String[] args) {

        Persona[] equipo = {
                new Futbolista(1, "Juan", "Perez", 30, 1, 10, "Delantero"),
                new Masajista(2, "Carlos", "Martinez", 31, 1, "Fisioterapeuta", 15),
                new Entrenador(3, "Pablo", "Lopez", 40, 1, 6545)
        };

        for (Persona persona : equipo) {
            persona.concentrarse();
            persona.viajar();
        }
    }
}