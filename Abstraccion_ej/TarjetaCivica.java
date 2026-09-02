package POO_pb.Abstraccion_ej;
import java.util.Scanner; // Agrego la libreria scanner para lectura de datos

public class TarjetaCivica {
    //atributos
    private String id;
    private String titular;
    private double saldo;
    private String perfil; // "Frecuente", "Estudiantil"

    //constructor
    public TarjetaCivica (String id, String titular, double saldo, String perfil){
        this.id=id;
        this.titular= titular;
        this.saldo = saldo;
        this.perfil=perfil;
    }

    // Getter para obtener el saldo actual
    public double getSaldo() {
        return saldo;
    }

    public String getId(){
        return id;
    } 

    // Método para mostrar los datos de la tarjeta
    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Titular: " + titular + " | Perfil: " + perfil + " | Saldo: $" + saldo);
    }

    // Método para recargar saldo 
    public boolean recargar(double monto) {
        if (monto > 0) { // Validación de monto positivo
            saldo += monto;
            return true;
        }
        return false;
    }
    

    // metodo de validación de saldo
    public boolean validarSaldoSuficiente(double monto) {
        return saldo >= monto;
    }
    

    //metodo para hacer el pago del pasaje
    public boolean pagarPasaje(double tarifaBase) {
    double tarifaFinal = tarifaBase;

    // Aplica el 50% de descuento si es estudiantil
    //equalsIgnoreCase para comparar string independiente de si estan en mayuscula o no
    if (perfil.equalsIgnoreCase("Estudiantil")) {
        tarifaFinal = tarifaBase * 0.5;
    }

    // Validación antes de descontar
    if (validarSaldoSuficiente(tarifaFinal)) {
        saldo -= tarifaFinal;
        return true;
    }
    return false;
}

}



    