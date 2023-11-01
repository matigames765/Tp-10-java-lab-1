public class CuentaBancaria {
    /*
    10.	Crea una clase CuentaBancaria con atributos como saldo y número de cuenta
     */
    double saldo;

    int numero_cuenta;

    /*
    11.	Define métodos para depositar y retirar dinero de la cuenta.
     */

    public void depositar(double deposito){
        saldo = saldo + deposito;
    }
    public double retirar(double retiro){
        if (saldo >= retiro){
            saldo = saldo - retiro;
            return retiro;
        }else{
            System.out.println("No tienes suficiente saldo para la extraccion");
            return 0.0;
        }
    }
}
