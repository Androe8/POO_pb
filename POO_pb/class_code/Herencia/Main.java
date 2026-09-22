package POO_pb.class_code.Herencia;

public class Main {
    public static void main(String[] args) {
        

        //Creamos el objeto
        Estudiante e1 = new Estudiante("Andres Arroyo ", "Ingenieria de Software");
        

        System.out.println(e1.Saludar());
        System.out.println(e1.Estudiar());

        //objeto docente
        Docente d1 =  new Docente("Lius Fernando", "POO");
        System.out.println(d1.InfoDocente());

    }    
}
