package com.mycompany.sistemabancario;

/**
 *
 * @author ESPE
 */
public class Cuantalimitada extends Cuenta {
    private final double maximoRetiro = 2500;

    public Cuantalimitada(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
  public void retirar(double cantidad) {
        if (cantidad <= maximoRetiro && cantidad <= getSaldo()) {
            super.retirar(cantidad);
        } else {
            System.out.println("No se puede retirar más de $" + maximoRetiro + " o más de lo que hay en la cuenta");
        }
    }
}