//public package Cooperativa;

class CuentaAhorro {
    private String titularCuenta;  
    private double saldo;


    // Constructor
    public CuentaAhorro(String titularCuenta, double saldo){
        this.titularCuenta= titularCuenta;
        this.saldo = saldo;
    }
    //Metodos

    //1. consultarSaldo sin poderlo modificar, muestra solo el saldo actual
    public double consultarSaldo(){
        return this.saldo;
    }

    //2. consignarValor
    public void consignarValor(double monto){
        if(monto > 0){
           this.saldo += monto;  
           System.out.println("La transacción fue exitosa");
        }else{
                System.out.println("El valor a consignar debe ser mayor que cero");
        }
        
    }

    //3. retirarValor
    public void retirarValor(double monto){
        //verifico que el valor del retiro no sea negativo y que la persona no retire mas de lo que tiene
        if(monto > 0 && monto <=this.saldo){
            this.saldo -= monto;
            System.out.println("La transaccion fue exitosa ");
        }else{
            System.out.println(" El valor a retirar debe ser mayor que cero");
        }
    }








}

