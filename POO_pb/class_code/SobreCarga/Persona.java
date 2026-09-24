package POO_pb.class_code.SobreCarga;

public class Persona {     
    String nombre;
    int edad;

    //constructor
    public Persona (String nombre, int edad ){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String rol(){
        return "persona";
    }

    public String mostrarInfoPersona(String identificacion, String nombre){
        return " Nombre : " +nombre+ " Identificacion "+ identificacion;
    }   
    
    @Override 
    public String toString(){
        return "Persona { Nombre : " +nombre+ " Edad " + edad;
    }
    


}
