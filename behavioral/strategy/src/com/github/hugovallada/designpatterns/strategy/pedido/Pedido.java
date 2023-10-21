package com.github.hugovallada.designpatterns.strategy.pedido;

import com.github.hugovallada.designpatterns.strategy.frete.Frete;

import java.math.BigDecimal;

public abstract class Pedido {
    private BigDecimal valor;

    private Frete tipoFrete;

    public Pedido(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setTipoFrete(Frete frete) {
        this.tipoFrete = frete;
    }

    public BigDecimal calculaFrete() {
        return tipoFrete.calcula(valor);
    }
}
