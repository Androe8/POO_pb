import java.util.ArrayList;
//Excercise: show only the productos that it's quantity is bigger than 5.
//Principal class
class Producto {
    //attributes
    private String codigo;
    private String nombre;
    private int cantidad;
    private float precio;


    /// Constructor
    public Producto(String codigo, String nombre, int cantidad, float precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad =cantidad;
        this.precio = precio;
    }

    //showing method.
    public void mostrar(){
        System.out.println("Codigo  " +codigo + "\nnombre producto : "+ nombre + "\n"+ "cantidad : " + cantidad + " \n" + "precio  : "+  precio +"\n-----------");
    }

    //condition method.
    public boolean validarMenorACinco(){
           return cantidad < 5;
    }
    

}

    public class producto_principal {
        public static void main(String[] args) {
         ArrayList <Producto> productos = new ArrayList<>(); // creo un arreglo para los productos

        productos.add(new Producto ("A01f", "Arroz Diana", 3, 3.200f));
        productos.add(new Producto ("A02k", "Frijoles", 6, 6.300f));
        productos.add(new Producto ("A003", "Maiz", 9, 9.700f));
        productos.add(new Producto ("A20d", "Coco", 2, 25.2f));
        productos.add(new Producto("2400a", "Pollo", 1, 2.500f));    
        productos.add(new Producto("PNNQ-98", "Pescado", 2, 5.600f));
        
            for(Producto p : productos){
                if(p.validarMenorACinco()){
                    p.mostrar();
                }     
        }

    }
    }