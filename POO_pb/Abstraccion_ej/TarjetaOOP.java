package POO_pb.Abstraccion_ej;
import java.util.Scanner;
import java.util.ArrayList;

//This code will be commented in Spanish due to the Teacher has to review it.

public class TarjetaOOP {
    public static void main(String[] args) {
        //variable global de la tarifa del metro.
        float tarifaMetro = 3200f;

        Scanner entrada = new Scanner(System.in); // creo una instancia de un objeto tipo scanner para la entrada de datod
        //lista que me guarda los objetos
        ArrayList <TarjetaCivica> listaTarjetas = new ArrayList<>(); 

        listaTarjetas.add(new TarjetaCivica("CIV-101", "Carlos Perez", 4000.0, "Estudiantil"));
        listaTarjetas.add(new TarjetaCivica("CIV-102", "Maria Lopez", 10000.0, "Frecuente"));
       
        String opcionmenu = "";

            while (!opcionmenu.equals("5")) {
            System.out.println("\n Sistema tarjeta Civica");
            System.out.println("1. Ver todas las tarjetas");
            System.out.println("2. Registrar nueva tarjeta");
            System.out.println("3. Recargar tarjeta");
            System.out.println("4. Pagar pasaje ");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");
        
            //lee la entrada del usuario
            opcionmenu = entrada.next();

            switch (opcionmenu) {
                case "1":
                    System.out.println("\n Listado de tarjeta registradas");
                    if (listaTarjetas.isEmpty()) // isEmpty me sirve para verifcar que una est datos o string no esté vacio, 
                        {
                        System.out.println("No hay tarjetas guardadas.");
                    } else {
                        // Recorrido de la lista con un ciclo
                        for (TarjetaCivica tarjeta : listaTarjetas) {
                            tarjeta.mostrarInfo();
                        }
                    }
                    break;

                case "2":
                    System.out.print("Ingrese id de la nueva tarjeta: ");

                    String id = entrada.next(); // next para guardar la palabra del usuario

                    entrada.nextLine(); // Limpia el salto de linea
                    System.out.print("Ingrese el nombre del titular: ");
                    String titular = entrada.nextLine();

                    System.out.print("Ingrese saldo inicial: $");

                    double saldoInicial = 0.0;

                    if (entrada.hasNextDouble()) {
                        saldoInicial = entrada.nextDouble();
                    } else {
                        System.out.println("Dato no valido. Se registrara con $ O ");
                        entrada.next();
                    }

                    System.out.print("Ingrese perfil (Estudiantil / Frecuente): ");
                    String perfil = entrada.next();

                    // Creación y adicion directa del nuevo objeto a la lista dinamica
                    listaTarjetas.add(new TarjetaCivica(id, titular, saldoInicial, perfil));
                    System.out.println(" La Tarjeta ha sido  registrada :)");
                    break;

                case "3":
                    System.out.print("Ingrese el id de la tarjeta a recargar: ");
                    String idBuscarRecarga = entrada.next();

                    // Búsqueda del objeto dentro de la lista dinámica
                    TarjetaCivica tarjetaARecargar = null;
                    for (TarjetaCivica t : listaTarjetas) {
                        if (t.getId().equalsIgnoreCase(idBuscarRecarga)) {
                            tarjetaARecargar = t;
                            break;
                        }
                    }

                    if (tarjetaARecargar != null) {
                        System.out.print("Ingrese monto a recargar: $");
                        if (entrada.hasNextDouble()) {
                            double monto = entrada.nextDouble();
                            if (tarjetaARecargar.recargar(monto)) {
                                System.out.println("Recarga exitosa. Nuevo saldo: $" + tarjetaARecargar.getSaldo());
                            } else {
                                System.out.println("Error: El monto a recargar debe ser mayor a 0.");
                            }
                        } else {
                            System.out.println("Error: Debe ingresar un valor numérico.");
                            entrada.next();
                        }
                    } else {
                        System.out.println("Error: No existe tarjeta registrada con ese ID.");
                    }
                    break;

                case "4":
                    System.out.print("Ingrese el id de la tarjeta para cobrar pasaje: ");
                    String idBuscarPago = entrada.next();

                    // Búsqueda del objeto dentro de la lista dinámica
                    TarjetaCivica tarjetaAPagar = null;
                    for (TarjetaCivica t : listaTarjetas) {
                        if (t.getId().equalsIgnoreCase(idBuscarPago)) {
                            tarjetaAPagar = t;
                            break;
                        }
                    }

                    if (tarjetaAPagar != null) {
                        if (tarjetaAPagar.pagarPasaje(tarifaMetro)) {
                            System.out.println("¡Pasaje pagado! Saldo restante: $" + tarjetaAPagar.getSaldo());
                        } else {
                            System.out.println("Error: Saldo insuficiente.");
                        }
                    } else {
                        System.out.println("Error: No existe tarjeta registrada con ese ID.");
                    }
                    break;

                case "5":
                    System.out.println("Has salido del sistema.");
                    break;

                default:
                    System.out.println("Opcion No valida. Seleccione un numero entre 1 y 5.");
            }
        }

    }
    
    }
    

