public class Estudiante extends Persona{
    
    int codigo;

    public void combinarNombre(String n) {
        super.nombre += n;
    }

    public final int getEdad() {
        return 20;
    }

}
