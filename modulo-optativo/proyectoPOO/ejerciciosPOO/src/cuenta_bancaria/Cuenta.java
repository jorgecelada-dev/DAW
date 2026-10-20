package cuenta_bancaria;
//constructor con todos los parametros
public class Cuenta {
    private String getCliente(){return, cliente};
    private double interes;
    private double saldo;
    private String numeroCuenta;
    private String cliente;


    public Cuenta(String cliente, double interes, String numerocuenta, double saldo){
        this.cliente = cliente;
        this.interes = interes;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    public Cuenta(){   //constructores->POR DEFECTO (sin parametros), puedo asignar yo los valores
        this.cliente = "Alberto";
        this.interes = 50;
        this.numeroCuenta = 45677;
        this.saldo = 3456;

    } //
    public Cuenta(Cuenta c){
        this.cliente = c.cliente;
        this.interes = c.interes;
        this.numeroCuenta = c.numeroCuenta;
        this.saldo = c.saldo;


    }
    public void setCliente(String cliente) {this.cliente = cliente;}        //

    public void setCliente(String interes) {this.interes = interes;}

    public void setCliente(String numeroCuenta) {this.interes = numeroCuenta;}

    public void setSaldo(String saldo) {this.saldo = saldo;}

    public boolean ingreso(int cantidad){         //metodo ingreso
        boolean resultado = true;
        if(cantidad <0){
            resultado = false;

        }else{}
        return resultado;
    }
    public boolean reintegro(double cantidad){              //metodo reintegro
        boolean resultado = true;
        if(cantidad <0 && cantidad > this.saldo){
            resultado=false;
        }else{
            this.saldo-=cantidad;
        }
        return resultado;
    }

    //metodo transferencia usando metodos que ya tengo creados

    public boolean transferencia(Cuenta cuentaDestino, double dinero){        //que datos necesito: cuenta de transferencia
        boolean resultado = true;
        if(dinero < 0 || dinero > this.saldo ){
            resultado = false;

        }else{
            reintegro(dinero);
            cuentaDestino.ingreso(dinero);
        }

        return resultado;



    }



}
