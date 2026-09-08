//public package Cooperativa;

class CuentaAhorro {
    private String titularCuenta;
    private double monto;  
    private double saldo;

    // Constructor
    public CuentaAhorro(String titularCuenta ,double monto, double saldo){
        this.titularCuenta= titularCuenta;
        this.monto = monto;
        this.saldo = saldo;
    }

    //Metodos

    //1. consultarSaldo sin poderlo modificar, muestra solo el saldo actual
    public String consultarSaldo(){
        System.out.println("El saldo actual de la cuenta a nombre de " +titularCuenta+ " es : " + saldo);
    }

    //2. consignarValor
    public double consignarValor(double monto){
        if(monto > 0){
           saldo += monto;  
        }else{
            System.out.println("El valor a consignar no puede ser negativo ");
        }
    }

    //3. retirarValor
    public double retirarValor(double monto){
        if(monto > 0){
            saldo -= monto;
        }else{
            System.out.println(" El valor a retirar no puede ser negativo");
        }
    }








}

