package POO_pb.class_code.SobreCarga;

public class Main {
    public static void main(String[] args) {
        
        //creamos el objeto estudiante
        //sobrecarga
        // Estudiante e1 = new Estudiante();
        // System.out.println(e1.saludar());
        // System.out.println(e1.saludar("Andres"));
        // System.out.println(e1.tipoJornada("Diurna"));   
        
        //Persona p3 = new Persona();
        //System.out.println(p3.mostrarInfoPersona("10699866", "Carlos"));
        

        Persona p4 = new Persona("Alberto", 45);
        System.out.println(p4);

        //sobrescritura
        //Persona p1 = new Persona();
        //Persona p2 = new Estudiante();


        //System.out.println(p1.rol());
        //System.out.println(p2.rol());    
    
    }
}
