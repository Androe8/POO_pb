//package Cooperativa;

import java.util.Scanner; // importo la libreria scanner para leer datos.
import java.util.ArrayList;

public class CuentaAhorroOOP {
   public static void main(String[] args) {
    
    double saldoInicial = 0; // inicializamos un valor del atributo saldo
    Scanner entrada = new Scanner(System.in);

    ArrayList <CuentaAhorro> listaCuentas = new ArrayList<>(); //lista con las cuentas

    listaCuentas.add(new CuentaAhorro("Andres Arroyo ", saldoInicial, saldoInicial));
    listaCuentas.add(new CuentaAhorro("Luis Perez", saldoInicial, saldoInicial));
    listaCuentas.add(new CuentaAhorro("Laura Osorio", saldoInicial, saldoInicial));

    String opcionMenu = "";
    while(!opcionMenu.equals("4")){
         System.out.println("\n ------   Sistema Cooperativa Estudiantil --------- ");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar ");
            System.out.println("3. Consignar");
            System.out.println("4. Salir");
            System.out.println(" Seleccione una opcion ");
            opcionMenu = entrada.next();
    }
    }  
}
