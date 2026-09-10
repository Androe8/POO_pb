//package Cooperativa;
//SEPARAR RESPONSABILIDADES
import java.util.Scanner; // importo la libreria scanner para leer datos.

public class CuentaAhorroOOP {
   public static void main(String[] args) {
     // inicializamos un valor del atributo saldo
      Scanner entrada = new Scanner(System.in); 
      //Objeto Cuenta
      CuentaAhorro cuentaAndres = new CuentaAhorro("Andres Lopez", 3500);
   
    String opcionMenu = "";
    //Mientras que el valor no sea igual al String 4
    while(!opcionMenu.equals("4")){
         System.out.println("\n ------  Ha ingresado A  Sistema Cooperativa Estudiantil --------- ");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Consignar ");
            System.out.println("3. Retirar");
            System.out.println("4. Salir");
            System.out.println(" Seleccione una opcion");
            opcionMenu = entrada.next();

         switch (opcionMenu) {
            case "1":
            System.out.println(" El saldo actual es : "+cuentaAndres.consultarSaldo());   
               break;
            case "2":
               System.out.println(" Ingrese el valor a consignar " );
               String montoConsignar = entrada.next();
               double montoR = Double.parseDouble(montoConsignar); // convierto el valor enviado por el usuario a Double
               cuentaAndres.consignarValor(montoR); // llamo al metodo y le paso el parametro de entrada.
               break;
            case "3":
               System.out.println("Ingrese el valor a retirar");   
               String montoRetirar = entrada.next();
               double montoC = Double.parseDouble(montoRetirar);
               cuentaAndres.retirarValor(montoC); // llamo al metodo retirar y le paso el parametro de entrada.
               break;
            case "4":
               System.out.println(" Ha salido del sistema :)");
               break;   
            default:
               System.out.println(" La opcion es invalida");
               }
            }
    }
    }  
