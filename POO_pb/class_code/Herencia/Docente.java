package POO_pb.class_code.Herencia;

import javax.swing.ProgressMonitorInputStream;

public class Docente extends Persona{
    private String materia;
    
    public Docente(String nombre, String materia){
        super(nombre);
        this.materia = materia;
    }

    public String InfoDocente(){
        //llamo el atributo nombre de persona
        return getNombre()+ " enseña "+ materia;
    }
}
