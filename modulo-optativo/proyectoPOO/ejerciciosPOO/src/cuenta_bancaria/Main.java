package cuenta_bancaria;

public class Main {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        System.out.println(c1.saldo());

        Cuenta c3 = new Cuenta ("Alberto", 30, 3884, 3444);
        System.out.println(c3.getSaldo);
        c3.getCliente();

    }
}
