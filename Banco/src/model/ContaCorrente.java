package model;

public class ContaCorrente {

    private float saldo;
    private float temp;

    public ContaCorrente(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void depositar(float valor) {
        saldo += valor;
    }

    public boolean sacar(float valor) {
        temp = getSaldo();
        if (temp < valor) {
            return false;
        } else {
            saldo = temp - valor;
            return true;
        }
    }
}
