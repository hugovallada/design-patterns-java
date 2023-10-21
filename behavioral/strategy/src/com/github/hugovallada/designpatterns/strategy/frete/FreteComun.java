package com.github.hugovallada.designpatterns.strategy.frete;

import java.math.BigDecimal;

public final class FreteComun implements Frete {
    @Override
    public BigDecimal calcula(BigDecimal valorPedido) {
        return BigDecimal.valueOf(valorPedido.doubleValue() * 0.05);
    }
}
