package model;

import java.util.Date;

public class Movimento {

    private Date data;
    private ContaCorrente conta;
    private String historico;
    private float valor;
    private int operacao;

    public static final int SACAR = 1;
    public static final int DEPOSITAR = 2;

    public Date getData() {
        return data;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public String getHistorico() {
        return historico;
    }

    public float getValor() {
        return valor;
    }

    public int getOperacao() {
        return operacao;
    }

    public static int getSACAR() {
        return SACAR;
    }

    public static int getDEPOSITAR() {
        return DEPOSITAR;
    }

    public Movimento(Date data, ContaCorrente conta, String historico, float valor, int operacao) {
        this.data = data;
        this.conta = conta;
        this.historico = historico;
        this.valor = valor;
        this.operacao = operacao;
    }

    public boolean movimentar() {
        if (operacao == SACAR) {
            return conta.sacar(valor);
        } else if (operacao == DEPOSITAR) {
            conta.depositar(valor);
            return true;
        } else {
            System.out.println("Operação Inválida");
            return false;
        }
    }
}
