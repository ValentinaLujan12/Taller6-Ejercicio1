public class Profesor extends Persona{
    
    String materia;
    private int cedula;

    public Profesor(String materia, String nombre, int cedula) {
        super(nombre, cedula);
        this.materia = materia;
    }

    public Profesor() {
        this("Fisica");
        super("Juan", 20123);
    }

    public Profesor(String materia) {
        this(materia, "Juan", 20123);
    }

    public int getCedula() {
        return cedula;
    }

    public long getCedulaS () {
        return super.cedula;
    }

}