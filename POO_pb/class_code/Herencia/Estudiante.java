package POO_pb.class_code.Herencia;

public class Estudiante extends Persona {
    private String programa;
    
    //Constructor
    public  Estudiante(String nombre, String programa){
        super(nombre); //super se utiliza para llamar a los atributos o metodos de la clase padre.
        this.programa = programa;
    }

    //llama al metodo de la clase padre
    public String Estudiar(){
        return getNombre()+" Estudia " + programa;
    }

}
