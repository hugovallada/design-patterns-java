package com.github.hugovallada.designpatterns.strategy.pedido;

import java.math.BigDecimal;

public class PedidoMoveis extends Pedido {
    private String nomeSetor;

    public PedidoMoveis(BigDecimal valor, String nomeSetor) {
        super(valor);
        this.nomeSetor = nomeSetor;
    }

    public String getNomeSetor() {
        return nomeSetor;
    }

    public void setNomeSetor(String nomeSetor) {
        this.nomeSetor = nomeSetor;
    }
}
