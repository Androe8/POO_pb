package POO_pb.class_code.SobreCarga;

public class Estudiante extends Persona {
    //atributo
    public String jornada;
   
    /***sobreescribir***/
    @Override 
    public String rol(){
        return "Estudiante";
    }

    

    //---Sobrecarga
    public  String saludar(){
        return "hola";
    }

    public String saludar(String nombre){
        return "Hola " +nombre;
    }

}
