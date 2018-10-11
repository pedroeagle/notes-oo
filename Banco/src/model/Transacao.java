package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Transacao {

    private List<Movimento> movimentos;

    public Transacao() {
        movimentos = new ArrayList<Movimento>();
    }

    public boolean realizarTransacao(Date data, ContaCorrente conta, String historico, float valor, int operacao) {
        Movimento movimento = new Movimento(data, conta, historico, valor, operacao);
        if (!movimento.movimentar()) {
            return false;
        }
        this.movimentos.add(movimento);
        return true;
    }

    public void estornaTransacao() {
        for (Movimento mov : this.movimentos) {
            mov = null;
        }
    }

    public List<Movimento> getMovimentos() {
        return this.movimentos;
    }
}
