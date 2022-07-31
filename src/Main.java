public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Persona persona  = new Persona();
        persona.setEdad(33);
        persona.setNombre("Allan Brito");
        persona.setTelefono("003-3-2134234");

        System.out.println("Persona {Edad: " + persona.getEdad() +
                            ", Nombre: " + persona.getNombre() +
                            ", Telefono: " + persona.getTelefono() +
                            "}");
        //System.out.println(persona.toString());


    }
}

//CLASE PERSONA
class Persona{
    private int edad;
    private String nombre, telefono;

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}