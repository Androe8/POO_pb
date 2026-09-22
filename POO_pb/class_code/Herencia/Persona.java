package POO_pb.class_code.Herencia;

public class Persona {
    private String nombre;

    //Constructor
    public Persona(String nombre){
        this.nombre = nombre;
    }

    //Metodo get para leer el nombre
    public String getNombre(){
        return nombre;
    }

    //metodo
    public String Saludar(){
        return "Hola "+nombre;
    }

}

