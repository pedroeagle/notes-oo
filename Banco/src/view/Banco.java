package view;

import java.util.Date;
import model.ContaCorrente;
import model.Movimento;
import model.Transacao;

public class Banco {

    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(0.0f);
        Transacao transacoes = new Transacao();
        float saldoAtual;
        saldoAtual = conta.getSaldo();
        transacoes.realizarTransacao(new Date(), conta, "Mesada", 100.0f, Movimento.DEPOSITAR);
        transacoes.realizarTransacao(new Date(), conta, "RU", 5.2f, Movimento.SACAR);
        transacoes.realizarTransacao(new Date(), conta, "Compra doce", 5.0f, Movimento.SACAR);
        transacoes.realizarTransacao(new Date(), conta, "Festa", 50.0f, Movimento.SACAR);
    }
}
