import java.util.List;

public class Professor extends Persona{

    String str;
    int edad;
    String numTelefono;
    List<Prestamo> prestamos;

    public Professor(String numTelefono) {

        super(numTelefono);
    }

    public void infoPersonal(){
        System.out.println("Nombre: " + str);
        System.out.println("Edad" + edad);
        System.out.println("Telefono" + numTelefono);
        for (Prestamo p : prestamos){
            System.out.println( p);
        }
    }

}
